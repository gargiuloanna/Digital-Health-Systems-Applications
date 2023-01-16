package it.unisa.diem.dhsa.group3.resources;

import com.aspose.imaging.fileformats.dicom.DicomImage;
import com.aspose.imaging.fileformats.dicom.DicomPage;
import com.aspose.imaging.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.imaging.imageoptions.TiffOptions;

import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;

import com.pixelmed.dicom.Attribute;
import com.pixelmed.dicom.AttributeList;
import com.pixelmed.dicom.DicomException;
import com.pixelmed.dicom.DicomInputStream;
import com.pixelmed.dicom.TagFromName;

import org.dcm4che2.imageio.plugins.dcm.DicomImageReadParam;
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

public class DiagnosticReportResource extends BaseResource {

	ServiceRequest serviceRequest;
	Encounter encounter;
	ImagingStudy imagingStudy;
	String conclusion;
	Patient patient;
	String path;
	String patientId;
	int[] pixelData;

	public DiagnosticReportResource() {
		super();
	}

	public DiagnosticReportResource(String path, Resource service_request, Resource imaging_study, String conclusion) {

	}

	public DiagnosticReportResource(File file) throws IOException {
		this.path = file.getName();
		File myDicomFile = new File("IM-0001-0001.dcm");
        DicomInputStream dis = new DicomInputStream(myDicomFile);
        Iterator<ImageReader> iter = ImageIO.getImageReadersByFormatName("DICOM");
        ImageReader reader = (ImageReader) iter.next();
        DicomImageReadParam param = (DicomImageReadParam) reader.getDefaultReadParam();
        ImageInputStream iis = ImageIO.createImageInputStream(myDicomFile);
        reader.setInput(iis, false);
        BufferedImage bi = reader.read(0, param);

        File myJpegFile = new File("IM-0001-0001.jpg");
        OutputStream output = new BufferedOutputStream(new FileOutputStream(myJpegFile));


	}
	
	byte[] fromIntToByte(int[] data) {
		byte[] out = new byte[data.length];
		for(int i=0; i<data.length; i++) {
			out[i] = (byte) (data[i]/256);
		}
		return out;
	}

	public byte[] getPixelDataAsByte() {
		byte[] a = fromIntToByte(pixelData);
		return a;
	}

	public void setPixelData(int[] pixelData) {
		this.pixelData = pixelData;
	}

	@Override
	public Resource createResource() {
		Reference serviceRequestRef = new Reference(serviceRequest);
		Reference encounterRef = new Reference(encounter);
		Reference imagingStudyRef = new Reference(imagingStudy);
		Reference patientRef = new Reference(patient);

		DiagnosticReport dr = new DiagnosticReport();
		dr.addBasedOn(serviceRequestRef); // the use of target is deprecated
		dr.addCategory(new CodeableConcept(
				new Coding("http://terminology.hl7.org/CodeSystem/v2-0074", "1", "Diagnostic Imaging")));

		// set code
		// 11541-0 deprecated https://loinc.org/11541-0/ mapped onto 24590-2
		dr.getCode().addCoding().setCode("24590-2").setSystem("http://loinc.org").setDisplay("MR Brain");
		dr.setConclusion(conclusion);
		dr.setEncounterTarget(encounter);
		dr.setEncounter(encounterRef);
		dr.setIdentifier(serviceRequest.getIdentifier()); // all the identifiers of service request are identifiers for
															// report

		dr.addImagingStudy(imagingStudyRef);
		dr.setStatus(DiagnosticReportStatus.FINAL); // if exists: APPENDED
		dr.setSubjectTarget(patient);
		dr.setSubject(patientRef);

		Attachment content = new Attachment();

		Media media = new Media();
		media.setStatus(MediaStatus.COMPLETED);
		media.setContent(content);
		media.addBasedOn(serviceRequestRef);
		media.setEncounterTarget(encounter);
		media.setEncounter(encounterRef);
		media.setIdentifier(serviceRequest.getIdentifier()); // all the identifiers of service request are identifiers
																// for report
		// media.setDevice(null);
		// frames height modality
		media.addPartOf(imagingStudyRef);
		media.setSubject(patientRef);
		dr.addMedia(new DiagnosticReport.DiagnosticReportMediaComponent(new Reference(media)));

		return dr;

	}

	private Resource getResource(String id) {
		return null;
	}

}
