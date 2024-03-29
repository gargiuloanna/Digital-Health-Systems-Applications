package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the possible identifiers of a patient.
 *
 */
public enum PIdentifier {
	
	SS, 	/*SOCIAL SECURITY NUMBER*/
	DL, 	/*DRIVER'S LICENCE*/
	PPN,	/*PASSPORT NUMBER*/ 
	NULL;	
	
	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the identifier value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static PIdentifier fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return null;
		if ("SS".equals(codeString))
			return SS;
		if ("DL".equals(codeString))
			return DL;
		if ("PPN".equals(codeString))
			return PPN;
		throw new FHIRException("Unknown Identifier code '" + codeString + "'");

	}

	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case SS:
			return "SS";
		case DL:
			return "DL";
		case PPN:
			return "PPN";
		case NULL:
			return "null";
		}
		return null;
	}

	/**
	 * The function gets the system used to encode the identifiers of the patient.
	 * @return the system used to encode the identifiers of the patient
	 */
	public String getSystem() {
		return "http://terminology.hl7.org/CodeSystem/v2-0203";
	}

	/**
	 * The function gets a human readable description associated with the identifiers.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch (this) {
		case SS:
			return "Social Security number";
		case DL:
			return "Driver's license number";
		case PPN:
			return "Passport number";
		case NULL:
			return null;
		}
		return null;
	}
	

}
