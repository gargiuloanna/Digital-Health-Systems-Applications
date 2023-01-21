package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.*;
import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ImagingStudyResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date DATE;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String ENCOUNTER = "";

	@CsvBindByName
	private String BODYSITE_CODE;

	@CsvBindByName
	private String BODYSITE_DESCRIPTION = "";

	@CsvBindByName
	private String MODALITY_CODE;

	@CsvBindByName
	private String MODALITY_DESCRIPTION = "";

	@CsvBindByName
	private String SOP_CODE;

	@CsvBindByName
	private String SOP_DESCRIPTION = "";

	public ImagingStudyResource(Date dATE, String pATIENT, String eNCOUNTER, String bODYSITE_CODE,
			String bODYSITE_DESCRIPTION, String mODALITY_CODE, String mODALITY_DESCRIPTION, String sOP_CODE,
			String sOP_DESCRIPTION) {
		super();
		DATE = dATE;
		PATIENT = pATIENT;
		ENCOUNTER = eNCOUNTER;
		BODYSITE_CODE = bODYSITE_CODE;
		BODYSITE_DESCRIPTION = bODYSITE_DESCRIPTION;
		MODALITY_CODE = mODALITY_CODE;
		MODALITY_DESCRIPTION = mODALITY_DESCRIPTION;
		SOP_CODE = sOP_CODE;
		SOP_DESCRIPTION = sOP_DESCRIPTION;
	}

	public Date getDATE() {
		return DATE;
	}

	public void setDATE(Date dATE) {
		DATE = dATE;
	}

	public String getPATIENT() {
		return PATIENT;
	}

	public void setPATIENT(String pATIENT) {
		PATIENT = pATIENT;
	}

	public String getENCOUNTER() {
		return ENCOUNTER;
	}

	public void setENCOUNTER(String eNCOUNTER) {
		ENCOUNTER = eNCOUNTER;
	}

	public String getBODYSITE_CODE() {
		return BODYSITE_CODE;
	}

	public void setBODYSITE_CODE(String bODYSITE_CODE) {
		BODYSITE_CODE = bODYSITE_CODE;
	}

	public String getBODYSITE_DESCRIPTION() {
		return BODYSITE_DESCRIPTION;
	}

	public void setBODYSITE_DESCRIPTION(String bODYSITE_DESCRIPTION) {
		BODYSITE_DESCRIPTION = bODYSITE_DESCRIPTION;
	}

	public String getMODALITY_CODE() {
		return MODALITY_CODE;
	}

	public void setMODALITY_CODE(String mODALITY_CODE) {
		MODALITY_CODE = mODALITY_CODE;
	}

	public String getMODALITY_DESCRIPTION() {
		return MODALITY_DESCRIPTION;
	}

	public void setMODALITY_DESCRIPTION(String mODALITY_DESCRIPTION) {
		MODALITY_DESCRIPTION = mODALITY_DESCRIPTION;
	}

	public String getSOP_CODE() {
		return SOP_CODE;
	}

	public void setSOP_CODE(String sOP_CODE) {
		SOP_CODE = sOP_CODE;
	}

	public String getSOP_DESCRIPTION() {
		return SOP_DESCRIPTION;
	}

	public void setSOP_DESCRIPTION(String sOP_DESCRIPTION) {
		SOP_DESCRIPTION = sOP_DESCRIPTION;
	}

	@Override
	public String toString() {
		return "ImagingStudyResource [Id =" + super.getId() + DATE + ", PATIENT=" + PATIENT + ", ENCOUNTER=" + ENCOUNTER
				+ ", BODYSITE_CODE=" + BODYSITE_CODE + ", BODYSITE_DESCRIPTION=" + BODYSITE_DESCRIPTION
				+ ", MODALITY_CODE=" + MODALITY_CODE + ", MODALITY_DESCRIPTION=" + MODALITY_DESCRIPTION + ", SOP_CODE="
				+ SOP_CODE + ", SOP_DESCRIPTION=" + SOP_DESCRIPTION + "]";
	}

	@Override
	public Resource createResource() {

		// Representation of the content produced in a DICOM imaging study. A study
		// comprises a set of series, each of which includes a set of Service-Object
		// Pair Instances (SOP Instances - images or other data) acquired or produced in
		// a common context. A series is of only one modality (e.g. X-ray, CT, MR,
		// ultrasound), but a study may have multiple series of different modalities.
		ImagingStudy im = new ImagingStudy();
		ImagingStudy.ImagingStudySeriesComponent comp = new ImagingStudy.ImagingStudySeriesComponent();
		ImagingStudy.ImagingStudySeriesInstanceComponent instance = new ImagingStudy.ImagingStudySeriesInstanceComponent();

		// add identifier
		im.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());

		// add date and the time the study was conducted (field: date)
		im.setStarted(DATE);

		// add patient (the subject of the imaging study)--> (field: patient)
		try {
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		im.setSubject(new Reference(patient));
		}catch (NullPointerException e){
		im.setSubject(new Reference().setIdentifier(new Identifier().setValue(PATIENT)));
		}
		

		// add encounter reference --> (field: encounter)
		try {
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		im.setEncounter(new Reference(encounter));
		} catch (NullPointerException e){
		im.setEncounter(new Reference().setIdentifier(new Identifier().setValue(ENCOUNTER)));
		}
		
		// add body (SNOMED codification) --> the anatomical structures examined in the
		// series sequence -->(fields: bodysite_code, bodysite_description)
		comp.setBodySite(new Coding("https://www.snomed.org/", BODYSITE_CODE, BODYSITE_DESCRIPTION));

		// add modality (DICOM codification) of the series --> (fields: modality_code, modality_description)
		comp.setModality(new Coding("https://dicom.nema.org/", MODALITY_CODE, MODALITY_DESCRIPTION));

		// add SOP (DICOM codification)--> The DICOM SOP Instance UID for this image or
		// other DICOM content (fields: sop_code, sop_description).
		instance.setSopClass(new Coding("https://dicom.nema.org/", SOP_CODE, SOP_DESCRIPTION));
		comp.addInstance(instance);

		return im.addSeries(comp);
	}

}
