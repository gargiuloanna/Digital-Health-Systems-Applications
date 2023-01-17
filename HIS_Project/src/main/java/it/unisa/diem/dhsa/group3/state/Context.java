package it.unisa.diem.dhsa.group3.state;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.api.IRestfulClientFactory;

public class Context extends FhirContext{
	static private Context cxt = null;
	private FhirContext context;
	static public String server = "http://localhost:8080/fhir";
	private IGenericClient client = null;
	
	@SuppressWarnings("deprecation")
	private Context() {
		context = FhirContext.forR4();
	}
	
	public static  Context getContext() {
		if(cxt == null)
			cxt = new Context();
		return cxt;

	}
	public  FhirContext get() {
		getContext();
		return context;

	}
	
	@Override
	public IGenericClient newRestfulGenericClient(final String theServerBase) {
		if (client == null) {
			IRestfulClientFactory clt = getContext().getRestfulClientFactory();
			clt.setConnectTimeout(10*1000); 
			clt.setSocketTimeout(10*1000); 
			client = clt.newGenericClient(theServerBase);
			}
		
		return client;
	}
	
}
