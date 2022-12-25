package it.unisa.diem.dhsa.group3.state;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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
					System.out.println(id);
					ids.add(id);
				} catch (FhirClientConnectionException e) {
					System.out.println("Error in the connection");
				}
			}
		System.out.println("ids" + ids);
		return ids;
	}

	public static Resource getResource(String identifier) throws FhirClientConnectionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);

		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;
		Future<Bundle> result = executor.submit(new Callable<Bundle>() {
			public Bundle call() throws FhirClientConnectionException {
				IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
				return client.search().forResource(Patient.class)
						.where(new TokenClientParam("identifier").exactly().code(id)).prettyPrint()
						.returnBundle(Bundle.class).encodedJson().execute();
			}
		});

		Bundle bundle;
		try {
			bundle = result.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		} finally {
			executor.shutdownNow();
		}

		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		return bundle.getEntryFirstRep().getResource();

	}

	public static List<Resource> getResources(String firstName, String lastName, LocalDate birthDate,
			LocalDate deathDate) throws FhirClientConnectionException {
		ExecutorService executor = Executors.newFixedThreadPool(2);
		String first = firstName, family = lastName;
		Date birthdate, deathdate;

		if (birthDate != null)
			birthdate = Date.from(birthDate.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		else birthdate = null;
		
		if (deathDate != null)
			deathdate = Date.from(deathDate.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		else deathdate = null;

		Future<Bundle> result = executor.submit(new Callable<Bundle>() {
			public Bundle call() throws FhirClientConnectionException {
				IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
				IQuery<IBaseBundle> query = client.search().forResource(Patient.class)
						.where(Patient.NAME.matches().value(firstName))
						.and(Patient.FAMILY.matchesExactly().value(lastName));
				
				if (birthdate != null)
					query = query.and(Patient.BIRTHDATE.beforeOrEquals().day(birthdate));
				
				if (deathdate != null)
					query = query.and(Patient.DEATH_DATE.beforeOrEquals().day(deathdate));

				return query.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
			}
		});

		Bundle bundle;
		try {
			bundle = result.get();
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		} finally {
			executor.shutdownNow();
		}

		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		List<Resource> list = new ArrayList<>();
		for (BundleEntryComponent elem: bundle.getEntry()) {
			list.add(elem.getResource());
		}
		return list;

	}

	public static String uploadResource(String id, Resource resource, boolean update)
			throws FhirClientConnectionException {
		Resource new_resource = resource;

		ExecutorService executor = Executors.newFixedThreadPool(2);

		Resource old_resource = getResource(id);
		MethodOutcome methodOutcome;
		Future<MethodOutcome> future;

		if (old_resource != null) {
			if (!update) {
				return old_resource.getIdElement().getIdPart();
			} else {
				future = executor.submit(new Callable<MethodOutcome>() {
					public MethodOutcome call() throws Exception {
						IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
						new_resource.setId(new_resource.getClass().getSimpleName() + '/'
								+ old_resource.getIdElement().getIdPart());
						MethodOutcome mo = client.update().resource(new_resource).prettyPrint().encodedJson().execute();
						return mo;
					}

				});
			}
		} else
			future = executor.submit(new Callable<MethodOutcome>() {
				public MethodOutcome call() throws Exception {
					IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
					MethodOutcome mo = client.create().resource(new_resource).prettyPrint().encodedJson().execute();
					return mo;
				}

			});

		try {
			methodOutcome = future.get();
			return methodOutcome.getId().getValue();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
			throw new FhirClientConnectionException("error in thread");
		} finally {
			executor.shutdownNow();
		}

	}

}
