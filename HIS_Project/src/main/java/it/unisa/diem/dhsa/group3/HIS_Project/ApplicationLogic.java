package it.unisa.diem.dhsa.group3.HIS_Project;

import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import ca.uhn.fhir.rest.client.api.IGenericClient;

public abstract class ApplicationLogic {
	Context ctx = null;
	String path = "";
	String serverBase = "https://hapi.fhir.org/baseR4";
	IGenericClient client;

	public ApplicationLogic() {
		Context ctx = Context.getContext();
		client = ctx.newRestfulGenericClient(serverBase); //TODO singleton anche per client?
	}

	public Context getCtx() {
		return ctx;
	}

	public void setCtx(Context ctx) {
		this.ctx = ctx;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public abstract Map<String, Resource> readCSV();
}
