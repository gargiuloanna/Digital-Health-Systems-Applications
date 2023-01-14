package it.unisa.diem.dhsa.group3.resources;

import java.io.File;

import org.hl7.fhir.r4.model.Attachment;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatus;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.ImagingStudy;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.ServiceRequest;
import org.hl7.fhir.r4.model.Media;
import org.hl7.fhir.r4.model.Media.MediaStatus;

public class DiagnosticReportResource extends BaseResource{
	
	ServiceRequest serviceRequest;
	Encounter encounter;
	ImagingStudy imagingStudy;
	String conclusion;
	Patient patient;
	String path;
	String patientId;
	
	
	public DiagnosticReportResource() {
		super();
	}
	
	public DiagnosticReportResource(String path, Resource service_request, Resource imaging_study, String conclusion) {
		
	}
	
	public DiagnosticReportResource(File file) {
		this.path = file.getName(); 
		String[] elems = this.path.split("_");
		patientId = elems[elems.length-1].substring(0, 36);
		System.out.println(patientId);
	}
	
	@Override
	public Resource createResource() {
		Reference serviceRequestRef = new Reference(serviceRequest);
		Reference encounterRef = new Reference(encounter);
		Reference imagingStudyRef = new Reference(imagingStudy);
		Reference patientRef = new Reference(patient);
		
		
		DiagnosticReport dr = new DiagnosticReport() ;
		dr.addBasedOn(serviceRequestRef); //the use of target is deprecated
		dr.addCategory(new CodeableConcept(
				new Coding("http://terminology.hl7.org/CodeSystem/v2-0074", "1", "Diagnostic Imaging")
				));
		
		//set code 
		// 11541-0 deprecated https://loinc.org/11541-0/ mapped onto 24590-2
		dr.getCode().addCoding().setCode("24590-2").setSystem("http://loinc.org").setDisplay("MR Brain"); 
		dr.setConclusion(conclusion);
		dr.setEncounterTarget(encounter);
		dr.setEncounter(encounterRef);
		dr.setIdentifier(serviceRequest.getIdentifier()); //all the identifiers of service request are identifiers for report
		
		dr.addImagingStudy(imagingStudyRef);
		dr.setStatus(DiagnosticReportStatus.FINAL); //if exists: APPENDED
		dr.setSubjectTarget(patient);
		dr.setSubject(patientRef);
		
		
		Attachment content = new Attachment();
		
		Media media = new Media();
		media.setStatus(MediaStatus.COMPLETED);
		media.setContent(content);
		media.addBasedOn(serviceRequestRef);
		media.setEncounterTarget(encounter);
		media.setEncounter(encounterRef);
		media.setIdentifier(serviceRequest.getIdentifier()); //all the identifiers of service request are identifiers for report
		//media.setDevice(null);
		//frames height modality
		media.addPartOf(imagingStudyRef);
		media.setSubject(patientRef);
		dr.addMedia(new DiagnosticReport.DiagnosticReportMediaComponent(
				new Reference(media)));
		
		return dr;
	
		
	}
	
	private Resource getResource(String id) {
		return null;
	}
	
}
