package it.unisa.diem.dhsa.group3.resources;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;

import com.aspose.imaging.Color;
import com.aspose.imaging.DataRecoveryMode;
import com.aspose.imaging.Image;
import com.aspose.imaging.LoadOptions;
import com.aspose.imaging.fileformats.dicom.ColorType;
import com.aspose.imaging.fileformats.dicom.DicomImage;
import com.aspose.imaging.fileformats.dicom.DicomPage;
import com.aspose.imaging.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.imaging.imageoptions.DicomOptions;
import com.aspose.imaging.imageoptions.PngOptions;
import com.aspose.imaging.imageoptions.TiffOptions;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.print.attribute.standard.Compression;

import com.pixelmed.dicom.Attribute;
import com.pixelmed.dicom.AttributeList;
import com.pixelmed.dicom.AttributeListFunctionalGroupsTableModelAllFrames;
import com.pixelmed.dicom.DicomException;
import com.pixelmed.dicom.DicomInputStream;
import com.pixelmed.dicom.TagFromName;
import com.pixelmed.display.DicomImageViewer;

import it.unisa.diem.dhsa.group3.state.Memory;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;

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
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Media.MediaStatus;

import java.util.Base64;

public class DiagnosticReportResource extends BaseResource {

	ServiceRequest serviceRequest;
	Encounter encounter;
	ImagingStudy imagingStudy;
	String conclusion;
	Patient patient;
	String path;
	String patientId;
	byte[] pixelData;

	public DiagnosticReportResource() {
		super();
	}

	public DiagnosticReportResource(String path, Resource service_request, Resource imaging_study, String conclusion) {

	}

	public DiagnosticReportResource(File file) {
		this.path = file.getName();
		String[] elems = this.path.split("_");
		this.patientId = elems[elems.length - 1].substring(0, 36);
		try {
			this.path = file.getCanonicalPath();
			handlePixelData();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// DicomImageViewer.main(args);
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				try {
					baos.close();
				} catch (Exception e) {
				}
			}
			byte[] bytes = baos.toByteArray();
			
			this.pixelData = bytes;

		}
	}
	
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

	public byte[] getEncoded() {
		return Base64.getEncoder().encode(this.pixelData);
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
		content.setData(pixelData);
		media.setContent(content);
		dr.addMedia(new DiagnosticReport.DiagnosticReportMediaComponent(new Reference(media)));

		return dr;

	}

	private Resource getResource(String id, Class<? extends BaseResource> specificClass) {
		Resource r = Memory.getMemory().get(specificClass).get(id);
		if (r == null) {
			r = ServerInteraction.getResource(id);
		}
		return r; //returns null if empty
	}

}
