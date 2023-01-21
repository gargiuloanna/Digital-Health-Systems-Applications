package it.unisa.diem.dhsa.group3.state;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.instance.model.api.IBaseBundle;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Bundle.BundleEntryComponent;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.ServiceRequest;

import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.IQuery;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;

public class ServerInteraction {

	//to upload CSVs on server
	public static void sendToServer(boolean update) throws FhirClientConnectionException{
		Memory mem = Memory.getMemory();
		for (Map<String, Resource> map : mem.values())
			for (String key : map.keySet()) 
				uploadResource(key, map.get(key), update);					
	}


	//Advanced Patient Search
	public static List<Resource> advancedPatientSearch(String firstName, String lastName, LocalDate birthDate,
			LocalDate deathDate) throws FhirClientConnectionException {
		Date birthdate, deathdate;

		if (birthDate != null)
			birthdate = Date.from(birthDate.atStartOfDay(ZoneId.of("Europe/Paris")).toInstant());
		else
			birthdate = null;

		if (deathDate != null)
			deathdate = Date.from(deathDate.atStartOfDay(ZoneId.of("Europe/Paris")).toInstant());
		else
			deathdate = null;

		
		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		IQuery<IBaseBundle> query = client.search().forResource(Patient.class)
				.where(Patient.NAME.matches().value(firstName))
				.and(Patient.FAMILY.matchesExactly().value(lastName));

		if (birthdate != null)
			query = query.and(Patient.BIRTHDATE.beforeOrEquals().day(birthdate));

		if (deathdate != null)
			query = query.and(Patient.DEATH_DATE.beforeOrEquals().day(deathdate));
		
		return genericQuery(query);

	}

	//to upload a resource on the server
	public static String uploadResource(String id, Resource resource, boolean update)
			throws FhirClientConnectionException {
		Resource new_resource = resource;

		Resource old_resource = getResource(resource.getClass(), id);
		MethodOutcome methodOutcome;

		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);

		try {
			if (old_resource != null) {
				if (!update) {
					return old_resource.getIdElement().getIdPart();
				} else {

					new_resource.setId(
							new_resource.getClass().getSimpleName() + '/' + old_resource.getIdElement().getIdPart());
					methodOutcome = client.update().resource(new_resource).prettyPrint().encodedJson().execute();

				}
			} else

				methodOutcome = client.create().resource(new_resource).prettyPrint().encodedJson().execute();

			return methodOutcome.getId().getIdPart();
		} catch (FhirClientConnectionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}

	}
	
	
	public static List<Resource> getOccurrenceServiceRequests(DateTimeType date) throws Exception {
		if (date  == null)
			throw new Exception("date is null");
		
		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		IQuery<IBaseBundle> query = client.search().forResource(ServiceRequest.class)
				.where(ServiceRequest.OCCURRENCE.afterOrEquals().day(date.getValue()));
		
		return genericQuery(query);
		
	}
	
	public static List<Resource> genericQuery(IQuery<IBaseBundle> query ) throws FhirClientConnectionException {
		
		Bundle bundle;
		try {
			bundle = query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		} catch (FhirClientConnectionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}
		
		if (bundle.isEmpty())
			return null;
		List<Resource> list = new ArrayList<>();
		for (BundleEntryComponent elem : bundle.getEntry()) {
			list.add(elem.getResource());
		}
		return list;
		
	}
	
	
	//Retrieves one resource from the server
	public static Resource getResource(Class<? extends Resource>  resourceClass, String identifier){
		if (resourceClass==null)
			return null;
		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		Bundle bundle = client.search().forResource(resourceClass)//.include(Resource.INCLUDE_ALL)
				.where(new TokenClientParam("identifier").exactly().code(id)).prettyPrint().returnBundle(Bundle.class)
				.encodedJson().execute();
		if (bundle.isEmpty())
			return null;
		
		return bundle.getEntryFirstRep().getResource();

	}
	
public static List<? extends Resource> getResources(Class<? extends Resource>  resourceClass) throws FhirClientConnectionException {
		
		Bundle bundle;
		try {
			IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
			IQuery<IBaseBundle> query = client.search().forResource(resourceClass).include(Resource.INCLUDE_ALL);

			bundle = query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		} catch (FhirClientConnectionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}
		
		if (bundle.isEmpty())
			return null;
		List<Resource> list = new ArrayList<>();
		for (BundleEntryComponent elem : bundle.getEntry()) {
			list.add(resourceClass.cast(elem.getResource()));
		}
		
		return list;

	}
	

	
}
