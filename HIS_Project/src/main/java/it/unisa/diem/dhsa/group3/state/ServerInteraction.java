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
		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);
		String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		Bundle bundle;
		bundle = client.search().forResource(Patient.class).where(new TokenClientParam("identifier").exactly().code(id))
				.prettyPrint().returnBundle(Bundle.class).encodedJson().execute();
		// .systemAndCode("https://github.com/synthetichealth/synthea", id)
		if (bundle.isEmpty())
			return null;
		return bundle.getEntryFirstRep().getResource();

	}

	public static String uploadResource(String id, Resource new_resource, boolean update)
			throws FhirClientConnectionException {

		FhirContext ctx = Context.getContext();
		IGenericClient client = ctx.newRestfulGenericClient(Context.server);
		Resource old_resource = getResource(id);
		MethodOutcome methodOutcome = null;
		if (old_resource != null) {
			if (!update)
				return old_resource.getIdElement().getIdPart();
			if (update)
				new_resource.setId(old_resource.getIdElement().getVersionIdPart());
		}
		methodOutcome = client.create().resource(new_resource).prettyPrint().encodedJson().execute();
		return methodOutcome.getId().getValue();

	}

}
