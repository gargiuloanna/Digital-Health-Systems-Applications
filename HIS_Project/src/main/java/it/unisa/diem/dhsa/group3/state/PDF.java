package it.unisa.diem.dhsa.group3.state;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


public final class PDF {
	private static PDDocument doc = new PDDocument();
	private static PDPage page = new PDPage();
	private static PDPageContentStream content;

	
	
	public static void createPDF(String patient, String encounter, String conclusion, String details, String report_number, String request, String study) throws IOException {
		doc.addPage(page);
		
			content = new PDPageContentStream(doc, page);
			content.beginText();
			content.setFont(PDType1Font.TIMES_BOLD, 16);
			content.newLineAtOffset(200, 750);
			content.showText("Hospital Information System");
			content.newLineAtOffset(-170, -70);
			content.setFont(PDType1Font.TIMES_ROMAN, 14);
			content.showText("Patient n. " + patient + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Encounter  n. " + encounter + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Description: " + details + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Diagnosis " + conclusion + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Refer to Request n. " + request + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Study n.  " + study + " ");
			content.newLineAtOffset(0, -70);
			content.showText("Diagnostic Report  n." + report_number  + " ");
			//String dicom = "a17d18afe1a71.2.840.99999999.23660322.844779366809.dcm";
			//PDImageXObject image = PDImageXObject.createFromFile("C:\\Users\\annin\\Documents\\coherent-11-17-2022\\output\\dicom\\" + dicom, doc);
			//content.drawImage(image, 0, -10);
			content.endText();
			content.close();
			doc.save("Report" + request + ".pdf");
			doc.close();
			
	}
	
	public static void  loadPDF(String report_number) throws IOException {
		File file = new File("Report" + report_number + ".pdf");
		System.out.println("hello");
		Desktop.getDesktop().open(file);
	}
	
}
