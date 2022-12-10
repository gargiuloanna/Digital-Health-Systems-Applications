package it.unisa.diem.dhsa.group3.HIS_Project;

//import java.util.Date;
import java.sql.Date;

import org.hl7.fhir.r4.model.*;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

public class OrganizationResource {
	
	//Id,START,STOP,PATIENT,ORGANIZATION,PROVIDER,PAYER,ENCOUNTERCLASS,CODE,DESCRIPTION,BASE_ENCOUNTER_COST,TOTAL_CLAIM_COST,
	//PAYER_COVERAGE,REASONCODE,REASONDESCRIPTION
	
	
	@CsvBindByName
	private String Id;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date START;
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date STOP;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String ORGANIZATION = "";
	
	@CsvBindByName
	private String PROVIDER = "";
	
	@CsvBindByName
	private String PAYER = "";
	
	@CsvBindByName
	private String ENCOUNTERCLASS = "";
	
	@CsvBindByName
	private Float CODE;
	
	@CsvBindByName
	private String DESCRIPTION = "";
	
	@CsvBindByName
	private Float BASE_ENCOUNTER_COST;
	
	@CsvBindByName
	private Float TOTAL_CLAIM_COST;
	
	@CsvBindByName
	private Float PAYER_COVERAGE;
	
	@CsvBindByName
	private String REASONCODE; //o è un numero o è null
	
	@CsvBindByName
	private String REASONDESCRIPTION;
	
	
	public String getId() {
		return Id;
	}


	public void setId(String id) {
		Id = id;
	}


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


	public String getORGANIZATION() {
		return ORGANIZATION;
	}


	public void setORGANIZATION(String oRGANIZATION) {
		ORGANIZATION = oRGANIZATION;
	}


	public String getPROVIDER() {
		return PROVIDER;
	}


	public void setPROVIDER(String pROVIDER) {
		PROVIDER = pROVIDER;
	}


	public String getPAYER() {
		return PAYER;
	}


	public void setPAYER(String pAYER) {
		PAYER = pAYER;
	}


	public String getENCOUNTERCLASS() {
		return ENCOUNTERCLASS;
	}


	public void setENCOUNTERCLASS(String eNCOUNTERCLASS) {
		ENCOUNTERCLASS = eNCOUNTERCLASS;
	}


	public Float getCODE() {
		return CODE;
	}


	public void setCODE(Float cODE) {
		CODE = cODE;
	}


	public String getDESCRIPTION() {
		return DESCRIPTION;
	}


	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}


	public Float getBASE_ENCOUNTER_COST() {
		return BASE_ENCOUNTER_COST;
	}


	public void setBASE_ENCOUNTER_COST(Float bASE_ENCOUNTER_COST) {
		BASE_ENCOUNTER_COST = bASE_ENCOUNTER_COST;
	}


	public Float getTOTAL_CLAIM_COST() {
		return TOTAL_CLAIM_COST;
	}


	public void setTOTAL_CLAIM_COST(Float tOTAL_CLAIM_COST) {
		TOTAL_CLAIM_COST = tOTAL_CLAIM_COST;
	}


	public Float getPAYER_COVERAGE() {
		return PAYER_COVERAGE;
	}


	public void setPAYER_COVERAGE(Float pAYER_COVERAGE) {
		PAYER_COVERAGE = pAYER_COVERAGE;
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
		return "EncounterResource [Id=" + Id + ", START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT
				+ ", ORGANIZATION=" + ORGANIZATION + ", PROVIDER=" + PROVIDER + ", PAYER=" + PAYER + ", ENCOUNTERCLASS="
				+ ENCOUNTERCLASS + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_ENCOUNTER_COST="
				+ BASE_ENCOUNTER_COST + ", TOTAL_CLAIM_COST=" + TOTAL_CLAIM_COST + ", PAYER_COVERAGE=" + PAYER_COVERAGE
				+ ", REASONCODE=" + REASONCODE + ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
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
