package it.unisa.diem.dhsa.group3.resources;

import java.util.Map;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Enumerations;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.Practitioner.PractitionerQualificationComponent;
import org.hl7.fhir.r4.model.PractitionerRole;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.StringType;
import org.hl7.fhir.r4.model.codesystems.V3AdministrativeGender;
import com.opencsv.bean.CsvBindByName;
import it.unisa.diem.dhsa.group3.enumerations.PracticeSettingCode;
import it.unisa.diem.dhsa.group3.state.Memory;

public class ProviderResource extends BaseResource{
	
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

		Practitioner d = new Practitioner();
		
		// Add US Profile to the Practitioner
		d.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitioner"));
		
		// Definition of the identifier (field: id)
		d.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(Id);
		
		// Definition of the official name  (fields: name)
		String[] values = NAME.split(" ");
		d.addName(new HumanName().setFamily(values[1]).addGiven(values[0]));
		//d.addName(new HumanName().setText(NAME));

		// Definition of the gender(field: gender)
		V3AdministrativeGender sex = V3AdministrativeGender.valueOf(GENDER);
		d.setGender(Enumerations.AdministrativeGender.valueOf(sex.getDefinition().toUpperCase()));

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
				
		// Link the Role to the Practitioner
		PractitionerRole r = new PractitionerRole();
		r.setActive(true);
		r.setPractitionerTarget(d);
				
		// Add US Profile to the Practitioner Role
		r.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-practitionerrole"));
		
		// Definition of the Organization that employees the practitioner
		Map<String, Resource> organizations = Memory.getMemory().get(OrganizationResource.class);
		Organization o = (Organization) organizations.get(ORGANIZATION);
		r.setOrganizationTarget(o);
		
		
		// Definition of the speciality of the practitioner 
		PracticeSettingCode code = PracticeSettingCode.fromCSV(SPECIALITY);
		r.addSpecialty().addCoding().setSystem(code.getSystem()).setCode(code.toCode()).setDisplayElement(new StringType(code.getDefinition()));
		
		
		
		// Missing utilization
		
		
		//return d;
		return r;
		
	}

	
	
}
