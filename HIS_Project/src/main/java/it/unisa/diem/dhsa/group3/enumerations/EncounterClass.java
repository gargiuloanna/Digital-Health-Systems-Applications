package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the class of the encounter.
 *
 */
public enum EncounterClass {
	
	IMP, 	/*INPATIENT ENCOUNTER*/
	AMB, 	/*AMBULATORY*/
	OBSENC, /*OBSERVATION ENCOUNTER*/
	EMER, 	/*EMERCENCY*/
	VR, 	/*VIRTUAL*/
	HH, 	/*HOME HEALTH*/
	WEL, 	/*WELLNESS*/
	URG, 	/*URGENT CARE*/
	OTP, 	/*OUTPATIENT*/
	NULL; 	/*NO INFORMATION*/
	
	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the enumeration value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static EncounterClass fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString)) 
			return NULL;
		if ("IMP".equals(codeString)) 
			return IMP;
		if ("AMB".equals(codeString)) 
			return AMB;
		if ("OBSENC".equals(codeString)) 
			return OBSENC;
		if ("EMER".equals(codeString)) 
			return EMER;
		if ("VR".equals(codeString)) 
			return VR;
		if ("HH".equals(codeString)) 
			return HH;
		if ("WEL".equals(codeString)) 
			return WEL;
		if ("OTP".equals(codeString)) 
			return OTP;
		if ("URG".equals(codeString)) 
			return URG;
		
		throw new FHIRException("Unknown EncounterClass code '" + codeString + "'");
	}
	
	/**
	 * Utility function to map the encounter class from references read in the CSV file.
	 * @param description the description of the class read from the CSV
	 * @return the enum value associated with the description
	 */
	public static EncounterClass fromCSV(String description) {
		if (description == null || "".equals(description)) 
			return NULL;
		if ("wellness".equals(description)) 
			return WEL;
		if ("ambulatory".equals(description)) 
			return AMB;
		if ("emergency".equals(description)) 
			return EMER;
		if ("urgentcare".equals(description)) 
			return URG;
		if ("outpatient".equals(description)) 
			return OTP;
		if ("inpatient".equals(description)) 
			return IMP;
		
		return null;
	}
	
	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case NULL : return null;
		case WEL : return "WEL";
		case AMB : return "AMB";
		case EMER : return "EMER";
		case URG : return "URG";
		case OTP : return "OTP";
		case IMP : return "IMP";
		case HH : return "HH";
		case OBSENC : return "OBSENC";
		case VR: return "VR";
		}
		return null;
	}
	
	/**
	 * The function gets the system used to encode the encounter class.
	 * @return the system used to encode the encounter class
	 */	
	public String getSystem() {
		return "https://terminology.hl7.org/4.0.0/CodeSystem-v3-ActCode.html";
	}
	
	/**
	 * The function gets a human readable description associated with the class of the encounter.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch(this) {
		case NULL : return "No information";
		case WEL : return "Wellness";
		case AMB : return "Ambulatory";
		case EMER : return "Emercency";
		case URG : return "Urgent Care";
		case OTP : return "Outpatient Encounter";
		case IMP : return "inpatient encounter";
		case HH : return "Home Health";
		case OBSENC : return "Observation Encounter";
		case VR: return "Virtual";
		}
		return null;
	}
}
