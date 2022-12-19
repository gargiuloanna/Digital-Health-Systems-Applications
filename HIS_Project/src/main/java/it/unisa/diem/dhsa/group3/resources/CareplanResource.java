package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.CarePlan;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Goal;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class CareplanResource extends BaseResource{

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
	private String REASONCODE; //o è un numero o è null
	
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
		return "CareplanResource [Id =" + super.getId()+ ", START=" + START+ ", STOP=" + STOP + ", PATIENT=" + PATIENT + ", ENCOUNTER="
				+ ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", REASONCODE=" + REASONCODE
				+ ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}



	@Override
	public Resource createResource() {
		CarePlan c = new CarePlan();
		
		//add identifier
		c.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());
		
		//add period
		Period p = new Period();
		p.setEnd(STOP).setStart(START);
		c.setPeriod(p);
		
		//set patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); //get the patient with id PATIENT
		c.setSubjectTarget(patient);
		
		//set encounter
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		c.setEncounterTarget(encounter);
		
		//code --description, 
		Goal g = new Goal();
		c.addGoalTarget().setDescription(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));
		
		//reason code  and description
		c.addCategory(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));
		
		return c;
	}
	
}
