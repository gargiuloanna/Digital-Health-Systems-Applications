package it.unisa.diem.dhsa.group3.enumerations;

import org.hl7.fhir.exceptions.FHIRException;

/**
 * Enumeration to represent valid values for the specialty of the Practitioner, encoded with the NUCC standard.
 *
 */
public enum ProviderSpecialtyNUCC {
	
	_208D00000X, /*GENERAL PRACTICE*/
	_111N00000X, /*CHIROPRACTIC*/
	_363L00000X, /*NURSE PRACTITIONER*/
	_103TC0700X, /*CLINICAL PSYCHOLOGIST*/
	_1041C0700X, /*CLINICAL SOCIAL WORKER*/
	_364S00000X, /*CLINICAL NURSE SPECIALIST*/
	_207W00000X, /*OPHTHALMOLOGY*/
	_2084P0800X, /*PSYCHIATRY*/
	_363A00000X, /*PHYSICIAN ASSISTANT*/
	_208800000X, /*UROLOGY*/
	_2086S0122X, /*PLASTIC AND RECONSTRUCTIVE SURGERY*/
	_152W00000X, /*OPTOMETRY*/
	_207RG0100X, /*GASTROENTEROLOGY*/
	_2084N0400X, /*NEUROLOGY*/
	_207R00000X, /*INTERNAL MEDICINE*/
	_208M00000X, /*HOSPITALIST*/
	_208000000X, /*PEDIATRIC MEDICINE*/
	_207RR0500X, /*RHEUMATOLOGY*/
	_213E00000X, /*PODIATRY*/
	_208100000X, /*PHYSICAL MEDICINE AND REHABILITATION, PHYSICAL THERAPHY*/
	_367A00000X, /*CERTIFIED NURSE MIDWIFE*/
	_207RE0101X, /*ENDOCRINOLOGY*/
	_2085R0202X, /*DIAGNOSTIC RADIOLOGY*/
	_207Q00000X, /*FAMILY PRACTICE*/
	_231H00000X, /*AUDIOLOGIST*/
	_207RC0000X, /*CARDIOVASCULAR DISEASE (CARDIOLOGY)*/
	_207V00000X, /*OBSTETRICS/GYNECOLOGY*/
	_207N00000X, /*DERMATOLOGY*/
	_207X00000X, /*ORTHOPEDIC SURGERY*/
	_133V00000X, /*REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL*/
	_207P00000X, /*EMERGENCY MEDICINE*/
	_208600000X, /*GENERAL SURGERY*/
	_207RA0401X, /*ADDICTION MEDICINE*/
	_208G00000X, /*THORACIC SURGERY*/
	_235Z00000X, /*SPEECH LANGUAGE PATHOLOGIST*/
	_207RP1001X, /*PULMONARY DISEASE*/
	_208VP0014X, /*INTERVENTIONAL PAIN MANAGEMENT*/
	_207Y00000X, /*OTOLARYNGOLOGY*/
	_207RH0003X, /*HEMATOLOGY/ONCOLOGY*/
	_2086S0129X, /*VASCULAR SURGERY, CARDIAC SURGERY, PERIPHERAL VASCULAR DISEASE*/
	_2086S0105X, /*HAND SURGERY*/
	_207RI0011X, /*INTERVENTIONAL CARDIOLOGY*/
	_207ZP0102X, /*PATHOLOGY*/
	_207RG0300X, /*GERIATRIC MEDICINE*/
	_207RI0200X, /*INFECTIOUS DISEASE*/
	_1223S0112X, /*ORAL SURGERY*/
	_204E00000X, /*MAXILLOFACIAL SURGERY*/
	_2084P0805X, /*GERIATRIC PSYCHIATRY*/
	_207K00000X, /*ALLERGY/IMMUNOLOGY*/
	_207RC0001X, /*CARDIAC ELECTROPHYSIOLOGY*/
	_207RN0300X, /*NEPHROLOGY*/
	_208VP0000X, /*PAIN MANAGEMENT*/
	_225X00000X, /*OCCUPATIONAL THERAPY*/
	_207VX0201X, /*GYNECOLOGICAL ONCOLOGY*/
	_207RC0200X, /*CRITICAL CARE (INTENSIVISTS)*/
	_207QS1201X, /*SLEEP MEDICINE*/
	_2085R0001X, /*RADIATION ONCOLOGY*/
	_207L00000X, /*ANESTHESIOLOGY*/
	_367500000X, /*CERTIFIED REGISTERED NURSE ANESTHETIST*/
	_208C00000X, /*COLORECTAL SURGERY (PROCTOLOGY)*/
	_NA,		 /*UNDEFINED PHYSICIAN TYPE (SPECIFY)*/
	_2081H0002X, /*HOSPICE/PALLIATIVE CARE*/
	_207RX0202X, /*MEDICAL ONCOLOGY*/
	_204C00000X, /*SPORTS MEDICINE*/
	_207RH0000X, /*HEMATOLOGY*/
	_207T00000X, /*NEUROSURGERY*/
	_207U00000X, /*NUCLEAR MEDICINE*/
	_2085R0204X, /*INTERVENTIONAL RADIOLOGY*/
	_207RA0001X, /*ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY*/
	_2086X0206X, /*SURGICAL ONCOLOGY*/
	_2084N0600X, /*NEUROPSYCHIATRY*/
	_367H00000X, /*ANESTHESIOLOGY ASSISTANT*/
	_2083P0901X, /*PREVENTATIVE MEDICINE*/
	NULL;
	
	/**
	 * The function gets the enum value associated with the string.
	 * @param codeString the code to evaluate
	 * @return the enumeration value for the code
	 * @throws FHIRException if the code is not known
	 */
	public static ProviderSpecialtyNUCC fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("_208D00000X".equals(codeString))
			return _208D00000X;
		if ("_111N00000X".equals(codeString))
			return _111N00000X;
		if ("_363L00000X".equals(codeString))
			return _363L00000X;
		if ("_103TC0700X".equals(codeString))
			return _103TC0700X;
		if ("_1041C0700X".equals(codeString))
			return _1041C0700X; 
		if ("_364S00000X".equals(codeString))
			return _364S00000X;
		if ("_207W00000X".equals(codeString))
			return _207W00000X; 
		if ("_2084P0800X".equals(codeString))
			return _2084P0800X;
		if ("_363A00000X".equals(codeString))
			return _363A00000X; 
		if ("_208800000X".equals(codeString))
			return _208800000X;
		if ("_2086S0122X".equals(codeString))
			return _2086S0122X; 
		if ("_152W00000X".equals(codeString))
			return _152W00000X;
		if ("_207RG0100X".equals(codeString))
			return _207RG0100X;
		if ("_2084N0400X".equals(codeString))
			return _2084N0400X;
		if ("_207R00000X".equals(codeString))
			return _207R00000X;
		if ("_208M00000X".equals(codeString))
			return _208M00000X;
		if ("_208000000X".equals(codeString))
			return _208000000X;
		if ("_207RR0500X".equals(codeString))
			return _207RR0500X;
		if ("_213E00000X".equals(codeString))
			return _213E00000X;
		if ("_208100000X".equals(codeString))
			return _208100000X;
		if ("_367A00000X".equals(codeString))
			return _367A00000X;
		if ("_207RE0101X".equals(codeString))
			return _207RE0101X;
		if ("_2085R0202X".equals(codeString))
			return _2085R0202X;
		if ("_207Q00000X".equals(codeString))
			return _207Q00000X;
		if ("_231H00000X".equals(codeString))
			return _231H00000X;
		if ("_207RC0000X".equals(codeString))
			return _207RC0000X;
		if ("_207V00000X".equals(codeString))
			return _207V00000X;
		if ("_207N00000X".equals(codeString))
			return _207N00000X;
		if ("_207X00000X".equals(codeString))
			return _207X00000X;
		if ("_133V00000X".equals(codeString))
			return _133V00000X;
		if ("_207P00000X".equals(codeString))
			return _207P00000X;
		if ("_208600000X".equals(codeString))
			return _208600000X;
		if ("_207RA0401X".equals(codeString))
			return _207RA0401X;
		if ("_208G00000X".equals(codeString))
			return _208G00000X;
		if ("_235Z00000X".equals(codeString))
			return _235Z00000X;
		if ("_207RP1001X".equals(codeString))
			return _207RP1001X;
		if ("_208VP0014X".equals(codeString))
			return _208VP0014X;
		if ("_207Y00000X".equals(codeString))
			return _207Y00000X;
		if ("_207RH0003X".equals(codeString))
			return _207RH0003X;
		if ("_2086S0129X".equals(codeString))
			return _2086S0129X;
		if ("_2086S0105X".equals(codeString))
			return _2086S0105X;
		if ("_207RI0011X".equals(codeString))
			return _207RI0011X;
		if ("__207ZP0102X".equals(codeString))
			return _207ZP0102X;
		if ("_207RG0300X".equals(codeString))
			return _207RG0300X;
		if ("_207RI0200X".equals(codeString))
			return _207RI0200X;
		if ("_1223S0112X".equals(codeString))
			return _1223S0112X;
		if ("_204E00000X".equals(codeString))
			return _204E00000X;
		if ("_2084P0805X".equals(codeString))
			return _2084P0805X;
		if ("_207K00000X".equals(codeString))
			return _207K00000X;
		if ("_207RC0001X".equals(codeString))
			return _207RC0001X;
		if ("_207RN0300X".equals(codeString))
			return _207RN0300X;
		if ("_208VP0000X".equals(codeString))
			return _208VP0000X;
		if ("_225X00000X".equals(codeString))
			return _225X00000X;
		if ("_207VX0201X".equals(codeString))
			return _207VX0201X;
		if ("_207RC0200X".equals(codeString))
			return _207RC0200X;
		if ("_207QS1201X".equals(codeString))
			return _207QS1201X;
		if ("_2085R0001X".equals(codeString))
			return _2085R0001X;
		if ("_207L00000X".equals(codeString))
			return _207L00000X;
		if ("_367500000X".equals(codeString))
			return _367500000X;
		if ("_208C00000X".equals(codeString))
			return _208C00000X;
		if ("_2081H0002X".equals(codeString))
			return _2081H0002X;
		if ("_207RX0202X".equals(codeString))
			return _207RX0202X;
		if ("_204C00000X".equals(codeString))
			return _204C00000X;
		if ("_207RH0000X".equals(codeString))
			return _207RH0000X;
		if ("_207T00000X".equals(codeString))
			return _207T00000X;
		if ("_207U00000X".equals(codeString))
			return _207U00000X;
		if ("_2085R0204X".equals(codeString))
			return _2085R0204X;
		if ("_207RA0001X".equals(codeString))
			return _207RA0001X;
		if ("_2086X0206X".equals(codeString))
			return _2086X0206X;
		if ("_2084N0600X".equals(codeString))
			return _2084N0600X;
		if ("_367H00000X".equals(codeString))
			return _367H00000X;
		if ("_2083P0901X".equals(codeString))
			return _2083P0901X;

		throw new FHIRException("Unknown ProviderSpecialtyNUCC code '" + codeString + "'");
	}

	/**
	 * Utility function to map the specialty from references read in the CSV file.
	 * @param description the description of the specialty read from the CSV
	 * @return the enum value associated with the description
	 */
	public static ProviderSpecialtyNUCC fromCSV(String description) {
		
		if (description == null || "".equalsIgnoreCase(description))
			return NULL;
		if ("GENERAL PRACTICE".equalsIgnoreCase(description))
			return _208D00000X;
		if ("INTERNAL MEDICINE".equalsIgnoreCase(description))
			return _207R00000X;
		if ("FAMILY PRACTICE".equalsIgnoreCase(description))
			return _207Q00000X;
		if ("PHYSICAL THERAPY".equalsIgnoreCase(description))
			return _208100000X;
		if ("CHIROPRACTIC".equalsIgnoreCase(description))
			return _111N00000X;
		if ("NURSE PRACTITIONER".equalsIgnoreCase(description))
			return _363L00000X;
		if ("CLINICAL PSYCHOLOGIST".equalsIgnoreCase(description))
			return _103TC0700X;
		if ("CLINICAL SOCIAL WORKER".equalsIgnoreCase(description))
			return _1041C0700X;
		if ("CLINICAL NURSE SPECIALIST".equalsIgnoreCase(description))
			return _364S00000X;
		if ("OPHTHALMOLOGY".equalsIgnoreCase(description))
			return _207W00000X;
		if ("PSYCHIATRY".equalsIgnoreCase(description))
			return _2084P0800X;
		if ("PHYSICIAN ASSISTANT".equalsIgnoreCase(description))
			return _363A00000X;
		if ("UROLOGY".equalsIgnoreCase(description))
			return _208800000X;
		if ("PLASTIC AND RECONSTRUCTIVE SURGERY".equalsIgnoreCase(description))
			return _2086S0122X;
		if ("OPTOMETRY".equalsIgnoreCase(description))
			return _152W00000X;
		if ("GASTROENTEROLOGY".equalsIgnoreCase(description))
			return _207RG0100X;
		if ("NEUROLOGY".equalsIgnoreCase(description))
			return _2084N0400X;
		if ("HOSPITALIST".equalsIgnoreCase(description))
			return _208M00000X;
		if ("PEDIATRIC MEDICINE".equalsIgnoreCase(description))
			return _208000000X;
		if ("RHEUMATOLOGY".equalsIgnoreCase(description))
			return _207RR0500X;
		if ("PODIATRY".equalsIgnoreCase(description))
			return _213E00000X;
		if ("CERTIFIED NURSE MIDWIFE".equalsIgnoreCase(description))
			return _367A00000X;
		if ("ENDOCRINOLOGY".equalsIgnoreCase(description))
			return _207RE0101X;
		if ("DIAGNOSTIC RADIOLOGY".equalsIgnoreCase(description))
			return _2085R0202X;
		if ("AUDIOLOGIST".equalsIgnoreCase(description))
			return _231H00000X;
		if ("CARDIOVASCULAR DISEASE (CARDIOLOGY)".equalsIgnoreCase(description))
			return _207RC0000X;
		if ("OBSTETRICS/GYNECOLOGY".equalsIgnoreCase(description))
			return _207V00000X;
		if ("DERMATOLOGY".equalsIgnoreCase(description))
			return _207N00000X;
		if ("ORTHOPEDIC SURGERY".equalsIgnoreCase(description))
			return _207X00000X;
		if ("PHYSICAL MEDICINE AND REHABILITATION".equalsIgnoreCase(description))
			return _208100000X;
		if ("REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL".equalsIgnoreCase(description))
			return _133V00000X;
		if ("ADDICTION MEDICINE".equalsIgnoreCase(description))
			return _207RA0401X;
		if ("THORACIC SURGERY".equalsIgnoreCase(description))
			return _208G00000X;
		if ("SPEECH LANGUAGE PATHOLOGIST".equalsIgnoreCase(description))
			return _235Z00000X;
		if ("PULMONARY DISEASE".equalsIgnoreCase(description))
			return _207RP1001X;
		if ("INTERVENTIONAL PAIN MANAGEMENT".equalsIgnoreCase(description))
			return _208VP0014X;
		if ("OTOLARYNGOLOGY".equalsIgnoreCase(description))
			return _207Y00000X;
		if ("HEMATOLOGY/ONCOLOGY".equalsIgnoreCase(description))
			return _207RH0003X;
		if ("VASCULAR SURGERY".equalsIgnoreCase(description))
			return _2086S0129X;
		if ("HAND SURGERY".equalsIgnoreCase(description))
			return _2086S0105X;
		if ("INTERVENTIONAL CARDIOLOGY".equalsIgnoreCase(description))
			return _207RI0011X;
		if ("PATHOLOGY".equalsIgnoreCase(description))
			return _207ZP0102X;
		if ("GERIATRIC MEDICINE".equalsIgnoreCase(description))
			return _207RG0300X;
		if ("INFECTIOUS DISEASE".equalsIgnoreCase(description))
			return _207RI0200X;
		if ("ORAL SURGERY".equalsIgnoreCase(description))
			return _1223S0112X;
		if ("MAXILLOFACIAL SURGERY".equalsIgnoreCase(description))
			return _204E00000X;
		if ("ALLERGY/IMMUNOLOGY".equalsIgnoreCase(description))
			return _207K00000X;
		if ("NEPHROLOGY".equalsIgnoreCase(description))
			return _207RN0300X;
		if ("PAIN MANAGEMENT".equalsIgnoreCase(description))
			return _208VP0000X;
		if ("OCCUPATIONAL THERAPY".equalsIgnoreCase(description))
			return _225X00000X;
		if ("GYNECOLOGICAL ONCOLOGY".equalsIgnoreCase(description))
			return _207VX0201X;
		if ("CRITICAL CARE (INTENSIVISTS)".equalsIgnoreCase(description))
			return _207RC0200X;
		if ("SLEEP MEDICINE".equalsIgnoreCase(description))
			return _207QS1201X;
		if ("RADIATION ONCOLOGY".equalsIgnoreCase(description))
			return _2085R0001X;
		if ("ANESTHESIOLOGY".equalsIgnoreCase(description))
			return _207L00000X;
		if ("CERTIFIED REGISTERED NURSE ANESTHETIST".equalsIgnoreCase(description))
			return _367500000X;
		if ("COLORECTAL SURGERY (PROCTOLOGY)".equalsIgnoreCase(description))
			return _208C00000X;
		if ("UNDEFINED PHYSICIAN TYPE (SPECIFY)".equalsIgnoreCase(description))
			return _NA;
		if ("HOSPICE/PALLIATIVE CARE".equalsIgnoreCase(description))
			return _2081H0002X;
		if ("MEDICAL ONCOLOGY".equalsIgnoreCase(description))
			return _207RX0202X;
		if ("PERIPHERAL VASCULAR DISEASE".equalsIgnoreCase(description))
			return _2086S0129X;
		if ("SPORTS MEDICINE".equalsIgnoreCase(description))
			return _204C00000X;
		if ("NEUROSURGERY".equalsIgnoreCase(description))
			return _207T00000X;
		if ("NUCLEAR MEDICINE".equalsIgnoreCase(description))
			return _207U00000X;
		if ("INTERVENTIONAL RADIOLOGY".equalsIgnoreCase(description))
			return _2085R0204X;
		if ("SURGICAL ONCOLOGY".equalsIgnoreCase(description))
			return _2086X0206X;
		if ("PREVENTATIVE MEDICINE".equalsIgnoreCase(description))
			return _2083P0901X;
		if ("NEUROPSYCHIATRY".equalsIgnoreCase(description))
			return _2084N0600X;
		if ("HEMATOLOGY".equalsIgnoreCase(description))
			return _207RH0000X;
		if ("EMERGENCY MEDICINE".equalsIgnoreCase(description))
			return _207P00000X;
		if ("GENERAL SURGERY".equalsIgnoreCase(description))
			return _208600000X;
		if ("GERIATRIC PSYCHIATRY".equalsIgnoreCase(description))
			return _2084P0805X;
		if ("CARDIAC ELECTROPHYSIOLOGY".equalsIgnoreCase(description))
			return _207RC0001X;
		if ("ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY".equalsIgnoreCase(description))
			return _207RA0001X;
		if ("ANESTHESIOLOGY ASSISTANT".equalsIgnoreCase(description))
			return _367H00000X;
		if("CARDIAC SURGERY".equalsIgnoreCase(description))
			return _2086S0129X;
		return null;
	}
	
	/**
	 * The function maps the enum value to a string representing the code.
	 * @return the string associated with the code
	 */
	public String toCode() {
		switch (this) {
		case _208D00000X:
			return "208D00000X";/* GENERAL PRACTICE */
		case _207R00000X:
			return "207R00000X";/* INTERNAL MEDICINE */
		case _207Q00000X:
			return "207Q00000X";/* FAMILY PRACTISE */
		case _111N00000X:
			return "111N00000X";/* CHIROPRACTIC */
		case _363L00000X:
			return "363L00000X";/* NURSE PRACTITIONER */
		case _103TC0700X:
			return "103TC0700X";/* CLINICAL PSYCHOLOGIST */
		case _1041C0700X:
			return "1041C0700X";/*  CLINICAL SOCIAL WORKER  */
		case _364S00000X:
			return "364S00000X";/* CLINICAL NURSE SPECIALIST */
		case _207W00000X:
			return "207W00000X";/* OPHTHALMOLOGY */
		case _2084P0800X:
			return "2084P0800X";/* PSYCHIATRY */
		case _363A00000X:
			return "363A00000X";/* PHYSICIAN ASSISTANT */
		case _208800000X:
			return "208800000X";/* UROLOGY */
		case _2086S0122X:
			return "_2086S0122X3";/* PLASTIC AND RECOSTRUCTIVE SURGERY*/
		case _152W00000X:
			return "152W00000X";/* OPTOMETRY */
		case _207RG0100X:
			return "207RG0100X";/* GASTROENTEROLOGY */
		case _2084N0400X:
			return "2084N0400X";/* NEUROLOGY */
		case _208M00000X:
			return "208M00000X";/* HOSPITALIST */
		case _208000000X:
			return "208000000X";/* MEDICAL PEDIATRIC */
		case _207RR0500X:
			return "207RR0500X";/* RHEUMATOLOGY */
		case _213E00000X:
			return "213E00000X";/* PODIATRY */
		case _367A00000X:
			return "367A00000X";/* CERTIFIED NURSE MIDWIFE */
		case _207RE0101X:
			return "207RE0101X";/* ENDOCRINOLOGY */
		case _2085R0202X:
			return "2085R0202X8";/* DIAGNOSTIC RADIOLOGY */
		case _231H00000X:
			return "231H00000X";/* AUDIOLOGIST */
		case _207RC0000X:
			return "207RC0000X";/*CARDIOVASCULAR DISEASE (CARDIOLOGY) */
		case _207V00000X:
			return "207V00000X";/* OBSTETRICS/GYNECOLOGY */
		case _207N00000X:
			return "207N00000X";/* DERMATOLOGY */
		case _207X00000X:
			return "207X00000X";/* ORTHOPEDIC SURGERY*/
		case _208100000X:
			return "208100000X";/* PHYSICAL MEDICINE AND REHABILITATION  */
		case _133V00000X:
			return "133V00000X";/* REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL*/
		case _207RA0401X:
			return "207RA0401X";/* ADDICTION MEDICINE */
		case _208G00000X:
			return "408456005";/* THORACIC SURGERY */
		case _235Z00000X:
			return "_235Z00000X";/* SPEECH LANGUAGE PATHOLOGIST */
		case _207RP1001X:
			return "418112009";/* PULMONARY DISEASE */
		case _208VP0014X:
			return "208VP0014X";/* INTERVENTIONAL PAIN MANAGEMENT */
		case _207Y00000X:
			return "207Y00000X";/* OTOLARYNGOLOGY */
		case _207RH0003X:
			return "207RH0003X";/* HEMATOLOGY/ONCOLOGY */
		case _2086S0129X:
			return "_2086S0129X";/* VASCULAR SURGERY, CARDIAC SURGERY, PERIPHERAL VASCULAR DISEASE */
		case _2086S0105X:
			return "2086S0105X";/* HAND SURGERY */
		case _207RI0011X:
			return "_207RI0011X";/* INTERVENTIONAL CARDIOLOGY*/
		case _207ZP0102X:
			return "207ZP0102X";/* PATHOLOGY */
		case _207RG0300X:
			return "207RG0300X";/* GERIATRIC MEDICINE */
		case _207RI0200X:
			return "207RI0200X";/* INFECTIOUS DISEASE */
		case _1223S0112X:
			return "_1223S0112X";/* ORAL SURGERY */
		case _204E00000X:
			return "204E00000X";/* MAXILLOFACIAL SURGERY */
		case _207K00000X:
			return "207K00000X";/* ALLERGY/IMMUNOLOGY*/
		case _207RN0300X:
			return "207RN0300X";/* NEPHROLOGY */
		case _208VP0000X:
			return "208VP0000X";/* PAIN MANAGEMENT SPECIALIST */
		case _225X00000X:
			return "225X00000X";/* OCCUPATIONAL THERAPY */
		case _207VX0201X:
			return "207VX0201X";/* GYNECOLOGICAL ONCOLOGY */
		case _207RC0200X:
			return "207RC0200X";/* CRITICAL CARE (INTENSIVISTS)  */
		case _207QS1201X:
			return "207QS1201X";/* SLEEP MEDICINE */
		case _2085R0001X:
			return "2085R0001X";/* RADIATION ONCOLOGY */
		case _207L00000X:
			return "207L00000X";/* ANESTHESIOLOGY */
		case _367500000X:
			return "367500000X";/* CERTIFIED REGISTERED NURSE ANESTHETIST */
		case _208C00000X:
			return "208C00000X";/* COLORECTAL SURGERY (PROCTOLOGY) */
		case _NA:
			return "NA";/* UNDEFINED PHYSICIAN TYPE (SPECIFY) */
		case _2081H0002X:
			return "2081H0002X";/* PALLIATIVE MEDICINE: HOSPICE/PALLIATIVE CARE FROM CSV */
		case _207RX0202X:
			return "207RX0202X";/* MEDICAL ONCOLOGY */
		case _204C00000X:
			return "204C00000X";/* SPORTS MEDICINE */
		case _207T00000X:
			return "207T00000X";/* NEUROSURGERY */
		case _207U00000X:
			return "207U00000X";/* NUCLEAR MEDICINE */
		case _2085R0204X:
			return "2085R0204X";/* INTERVENTIONAL RADIOLOGY */
		case _2086X0206X:
			return "2086X0206X";/* SURGICAL ONCOLOGY */
		case _2083P0901X:
			return "2083P0901X";/* PREVENTIVE MEDICINE*/
		case _2084N0600X:
			return "2084N0600X";/* NEUROPHYSICHIATRY */
		case _207RH0000X:
			return "207RH0000X";/* HEMATOLOGIST */
		case _207P00000X:
			return "207P00000X";/* EMERGENCY MEDICINE */
		case _208600000X:
			return "208600000X";/* GENERAL SURGERY */
		case _2084P0805X:
			return "2084P0805X";/* GERIATRIC PSYCHIATRY */
		case _207RC0001X:
			return "_207RC0001X";/* CARDIAC ELECTROPHYSIOLOGY */
		case _207RA0001X:
			return "408471009";/* ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY */
		case _367H00000X:
			return "309445003";/* nurse - ANESTHESIOLOGY ASSISTANT */
		case NULL:
			return "null";
		}
		return null;
	}

	/**
	 * The function gets the system used to encode the specialty.
	 * @return the system used to encode the specialty -- NUCC
	 */	
	public String getSystem() {
		return "https://www.nucc.org/";
	}

	/**
	 * The function gets a human readable description associated with the specialty of the practitioner.
	 * @return the description associated with the code
	 */
	public String getDefinition() {
		switch (this) {
		case _208D00000X:
			return "General Practice";/* GENERAL PRACTICE */
		case _207R00000X:
			return "Internal Medicine";/* INTERNAL MEDICINE */
		case _207Q00000X:
			return "Family Practice";/* FAMILY PRACTICE */
		case _111N00000X:
			return "Chiropractic";/* CHIROPRACTIC */
		case _363L00000X:
			return "Nurse Practitioner";/* NURSE PRACTITIONER */
		case _103TC0700X:
			return "Clinical Psychologist";/* CLINICAL PSYCHOLOGIST */
		case _1041C0700X:
			return "Clinical Social Worker";/* CLINICAL SOCIAL WORKER F */
		case _364S00000X:
			return "Clinical Nurse Specialist";/* CLINICAL NURSE SPECIALIST */
		case _207W00000X:
			return "Ophthamology";/* OPHTHALMOLOGY */
		case _2084P0800X:
			return "Psychiatry";/* PSYCHIATRY */
		case _363A00000X:
			return "Physician Assistant";/* PHYSICIAN ASSISTANT */
		case _208800000X:
			return "Urology";/* UROLOGY */
		case _2086S0122X:
			return "Plastic Surgery";/*PLASTIC AND RECOSTRUCTIVE SURGERY */
		case _152W00000X:
			return "Optometry";/* OPTOMETRY */
		case _207RG0100X:
			return "Gastroenterology";/* GASTROENTEROLOGY */
		case _2084N0400X:
			return "Neurology";/* NEUROLOGY */
		case _208M00000X:
			return "Hospitalist";/* HOSPITALIST */
		case _208000000X:
			return "Medical Pediatric";/*MEDICAL PEDIATRIC  */
		case _207RR0500X:
			return "Rheumatology";/* RHEUMATOLOGY */
		case _213E00000X:
			return "Podiatry";/* PODIATRY */
		case _367A00000X:
			return "Certified Nurse Midwife";/* CERTIFIED NURSE MIDWIFE */
		case _207RE0101X:
			return "Endocrinology";/* ENDOCRINOLOGY */
		case _2085R0202X:
			return "Diagnostic Radiology";/*DIAGNOSTIC RADIOLOGY*/
		case _231H00000X:
			return "Audiologist";/* AUDIOLOGIST */
		case _207RC0000X:
			return "Cardiovascular Disease (Cardiology)";/*CARDIOVASCULAR DISEASE (CARDIOLOGY) */
		case _207V00000X:
			return "Obstetrics/Gynecology";/* OBSTETRICS/GYNECOLOGY */
		case _207N00000X:
			return "Dermatology";/* DERMATOLOGY */
		case _207X00000X:
			return "Ortopedic Surgery";/* ORTHOPEDIC SURGERY: SURGERY- TRAUMA AND ORTOPEDICS */
		case _208100000X:
			return "Physical Medicine and Rehabilitation/Physical Theraphy";/* PHYSICAL MEDICINE AND REHABILITATION */
		case _133V00000X:
			return "Registered Dietitian/Nutrition Professional";/* DIETITIAN: REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL */
		case _207RA0401X:
			return "Addiction Medicine";/* ADDICTION MEDICINE */
		case _208G00000X:
			return "Thoracic Surgery";/* THORACIC SURGERY */
		case _235Z00000X:
			return "Speech/Language Pathologist";/* : SPEECH LANGUAGE PATHOLOGIST */
		case _207RP1001X:
			return "Pulmonary Disease";/*PULMONARY DISEASE */
		case _208VP0014X:
			return "Interventional Pain Management";/* INTERVENTIONAL PAIN MANAGEMENT (SPECIALTY) */
		case _207Y00000X:
			return "Otolaryngology";/* OTOLARYNGOLOGY */
		case _207RH0003X:
			return "Hematology/Oncology";/* HEMATOLOGY/ONCOLOGY */
		case _2086S0129X:
			return "Vascular Surgery/Cardiac Surgery/Peripheral Vascular Disease";/* VASCULAR SURGERY, CARDIAC SURGERY, PERIPHERAL VASCULAR DISEASE */
		case _2086S0105X:
			return "Hand Surgery";/* HAND SURGERY */
		case _207RI0011X:
			return "Interventional Cardiology"; /*INTERVENTIONAL CARDIOLOGY*/
		case _207ZP0102X:
			return "Pathology";/* PATHOLOGY */
		case _207RG0300X:
			return "Geriatric Medicine";/* GERIATRIC MEDICINE */
		case _207RI0200X:
			return "Infecticious Disease";/* INFECTIOUS DISEASE */
		case _1223S0112X:
			return "Oral Surgery";/* ORAL SURGERY */
		case _204E00000X:
			return "Maxillofacial Surgery";/* MAXILLOFACIAL SURGERY */
		case _207K00000X:
			return "Allergy/Immunology";/*ALLERGY/IMMUNOLOGY */
		case _207RN0300X:
			return "Nephrology";/* NEPHROLOGY */
		case _208VP0000X:
			return "Pain Management";/* PAIN MANAGEMENT SPECIALIST */
		case _225X00000X:
			return "Occupational Theraphy";/* OCCUPATIONAL THERAPY */
		case _207VX0201X:
			return "Gynecological Oncology";/* GYNECOLOGICAL ONCOLOGY */
		case _207RC0200X:
			return "Critical Care (Intensivists)";/* CRITICAL CARE (INTENSIVISTS)  */
		case _207QS1201X:
			return "Sleep Medicine";/* SLEEP MEDICINE */
		case _2085R0001X:
			return "Radiation Oncology";/* RADIATION ONCOLOGY */
		case _207L00000X:
			return "Anesthesiology";/* ANESTHESIOLOGY */
		case _367500000X:
			return "Certified Registered Nurse Anesthetist";/* CERTIFIED REGISTERED NURSE ANESTHETIST */
		case _208C00000X:
			return "Colorectal Surgery (Proctology)";/* COLORECTAL SURGERY (PROCTOLOGY) */
		case _NA:
			return "Undefined Physician Type";/* UNDEFINED PHYSICIAN TYPE (SPECIFY) */
		case _2081H0002X:
			return "Hospice/Palliative Medicine";/* HOSPICE/PALLIATIVE CARE  */
		case _207RX0202X:
			return "Medical Oncology";/* MEDICAL ONCOLOGY */
		case _204C00000X:
			return "Sports Medicine";/* SPORTS MEDICINE */
		case _207T00000X:
			return "Neurosurgery";/* NEUROSURGERY */
		case _207U00000X:
			return "Nuclear Medicine";/* NUCLEAR MEDICINE */
		case _2085R0204X:
			return "Interventional Radiology";/* INTERVENTIONAL RADIOLOGY */
		case _2086X0206X:
			return "Surgical Oncology";/* SURGICAL ONCOLOGY */
		case _2083P0901X:
			return "Preventive Medicine";/* PREVENTIVE MEDICINE: PREVENTATIVE MEDICINE FROM CSV */
		case _2084N0600X:
			return "Neurophysichiatry";/* NEUROPHYSICHIATRY */
		case _207RH0000X:
			return "Hematology";/* HEMATOLOGIST */
		case _207P00000X:
			return "Emergency Medicine";/* EMERGENCY MEDICINE */
		case _208600000X:
			return "General Surgery";/* GENERAL SURGERY */
		case _2084P0805X:
			return "Geriatric Physichiatry";/* GERIATRIC PHYSICHIATRY */
		case _207RC0001X:
			return "Cardiac Electrophysiology";/* CARDIAC ELECTROPHYSIOLOGY */
		case _207RA0001X:
			return "Advanced Heart Failure and Transplant Cardiology";/* ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY */
		case _367H00000X:
			return "Anesthesiology Assistant";/* nurse - ANESTHESIOLOGY ASSISTANT */
		case NULL:
			return "null";
		}
		return null;
	}

	
	

	
	
	
	
}
