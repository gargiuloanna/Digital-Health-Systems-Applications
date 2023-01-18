package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

public enum ServiceRequestCategory {
	
	 _386053000, /*Evaluation procedure (procedure)*/
	 _410606002, /*Social service procedure (procedure)*/	
	 _108252007, /*Laboratory procedure*/	
	 _363679005, /*Imaging*/
	 _409063005, /*Counseling*/	
	 _409073007, /*Education*/	
	 _387713003, /*Surgical procedure*/
	 NULL;
	
	
	public static ServiceRequestCategory fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("Evaluation procedure (procedure)".equals(codeString))
			return _386053000;
		if ("Social service procedure (procedure)".equals(codeString))
			return _410606002;
		if ("Laboratory procedure".equals(codeString))
			return _108252007;
		if ("Imaging".equals(codeString))
			return _363679005;
		if ("Counseling".equals(codeString))
			return _409063005;
		if ("Education".equals(codeString))
			return _409073007;
		if ("Surgical procedure".equals(codeString))
			return _387713003;

		throw new FHIRException("Unknown PracticeSettingCode code '" + codeString + "'");
	}
	
	public String toCode() {
		switch (this) {
		case _386053000:
			return "386053000";/*Evaluation procedure (procedure)*/
		case _410606002:
			return "410606002";/*Social service procedure (procedure)*/
		case _108252007:
			return "108252007";/*Laboratory procedure*/
		case _363679005:
			return "363679005";/*Imaging*/
		case _409063005:
			return "409063005";/*Counseling*/
		case _409073007:
			return "409073007";/*Education*/
		case _387713003:
			return "387713003";/*Surgical procedure*/
		case NULL:
			return "null";
		}
		return null;
	}
	
	public String getSystem() {
		return "http://snomed.info/sct";
	}
	
	public String getDefinition() {
		switch (this) {
		case _386053000:
			return "Evaluation procedure (procedure)";/*Evaluation procedure (procedure)*/
		case _410606002:
			return "Social service procedure (procedure)";/*Social service procedure (procedure)*/
		case _108252007:
			return "Laboratory procedure";/*Laboratory procedure*/
		case _363679005:
			return "Imaging";/*Imaging*/
		case _409063005:
			return "Counseling";/*Counseling*/
		case _409073007:
			return "Education";/*Education*/
		case _387713003:
			return "Surgical procedure";/*Surgical procedure*/
		case NULL:
			return "null";
		}
		return null;
	}

}
