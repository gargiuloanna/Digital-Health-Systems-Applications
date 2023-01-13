package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.codesystems.ConditionCategory;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ConditionResource extends BaseResource {

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

	@Override
	public String toString() {
		return "ConditionResource [Id=" + super.getId() + ", START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT + ", ENCOUNTER="
				+ ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + "]";
	}

	@Override
	public Resource createResource() {

		// Definition of the condition resource with the reference to the patient
		// involved
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		Condition c = new Condition(new Reference(patient));

		// Definition of the considered profile
		c.setMeta(new Meta().addProfile(
				"http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition-problems-health-concerns"));
		// add identifier
		c.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());

		// add period
		Period period = new Period();
		if (STOP != null) {
			period.setStart(START).setEnd(STOP);
		} else {
			period.setStart(START);
		}
		c.setOnset(period);

		// set category assigned to the condition
		c.getCategory()
				.add(new CodeableConcept(new Coding(ConditionCategory.ENCOUNTERDIAGNOSIS.toCode(),
						ConditionCategory.ENCOUNTERDIAGNOSIS.getSystem(),
						ConditionCategory.ENCOUNTERDIAGNOSIS.getDefinition())));
		// add encounter reference
		Encounter e = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		c.setEncounter(new Reference(e));

		// add the snomed code about the diagnosis with the description
		c.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));

		return c;
	}

}
