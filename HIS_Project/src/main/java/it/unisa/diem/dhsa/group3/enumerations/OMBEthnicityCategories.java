package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the ethnicity of the patient.
 *
 */
public enum OMBEthnicityCategories {
	_21352, /* HISPANIC OR LATINO */
	_21865, /* NOT HISPANIC OR LATINO */
	NULL;

	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the ethnicity value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static OMBEthnicityCategories fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("2135-2".equals(codeString))
			return _21352;
		if ("2186-5".equals(codeString))
			return _21865;
		throw new FHIRException("Unknown OMBEtnicityCategories code '" + codeString + "'");
	}

	/**
	 * Utility function to map the ethnicity of the patient from references read in the CSV file.
	 * @param description the description of the ethnicity read from the CSV
	 * @return the enum value associated with the description
	 */
	public static OMBEthnicityCategories fromCSV(String description) {
		if (description == null || "".equals(description))
			return NULL;
		if ("hispanic".equals(description))
			return _21352;
		if ("nonhispanic".equals(description))
			return _21865;

		return null;
	}

	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case _21352:
			return "2135-2";
		case _21865:
			return "2186-5";
		case NULL:
			return "";

		}
		return null;
	}

	/**
	 * The function gets the system used to encode the ethnicity of the patient.
	 * @return the system used to encode the ethnicity of the patient
	 */
	public String getSystem() {
		return "urn:oid:2.16.840.1.113883.6.238";
	}

	/**
	 * The function gets a human readable description associated with the ethnicity code.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch (this) {
		case _21352:
			return "Hispanic or Latino";
		case _21865:
			return "Not Hispanic or Latino";
		case NULL:
			return "";
		}
		return null;
	}

}
