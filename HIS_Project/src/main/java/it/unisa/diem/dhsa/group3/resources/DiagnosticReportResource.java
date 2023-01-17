package it.unisa.diem.dhsa.group3.resources;

import java.io.ByteArrayInputStream;

import com.aspose.imaging.Image;
import com.aspose.imaging.fileformats.dicom.DicomImage;
import com.aspose.imaging.fileformats.dicom.DicomPage;
import com.aspose.imaging.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.imaging.imageoptions.PngOptions;
import com.aspose.imaging.imageoptions.TiffOptions;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.pixelmed.dicom.Attribute;
import com.pixelmed.dicom.AttributeList;
import com.pixelmed.dicom.AttributeListFunctionalGroupsTableModelAllFrames;
import com.pixelmed.dicom.DicomException;
import com.pixelmed.dicom.DicomInputStream;
import com.pixelmed.dicom.TagFromName;
import com.pixelmed.display.DicomImageViewer;

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
		//String[] elems = this.path.split("_");
		//patientId = elems[elems.length - 1].substring(0, 36);
		//System.out.println(patientId);

		DicomImage dicomImage = (DicomImage) DicomImage.load(file.getCanonicalPath());
		// Save each page as an individual PNG image.
		System.out.println(dicomImage.getDicomPages().length);
		for (DicomPage dicomPage : dicomImage.getDicomPages()) {
			// Generate a file name based on the page index.
			//if(dicomPage.getIndex() == 129) {
				String fileName = String.format("DICOM_to_PNG.%d.tiff", dicomPage.getIndex());
				// Save as PNG.
				System.out.println("YES");
				dicomPage.save("src/main/resources/" + fileName, new TiffOptions(TiffExpectedFormat.TiffNoCompressionBw));
			//} else System.out.println("not");
			
		}
		System.out.println("finished");
		
		try (DicomInputStream my_image = new DicomInputStream(file)) {
			AttributeList list = new AttributeList();
			list.read(file);
			System.out.println(list.get(TagFromName.PixelData));
			Attribute a = list.get(TagFromName.PixelData);
			byte[] pixel_data = a.getByteValues(false);
			pixelData = new int[pixel_data.length / 2];
			int tmp1, tmp2;
			for (int i = 0; i < pixel_data.length; i += 2) {
				int index = i / 2;
				tmp1 = pixel_data[i];
				tmp2 = pixel_data[i + 1];
				if (tmp1 < 0)
					tmp1 += 256;
				if (tmp2 < 0)
					tmp2 += 256;
				pixelData[index] = tmp1 * 256 + tmp2;
				/*
				 * System.out.println(tmp1); System.out.println(tmp2);
				 * System.out.println(pixelData[index]); System.out.println(tmp1*256 + tmp2);
				 * System.out.println(); if (i>10) break;
				 */
			}
			System.out.println(pixelData.length);

			String patientName = Attribute.getDelimitedStringValuesOrEmptyString(list, TagFromName.PatientName);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (DicomException e) {
			e.printStackTrace();
		}

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
