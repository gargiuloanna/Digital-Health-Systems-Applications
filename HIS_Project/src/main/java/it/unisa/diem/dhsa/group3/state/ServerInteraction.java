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

	public static List<String> sendToServer() {
		List<String> ids = new ArrayList<>();
		Memory mem = Memory.getMemory();
		FhirContext ctx = Context.getContext().get();
		IGenericClient client = ctx.newRestfulGenericClient(Context.server);
		MethodOutcome methodOutcome;
		for (Map<String, Resource> map : mem.values())
			for (Resource resource : map.values()) {
				try {
					methodOutcome = uploadResource(resource, false);
					System.out.println((methodOutcome.getOperationOutcome()));
					// ids.add(methodOutcome.getOperationOutcome().getIdElement().getIdPart());
				} catch (FhirClientConnectionException e) {
					System.out.println("Error in the connection");
				}
			}
		System.out.println(ids);
		return ids;
	}

	public static Resource getResource(String identifier) throws FhirClientConnectionException {
		final String id;
		if (identifier == "") {
			id = "0";
		} else
			id = identifier;

		IGenericClient client = Context.getContext().newRestfulGenericClient(Context.server);

		Bundle bundle;
		bundle = client.search().forResource(Patient.class).where(new TokenClientParam("identifier").exactly()
				// .systemAndCode("https://github.com/synthetichealth/synthea", id)
				.code(id)).prettyPrint().returnBundle(Bundle.class).execute();
		if (bundle.isEmpty())
			return null;
		return bundle.getEntryFirstRep().getResource();

	}

	public static MethodOutcome uploadResource(Resource new_resource, boolean update)
			throws FhirClientConnectionException {

		FhirContext ctx = Context.getContext();
		IGenericClient client = ctx.newRestfulGenericClient(Context.server);
		Resource old_resource = getResource(new_resource.getId());
		if (old_resource == null || !update) {
			return null;
		}
		if (update)
			new_resource.setId(old_resource.getIdElement().getVersionIdPart());

		return client.create().resource(new_resource).prettyPrint().encodedJson().execute();

	}

}
