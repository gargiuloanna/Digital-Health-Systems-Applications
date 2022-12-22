package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Procedure;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ProcedureResource extends BaseResource{
	
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm:ss")
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
	private Float BASE_COST;
	
	@CsvBindByName
	private String REASONCODE;
	
	@CsvBindByName
	private String REASONDESCRIPTION = "";
	
	
	
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
		return "ProcedureResource [DATE=" + DATE + ", PATIENT=" + PATIENT + ", ENCOUNTER=" + ENCOUNTER + ", CODE="
				+ CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_COST=" + BASE_COST + ", REASONCODE=" + REASONCODE
				+ ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}



	@Override
	public Resource createResource() {

		Procedure p = new Procedure();
		
		// Add US Profile to the Procedure
		p.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-procedure"));
				
		//add date
		p.setPerformed(new DateTimeType(DATE));
		
		//set patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		p.setSubjectTarget(patient);
		
		//set code and description (SNOMED code) 
		p.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));
		
		//set code and description (SNOMED code) for the resource
		p.addReasonCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));
		
		// Set Encounter related to the Procedure
		Encounter e = (Encounter) Memory.getMemory().get(OrganizationResource.class).get(ENCOUNTER);
		p.setEncounterTarget(e);
		
		// Set Status of the Procedure
		p.setStatus(getStatus());
		
		return null;
	}
	
	private Procedure.ProcedureStatus getStatus() {
		if(DATE == null)
			return Procedure.ProcedureStatus.NULL;
		else if(DATE.after(DateTimeType.now().getValue()))
			return Procedure.ProcedureStatus.NOTDONE;
		else if (DATE.before(DateTimeType.now().getValue()))
			return Procedure.ProcedureStatus.COMPLETED;
		else
			return Procedure.ProcedureStatus.UNKNOWN;
	
	}

}
