package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.PractitionerRole;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.codesystems.V3AdministrativeGender;
import org.hl7.fhir.r4.model.codesystems.V3MaritalStatus;

import com.opencsv.bean.CsvBindByName;

public class ProviderResource {
	
	//Id,,ORGANIZATION,NAME, GENDER, SPECIALITY, ADDRESS, CITY, STATE, ZIP, LAT, LON, UTILIZATION
	
	@CsvBindByName
	private String Id;
	
	@CsvBindByName
	private String ORGANIZATION = "";
	
	@CsvBindByName
	private String NAME = "";
	
	@CsvBindByName
	private String GENDER = "";
	
	@CsvBindByName
	private String SPECIALITY = "";
	
	@CsvBindByName
	private String ADDRESS = "";
	
	@CsvBindByName
	private String CITY = "";

	@CsvBindByName
	private String STATE = "";
	
	@CsvBindByName
	private String ZIP = "";
	
	@CsvBindByName
	private Float LAT;
	
	@CsvBindByName
	private Float LON;
	
	@CsvBindByName
	private int UTILIZATION;

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getORGANIZATION() {
		return ORGANIZATION;
	}

	public void setORGANIZATION(String oRGANIZATION) {
		ORGANIZATION = oRGANIZATION;
	}

	public String getNAME() {
		return NAME;
	}

	public void setNAME(String nAME) {
		NAME = nAME;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getSPECIALITY() {
		return SPECIALITY;
	}

	public void setSPECIALITY(String sPECIALITY) {
		SPECIALITY = sPECIALITY;
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

	public int getUTILIZATION() {
		return UTILIZATION;
	}

	public void setUTILIZATION(int uTILIZATION) {
		UTILIZATION = uTILIZATION;
	}

	@Override
	public String toString() {
		return "ProviderResource [Id=" + Id + ", ORGANIZATION=" + ORGANIZATION + ", NAME=" + NAME + ", GENDER=" + GENDER
				+ ", SPECIALITY=" + SPECIALITY + ", ADDRESS=" + ADDRESS + ", CITY=" + CITY + ", STATE=" + STATE
				+ ", ZIP=" + ZIP + ", LAT=" + LAT + ", LON=" + LON + ", UTILIZATION=" + UTILIZATION + "]";
	}
	
	public Resource createResource() {

		Practitioner d = new Practitioner(); //no profile
		PractitionerRole r = new PractitionerRole();
		
		// Definition of the identifier (field: id)
		d.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		
		//Definition of the Organization that employees the practitioner
		
	
		// Definition of the official name  (fields: name)
		d.addName(new HumanName().setText(NAME));

		// Definition of the gender(field: gender)
		V3AdministrativeGender sex = V3AdministrativeGender.valueOf(GENDER);
		d.setGender(Enumerations.AdministrativeGender.valueOf(sex.getDefinition().toUpperCase()));
		
		//Definition of the speciality of the practitioner 
		
		
		// Definition of the address (fields: address, city, state, zip) with the
		// extensions for the latitude and longitude
		d.addAddress().setCity(CITY).addLine(ADDRESS).setPostalCode(ZIP)
				.setState(STATE);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		d.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);




		return r.setPractitionerTarget(d);
	}

	
	
}
