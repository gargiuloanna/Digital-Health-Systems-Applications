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

	public static List<String> sendToServer(boolean update) {
		List<String> ids = new ArrayList<>();
		Memory mem = Memory.getMemory();
		String id;
		for (Map<String, Resource> map : mem.values())
			for (String key : map.keySet()) {
				try {
					id = uploadResource(key, map.get(key), update);
					ids.add(id);
				} catch (FhirClientConnectionException e) {
					System.out.println("Error in the connection");
				}
			}
		System.out.println("ids" + ids);
		return ids;
	}

	public static Resource getResource(String identifier) throws FhirClientConnectionException {
		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		Bundle bundle = client.search().forResource(Patient.class)
				.where(new TokenClientParam("identifier").exactly().code(id)).prettyPrint().returnBundle(Bundle.class)
				.encodedJson().execute();

		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		return bundle.getEntryFirstRep().getResource();

	}

	public static List<Resource> getResources(String firstName, String lastName, LocalDate birthDate,
			LocalDate deathDate) throws FhirClientConnectionException {
		Date birthdate, deathdate;

		if (birthDate != null)
			birthdate = Date.from(birthDate.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		else
			birthdate = null;

		if (deathDate != null)
			deathdate = Date.from(deathDate.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		else
			deathdate = null;

		Bundle bundle;
		try {
			IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
			IQuery<IBaseBundle> query = client.search().forResource(Patient.class)
					.where(Patient.NAME.matches().value(firstName))
					.and(Patient.FAMILY.matchesExactly().value(lastName));

			if (birthdate != null)
				query = query.and(Patient.BIRTHDATE.beforeOrEquals().day(birthdate));

			if (deathdate != null)
				query = query.and(Patient.DEATH_DATE.beforeOrEquals().day(deathdate));

			bundle = query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		} catch (FhirClientConnectionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}

		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		List<Resource> list = new ArrayList<>();
		for (BundleEntryComponent elem : bundle.getEntry()) {
			list.add(elem.getResource());
		}
		return list;

	}

	public static String uploadResource(String id, Resource resource, boolean update)
			throws FhirClientConnectionException {
		Resource new_resource = resource;

		Resource old_resource = getResource(id);
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
	
	//get service request starting from id of the patient
	/*public static List<Resource> getPatientServiceRequests(String id) throws Exception {
		if (id == "" || id == null)
			throw new Exception();
		
		Bundle bundle;
		try {
			IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
			IQuery<IBaseBundle> query = client.search().forResource(ServiceRequest.class).include(ServiceRequest.INCLUDE_ALL);

			bundle = query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		} catch (FhirClientConnectionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}
		
		if (bundle.isEmpty())
			return null;
		List<Resource> list = new ArrayList<>();
		for (BundleEntryComponent elem : bundle.getEntry()) {
			ServiceRequest r = (ServiceRequest) elem.getResource();
			list.add(elem.getResource());
		}
		return list;
		//non c'è bisogno di cercare di nuovo sul server
	
		
	}*/
	
	public static List<Resource> getOccurrenceServiceRequests(DateTimeType date) throws Exception {
		if (date == null)
			throw new Exception();
		
		Bundle bundle;
		try {
			IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
			IQuery<IBaseBundle> query = client.search().forResource(ServiceRequest.class)
					.where(ServiceRequest.OCCURRENCE.afterOrEquals().day(date.getValue()));

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
	
	public static List<ServiceRequest> getServiceRequestResources() throws FhirClientConnectionException {
		
		Bundle bundle;
		try {
			IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
			IQuery<IBaseBundle> query = client.search().forResource(ServiceRequest.class).include(ServiceRequest.INCLUDE_ALL);

			bundle = query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		} catch (FhirClientConnectionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		}
		
		if (bundle.isEmpty())
			return null;
		List<ServiceRequest> list = new ArrayList<>();
		for (BundleEntryComponent elem : bundle.getEntry()) {
			list.add((ServiceRequest) elem.getResource());
		}
		return list;

	}
	
	public static Resource getGenericResource(String resource, String identifier){
		Class<? extends org.hl7.fhir.r4.model.Resource> resourceClass = ServerInteraction.get_class(resource);
		assert(resourceClass != null);
		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		Bundle bundle = client.search().forResource(resourceClass)
				.where(new TokenClientParam("identifier").exactly().code(id)).prettyPrint().returnBundle(Bundle.class)
				.encodedJson().execute();

		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		
		return bundle.getEntryFirstRep().getResource();

	}
	
	public static Class<? extends org.hl7.fhir.r4.model.Resource> get_class(String resource) {
		switch (resource) {
		case "patient":
			return org.hl7.fhir.r4.model.Patient.class;
		case "allergy":
			return org.hl7.fhir.r4.model.AllergyIntolerance.class;
		case "condition":
			return org.hl7.fhir.r4.model.Condition.class;
		case "device":
			return org.hl7.fhir.r4.model.Device.class;
		case "encounter":
			return org.hl7.fhir.r4.model.Encounter.class;
		case "careplan":
			return org.hl7.fhir.r4.model.CarePlan.class;
		case "imaging study":
			return org.hl7.fhir.r4.model.ImagingStudy.class;
		case "immunization":
			return org.hl7.fhir.r4.model.Immunization.class;
		case "medication":
			return org.hl7.fhir.r4.model.Medication.class;
		case "observation":
			return org.hl7.fhir.r4.model.Observation.class;
		case "organization":
			return org.hl7.fhir.r4.model.Organization.class;
		case "payer":
			return org.hl7.fhir.r4.model.Organization.class;
		case "procedure":
			return org.hl7.fhir.r4.model.Procedure.class;
		case "provider":
			return org.hl7.fhir.r4.model.Practitioner.class;
		}
		return org.hl7.fhir.r4.model.Resource.class;
	}
	
}
