package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class MedicationResource extends BaseResource{
	

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm:ss")
	private Date START;
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm:ss")
	private Date STOP;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String PAYER = "";
	
	@CsvBindByName
	private String ENCOUNTER = "";
	
	@CsvBindByName
	private String CODE;
	
	@CsvBindByName
	private String DESCRIPTION = "";
	
	@CsvBindByName
	private Float BASE_COST;

	@CsvBindByName
	private Float PAYER_COVERAGE;
	
	@CsvBindByName
	private int DISPENSES;
	
	@CsvBindByName
	private Float TOTALCOST;
	
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



	public String getPAYER() {
		return PAYER;
	}



	public void setPAYER(String pAYER) {
		PAYER = pAYER;
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



	public Float getPAYER_COVERAGE() {
		return PAYER_COVERAGE;
	}



	public void setPAYER_COVERAGE(Float pAYER_COVERAGE) {
		PAYER_COVERAGE = pAYER_COVERAGE;
	}



	public int getDISPENSES() {
		return DISPENSES;
	}



	public void setDISPENSES(int dISPENSES) {
		DISPENSES = dISPENSES;
	}



	public Float getTOTALCOST() {
		return TOTALCOST;
	}



	public void setTOTALCOST(Float tOTALCOST) {
		TOTALCOST = tOTALCOST;
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
		return "MedicationResource [START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT + ", PAYER=" + PAYER
				+ ", ENCOUNTER=" + ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_COST="
				+ BASE_COST + ", PAYER_COVERAGE=" + PAYER_COVERAGE + ", DISPENSES=" + DISPENSES + ", TOTALCOST="
				+ TOTALCOST + ", REASONCODE=" + REASONCODE + ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}



	@Override
	public Resource createResource() {
		// TODO Auto-generated method stub
		return null;
	}

}
