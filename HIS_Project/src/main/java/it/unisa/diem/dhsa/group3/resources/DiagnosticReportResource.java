package it.unisa.diem.dhsa.group3.resources;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;

import com.aspose.imaging.DataRecoveryMode;
import com.aspose.imaging.LoadOptions;
import com.aspose.imaging.fileformats.dicom.DicomImage;
import com.aspose.imaging.fileformats.dicom.DicomPage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import it.unisa.diem.dhsa.group3.state.Memory;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;

import org.hl7.fhir.r4.model.Attachment;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.DiagnosticReport.DiagnosticReportStatus;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.Media;
import org.hl7.fhir.r4.model.Media.MediaStatus;

import java.util.Arrays;
import java.util.Base64;

/**
 * This class allow to build the FHIR Resource DiagnosticReport
 */
public class DiagnosticReportResource extends BaseResource {

	String serviceRequest;
	String encounter;
	String imagingStudy;
	String conclusion;
	String path;
	String patientId;
	byte[] pixelData;
	int frames = 0;
	
	
	public String getServiceRequest() {
		return serviceRequest;
	}

	public void setServiceRequest(String serviceRequest) {
		this.serviceRequest = serviceRequest;
	}

	public String getEncounter() {
		return encounter;
	}

	public void setEncounter(String encounter) {
		this.encounter = encounter;
	}

	public String getImagingStudy() {
		return imagingStudy;
	}

	public void setImagingStudy(String imagingStudy) {
		this.imagingStudy = imagingStudy;
	}

	public byte[] getPixelData() {
		return pixelData;
	}

	public void setPixelData(byte[] pixelData) {
		this.pixelData = pixelData;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	
	/**
	 * This method returns the string representation of the resource class
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "DiagnosticReportResource [serviceRequest=" + serviceRequest + ", encounter=" + encounter
				+ ", imagingStudy=" + imagingStudy + ", conclusion=" + conclusion + ", path=" + path + ", patientId="
				+ patientId + ", pixelData=" + Arrays.toString(pixelData) + ", frames=" + frames + "]";
	}

	/**
	 * This method takes all the frames of the image, turns them into byte arrays and associates them to the Object
	 * @param file - File representing the image to associate with the DiagnosticReportResource object
	 */
	public void setImage(File file) {
		this.path = file.getName();
		try {
			this.path = file.getCanonicalPath();
			handlePixelData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	/**
	 * Public Empty Constructor
	 */
	public DiagnosticReportResource() {
		super();
	}

	/**
	 * Public Constructor with fields mapped from FHIR Resources
	 * @param path - String
	 * @param service_request - FHIR Resource
	 * @param imaging_study - FHIR Resource
	 * @param conclusion - FHIR Resource
	 */
	public DiagnosticReportResource(String path, Resource service_request, Resource imaging_study, String conclusion) {

	}
	
	
	private void handlePixelData() {
		
		LoadOptions lo = new LoadOptions();
		lo.setDataRecoveryMode(DataRecoveryMode.MaximalRecover);
		DicomImage dicomImage = (DicomImage) DicomImage.load(this.path, lo);

		for (DicomPage dicomPage : dicomImage.getDicomPages()) {
			// Generate a file name based f the page index.

			BufferedImage bi = dicomPage.toBitmap();
			ByteArrayOutputStream baos = null;
			try {
				baos = new ByteArrayOutputStream();
				ImageIO.write(bi, "png", baos);

				baos.flush();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					baos.close();
				} catch (Exception e) {
				}
			}
			byte[] bytes = baos.toByteArray();
			
			this.pixelData = bytes;
			this.frames = dicomImage.getPageCount();

		}
	}
	
	/**
	 * This method tries to read an image
	 * @param bytes to read
	 * @throws RuntimeException
	 */
	public static void getImageFromByte(byte[] bytes) {
		InputStream is = new ByteArrayInputStream(bytes);
		System.out.println(is);
		BufferedImage bin; // new BufferedImage(256, 256, BufferedImage.TYPE_BYTE_GRAY);
		try {
			bin = ImageIO.read(is);
			System.out.println(bin);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	

	/**
	 * This method create a byte array starting from pixelData field 
	 * @return byte array of pixelData
	 */
	public byte[] getEncoded() {
		return Base64.getEncoder().encode(this.pixelData);
	}

	/**
	 * This method creates the DiagnosticReport Resource by mapping the fields of the DiagnosticReportResource Object
	 * @return the FHIR DiagnosticReport Resource
	 */
	@Override
	public Resource createResource() {
		Reference serviceRequestRef = new Reference().setIdentifier(new Identifier().setValue(serviceRequest));
		Reference encounterRef = new Reference().setIdentifier(new Identifier().setValue(encounter));
		Reference imagingStudyRef = new Reference().setIdentifier(new Identifier().setValue(imagingStudy));
		Reference patientRef = new Reference().setIdentifier(new Identifier().setValue(patientId));

		DiagnosticReport dr = new DiagnosticReport();
		dr.addBasedOn(serviceRequestRef); // the use of target is deprecated
		dr.addCategory(new CodeableConcept(
				new Coding("http://terminology.hl7.org/CodeSystem/v2-0074", "1", "Diagnostic Imaging")));

		// set code
		// 11541-0 deprecated https://loinc.org/11541-0/ mapped onto 24590-2
		dr.getCode().addCoding().setCode("24590-2").setSystem("http://loinc.org").setDisplay("MR Brain");
		dr.setConclusion(conclusion);
		dr.setEncounter(encounterRef);
		dr.addIdentifier(new Identifier().setValue(serviceRequest).setSystem("https://www.uuidgenerator.net/dev-corner/java")); // all the identifiers of service request are identifiers for
															// report

		dr.addImagingStudy(imagingStudyRef);
		dr.setStatus(DiagnosticReportStatus.FINAL); // if exists: APPENDED
		dr.setSubject(patientRef);

		Attachment content = new Attachment();

		Media media = new Media();
		media.setStatus(MediaStatus.COMPLETED);
		media.setContent(content);
		media.addBasedOn(serviceRequestRef);
		media.setEncounter(encounterRef);
		media.addIdentifier(new Identifier().setValue(serviceRequest).setSystem("https://www.uuidgenerator.net/dev-corner/java")); // all the identifiers of service request are identifiers
																// for report
		// media.setDevice(null);
		// frames height modality
		media.addPartOf(imagingStudyRef);
		media.setSubject(patientRef);
		media.setFrames(this.frames);
		content.setData(pixelData);
		media.setContent(content);
		dr.addMedia(new DiagnosticReport.DiagnosticReportMediaComponent(new Reference(media)));

		return dr;

	}

}
