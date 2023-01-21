package it.unisa.diem.dhsa.group3.state;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ServiceRequest;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.resources.DiagnosticReportResource;
import it.unisa.diem.dhsa.group3.resources.ServiceRequestResource;


public final class PDF {
	private static PDDocument doc = new PDDocument();
	private static PDPage page = new PDPage();
	private static PDPageContentStream content;
	
	public static Map<String, String> getDataFieds(DiagnosticReportResource drr) throws FhirClientConnectionException{
		String subject = drr.getPatientId();
		String serviceReq = drr.getServiceRequest();
		String encounter= drr.getEncounter();
		String imStudy = drr.getImagingStudy();
		Map<String,String> metaData = new HashMap<>();
		metaData.put("patient id", subject);
		Patient p = (Patient)ServerInteraction.getResource(Patient.class, subject);
		int index = 0;
		
		for (HumanName humanName : p.getName()) {
			if (humanName.getUse().equals(HumanName.NameUse.OFFICIAL)) {
				metaData.put("patient name", "");
				metaData.put("patient surname", "");
				if (!humanName.getGiven().isEmpty()) {
					index = humanName.getGiven().size() - 1;
					metaData.put("patient name", humanName.getGiven().get(index).getValueNotNull()); // it insert the last name in the field of the names
					metaData.put("patient surname", humanName.getFamily());
				}
				
				metaData.put("patient name prefix", "");
				if (!humanName.getPrefix().isEmpty()) {
					index = humanName.getPrefix().size() - 1;
					metaData.put("patient name prefix", humanName.getPrefix().get(index).getValueNotNull());
				}
				
				metaData.put("patient name suffix", "");
				if (!humanName.getSuffix().isEmpty()) {
					index = humanName.getSuffix().size() - 1;
					metaData.put("patient name suffix", humanName.getSuffix().get(index).getValueNotNull());
				}
			}
			metaData.put("maiden", "");
			if (humanName.getUse().equals(HumanName.NameUse.MAIDEN)) {
				metaData.put("maiden", humanName.getFamily()); // only one maiden name for person
			}		
		}
		metaData.put("birth date", p.getBirthDate().toString());
		
		Integer age = LocalDate.now().getYear() - p.getBirthDateElement().getYear();
		metaData.put("age", age.toString());
		
		metaData.put("encounter id", encounter);
		
		metaData.put("service request id", serviceReq);
		ServiceRequest sr = (ServiceRequest)ServerInteraction.getResource(ServiceRequest.class,serviceReq);
		ServiceRequestResource srr = new ServiceRequestResource(sr);
		metaData.put("date", srr.getDate().toString());
		metaData.put("imaging study id", imStudy);
		
		metaData.put("comparison","None available");
		metaData.put("technique", "Not available");
		metaData.put("findings", srr.getDetails());
		metaData.put("impression", drr.getConclusion());
		
		return metaData;
		
	}
	
	private static void writeText(int offset, List<String> report) {
		
		try {
			
			PDFont pdfFont = PDType1Font.TIMES_ROMAN;
		    float fontSize = 12;
		    float leading = 1.5f * fontSize;
		    System.out.println("leading " + leading);
	
		    PDRectangle mediabox = page.getMediaBox();
		    float margin = 72;
		    float width = mediabox.getWidth() - 2*margin;
		    float startX = mediabox.getLowerLeftX() + margin;
		    float startY = mediabox.getUpperRightY() - margin - 20;

		    content.setFont(pdfFont, fontSize);
		    content.beginText();
		    content.newLineAtOffset(startX, startY);
		    
		    for(String text: report) {
		    	List<String> lines = new ArrayList<String>();
			    int lastSpace = -1;
			    while (text.length() > 0){
			        int spaceIndex = text.indexOf(' ', lastSpace + 1);
			        if (spaceIndex < 0)
			            spaceIndex = text.length();
			        String subString = text.substring(0, spaceIndex);
			        float size = fontSize * pdfFont.getStringWidth(subString) / 1000;
			        //System.out.printf("'%s' - %f of %f\n", subString, size, width);
			        if (size > width){
			            if (lastSpace < 0)
			                lastSpace = spaceIndex;
			            subString = text.substring(0, lastSpace);
			            lines.add(subString);
			            text = text.substring(lastSpace).trim();
			            //System.out.printf("'%s' is line\n", subString);
			            lastSpace = -1;
			        }
			        else if (spaceIndex == text.length()){
			            lines.add(text);
			            //System.out.printf("'%s' is line\n", text);
			            text = "";
			        }
			        else{
			            lastSpace = spaceIndex;
			        }
			    }		    
				//content.beginText();
				
			    for (String line: lines){
			        content.showText(line);
			        content.newLineAtOffset(0, -leading);
			    }
			    content.newLineAtOffset(0, offset);
		    }
		    
		    //content.endText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	    
	
	public static void createPDF(Map<String,String> metaData) throws IOException{
		doc.addPage(page);
		
		//add icon to the file
		content = new PDPageContentStream(doc, page);
		String path = "src\\main\\java\\it\\unisa\\diem\\dhsa\\group3\\state\\icon64.png";
		File f = new File(path);
		PDImageXObject image = PDImageXObject.createFromFileByContent(f, doc);
		content.drawImage(image, 75, 725);
		
		// add title
		content.beginText();
		content.setFont(PDType1Font.TIMES_BOLD, 16);
		content.newLineAtOffset(200, 750);
		content.showText("Hospital Information System - Diagnostic Report");
		content.endText();
		
		List<String> report = new ArrayList<>();
		report.add("PATIENT: " + metaData.get("patient name prefix") + " " 
				+ metaData.get("patient name") + " " 
				+ metaData.get("patient name suffix") + " " 
				+ metaData.get("maiden") + " " 
				+ metaData.get("patient surname"));
		report.add( "PATIENT ID: " + metaData.get("patient id"));
		report.add("DOB: " + metaData.get("birth date") + " - AGE: " + metaData.get("age"));
		report.add("Diagnostic Report  n. " + metaData.get("imaging study id"));
		report.add( "Refer to Request  n. " + metaData.get("service request id"));
		report.add("EXAM DATE: " + metaData.get("date"));
		report.add("(ENCOUNTER ID) " + metaData.get("encounter id"));
		report.add("Comparison: " + metaData.get("comparison"));
		report.add("Technique: " + metaData.get("technique"));
		report.add("Findings:" + metaData.get("findings"));
		report.add("Conlusion:" + metaData.get("impression"));
		
		writeText(-10,  report);
		
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
