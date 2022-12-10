package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.exceptions.FHIRException;

public enum OMBEtnicityCategories {
	_21352, _21865, NULL;

	public static OMBEtnicityCategories fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return null;
		if ("2135-2".equals(codeString))
			return _21352;
		if ("2186-5".equals(codeString))
			return _21865;
		throw new FHIRException("Unknown OMBEtnicityCategories code '" + codeString + "'");

	}
	
	public static OMBEtnicityCategories fromCSV(String description) {
		if (description == null || "".equals(description))
			return null;
		if("hispanic".equals(description))
			return _21352;
		if("nonhispanic".equals(description))
			return _21865;

		return null;
			
	}

	public String toCode() {
		switch (this) {
		case _21352:
			return "2135-2";
		case _21865:
			return "2186-5";

		}
		return null;
	}

	public String getSystem() {
		return "urn:oid:2.16.840.1.113883.6.238";
	}

	public String getDefinition() {
		switch (this) {
		case _21352:
			return "Hispanic or Latino";
		case _21865:
			return "Not Hispanic or Latino";

		}
		return null;
	}
}
