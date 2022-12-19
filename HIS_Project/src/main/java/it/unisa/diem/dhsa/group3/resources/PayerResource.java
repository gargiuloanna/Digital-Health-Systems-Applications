package it.unisa.diem.dhsa.group3.resources;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.codesystems.OrganizationType;

import com.opencsv.bean.CsvBindByName;

public class PayerResource extends BaseResource{
	
	//Id,NAME,ADDRESS,CITY,STATE_HEADQUARTERED,ZIP,PHONE,AMOUNT_COVERED,AMOUNT_UNCOVERED,REVENUE,COVERED_ENCOUNTERS,
	//UNCOVERED_ENCOUNTERS,COVERED_MEDICATIONS,UNCOVERED_MEDICATIONS,COVERED_PROCEDURES,UNCOVERED_PROCEDURES,COVERED_IMMUNIZATIONS,
	//UNCOVERED_IMMUNIZATIONS,UNIQUE_CUSTOMERS,QOLS_AVG,MEMBER_MONTHS
	
	
	@CsvBindByName
	private String Id;
	
	@CsvBindByName
	private String NAME = "";
	
	@CsvBindByName
	private String ADDRESS = "";
	
	@CsvBindByName
	private String CITY = "";
	
	@CsvBindByName
	private String STATE = "";
	
	@CsvBindByName
	private String ZIP;
	
	@CsvBindByName
	private String PHONE;
	
	@CsvBindByName
	private Float AMOUNT_COVERED;
	
	@CsvBindByName
	private Float AMOUNT_UNCOVERED;	
	
	@CsvBindByName
	private Float REVENUE;
	
	@CsvBindByName
	private int COVERED_ENCOUNTERS;
	
	@CsvBindByName
	private int UNCOVERED_ENCOUNTERS;
	
	@CsvBindByName
	private int COVERED_MEDICATIONS;
	
	@CsvBindByName
	private int UNCOVERED_MEDICATIONS;
	
	@CsvBindByName
	private int COVERED_PROCEDURES;
	
	@CsvBindByName
	private int UNCOVERED_PROCEDURES;
	
	@CsvBindByName
	private int COVERED_IMMUNIZATIONS;
	
	@CsvBindByName
	private int UNCOVERED_IMMUNIZATIONS;
	
	@CsvBindByName
	private int UNIQUE_CUSTOMERS;
	
	@CsvBindByName
	private Float QOLS_AVG;
	
	@CsvBindByName
	private int MEMBER_MONTHS;
	
	

	public Float getAMOUNT_COVERED() {
		return AMOUNT_COVERED;
	}



	public void setAMOUNT_COVERED(Float aMOUNT_COVERED) {
		AMOUNT_COVERED = aMOUNT_COVERED;
	}



	public Float getAMOUNT_UNCOVERED() {
		return AMOUNT_UNCOVERED;
	}



	public void setAMOUNT_UNCOVERED(Float aMOUNT_UNCOVERED) {
		AMOUNT_UNCOVERED = aMOUNT_UNCOVERED;
	}



	public int getCOVERED_ENCOUNTERS() {
		return COVERED_ENCOUNTERS;
	}



	public void setCOVERED_ENCOUNTERS(int cOVERED_ENCOUNTERS) {
		COVERED_ENCOUNTERS = cOVERED_ENCOUNTERS;
	}



	public int getUNCOVERED_ENCOUNTERS() {
		return UNCOVERED_ENCOUNTERS;
	}



	public void setUNCOVERED_ENCOUNTERS(int uNCOVERED_ENCOUNTERS) {
		UNCOVERED_ENCOUNTERS = uNCOVERED_ENCOUNTERS;
	}



	public int getCOVERED_MEDICATIONS() {
		return COVERED_MEDICATIONS;
	}



	public void setCOVERED_MEDICATIONS(int cOVERED_MEDICATIONS) {
		COVERED_MEDICATIONS = cOVERED_MEDICATIONS;
	}



	public int getUNCOVERED_MEDICATIONS() {
		return UNCOVERED_MEDICATIONS;
	}



	public void setUNCOVERED_MEDICATIONS(int uNCOVERED_MEDICATIONS) {
		UNCOVERED_MEDICATIONS = uNCOVERED_MEDICATIONS;
	}



	public int getCOVERED_PROCEDURES() {
		return COVERED_PROCEDURES;
	}



	public void setCOVERED_PROCEDURES(int cOVERED_PROCEDURES) {
		COVERED_PROCEDURES = cOVERED_PROCEDURES;
	}



	public int getUNCOVERED_PROCEDURES() {
		return UNCOVERED_PROCEDURES;
	}



	public void setUNCOVERED_PROCEDURES(int uNCOVERED_PROCEDURES) {
		UNCOVERED_PROCEDURES = uNCOVERED_PROCEDURES;
	}



	public int getCOVERED_IMMUNIZATIONS() {
		return COVERED_IMMUNIZATIONS;
	}



	public void setCOVERED_IMMUNIZATIONS(int cOVERED_IMMUNIZATIONS) {
		COVERED_IMMUNIZATIONS = cOVERED_IMMUNIZATIONS;
	}



	public int getUNCOVERED_IMMUNIZATIONS() {
		return UNCOVERED_IMMUNIZATIONS;
	}



	public void setUNCOVERED_IMMUNIZATIONS(int uNCOVERED_IMMUNIZATIONS) {
		UNCOVERED_IMMUNIZATIONS = uNCOVERED_IMMUNIZATIONS;
	}



	public int getUNIQUE_CUSTOMERS() {
		return UNIQUE_CUSTOMERS;
	}



	public void setUNIQUE_CUSTOMERS(int uNIQUE_CUSTOMERS) {
		UNIQUE_CUSTOMERS = uNIQUE_CUSTOMERS;
	}



	public Float getQOLS_AVG() {
		return QOLS_AVG;
	}



	public void setQOLS_AVG(Float qOLS_AVG) {
		QOLS_AVG = qOLS_AVG;
	}



	public int getMEMBER_MONTHS() {
		return MEMBER_MONTHS;
	}



	public void setMEMBER_MONTHS(int mEMBER_MONTHS) {
		MEMBER_MONTHS = mEMBER_MONTHS;
	}



	public String getId() {
		return Id;
	}



	public void setId(String id) {
		Id = id;
	}



	public String getNAME() {
		return NAME;
	}



	public void setNAME(String nAME) {
		NAME = nAME;
	}



	public String getADDRESS() {
		return ADDRESS;
	}



	public void setADDRESS(String aDDRESS) {
		ADDRESS = aDDRESS;
	}



	public String getCITY() {
		return CITY;
	}



	public void setCITY(String cITY) {
		CITY = cITY;
	}



	public String getSTATE() {
		return STATE;
	}



	public void setSTATE(String sTATE) {
		STATE = sTATE;
	}



	public String getZIP() {
		return ZIP;
	}



	public void setZIP(String zIP) {
		ZIP = zIP;
	}

	public String getPHONE() {
		return PHONE;
	}



	public void setPHONE(String pHONE) {
		PHONE = pHONE;
	}



	public Float getREVENUE() {
		return REVENUE;
	}



	public void setREVENUE(Float rEVENUE) {
		REVENUE = rEVENUE;
	}

	@Override
	public String toString() {
		return "PayerResource [Id=" + Id + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", STATE="
				+ STATE + ", ZIP=" + ZIP + ", PHONE=" + PHONE + ", AMOUNT_COVERED=" + AMOUNT_COVERED
				+ ", AMOUNT_UNCOVERED=" + AMOUNT_UNCOVERED + ", REVENUE=" + REVENUE + ", COVERED_ENCOUNTERS="
				+ COVERED_ENCOUNTERS + ", UNCOVERED_ENCOUNTERS=" + UNCOVERED_ENCOUNTERS + ", COVERED_MEDICATIONS="
				+ COVERED_MEDICATIONS + ", UNCOVERED_MEDICATIONS=" + UNCOVERED_MEDICATIONS + ", COVERED_PROCEDURES="
				+ COVERED_PROCEDURES + ", UNCOVERED_PROCEDURES=" + UNCOVERED_PROCEDURES + ", COVERED_IMMUNIZATIONS="
				+ COVERED_IMMUNIZATIONS + ", UNCOVERED_IMMUNIZATIONS=" + UNCOVERED_IMMUNIZATIONS + ", UNIQUE_CUSTOMERS="
				+ UNIQUE_CUSTOMERS + ", QOLS_AVG=" + QOLS_AVG + ", MEMBER_MONTHS=" + MEMBER_MONTHS + "]";
	}



	public Resource createResource() {
		Organization payer = new Organization();
		payer.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		
		//specify that the type of the organization is payer
		payer.addType(new CodeableConcept(new Coding(OrganizationType.PAY.getSystem(), OrganizationType.PAY.toCode(), OrganizationType.PAY.getDefinition())));

		//add name
		payer.setName(NAME);
		
		//add address
		payer.addAddress().setCity(CITY).addLine(ADDRESS).setPostalCode(ZIP).setState(STATE);
		
		//add phone
		//contact point -> phone
		payer.addTelecom().setSystem(ContactPointSystem.PHONE).setValue(PHONE);
		
		Coverage coverage = new Coverage();
		//amount uncovered is what the patient has to play on their own since it is not covered by insurance
		coverage.addCostToBeneficiary().setValue(new Money().setCurrency("USD").setValue(AMOUNT_UNCOVERED));
		
		return payer;
		
	}

	
	
	
	
	
	
	

}
