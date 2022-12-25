package it.unisa.diem.dhsa.group3.resources;

import java.text.DateFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
//import java.util.Date;
import java.util.Date;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.codesystems.V3AdministrativeGender;
import org.hl7.fhir.r4.model.codesystems.V3MaritalStatus;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.enumerations.OMBEthnicityCategories;
import it.unisa.diem.dhsa.group3.enumerations.OMBRaceCategories;
import it.unisa.diem.dhsa.group3.enumerations.PIdentifier;

public class PatientResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date BIRTHDATE;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date DEATHDATE;

	@CsvBindByName
	private String SSN = "";

	@CsvBindByName
	private String DRIVERS = "";

	@CsvBindByName
	private String PASSPORT = "";

	@CsvBindByName
	private String PREFIX = "";

	@CsvBindByName
	private String FIRST = "";

	@CsvBindByName
	private String LAST = "";

	@CsvBindByName
	private String SUFFIX = "";

	@CsvBindByName
	private String MAIDEN = "";

	@CsvBindByName
	private String MARITAL = "";

	@CsvBindByName
	private String RACE = "";

	@CsvBindByName
	private String ETHNICITY = "";

	@CsvBindByName
	private String GENDER = "";

	@CsvBindByName
	private String BIRTHPLACE = "";

	@CsvBindByName
	private String ADDRESS = "";

	@CsvBindByName
	private String CITY = "";

	@CsvBindByName
	private String STATE = "";

	@CsvBindByName
	private String COUNTY = "";

	@CsvBindByName
	private String ZIP = "";

	@CsvBindByName
	private Float LAT;

	@CsvBindByName
	private Float LON;

	@CsvBindByName
	private Float HEALTHCARE_EXPENSES;

	@CsvBindByName
	private Float HEALTHCARE_COVERAGE;

	public Date getBIRTHDATE() {
		return BIRTHDATE;
	}

	public void setBIRTHDATE(Date bIRTHDATE) {
		BIRTHDATE = bIRTHDATE;
	}

	public Date getDEATHDATE() {
		return DEATHDATE;
	}

	public void setDEATHDATE(Date dEATHDATE) {
		DEATHDATE = dEATHDATE;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getDRIVERS() {
		return DRIVERS;
	}

	public void setDRIVERS(String dRIVERS) {
		DRIVERS = dRIVERS;
	}

	public String getPASSPORT() {
		return PASSPORT;
	}

	public void setPASSPORT(String pASSPORT) {
		PASSPORT = pASSPORT;
	}

	public String getPREFIX() {
		return PREFIX;
	}

	public void setPREFIX(String pREFIX) {
		PREFIX = pREFIX;
	}

	public String getFIRST() {
		return FIRST;
	}

	public void setFIRST(String fIRST) {
		FIRST = fIRST;
	}

	public String getLAST() {
		return LAST;
	}

	public void setLAST(String lAST) {
		LAST = lAST;
	}

	public String getSUFFIX() {
		return SUFFIX;
	}

	public void setSUFFIX(String sUFFIX) {
		SUFFIX = sUFFIX;
	}

	public String getMAIDEN() {
		return MAIDEN;
	}

	public void setMAIDEN(String mAIDEN) {
		MAIDEN = mAIDEN;
	}

	public String getMARITAL() {
		return MARITAL;
	}

	public void setMARITAL(String mARITAL) {
		MARITAL = mARITAL;
	}

	public String getRACE() {
		return RACE;
	}

	public void setRACE(String rACE) {
		RACE = rACE;
	}

	public String getETHNICITY() {
		return ETHNICITY;
	}

	public void setETHNICITY(String eTHNICITY) {
		ETHNICITY = eTHNICITY;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getBIRTHPLACE() {
		return BIRTHPLACE;
	}

	public void setBIRTHPLACE(String bIRTHPLACE) {
		BIRTHPLACE = bIRTHPLACE;
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

	public String getCOUNTY() {
		return COUNTY;
	}

	public void setCOUNTY(String cOUNTY) {
		COUNTY = cOUNTY;
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

	public Float getHEALTHCARE_EXPENSES() {
		return HEALTHCARE_EXPENSES;
	}

	public void setHEALTHCARE_EXPENSES(Float hEALTHCARE_EXPENSES) {
		HEALTHCARE_EXPENSES = hEALTHCARE_EXPENSES;
	}

	public Float getHEALTHCARE_COVERAGE() {
		return HEALTHCARE_COVERAGE;
	}

	public void setHEALTHCARE_COVERAGE(Float hEALTHCARE_COVERAGE) {
		HEALTHCARE_COVERAGE = hEALTHCARE_COVERAGE;
	}

	public PatientResource() {
	}

	public PatientResource(String iD, Date bIRTHDATE, Date dEATHDATE, String sSN, String dRIVERS, String pASSPORT, String pREFIX,
			String fIRST, String lAST, String sUFFIX, String mAIDEN, String mARITAL, String rACE, String eTHNICITY,
			String gENDER, String bIRTHPLACE, String aDDRESS, String cITY, String sTATE, String cOUNTY, String zIP,
			Float lAT, Float lON, Float hEALTHCARE_EXPENSES, Float hEALTHCARE_COVERAGE) {
		super(iD);
		BIRTHDATE = bIRTHDATE;
		DEATHDATE = dEATHDATE;
		SSN = sSN;
		DRIVERS = dRIVERS;
		PASSPORT = pASSPORT;
		PREFIX = pREFIX;
		FIRST = fIRST;
		LAST = lAST;
		SUFFIX = sUFFIX;
		MAIDEN = mAIDEN;
		MARITAL = mARITAL;
		RACE = rACE;
		ETHNICITY = eTHNICITY;
		GENDER = gENDER;
		BIRTHPLACE = bIRTHPLACE;
		ADDRESS = aDDRESS;
		CITY = cITY;
		STATE = sTATE;
		COUNTY = cOUNTY;
		ZIP = zIP;
		LAT = lAT;
		LON = lON;
		HEALTHCARE_EXPENSES = hEALTHCARE_EXPENSES;
		HEALTHCARE_COVERAGE = hEALTHCARE_COVERAGE;
	}

	public PatientResource(String iD, LocalDate bIRTHDATE, LocalDate dEATHDATE, String sSN, String dRIVERS, String pASSPORT,
			String pREFIX, String fIRST, String lAST, String sUFFIX, String mAIDEN, String mARITAL, String rACE,
			String eTHNICITY, String gENDER, String bIRTHPLACE, String aDDRESS, String cITY, String sTATE,
			String cOUNTY, String zIP, Float lAT, Float lON, Float hEALTHCARE_EXPENSES, Float hEALTHCARE_COVERAGE)
			throws ParseException {
		super(iD);
		if (bIRTHDATE == null)
			BIRTHDATE = null;
		else
			BIRTHDATE = Date.from(bIRTHDATE.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		if (dEATHDATE == null)
			DEATHDATE = null;
		else
			DEATHDATE = Date.from(dEATHDATE.atStartOfDay(ZoneId.of("Asia/Kolkata")).toInstant());
		SSN = sSN;
		DRIVERS = dRIVERS;
		PASSPORT = pASSPORT;
		PREFIX = pREFIX;
		FIRST = fIRST;
		LAST = lAST;
		SUFFIX = sUFFIX;
		MAIDEN = mAIDEN;
		MARITAL = mARITAL;
		RACE = rACE;
		ETHNICITY = eTHNICITY;
		GENDER = gENDER;
		BIRTHPLACE = bIRTHPLACE;
		ADDRESS = aDDRESS;
		CITY = cITY;
		STATE = sTATE;
		COUNTY = cOUNTY;
		ZIP = zIP;
		LAT = lAT;
		LON = lON;
		HEALTHCARE_EXPENSES = hEALTHCARE_EXPENSES;
		HEALTHCARE_COVERAGE = hEALTHCARE_COVERAGE;
	}

	@Override
	public String toString() {
		return "PatientResource [Id=" + super.getId() + ", BIRTHDATE=" + BIRTHDATE + ", DEATHDATE=" + DEATHDATE
				+ ", SSN=" + SSN + ", DRIVERS=" + DRIVERS + ", PASSPORT=" + PASSPORT + ", PREFIX=" + PREFIX + ", FIRST="
				+ FIRST + ", LAST=" + LAST + ", SUFFIX=" + SUFFIX + ", MAIDEN=" + MAIDEN + ", MARITAL=" + MARITAL
				+ ", RACE=" + RACE + ", ETHNICITY=" + ETHNICITY + ", GENDER=" + GENDER + ", BIRTHPLACE=" + BIRTHPLACE
				+ ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", STATE=" + STATE + ", COUNTY=" + COUNTY + ", ZIP=" + ZIP
				+ ", LAT=" + LAT + ", LON=" + LON + ", HEALTHCARE_EXPENSES=" + HEALTHCARE_EXPENSES
				+ ", HEALTHCARE_COVERAGE=" + HEALTHCARE_COVERAGE + "]";
	}

	@Override
	public Resource createResource() {

		Patient p = new Patient();
		// Definition of the considered profile
		p.setMeta(new Meta().addProfile("https://hl7.org/fhir/us/core/StructureDefinition-us-core-patient"));

		// p.setId(args[head.get("id")]);

		// Definition of the birthdate and deathdate(fields: birthdate, deathdate)
		// with the addition of the extension birthplace

		p.setBirthDate(BIRTHDATE);
		if (DEATHDATE != null)
			p.setDeceased(new DateTimeType(DEATHDATE));

		Extension birthplace = new Extension("http://hl7.org/fhir/StructureDefinition/patient-birthPlace",
				new Address().setText(BIRTHPLACE));
		p.addExtension(birthplace);

		// Definition of the identifiers (fields: id, drivers, passport, ssn)
		p.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());
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
		p.addName().setUse(HumanName.NameUse.OFFICIAL).setFamily(LAST).addGiven(FIRST).addPrefix(PREFIX)
				.addSuffix(SUFFIX);
		// Definition of the maiden name (fields: first, maiden, prefix, suffix)
		p.addName().setUse(HumanName.NameUse.MAIDEN).setFamily(MAIDEN).addGiven(FIRST).addPrefix(PREFIX)
				.addSuffix(SUFFIX);

		// Definition of the address (fields: address, city, state,county, zip) with the
		// extensions for the latitude and longitude
		p.addAddress().setCity(CITY).addLine(ADDRESS).setDistrict(COUNTY).setPostalCode(ZIP).setState(STATE);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		p.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);

		// Definition of the marital status (field: marital)

		V3MaritalStatus status = V3MaritalStatus.fromCode(MARITAL);
		if (status == null)
			status = V3MaritalStatus.NULL;
		p.setMaritalStatus(new CodeableConcept(new Coding(status.getSystem(), status.toCode(), status.getDisplay())));

		// Definition of the two extensions and connected subextensions for the race and
		// the ethnicity (fields: race, ethnicity)
		OMBRaceCategories race = OMBRaceCategories.fromCSV(RACE);
		OMBEthnicityCategories eth = OMBEthnicityCategories.fromCSV(ETHNICITY);
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
		try {
			p.setGender(Enumerations.AdministrativeGender.valueOf(sex.getDefinition().toUpperCase()));
		} catch (IllegalArgumentException e) {
			p.setGender(Enumerations.AdministrativeGender.UNKNOWN);
		}

		return p;
	}

}
