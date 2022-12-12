package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.exceptions.FHIRException;

public enum OMBRaceCategories {

	_10025, _20289, _20545, _20768, _21063, _21311, NULL;

	public static OMBRaceCategories fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("1002-5".equals(codeString))
			return _10025;
		if ("2028-9".equals(codeString))
			return _20289;
		if ("2054-5".equals(codeString))
			return _20545;
		if ("2076-8".equals(codeString))
			return _20768;
		if ("2106-3".equals(codeString))
			return _21063;
		if ("2131-1".equals(codeString))
			return _21311;
		throw new FHIRException("Unknown OMBRaceCategories code '" + codeString + "'");

	}

	
	public static OMBRaceCategories fromCSV(String description) {
		if (description == null || "".equals(description))
			return NULL;
		if("asian".equals(description))
			return _20289;
		if("black".equals(description))
			return _20545;
		if("white".equals(description))
			return _21063;
		if("other".equals(description))
			return _21311;
		if("native".equals(description))
			return _20768;
		return null;
			
	}

	public String toCode() {
		switch (this) {
		case _10025:
			return "1002-5";
		case _20289:
			return "2028-9";
		case _20545:
			return "2054-5";
		case _20768:
			return "2076-8";
		case _21063:
			return "2106-3";
		case _21311:
			return "2131-1";
		case NULL:
			return "";
		}
		return null;
	}

	public String getSystem() {
		return "urn:oid:2.16.840.1.113883.6.238";
	}

	public String getDefinition() {
		switch (this) {
		case _10025:
			return "American Indian or Alaska Native";
		case _20289:
			return "Asian";
		case _20545:
			return "Black or African American";
		case _20768:
			return "Native Hawaiian or Other Pacific Islander";
		case _21063:
			return "White";
		case _21311:
			return "Other race";
		case NULL:
			return ""; 
		}
		return null;
	}
	
	
}
