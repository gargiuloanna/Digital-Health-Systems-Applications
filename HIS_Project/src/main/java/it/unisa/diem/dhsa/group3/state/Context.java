package it.unisa.diem.dhsa.group3.state;
import ca.uhn.fhir.context.FhirContext;

public class Context extends FhirContext{
	static private Context cxt = null;
	private FhirContext context;
	static public String server = "http://192.168.71.103:8080/fhir";
	
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
	
}
