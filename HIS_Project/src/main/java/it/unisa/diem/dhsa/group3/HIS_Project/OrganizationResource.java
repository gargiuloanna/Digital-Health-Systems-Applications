package it.unisa.diem.dhsa.group3.HIS_Project;

//import java.util.Date;
import java.sql.Date;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class OrganizationResource {
	
	//Id	NAME	ADDRESS	CITY	STATE	ZIP LAT	LON	PHONE	
	//REVENUE	UTILIZATION
	
	
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
	private Float LAT;
	
	@CsvBindByName
	private Float LON;
	
	@CsvBindByName
	private String PHONE;
	
	@CsvBindByName
	private Float REVENUE;
	
	@CsvBindByName
	private int UTILIZATION;
	

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



	public Float getLAT() {
		return LAT;
	}



	public void setLAT(Float lAT) {
		LAT = lAT;
	}



	public Float getLON() {
		return LON;
	}



	public void setLON(Float lON) {
		LON = lON;
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



	public int getUTILIZATION() {
		return UTILIZATION;
	}



	public void setUTILIZATION(int uTILIZATION) {
		UTILIZATION = uTILIZATION;
	}
	

	@Override
	public String toString() {
		return "EncounterResource [Id=" + Id + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", STATE="
				+ STATE + ", ZIP=" + ZIP + ", LAT=" + LAT + ", LON=" + LON + ", PHONE=" + PHONE + ", REVENUE=" + REVENUE
				+ ", UTILIZATION=" + UTILIZATION + "]";
	}



	public Resource createResource() {
		
		//o.setId(Id);
		Organization o = new Organization(); //no profile
		//add identifier
		o.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		// add the name of the organization
		o.setName(NAME);
		// Definition of the address (fields: address, city, state, zip) with the
		// extensions for the latitude and longitude
		o.addAddress().setCity(CITY).addLine(ADDRESS).setPostalCode(ZIP).setState(STATE);
		
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		o.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);
		
		//contact point -> phone
		o.addTelecom().setSystem(ContactPointSystem.PHONE).setValue(PHONE);
		
		return o;
		
		
		
		

	}

	
	
	
	
	
	
	

}
