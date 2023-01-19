package it.unisa.diem.dhsa.group3.resources;


import java.util.Date;

import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Observation;
import org.hl7.fhir.r4.model.Observation.ObservationStatus;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Quantity;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.StringType;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ObservationResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date DATE;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String ENCOUNTER = "";

	@CsvBindByName
	private String CODE;

	@CsvBindByName
	private String DESCRIPTION = "";

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
		return "ObservationResource [Id=" + super.getId() + ",DATE=" + DATE + ", PATIENT=" + PATIENT + ", ENCOUNTER=" + ENCOUNTER + ", CODE="
				+ CODE + ", DESCRIPTION=" + DESCRIPTION + ", VALUE=" + VALUE + ", UNITS=" + UNITS + ", TYPE=" + TYPE
				+ "]";
	}
	
	private Observation.ObservationStatus getStatus() {
		if (DATE == null)
			return ObservationStatus.NULL;
		else
			return ObservationStatus.FINAL;

	}

	@Override
	public Resource createResource() {
		
		Observation observation = new Observation();
		
		// set identifier
		observation.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());
		
		// set the date and time the observation was performed (field: date)
		observation.setIssued(DATE);
		
		//set the status of the observation (a must have value)
		observation.setStatus(getStatus());
		
		// set patient involved into the observation (field: patient)
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); 
		observation.setSubject(new Reference(patient));

		// set encounter (field: encounter)
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		observation.setEncounter(new Reference(encounter));

		// set code describing what was observed (field codes, description)
		Coding coding = observation.getCode().addCoding();
		coding.setCode(CODE).setSystem("http://loinc.org").setDisplay(DESCRIPTION);

		// add the value of the observation with the units according to the two types: numeric and text
		if (TYPE=="numeric") {
			Quantity value = new Quantity();
			value.setValue(Float.parseFloat(VALUE)).setSystem("http://unitsofmeasure.org").setCode(UNITS);
			observation.setValue(value);
		}else {
			observation.setValue(new StringType(VALUE.concat(UNITS)));
		}

		return observation;
	}

}
