package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.*;

import it.unisa.diem.dhsa.group3.enumerations.ServiceRequestCategory;
import it.unisa.diem.dhsa.group3.enumerations.ServiceRequestCode;

public class ServiceRequestResource extends BaseResource {

	/*Each Service Request must have:
	 * a status
	 * an intent code indicating whether the request is a proposal, plan, or order.
	 * a code defining what is being requested
	 * a patient
	 Each Service Request must support:
	 * a category
	 * when requested service should happen
	 * when request was made
	 * the requester
	 */
	
	private String id;
	private String statusCode;
	private String intentCode; //proposal, plan, or order... si può filtrare sull'intent
	private String requestCode; //defines what is being requested... serve l'enumeration
	private String subject_id; // the patient
	private String encounter_id;
	private String category;
	private Date date; // when when requested service should happen
	private Date when; // when the request was made
	private String requester; //the practictioner
	private String details;

	
	
	public ServiceRequestResource(String id, String statusCode, String intentCode, String requestCode, String subject,
			String encounter, String category, Date date, Date when, String requester, String details) {
		super(id);
		this.statusCode = statusCode;
		this.intentCode = intentCode;
		this.requestCode = requestCode;
		this.subject_id = subject;
		this.encounter_id = encounter;
		this.category = category;
		this.date = date;
		this.when = when;
		this.requester = requester;
		this.details = details;
	}


	public ServiceRequestResource(ServiceRequest r) {
		super();
		this.subject_id = r.getSubject().getIdentifier().getValue();
		this.encounter_id = r.getEncounter().getIdentifier().getValue();
		this.id = r.getIdentifierFirstRep().getValue();
		this.date = new Date();
		this.statusCode = r.getStatus().toCode();
		this.category = r.getCategoryFirstRep().getCodingFirstRep().getDisplay();
		this.requestCode = "_" + r.getCode().getCodingFirstRep().getCode();
		this.intentCode= r.getIntent().toCode();
		this.details = r.getNoteFirstRep().getText();
		this.when = r.getAuthoredOn();
		this.requester = r.getRequester().getIdentifier().getValue();
	}

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getStatusCode() {
		return statusCode;
	}



	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}



	public String getIntentCode() {
		return intentCode;
	}



	public void setIntentCode(String intentCode) {
		this.intentCode = intentCode;
	}



	public String getRequestCode() {
		return requestCode;
	}



	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}

	public String getSubject_id() {
		return subject_id;
	}




	public void setSubject_id(String subject_id) {
		this.subject_id = subject_id;
	}




	public String getEncounter_id() {
		return encounter_id;
	}


	public void setEncounter_id(String encounter_id) {
		this.encounter_id = encounter_id;
	}

	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public Date getDate() {
		return date;
	}



	public void setDate(Date date) {
		this.date = date;
	}



	public Date getWhen() {
		return when;
	}



	public void setWhen(Date when) {
		this.when = when;
	}



	public String getRequester() {
		return requester;
	}



	public void setRequester(String requester) {
		this.requester = requester;
	}



	public String getDetails() {
		return details;
	}



	public void setDetails(String details) {
		this.details = details;
	}
	
	
	@Override
	public String toString() {
		return "Request id:" + id + "\nStatus Code: " + statusCode + "\nIntent Code: " + intentCode
				+ "\nRequest Code: " + requestCode + "\nPatient: " + subject_id + "\nEncounter: " + encounter_id + "\nCategory: "
				+ category + "\nDate: " + date + "\nIssued On: " + when + "\nRequester: " + requester + "\nDetails: " + details
				+ "\n";
	}



	@Override
	public Resource createResource() {
		ServiceRequest r = new ServiceRequest();
		// Definition of the considered profile
		r.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-servicerequest"));
		
		r.addIdentifier().setSystem("https://www.uuidgenerator.net/dev-corner/java").setValue(super.getId());
		
		ServiceRequest.ServiceRequestStatus status = ServiceRequest.ServiceRequestStatus.fromCode(statusCode);
		r.setStatus(status);
		
		ServiceRequest.ServiceRequestIntent intent = ServiceRequest.ServiceRequestIntent.fromCode(intentCode);
		r.setIntent(intent);
		
		//add code
		ServiceRequestCode code = ServiceRequestCode.fromCode(requestCode);
		r.setCode(new CodeableConcept(new Coding(code.getSystem(), code.toCode(), code.getDefinition())));
		
		r.setSubject(new Reference().setIdentifier(new Identifier().setValue(subject_id)));
		r.setEncounter(new Reference().setIdentifier(new Identifier().setValue(encounter_id)));
		
		ServiceRequestCategory cat = ServiceRequestCategory.fromCode(category);
		r.addCategory(new CodeableConcept(new Coding(cat.getSystem(), cat.toCode(), cat.getDefinition())));
		
		r.setAuthoredOn(when);// the date of the prescription
		r.setOccurrence(new DateTimeType(date)); // the date of the order
		Reference ref = new Reference();
		ref.setIdentifier(new Identifier().setValue(requester));
		
		r.setRequester(ref);
		
		Annotation ann = new Annotation();
		ann.setText("Details for the order: " + details);
		r.addNote(ann);
		
		return r;
	}
	
}
