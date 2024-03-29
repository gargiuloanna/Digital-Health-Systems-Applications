package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.Annotation;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Immunization;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

/**
 * This class allows to map the FHIR Resource Immunization
 */
public class ImmunizationResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date DATE;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String ENCOUNTER = "";

	@CsvBindByName
	private String CODE = "";

	@CsvBindByName
	private String DESCRIPTION = "";

	@CsvBindByName
	private Float BASE_COST;

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

	public Float getBASE_COST() {
		return BASE_COST;
	}

	public void setBASE_COST(Float bASE_COST) {
		BASE_COST = bASE_COST;
	}

	/**
	 * This method returns the string representation of the resource class
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "ImmunizationResource [Id=" + super.getId() + ",DATE=" + DATE + ", PATIENT=" + PATIENT + ", ENCOUNTER="
				+ ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_COST=" + BASE_COST + "]";
	}

	/**
	 * This method sets the status element of the immunization resource through the date field
	 * @return the status from the ImmunizationStatus enumeration
	 */
	private Immunization.ImmunizationStatus getStatus() {
		if (DATE == null)
			return Immunization.ImmunizationStatus.NULL;
		else if (DATE.after(DateTimeType.now().getValue()))
			return Immunization.ImmunizationStatus.NOTDONE;
		else if (DATE.before(DateTimeType.now().getValue()))
			return Immunization.ImmunizationStatus.COMPLETED;
		else
			return Immunization.ImmunizationStatus.ENTEREDINERROR;

	}

	/**
	 * This method creates the Immunization Resource by mapping the fields of the correlated csv
	 * @return the FHIR Immunization Resource
	 */
	@Override
	public Resource createResource() {
		Immunization i = new Immunization();
		
		// Add US Profile to the Procedure
		i.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-immunization"));

		// add identifier
		i.addIdentifier().setSystem("https://www.uuidgenerator.net").setValue(super.getId());

		// add date (field: date, a must have value)
		i.setRecorded(DATE);

		// add patient (field: patient, a must have value)
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		i.setPatient(new Reference(patient));

		// add encounter (field: encounter)
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		i.setEncounter(new Reference(encounter));

		// set vaccine code (fields: code, description, a must have value)
		i.setVaccineCode(new CodeableConcept(
				new Coding("https://www2a.cdc.gov/vaccines/iis/iisstandards/vaccines.asp?rpt=cvx", CODE, DESCRIPTION)));

		// set the status of the immunization (a must have value)
		i.setStatus(getStatus());

		// add note for BASE COST
		Annotation a = new Annotation();
		a.setText("The base cost of the vaccin is " + BASE_COST);
		i.addNote(a);

		return i;
	}

}
