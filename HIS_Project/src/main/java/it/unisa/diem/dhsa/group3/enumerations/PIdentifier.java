package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

public enum PIdentifier {
	
	SS, DL, PPN, NULL;
	
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

	public String getSystem() {
		return "http://terminology.hl7.org/CodeSystem/v2-0203";
	}

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
