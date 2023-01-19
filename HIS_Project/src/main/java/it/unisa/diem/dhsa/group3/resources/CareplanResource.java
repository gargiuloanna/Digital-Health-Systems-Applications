package it.unisa.diem.dhsa.group3.resources;


import java.util.Date;

import org.hl7.fhir.r4.model.CarePlan;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;
import it.unisa.diem.dhsa.group3.state.Memory;

public class CareplanResource extends BaseResource {

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

	@CsvBindByName
	private String REASONCODE;

	@CsvBindByName
	private String REASONDESCRIPTION = "";

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

	public String getREASONCODE() {
		return REASONCODE;
	}

	public void setREASONCODE(String rEASONCODE) {
		REASONCODE = rEASONCODE;
	}

	public String getREASONDESCRIPTION() {
		return REASONDESCRIPTION;
	}

	public void setREASONDESCRIPTION(String rEASONDESCRIPTION) {
		REASONDESCRIPTION = rEASONDESCRIPTION;
	}

	@Override
	public String toString() {
		return "CareplanResource [Id =" + super.getId() + ", START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT
				+ ", ENCOUNTER=" + ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", REASONCODE="
				+ REASONCODE + ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}

	@Override
	public Resource createResource() {

		CarePlan c = new CarePlan();

		// Definition of the considered profile
		c.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-careplan"));

		// add identifier
		c.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());

		// add period(fields: Start and Stop) and the value status of the care plan (a must have value)
		Period p = new Period();
		if (STOP != null) {
			p.setStart(START).setEnd(STOP);
			c.setStatus(CarePlan.CarePlanStatus.COMPLETED);
		} else
			p.setStart(START);
		c.setStatus(CarePlan.CarePlanStatus.ACTIVE);
		c.setPeriod(p);

		// add intent (a must have value)
		// (PLAN: The request represents an intention to ensure something occurs without
		// providing an authorization for others to act)
		c.setIntent(CarePlan.CarePlanIntent.PLAN);

		// add patient reference(must have value)-->(field: patient)
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); 
		c.setSubject(new Reference(patient));

		// add encounter reference (field: encounter)
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		c.setEncounter(new Reference(encounter));

		// add code and description of the category describing the careplan (fields: code, description)
		c.addCategory(new CodeableConcept(new Coding("https://www.snomed.org/", CODE,DESCRIPTION)));
		
		// add diagnosis code addressed by the care plan and its description (a must
		// have value for the profile)-->(fields: reasoncode, reasondescription)
		c.getAddresses().add(new Reference(new Condition().setCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)))));

		// to see a narrative summary of the patient assessment and plan of treatment (a
		// must have value for the profile)
		c.setDescription("The condition that affects the patient is "+ REASONDESCRIPTION+ ". The plan of treamentent requires "+ DESCRIPTION);
		return c;
	}

}
