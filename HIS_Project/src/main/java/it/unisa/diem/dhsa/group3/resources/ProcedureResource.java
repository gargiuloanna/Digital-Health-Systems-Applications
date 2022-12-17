package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

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
		// TODO Auto-generated method stub
		return null;
	}

}
