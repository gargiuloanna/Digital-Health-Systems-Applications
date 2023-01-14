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
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

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

}
