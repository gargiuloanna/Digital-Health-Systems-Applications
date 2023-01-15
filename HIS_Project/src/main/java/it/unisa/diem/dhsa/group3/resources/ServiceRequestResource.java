package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.*;

import it.unisa.diem.dhsa.group3.enumerations.ServiceRequestCategory;
import it.unisa.diem.dhsa.group3.enumerations.ServiceRequestCode;
import it.unisa.diem.dhsa.group3.state.Memory;

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
	private String subject; // the patient
	private String encounter;
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
		this.subject = subject;
		this.encounter = encounter;
		this.category = category;
		this.date = date;
		this.when = when;
		this.requester = requester;
		this.details = details;
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



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getEncounter() {
		return encounter;
	}



	public void setEncounter(String encounter) {
		this.encounter = encounter;
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
		return "ServiceRequestResource [id=" + id + ", statusCode=" + statusCode + ", intentCode=" + intentCode
				+ ", requestCode=" + requestCode + ", subject=" + subject + ", encounter=" + encounter + ", category="
				+ category + ", date=" + date + ", when=" + when + ", requester=" + requester + ", details=" + details
				+ "]";
	}



	@Override
	public Resource createResource() {
		ServiceRequest r = new ServiceRequest();
		// Definition of the considered profile
		r.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-servicerequest"));
		
		r.addIdentifier().setSystem("https://www.uuidgenerator.net/dev-corner/java").setValue(id);
		
		ServiceRequest.ServiceRequestStatus status = ServiceRequest.ServiceRequestStatus.fromCode(statusCode);
		r.setStatus(status);
		
		ServiceRequest.ServiceRequestIntent intent = ServiceRequest.ServiceRequestIntent.fromCode(intentCode);
		r.setIntent(intent);
		
		//add code
		ServiceRequestCode code = ServiceRequestCode.fromCode(requestCode);
		r.setCode(new CodeableConcept(new Coding(code.getSystem(), code.toCode(), code.getDefinition())));
		
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(subject); //get the patient with id PATIENT 
		r.setSubjectTarget(patient);
		
		Encounter enc = (Encounter) Memory.getMemory().get(EncounterResource.class).get(encounter);
		r.setEncounterTarget(enc);
		
		ServiceRequestCategory cat = ServiceRequestCategory.fromCode(category);
		r.addCategory(new CodeableConcept(new Coding(cat.getSystem(), cat.toCode(), cat.getDefinition())));
		
		
		r.setAuthoredOn(when);// the date of the prescription
		r.setOccurrence(new DateType(date)); // the date of the order
		
		Practitioner practitioner = (Practitioner) Memory.getMemory().get(ProviderResource.class).get(requester);
		r.setRequesterTarget(practitioner);
		
		Annotation ann = new Annotation();
		ann.setText("Details for the order: " + details);
		r.addNote(ann);
		
		return r;
	}
	
}
