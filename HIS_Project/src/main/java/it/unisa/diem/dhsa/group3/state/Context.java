package it.unisa.diem.dhsa.group3.state;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.client.api.IRestfulClientFactory;

/**
 * 
 * This class allow to have a single context and client within all application
 *
 */
public class Context extends FhirContext{
	static private Context cxt = null;
	private FhirContext context;
	static public String server = "http://192.168.71.103:8080//fhir";
	private IGenericClient client = null;
	
	/**
	 * 
	 * private constructor
	 */
	@SuppressWarnings("deprecation")
	private Context() {
		context = FhirContext.forR4();
	}
	
	/**
	 * factory method
	 * @return Context object
	 */
	public static  Context getContext() {
		if(cxt == null)
			cxt = new Context();
		return cxt;

	}
	
	/**
	 * 
	 * @return FhirContext object
	 */
	public  FhirContext get() {
		getContext();
		return context;

	}
	
	/**
	 * factory method for a client that is a singleton
	 * timeouts are set to 10s 
	 */
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
