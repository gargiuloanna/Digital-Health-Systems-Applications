package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;
import org.hl7.fhir.r4.model.AllergyIntolerance;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;
/**
 * 
 * This class allows to map the FHIR Resource AllergyIntollerance
 * 
 */
public class AllergyIntoleranceResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date START;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date STOP;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String ENCOUNTER = "";

	@CsvBindByName
	private String CODE;

	@CsvBindByName
	private String DESCRIPTION = "";

	
	public Date getSTART() {
		return START;
	}

	public void setSTART(Date sTART) {
		START = sTART;
	}

	public Date getSTOP() {
		return STOP;
	}

	public void setSTOP(Date sTOP) {
		STOP = sTOP;
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

	/**
	 * This method returns the string representation of the resource class
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "AllergyIntoleranceResource [Id=" + super.getId() + ", START=" + START + ", STOP=" + STOP + ", PATIENT="
				+ PATIENT + ", ENCOUNTER=" + ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + "]";
	}
	
	/**
	 * This method creates the AllergyIntolerance Resource by mapping the fields of the correlated csv
	 * @return the FHIR AllergyIntolerance Resource 
	 */
	@Override
	public Resource createResource() {

		// add the patient who has the allergy or intolerance (field: patient)
		Patient p = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		AllergyIntolerance allergy = new AllergyIntolerance(new Reference(p));

		// Definition of the considered profile
		allergy.setMeta(
				new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-allergyintolerance"));

		// add identifier
		allergy.addIdentifier().setSystem("https://www.uuidgenerator.net/").setValue(super.getId());

		// add date the allergy was diagnosed and the clinical status (field: start)
		// clinical status is not present in the csv data but it is a must have value
		// required by the profile.
		allergy.setOnset(new DateTimeType(START));
		allergy.setClinicalStatus(new CodeableConcept(
				new Coding("http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical", "active", "Active")));

		// add the date the allergy stopped(for us it is the last known occurrence of
		// the action event)-->(field: STOP)
		if (STOP != null)
			allergy.setLastOccurrence(STOP);
		allergy.setClinicalStatus(new CodeableConcept(new Coding(
				"http://terminology.hl7.org/CodeSystem/allergyintolerance-clinical", "inactive", "Inactive")));

		// add encounter when allergy was diagnosed
		Encounter e = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		allergy.setEncounter(new Reference(e));

		// add SNOMED code for an allergy or intolerance statement (fields: code, description)
		allergy.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));

		return allergy;
	}

}
