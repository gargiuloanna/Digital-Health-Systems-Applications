package it.unisa.diem.dhsa.group3.state;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.ImagingStudy;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ServiceRequest;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.resources.DiagnosticReportResource;


public final class PDF {
	private static PDDocument doc = new PDDocument();
	private static PDPage page = new PDPage();
	private static PDPageContentStream content;
	
	public static Map<String, String> getDataFieds(DiagnosticReportResource drr) throws FhirClientConnectionException{
		Patient p = (Patient)ServerInteraction.getResource(Patient.class, drr.getPatientId());
		ServiceRequest serviceReq = (ServiceRequest) ServerInteraction.getResource(ImagingStudy.class, drr.getServiceRequest());
		String encounter= drr.getEncounter();
		ImagingStudy imStudy = (ImagingStudy) ServerInteraction.getResource(ImagingStudy.class, drr.getImagingStudy());
		Map<String,String> metaData = new HashMap<>();
		metaData.put("patient id", p.getIdentifierFirstRep().getValue());
		int index = 0;
		
		//insert the first name in the field of the name
		for (HumanName humanName : p.getName()) {
			if (humanName.getUse().equals(HumanName.NameUse.OFFICIAL)) {
				if (!humanName.getGiven().isEmpty()) {
					index = humanName.getGiven().size() - 1;
					metaData.put("patient name", humanName.getGiven().get(index).getValueNotNull()); // it insert the last name in the field of the names
					metaData.put("patient surname", humanName.getFamily());
				}else {
					metaData.put("patient name", "No name available");
					metaData.put("patient surname", "No surname available");
				}
				//insert the prefix in the corresponding field
				if (!humanName.getPrefix().isEmpty()) {
					index = humanName.getPrefix().size() - 1;
					metaData.put("patient name prefix", humanName.getPrefix().get(index).getValueNotNull());
				}else {
					metaData.put("patient name prefix", "");
				}
				// it insert the first name in the corresponding field
				if (!humanName.getSuffix().isEmpty()) {
					index = humanName.getSuffix().size() - 1;
					metaData.put("patient name suffix", humanName.getSuffix().get(index).getValueNotNull());
				}else {
					metaData.put("patient name suffix", "");
				}
			}
			if (humanName.getUse().equals(HumanName.NameUse.MAIDEN)) {
				// it insert the last name in the field of the names
				metaData.put("maiden", humanName.getFamily()); // only one maiden name for person
			}else {
				metaData.put("maiden", "");
			}
		}
		metaData.put("birth date", p.getBirthDate().toString());
		
		Integer age = LocalDate.now().getYear() - p.getBirthDateElement().getYear();
		metaData.put("age", age.toString());
		
		metaData.put("encounter id", encounter);
		
		metaData.put("service request id", serviceReq.getIdentifierFirstRep().getValue());
		metaData.put("imaging study id", imStudy.getIdentifierFirstRep().getValue());
		metaData.put("imaging study modality", imStudy.getSeriesFirstRep().getModality().getDisplay());
		metaData.put("body site", imStudy.getSeriesFirstRep().getBodySite().getDisplay());
		metaData.put("date", imStudy.getStarted().toString());
		
		metaData.put("comparison","None available");
		metaData.put("technique", "Not available");
		metaData.put("findings", serviceReq.getNoteFirstRep().getText());

		metaData.put("impression", drr.getConclusion());
		
		metaData.put("requester", serviceReq.getRequester().getIdentifier().getValue());

		
		return metaData;
		
	}
	
	private static void writeNewLine(int offset, String line) {
		try {
			
			content.newLineAtOffset(0, offset);
			content.showText(line);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void createPDF(Map<String,String> metaData) throws IOException{
		doc.addPage(page);
		
		content = new PDPageContentStream(doc, page);
		content.beginText();
		content.setFont(PDType1Font.TIMES_BOLD, 16);
		content.newLineAtOffset(200, 750);
		content.showText("Hospital Information System - Diagnostic Report");
		content.newLineAtOffset(-170, -70);
		content.setFont(PDType1Font.TIMES_ROMAN, 14);
		writeNewLine(0, "PATIENT: " + metaData.get("patient name prefix") + " " 
									+ metaData.get("patient name") + " " 
									+ metaData.get("patient name suffix") + " " 
									+ metaData.get("maiden") + " " 
									+ metaData.get("patient surname"));
		writeNewLine(-30, "PATIENT ID: " + metaData.get("patient id"));
		writeNewLine(-30, "DOB: " + metaData.get("birth date") + " - AGE: " + metaData.get("age"));
		
		writeNewLine(-40, "Diagnostic Report  n. " + metaData.get("imaging study id"));
		writeNewLine(-30, "EXAM DATE: " + metaData.get("date"));
		
		writeNewLine(-40, "Refer to Request  n. " + metaData.get("service request id"));
		
		writeNewLine(-30, metaData.get("imaging study modality") + " - " + metaData.get("body site"));
		
		writeNewLine(-30, "(ENCOUNTER ID) " + metaData.get("encounter id"));
		
		writeNewLine(-40, "Comparison: " + metaData.get("comparison"));
		
		writeNewLine(-30, "Technique: " + metaData.get("technique"));
		
		writeNewLine(-30, "Findings:");
		writeNewLine(-20, metaData.get("findings"));
		
		
		writeNewLine(-20, "Conlusion:");
		writeNewLine(-20, metaData.get("impression"));
		
		
		writeNewLine(-30, "Doctor: " + metaData.get("requester"));
		content.endText();
		content.close();
		doc.save("Report" + metaData.get("service request id") + ".pdf");
		doc.close();
	}
	
	public static void  loadPDF(String report_number) throws IOException {
		File file = new File("Report" + report_number + ".pdf");
		Desktop desktop = Desktop.getDesktop();
		//windows & mac
		desktop.open(file);
	}
	
}
