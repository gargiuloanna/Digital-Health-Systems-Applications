package it.unisa.diem.dhsa.group3.resources;

import com.opencsv.bean.CsvBindByName;

/**
 * 
 * This class represent the base class to map the FHIR Resource Organization
 *
 */

public abstract class BaseOrganization extends BaseResource{

	@CsvBindByName
	private String NAME = "";

	@CsvBindByName
	private String ADDRESS = "";

	@CsvBindByName
	private String CITY = "";
	
	@CsvBindByName
	private String ZIP;
	
	@CsvBindByName
	private String PHONE = "";
	
	@CsvBindByName
	private Float REVENUE;

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
	
	/**
	 * This method returns the string representation of the resource class
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "BaseOrganization [Id=" + super.getId() + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", ZIP=" + ZIP
				+ ", PHONE=" + PHONE + ", REVENUE=" + REVENUE + "]";
	}
	
	

}
