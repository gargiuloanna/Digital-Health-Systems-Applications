package state;
import ca.uhn.fhir.context.FhirContext;

public class Context extends FhirContext{
	static private Context cxt = null;
	private FhirContext context;
	
	private Context() {
		context = FhirContext.forR4();
	}
	
	public static  Context getContext() {
		if(cxt == null)
			cxt = new Context();
		return cxt;

	}
	
}
