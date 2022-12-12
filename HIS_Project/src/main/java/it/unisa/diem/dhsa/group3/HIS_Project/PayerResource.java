package it.unisa.diem.dhsa.group3.HIS_Project;

//import java.util.Date;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class PayerResource {
	
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
	private String STATE_HEADQUARTERED = "";
	
	@CsvBindByName
	private String ZIP;
	
	@CsvBindByName
	private String PHONE;
	
	@CsvBindByName
	private long AMOUNT_COVERED;
	
	@CsvBindByName
	private long AMOUNT_UNCOVERED;
	
	@CsvBindByName
	private long REVENUE;
	
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


	
	public String getSTATE_HEADQUARTERED() {
		return STATE_HEADQUARTERED;
	}



	public void setSTATE_HEADQUARTERED(String sTATE_HEADQUARTERED) {
		STATE_HEADQUARTERED = sTATE_HEADQUARTERED;
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



	public long getAMOUNT_COVERED() {
		return AMOUNT_COVERED;
	}



	public void setAMOUNT_COVERED(long aMOUNT_COVERED) {
		AMOUNT_COVERED = aMOUNT_COVERED;
	}



	public long getAMOUNT_UNCOVERED() {
		return AMOUNT_UNCOVERED;
	}



	public void setAMOUNT_UNCOVERED(long aMOUNT_UNCOVERED) {
		AMOUNT_UNCOVERED = aMOUNT_UNCOVERED;
	}



	public long getREVENUE() {
		return REVENUE;
	}



	public void setREVENUE(long rEVENUE) {
		REVENUE = rEVENUE;
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


	@Override
	public String toString() {
		return "PayerResource [Id=" + Id + ", NAME=" + NAME + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY
				+ ", STATE_HEADQUARTERED=" + STATE_HEADQUARTERED + ", ZIP=" + ZIP + ", PHONE=" + PHONE
				+ ", AMOUNT_COVERED=" + AMOUNT_COVERED + ", AMOUNT_UNCOVERED=" + AMOUNT_UNCOVERED + ", REVENUE="
				+ REVENUE + ", COVERED_ENCOUNTERS=" + COVERED_ENCOUNTERS + ", UNCOVERED_ENCOUNTERS="
				+ UNCOVERED_ENCOUNTERS + ", COVERED_MEDICATIONS=" + COVERED_MEDICATIONS + ", UNCOVERED_MEDICATIONS="
				+ UNCOVERED_MEDICATIONS + ", COVERED_PROCEDURES=" + COVERED_PROCEDURES + ", UNCOVERED_PROCEDURES="
				+ UNCOVERED_PROCEDURES + ", COVERED_IMMUNIZATIONS=" + COVERED_IMMUNIZATIONS
				+ ", UNCOVERED_IMMUNIZATIONS=" + UNCOVERED_IMMUNIZATIONS + ", UNIQUE_CUSTOMERS=" + UNIQUE_CUSTOMERS
				+ ", QOLS_AVG=" + QOLS_AVG + ", MEMBER_MONTHS=" + MEMBER_MONTHS + "]";
	}



	public Resource createResource() {

		return null;
		//http://terminology.hl7.org/CodeSystem/organization-type
		
		//o.setId(Id);
		Organization o = new Organization(); //no profile
		//add identifier
		o.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		// add the name of the organization
		o.setName(NAME);
		// Definition of the address (fields: address, city, state, zip) with the
		// extensions for the latitude and longitude
		o.addAddress().setCity(CITY).addLine(ADDRESS).setPostalCode(ZIP).setState(STATE_HEADQUARTERED);
		
		String system = "http://terminology.hl7.org/CodeSystem/organization-type";
		String code = "pay";
		String display = "Payer";
		List<CodeableConcept> type = new ArrayList<>();
		type.add(new CodeableConcept(new Coding(system, code, display)));
		o.setType(type);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		o.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);
		
		//contact point -> phone
		o.addTelecom().setSystem(ContactPointSystem.PHONE).setValue(PHONE);
		
		return o;
		/*Patient p = new Patient();
		// Definition of the considered profile
		p.setMeta(new Meta().addProfile("https://hl7.org/fhir/us/core/StructureDefinition-us-core-patient"));

		//p.setId(args[head.get("id")]);

		// Definition of the birthdate and deathdate(fields: birthdate, deathdate)
		// with the addition of the extension birthplace
	
		p.setBirthDate(BIRTHDATE);
		if(DEATHDATE!=null)
			p.setDeceased(new DateTimeType(DEATHDATE));

		Extension birthplace = new Extension("http://hl7.org/fhir/StructureDefinition/patient-birthPlace",
				new Address().setText(BIRTHPLACE));
		p.addExtension(birthplace);

		// Definition of the identifiers (fields: id, drivers, passport, ssn)
		p.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.SS.getSystem(), PIdentifier.SS.toCode(), PIdentifier.SS.getDefinition())))
				.setValue(SSN));
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.DL.getSystem(), PIdentifier.DL.toCode(), PIdentifier.DL.getDefinition())))
				.setValue(DRIVERS));
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.PPN.getSystem(), PIdentifier.PPN.toCode(), PIdentifier.PPN.getDefinition())))
				.setValue(PASSPORT));

		// Definition of the official name (fields: first, last, prefix, suffix)
		p.addName().setUse(HumanName.NameUse.OFFICIAL).setFamily(LAST)
				.addGiven(FIRST).addPrefix(PREFIX)
				.addSuffix(SUFFIX);
		// Definition of the maiden name (fields: first, maiden, prefix, suffix)
		p.addName().setUse(HumanName.NameUse.MAIDEN).setFamily(MAIDEN)
				.addGiven(FIRST).addPrefix(PREFIX)
				.addSuffix(SUFFIX);

		// Definition of the address (fields: address, city, state,county, zip) with the
		// extensions for the latitude and longitude
		p.addAddress().setCity(CITY).addLine(ADDRESS)
				.setDistrict(COUNTY).setPostalCode(ZIP)
				.setState(STATE);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		p.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);

		// Definition of the marital status (field: marital)

		V3MaritalStatus status = V3MaritalStatus.fromCode(MARITAL);
		if(status == null)
			status = V3MaritalStatus.NULL;
		p.setMaritalStatus(new CodeableConcept(new Coding(status.getSystem(), status.toCode(), status.getDisplay())));

		// Definition of the two extensions and connected subextensions for the race and
		// the ethnicity (fields: race, ethnicity)
		OMBRaceCategories race = OMBRaceCategories.fromCSV(RACE);
		OMBEtnicityCategories eth = OMBEtnicityCategories.fromCSV(ETHNICITY);
		Extension ra = new Extension("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
		p.addExtension(ra);
		Extension subRa = new Extension("http://hl7.org/fhir/us/core/ValueSet/omb-race-category",
				new CodeableConcept(new Coding(race.getSystem(), race.toCode(), race.getDefinition())));
		ra.addExtension(subRa);
		Extension et = new Extension("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
		p.addExtension(et);
		Extension subEt = new Extension("http://hl7.org/fhir/us/core/ValueSet/omb-ethnicity-category",
				new CodeableConcept(new Coding(eth.getSystem(), eth.toCode(), eth.getDefinition())));
		et.addExtension(subEt);

		// Definition of the gender(field: gender)
		V3AdministrativeGender sex = V3AdministrativeGender.valueOf(GENDER);
		p.setGender(Enumerations.AdministrativeGender.valueOf(sex.getDefinition().toUpperCase()));

		return p;*/
	}

	
	
	
	
	
	
	

}
