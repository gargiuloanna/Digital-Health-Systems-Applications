package it.unisa.diem.dhsa.group3.state;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.interceptor.executor.InterceptorService;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.gclient.TokenClientParam;
import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;

public class ServerInteraction {

	public static List<String> sendToServer(boolean update) {
		List<String> ids = new ArrayList<>();
		Memory mem = Memory.getMemory();
		String id;
		for (Map<String, Resource> map : mem.values())
			for (Resource resource : map.values()) {
				try {
					id = uploadResource(resource, update);
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
		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		System.out.println("id "+ id);
		System.out.println("identifier "+ identifier);
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		Bundle bundle;
		bundle = client.search().forResource(Patient.class).where(new TokenClientParam("identifier").exactly().code(id))
				.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		return bundle.getEntryFirstRep().getResource();

	}

	public static String uploadResource(Resource new_resource, boolean update) throws FhirClientConnectionException {

		Patient r = (Patient) new_resource;
		FhirContext ctx = Context.getContext();
		IGenericClient client = ctx.newRestfulGenericClient(Context.server);
		Resource old_resource = getResource(r.getIdentifierFirstRep().getValue()); // ID is an identifier
		MethodOutcome methodOutcome = null;
		if (old_resource != null) {
			if (!update)
				return old_resource.getIdElement().getIdPart();
			if (update)
				new_resource.setId(old_resource.getIdElement().getVersionIdPart());
		}
		methodOutcome = client.create().resource(new_resource).prettyPrint().encodedJson().execute();
		System.out.println("ho caricato");
		return methodOutcome.getId().getValue();

	}

}
