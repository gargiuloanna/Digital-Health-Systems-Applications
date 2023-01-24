package it.unisa.diem.dhsa.group3.resources;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.ContactPoint.ContactPointSystem;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Extension;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.codesystems.OrganizationType;
import com.opencsv.bean.CsvBindByName;

/**
 * This class allows to map the Medical organizations to the FHIR Resource Organization
 */
public class OrganizationResource extends BaseOrganization {

	@CsvBindByName
	private String STATE = "";

	@CsvBindByName
	private Float LAT;

	@CsvBindByName
	private Float LON;


	@CsvBindByName
	private int UTILIZATION;

	public String getSTATE() {
		return STATE;
	}

	public void setSTATE(String sTATE) {
		STATE = sTATE;
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

	/**
	 * This method returns the string representation of the resource class
	 * @return the string representation
	 */
	@Override
	public String toString() {
		return "OrganizationResource [Id=" + super.getId() + ", NAME=" + super.getNAME() + ", ADDRESS="
				+ super.getADDRESS() + ", CITY=" + super.getCITY() + ", STATE=" + STATE + ", ZIP=" + super.getZIP()
				+ ", LAT=" + LAT + ", LON=" + LON + ", PHONE=" + super.getPHONE() + ", REVENUE=" + super.getREVENUE()
				+ ", UTILIZATION=" + UTILIZATION + "]";
	}

	/**
	 * This method creates the Organization Resource by mapping the fields of the organizations csv
	 * @return the FHIR Organization Resource representing the Provider entity
	 */
	@Override
	public Resource createResource() {

		Organization o = new Organization(); 
		// Definition of the considered profile
		o.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-organization"));
		// add identifier
		o.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());
		
		//set state (a must have value)
		o.setActive(true);
		
		// add the name of the organization (field: name, a must have value) and its type
		o.setName(super.getNAME());
		o.getType().add(new CodeableConcept(new Coding(OrganizationType.PROV.toCode(),
				OrganizationType.PROV.getSystem(), OrganizationType.PROV.getDefinition())));
		
		// Definition of the address (fields: address, city, state, zip) with the
		// extensions for the latitude and longitude
		o.addAddress().setCity(super.getCITY()).addLine(super.getADDRESS()).setPostalCode(super.getZIP()).setState(STATE);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		o.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(LAT));
		Extension lon = new Extension("longitude", new DecimalType(LON));
		loc.addExtension(lat);
		loc.addExtension(lon);

		// contact point -> phone (field: phone)
		o.addTelecom().setSystem(ContactPointSystem.PHONE).setValue(super.getPHONE());

		return o;

	}

}
