package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ObservationResource extends BaseResource{
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm'Z'")
	private Date DATE;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String ENCOUNTER = "";
	
	@CsvBindByName
	private String CODE = "";
	
	@CsvBindByName
	private String DESCRIPTION;
	
	@CsvBindByName
	private String VALUE;
	
	@CsvBindByName
	private String UNITS;
	@CsvBindByName
	private String TYPE;
	
	

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



	public String getCODE() {
		return CODE;
	}



	public void setCODE(String cODE) {
		CODE = cODE;
	}



	public String getDESCRIPTION() {
		return DESCRIPTION;
	}



	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}



	public String getVALUE() {
		return VALUE;
	}



	public void setVALUE(String vALUE) {
		VALUE = vALUE;
	}



	public String getUNITS() {
		return UNITS;
	}



	public void setUNITS(String uNITS) {
		UNITS = uNITS;
	}



	public String getTYPE() {
		return TYPE;
	}



	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	

	@Override
	public String toString() {
		return "ObservationResource [DATE=" + DATE + ", PATIENT=" + PATIENT + ", ENCOUNTER="
				+ ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", VALUE=" + VALUE + ", UNITS="
				+ UNITS + ", TYPE=" + TYPE + "]";
	}



	@Override
	public Resource createResource() {
		Observation observation = new Observation();
		
		//set date
		observation.setIssued(DATE);
		//set patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); //get the patient with id PATIENT 
		observation.setSubjectTarget(patient);
		
		//set encounter
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		observation.setEncounterTarget(encounter);
		
		//set code
		Coding coding = observation.getCode().addCoding();
		coding.setCode(CODE).setSystem("http://loinc.org").setDisplay(DESCRIPTION);
		
		//add value, unit and type --TODO: check since type is not added
		CodeableConcept concept = new CodeableConcept();
		coding.setCode(UNITS).setSystem("http://unitsofmeasure.org");
		concept.addCoding(new Coding().setCode(UNITS).setSystem("http://unitsofmeasure.org")).setText(VALUE);
		observation.setValue(concept);
		return null;
	}

}
