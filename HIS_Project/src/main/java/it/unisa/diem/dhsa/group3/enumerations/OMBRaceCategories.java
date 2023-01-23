package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the race of the patient.
 *
 */
public enum OMBRaceCategories {

	_10025, /*AMERICAN INDIAND OR ALASKA NATIVE*/
	_20289, /*ASIAN*/
	_20545, /*BLACK OR AFRICAN AMERICAN*/
	_20768, /*NATIVE HAWAIIAN OR OTHER PACIFIC ISLANDER*/
	_21063, /*WHITE*/
	_21311, /*OTHER RACE*/
	NULL;

	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the race associated with the code
	 * @throws FHIRException if the code is not known
	 */
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

	/**
	 * Utility function to map the race of the patient from references read in the CSV file.
	 * @param description the description of the race read from the CSV
	 * @return the enum value associated with the description
	 */
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

	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
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

	/**
	 * The function gets the system used to encode the race of the patient.
	 * @return the system used to encode the race of the patient
	 */
	public String getSystem() {
		return "urn:oid:2.16.840.1.113883.6.238";
	}

	/**
	 * The function gets a human readable description associated with the race code.
	 * @return the description associated with the code
	 */
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
