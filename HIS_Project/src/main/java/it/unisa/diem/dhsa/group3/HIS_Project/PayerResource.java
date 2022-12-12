package it.unisa.diem.dhsa.group3.HIS_Project;

//import java.util.Date;


import org.hl7.fhir.r4.model.*;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

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

		return null;
		
		
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
