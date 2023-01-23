package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the MRI request codes of the ServiceRequest.
 *
 */
public enum ServiceRequestCode {
	
	_241601008, /*Magnetic resonance imaging of head*/
	_1292009, /*MRI of bladder*/
	_2690005, /*MRI of pelvis*/
	_3991004, /*MRI of pelvis,  prostate and bladder*/
	_3998005, /*Bone imaging of limited area*/
	_5110001, /*Ultrasound peripheral imaging,  real time scan*/
	_5216004, /*Three dimensional ultrasound imaging of heart*/
	_6007000, /*Magnetic resonance imaging of chest*/
	 NULL;
	
	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the enumeration value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static ServiceRequestCode fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString)) return NULL;
		if("Magnetic resonance imaging of head".equals(codeString)) return _241601008;
		if ("MRI of bladder".equals(codeString)) return _1292009;
		if ("MRI of pelvis".equals(codeString)) return _2690005;
		if ("MRI of pelvis,  prostate and bladder".equals(codeString)) return _3991004;
		if ("Bone imaging of limited area".equals(codeString)) return _3998005;
		if ("Ultrasound peripheral imaging,  real time scan".equals(codeString)) return _5110001;
		if ("Three dimensional ultrasound imaging of heart".equals(codeString)) return _5216004;
		if ("Magnetic resonance imaging of chest".equals(codeString)) return _6007000;
		throw new FHIRException("Unknown PracticeSettingCode code '" + codeString + "'");
	}
	
	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case _241601008: return "241601008"; /*Magnetic resonance imaging of head*/
		case _1292009: return "1292009"; /*MRI of bladder*/
		case _2690005: return "2690005"; /*MRI of pelvis*/
		case _3991004: return "3991004"; /*MRI of pelvis, prostate and bladder*/
		case _3998005: return "3998005"; /*Bone imaging of limited area*/
		case _5110001: return "5110001"; /*Ultrasound peripheral imaging, real time scan*/
		case _5216004: return "5216004"; /*Three dimensional ultrasound imaging of heart*/
		case _6007000: return "6007000"; /*Magnetic resonance imaging of chest*/
		case NULL: return "null";
		}
		return null;
	}
	
	/**
	 * The function gets the system used to encode the request.
	 * @return the system used to encode the request code -- SNOMED
	 */	
	public String getSystem() {
		return "http://snomed.info/sct";
	}
	
	/**
	 * The function gets a human readable description associated with the request code of the ServiceRequest.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch (this) {
		case _241601008: return "Magnetic resonance imaging of head";
		case _1292009: return "MRI of bladder";
		case _2690005: return "MRI of pelvis";
		case _3991004: return "MRI of pelvis, prostate and bladder";
		case _3998005: return "Bone imaging of limited area";
		case _5110001: return "Ultrasound peripheral imaging, real time scan";
		case _5216004: return "Three dimensional ultrasound imaging of heart";
		case _6007000: return "Magnetic resonance imaging of chest";
		case NULL: return "null";
		}
		return null;
	}

}
