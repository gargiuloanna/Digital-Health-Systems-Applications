package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

public enum EncounterClass {
	IMP, /*INPATIENT ENCOUNTER*/
	AMB, /*AMBULATORY*/
	OBSENC, /*OBSERVATION ENCOUNTER*/
	EMER, /*EMERCENCY*/
	VR, /*VIRTUAL*/
	HH, /*HOME HEALTH*/
	WEL, /*WELLNESS -- TODO: FITTIZIO PER IL MOMENTO, RIVEDERE COME FARE */
	URG, /*URGENT CARE -- TODO: FITTIZIO PER IL MOMENTO, RIVEDERE COME FARE */
	OTP, /*OUTPATIENT -- TODO: FITTIZIO PER IL MOMENTO, RIVEDERE COME FARE */
	NULL; /* NO INFORMATION */
	
	
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
	
	public String getSystem() {
		return "https://terminology.hl7.org/4.0.0/CodeSystem-v3-ActCode.html";
	}
	
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
