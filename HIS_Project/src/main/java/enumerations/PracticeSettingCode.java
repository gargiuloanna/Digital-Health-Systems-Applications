package enumerations;

import org.hl7.fhir.exceptions.FHIRException;

public enum PracticeSettingCode {

	_394814009, /* GENERAL PRACTICE */
	_419192003, /* INTERNAL MEDICINE */
	_419772000, /* FAMILY PRACTISE */
	_722138006, /* PHYSICAL THERAPHY */
	_722170006, /* CHIROPRACTIC */
	_224571005, /* NURSE PRACTITIONER */
	_310191001, /* CLINICAL PSYCHOLOGIST */
	_158950001, /* MEDICAL SOCIAL WORKER: CLINICAL SOCIAL WORKER FROM CSV */
	_224570006, /* CLINICAL NURSE SPECIALIST */
	_394594003, /* OPHTHALMOLOGY */
	_394587001, /* PSYCHIATRY */
	_449161006, /* PHYSICIAN ASSISTANT */
	_394612005, /* UROLOGY */
	_394611003, /* PLASTIC SURGERY: PLASTIC AND RECOSTRUCTIVE SURGERY FROM CSV */
	_310105000, /* OPTOMETRY */
	_394584008, /* GASTROENTEROLOGY */
	_394591006, /* NEUROLOGY */
	_768837005, /* HOSPITALIST */
	_394537008, /* PEDIATRICS: MEDICAL PEDIATRIC FROM CSV */
	_394810000, /* RHEUMATOLOGY */
	_722166003, /* PODIATRY */
	_224534008, /* CERTIFIED NURSE MIDWIFE */
	_394583002, /* ENDOCRINOLOGY */
	_394914008, /* RADIOLOGY: DIAGNOSTIC RADIOLOGY FROM CSV */
	_309418004, /* AUDIOLOGIST */
	_394579002, /* CARDIOLOGY: CARDIOVASCULAR DISEASE (CARDIOLOGY) FROM CSV */
	_394585009, /* OBSTETRICS/GYNECOLOGY */
	_394582007, /* DERMATOLOGY */
	_394801008, /* ORTHOPEDIC SURGERY: SURGERY- TRAUMA AND ORTOPEDICS */
	_722424008, /* PHYSICAL MEDICINE AND REHABILITATION */
	_159033005, /* DIETITIAN: REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL FROM CSV */
	_446701002, /* ADDICTION MEDICINE */
	_408456005, /* THORACIC SURGERY */
	_159026005, /* SPEECH/LANGUAGE THERAPIST: SPEECH LANGUAGE PATHOLOGIST FROM CSV */
	_418112009, /* PULMONARY MEDICINE: PULMONARY DISEASE FROM CSV */
	_394882004, /* INTERVENTIONAL PAIN MANAGEMENT (SPECIALTY) */
	_418960008, /* OTOLARYNGOLOGY */
	_394803006, /* hematopathology - HEMATOLOGY/ONCOLOGY */
	_408463005, /* VASCULAR SURGERY */
	_310157000, /* HAND SURGERY */
	_408466002, /* CARDIAC SURGERY: INTERVENTIONAL CARDIOLOGY FROM CSV */
	_394595002, /* PATHOLOGY */
	_394811001, /* GERIATRIC MEDICINE */
	_394807007, /* INFECTIOUS DISEASE */
	_394605001, /* ORAL SURGERY */
	_408457001, /* MAXILLOFACIAL SURGERY */
	_408439002, /* _721943002 - ALLERGY/ ---_408480009 IMMUNOLOGY?? */
	_394589003, /* NEPHROLOGY */
	_309337009, /* PAIN MANAGEMENT SPECIALIST */
	_224587008, /* OCCUPATIONAL THERAPY */
	_408446006, /* GYNECOLOGICAL ONCOLOGY */
	_408478003, /* CRITICAL CARE MEDICINE: CRITICAL CARE (INTENSIVISTS) FROM CSV */
	_408450004, /* SLEEP MEDICINE */
	_419815003, /* RADIATION ONCOLOGY */
	_394577000, /* ANESTHESIOLOGY */
	_405278004, /* CERTIFIED REGISTERED NURSE ANESTHETIST */
	_408464004, /* COLORECTAL SURGERY (PROCTOLOGY) */
	_59058001, /* unsure - UNDEFINED PHYSICIAN TYPE (SPECIFY) */
	_394806003, /* PALLIATIVE MEDICINE: HOSPICE/PALLIATIVE CARE FROM CSV */
	_394593009, /* MEDICAL ONCOLOGY */
	_721939001, /* PERIPHERAL VASCULAR DISEASE */
	_1251536003, /* SPORTS MEDICINE */
	_394610002, /* NEUROSURGERY */
	_394649004, /* NUCLEAR MEDICINE */
	_408455009, /* INTERVENTIONAL RADIOLOGY */
	_419321007, /* SURGICAL ONCOLOGY */
	_409968004, /* PREVENTIVE MEDICINE: PREVENTATIVE MEDICINE FROM CSV */
	_21450003, /* NEUROPHYSICHIATRY */
	_40204001, /* HEMATOLOGIST */
	_773568002, /* EMERGENCY MEDICINE */
	_394609007, /* GENERAL SURGERY */
	_309364005, /* GERIATRIC PHYSICHIATRY */
	_1251551007, /* CARDIAC ELECTROPHYSIOLOGY */
	_408471009, /* ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY */
	_309445003, /* nurse - ANESTHESIOLOGY ASSISTANT */
	NULL;

	public static PracticeSettingCode fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString))
			return NULL;
		if ("_394814009".equals(codeString))
			return _394814009;
		if ("_419192003".equals(codeString))
			return _419192003;
		if ("_419772000".equals(codeString))
			return _419772000;
		if ("_722138006".equals(codeString))
			return _722138006;
		if ("_722170006".equals(codeString))
			return _722170006;
		if ("_224571005".equals(codeString))
			return _224571005;
		if ("_158950001".equals(codeString))
			return _158950001;
		if ("_224570006".equals(codeString))
			return _224570006;
		if ("_394594003".equals(codeString))
			return _394594003;
		if ("_394587001".equals(codeString))
			return _394587001;
		if ("_449161006".equals(codeString))
			return _449161006;
		if ("_394612005".equals(codeString))
			return _394612005;
		if ("_394611003".equals(codeString))
			return _394611003;
		if ("_310105000".equals(codeString))
			return _310105000;
		if ("_394584008".equals(codeString))
			return _394584008;
		if ("_394591006".equals(codeString))
			return _394591006;
		if ("_768837005".equals(codeString))
			return _768837005;
		if ("_394537008".equals(codeString))
			return _394537008;
		if ("_394810000".equals(codeString))
			return _394810000;
		if ("_722166003".equals(codeString))
			return _722166003;
		if ("_224534008".equals(codeString))
			return _224534008;
		if ("_394583002".equals(codeString))
			return _394583002;
		if ("_394914008".equals(codeString))
			return _394914008;
		if ("_309418004".equals(codeString))
			return _309418004;
		if ("_394579002".equals(codeString))
			return _394579002;
		if ("_394585009".equals(codeString))
			return _394585009;
		if ("_394582007".equals(codeString))
			return _394582007;
		if ("_394914008".equals(codeString))
			return _394914008;
		if ("_446701002".equals(codeString))
			return _446701002;
		if ("_408456005".equals(codeString))
			return _408456005;
		if ("_159026005".equals(codeString))
			return _159026005;
		if ("_418112009".equals(codeString))
			return _418112009;
		if ("_394882004".equals(codeString))
			return _394882004;
		if ("_418960008".equals(codeString))
			return _418960008;
		if ("_394803006".equals(codeString))
			return _394803006;
		if ("_408463005".equals(codeString))
			return _408463005;
		if ("_310157000".equals(codeString))
			return _310157000;
		if ("_408466002".equals(codeString))
			return _408466002;
		if ("_394811001".equals(codeString))
			return _394811001;
		if ("_394595002".equals(codeString))
			return _394595002;
		if ("_394807007".equals(codeString))
			return _394807007;
		if ("_394605001".equals(codeString))
			return _394605001;
		if ("_408457001".equals(codeString))
			return _408457001;
		if ("_408439002".equals(codeString))
			return _408439002;
		if ("_394589003".equals(codeString))
			return _394589003;
		if ("_309337009".equals(codeString))
			return _309337009;
		if ("_224587008".equals(codeString))
			return _224587008;
		if ("_408446006".equals(codeString))
			return _408446006;
		if ("_408478003".equals(codeString))
			return _408478003;
		if ("_408450004".equals(codeString))
			return _408450004;
		if ("_419815003".equals(codeString))
			return _419815003;
		if ("_394577000".equals(codeString))
			return _394577000;
		if ("_405278004".equals(codeString))
			return _405278004;
		if ("_408464004".equals(codeString))
			return _408464004;
		if ("_59058001".equals(codeString))
			return _59058001;
		if ("_394806003".equals(codeString))
			return _394806003;
		if ("_394593009".equals(codeString))
			return _394593009;
		if ("_721939001".equals(codeString))
			return _721939001;
		if ("_1251536003".equals(codeString))
			return _1251536003;
		if ("_394610002".equals(codeString))
			return _394610002;
		if ("_394649004".equals(codeString))
			return _394649004;
		if ("_408455009".equals(codeString))
			return _408455009;
		if ("_419321007".equals(codeString))
			return _419321007;
		if ("_409968004".equals(codeString))
			return _409968004;
		if ("_21450003".equals(codeString))
			return _21450003;
		if ("_40204001".equals(codeString))
			return _40204001;
		if ("_773568002".equals(codeString))
			return _773568002;
		if ("_394609007".equals(codeString))
			return _394609007;
		if ("_309364005".equals(codeString))
			return _309364005;
		if ("_1251551007".equals(codeString))
			return _1251551007;
		if ("_408471009".equals(codeString))
			return _408471009;
		if ("_309445003".equals(codeString))
			return _309445003;

		throw new FHIRException("Unknown PracticeSettingCode code '" + codeString + "'");
	}

	public static PracticeSettingCode fromCSV(String description) {
		
		if (description == null || "".equalsIgnoreCase(description))
			return NULL;
		if ("general practise".equalsIgnoreCase(description))
			return _394814009;
		if ("internal medicine".equalsIgnoreCase(description))
			return _419192003;
		if ("family practise".equalsIgnoreCase(description))
			return _419772000;
		if ("physicial theraphy".equalsIgnoreCase(description))
			return _722138006;
		if ("chiropractic".equalsIgnoreCase(description))
			return _722170006;
		if ("nurse practitioner".equalsIgnoreCase(description))
			return _224571005;
		if ("clinical phychologist".equalsIgnoreCase(description))
			return _310191001;
		if ("clinical social worker".equalsIgnoreCase(description))
			return _158950001;
		if ("clinical nurse specialist".equalsIgnoreCase(description))
			return _224570006;
		if ("ophthalmology".equalsIgnoreCase(description))
			return _394594003;
		if ("phychiatry".equalsIgnoreCase(description))
			return _394587001;
		if ("physician assistant".equalsIgnoreCase(description))
			return _449161006;
		if ("urology".equalsIgnoreCase(description))
			return _394612005;
		if ("plastic and recostructive surgery".equalsIgnoreCase(description))
			return _394611003;
		if ("optometry".equalsIgnoreCase(description))
			return _310105000;
		if ("gastroenterology".equalsIgnoreCase(description))
			return _394584008;
		if ("neurology".equalsIgnoreCase(description))
			return _394591006;
		if ("hospitalist".equalsIgnoreCase(description))
			return _768837005;
		if ("medical pediatric".equalsIgnoreCase(description))
			return _394537008;
		if ("rheumatology".equalsIgnoreCase(description))
			return _394810000;
		if ("podiatry".equalsIgnoreCase(description))
			return _722166003;
		if ("certified nurse midwife".equalsIgnoreCase(description))
			return _224534008;
		if ("endocrinology".equalsIgnoreCase(description))
			return _394583002;
		if ("diagnostic radiology".equalsIgnoreCase(description))
			return _394914008;
		if ("audiologist".equalsIgnoreCase(description))
			return _309418004;
		if ("cardiovascular disease (cardiology)".equalsIgnoreCase(description))
			return _394579002;
		if ("obstetrics/gynecology".equalsIgnoreCase(description))
			return _394585009;
		if ("dermatology".equalsIgnoreCase(description))
			return _394582007;
		if ("orthopedic surgery:".equalsIgnoreCase(description))
			return _394801008;
		if ("physicial medicine and rehabilitation".equalsIgnoreCase(description))
			return _722424008;
		if ("registered dietitian or nutrition professional".equalsIgnoreCase(description))
			return _159033005;
		if ("addiction medicine".equalsIgnoreCase(description))
			return _446701002;
		if ("thoracic surgery".equalsIgnoreCase(description))
			return _408456005;
		if ("speech language pathology".equalsIgnoreCase(description))
			return _159026005;
		if ("pulmonary disease".equalsIgnoreCase(description))
			return _418112009;
		if ("interventional pain management".equalsIgnoreCase(description))
			return _394882004;
		if ("otolaryngology".equalsIgnoreCase(description))
			return _418960008;
		if ("hematology/oncology".equalsIgnoreCase(description))
			return _394803006;
		if ("vascular surgery".equalsIgnoreCase(description))
			return _408463005;
		if ("hand surgery".equalsIgnoreCase(description))
			return _310157000;
		if ("interventional cardiology".equalsIgnoreCase(description))
			return _408466002;
		if ("pathology".equalsIgnoreCase(description))
			return _394595002;
		if ("geriatric medicine".equalsIgnoreCase(description))
			return _394811001;
		if ("infectious disease".equalsIgnoreCase(description))
			return _394807007;
		if ("oral surgery".equalsIgnoreCase(description))
			return _394605001;
		if ("maxillofacial surgery".equalsIgnoreCase(description))
			return _408457001;
		if ("allergy/immunology".equalsIgnoreCase(description))
			return _408439002;
		if ("nephrology".equalsIgnoreCase(description))
			return _394589003;
		if ("pain management".equalsIgnoreCase(description))
			return _309337009;
		if ("occupational therapy".equalsIgnoreCase(description))
			return _224587008;
		if ("gynecological oncology".equalsIgnoreCase(description))
			return _408446006;
		if ("critical care (intensivists)".equalsIgnoreCase(description))
			return _408478003;
		if ("sleep medicine".equalsIgnoreCase(description))
			return _408450004;
		if ("radiation oncology".equalsIgnoreCase(description))
			return _419815003;
		if ("anesthesiology".equalsIgnoreCase(description))
			return _394577000;
		if ("certified registered nurse anesthetist".equalsIgnoreCase(description))
			return _405278004;
		if ("colorectal surgery (proctology)".equalsIgnoreCase(description))
			return _408464004;
		if ("undefined physician type (specify)".equalsIgnoreCase(description))
			return _59058001;
		if ("hospice/palliative care".equalsIgnoreCase(description))
			return _394806003;
		if ("medical oncology".equalsIgnoreCase(description))
			return _394593009;
		if ("peripheral vascular disease".equalsIgnoreCase(description))
			return _721939001;
		if ("sports medicine".equalsIgnoreCase(description))
			return _1251536003;
		if ("neurosurgery".equalsIgnoreCase(description))
			return _394610002;
		if ("nuclear medicine".equalsIgnoreCase(description))
			return _394649004;
		if ("interventional radiology".equalsIgnoreCase(description))
			return _408455009;
		if ("surgical oncology".equalsIgnoreCase(description))
			return _419321007;
		if ("preventative medicine".equalsIgnoreCase(description))
			return _409968004;
		if ("neurophysichiatry".equalsIgnoreCase(description))
			return _21450003;
		if ("hematologist".equalsIgnoreCase(description))
			return _40204001;
		if ("emergency medicine".equalsIgnoreCase(description))
			return _773568002;
		if ("general surgery".equalsIgnoreCase(description))
			return _394609007;
		if ("geriatric physichiatry".equalsIgnoreCase(description))
			return _309364005;
		if ("cardiac electrophysiology".equalsIgnoreCase(description))
			return _1251551007;
		if ("advanced heart failure and transplant cardioloy".equalsIgnoreCase(description))
			return _408471009;
		if ("anesthesiology assistant".equalsIgnoreCase(description))
			return _309445003;

		return null;

	}

	public String toCode() {
		switch (this) {
		case _394814009:
			return "394814009";/* GENERAL PRACTICE */
		case _419192003:
			return "419192003";/* INTERNAL MEDICINE */
		case _419772000:
			return "419772000";/* FAMILY PRACTISE */
		case _722138006:
			return "722138006";/* PHYSICAL THERAPHY */
		case _722170006:
			return "722170006";/* CHIROPRACTIC */
		case _224571005:
			return "224571005";/* NURSE PRACTITIONER */
		case _310191001:
			return "310191001";/* CLINICAL PSYCHOLOGIST */
		case _158950001:
			return "158950001";/* MEDICAL SOCIAL WORKER: CLINICAL SOCIAL WORKER FROM CSV */
		case _224570006:
			return "224570006";/* CLINICAL NURSE SPECIALIST */
		case _394594003:
			return "394594003";/* OPHTHALMOLOGY */
		case _394587001:
			return "394587001";/* PSYCHIATRY */
		case _449161006:
			return "449161006";/* PHYSICIAN ASSISTANT */
		case _394612005:
			return "394612005";/* UROLOGY */
		case _394611003:
			return "394611003";/* PLASTIC SURGERY: PLASTIC AND RECOSTRUCTIVE SURGERY FROM CSV */
		case _310105000:
			return "310105000";/* OPTOMETRY */
		case _394584008:
			return "394584008";/* GASTROENTEROLOGY */
		case _394591006:
			return "394591006";/* NEUROLOGY */
		case _768837005:
			return "768837005";/* HOSPITALIST */
		case _394537008:
			return "394537008";/* PEDIATRICS: MEDICAL PEDIATRIC FROM CSV */
		case _394810000:
			return "394810000";/* RHEUMATOLOGY */
		case _722166003:
			return "722166003";/* PODIATRY */
		case _224534008:
			return "224534008";/* CERTIFIED NURSE MIDWIFE */
		case _394583002:
			return "394583002";/* ENDOCRINOLOGY */
		case _394914008:
			return "394914008";/* RADIOLOGY: DIAGNOSTIC RADIOLOGY FROM CSV */
		case _309418004:
			return "309418004";/* AUDIOLOGIST */
		case _394579002:
			return "394579002";/* CARDIOLOGY: CARDIOVASCULAR DISEASE (CARDIOLOGY) FROM CSV */
		case _394585009:
			return "394585009";/* OBSTETRICS/GYNECOLOGY */
		case _394582007:
			return "394582007";/* DERMATOLOGY */
		case _394801008:
			return "394801008";/* ORTHOPEDIC SURGERY: SURGERY- TRAUMA AND ORTOPEDICS */
		case _722424008:
			return "722424008";/* PHYSICAL MEDICINE AND REHABILITATION */
		case _159033005:
			return "159033005";/* DIETITIAN: REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL FROM CSV */
		case _446701002:
			return "446701002";/* ADDICTION MEDICINE */
		case _408456005:
			return "408456005";/* THORACIC SURGERY */
		case _159026005:
			return "159026005";/* SPEECH/LANGUAGE THERAPIST: SPEECH LANGUAGE PATHOLOGIST FROM CSV */
		case _418112009:
			return "418112009";/* PULMONARY MEDICINE: PULMONARY DISEASE FROM CSV */
		case _394882004:
			return "394882004";/* INTERVENTIONAL PAIN MANAGEMENT (SPECIALTY) */
		case _418960008:
			return "418960008";/* OTOLARYNGOLOGY */
		case _394803006:
			return "394803006";/* hematopathology - HEMATOLOGY/ONCOLOGY */
		case _408463005:
			return "408463005";/* VASCULAR SURGERY */
		case _310157000:
			return "310157000";/* HAND SURGERY */
		case _408466002:
			return "408466002";/* CARDIAC SURGERY: INTERVENTIONAL CARDIOLOGY FROM CSV */
		case _394595002:
			return "394595002";/* PATHOLOGY */
		case _394811001:
			return "394811001";/* GERIATRIC MEDICINE */
		case _394807007:
			return "394807007";/* INFECTIOUS DISEASE */
		case _394605001:
			return "394605001";/* ORAL SURGERY */
		case _408457001:
			return "408457001";/* MAXILLOFACIAL SURGERY */
		case _408439002:
			return "408439002";/* _721943002 - ALLERGY/ ---_408480009 IMMUNOLOGY?? */
		case _394589003:
			return "394589003";/* NEPHROLOGY */
		case _309337009:
			return "309337009";/* PAIN MANAGEMENT SPECIALIST */
		case _224587008:
			return "224587008";/* OCCUPATIONAL THERAPY */
		case _408446006:
			return "408446006";/* GYNECOLOGICAL ONCOLOGY */
		case _408478003:
			return "408478003";/* CRITICAL CARE MEDICINE: CRITICAL CARE (INTENSIVISTS) FROM CSV */
		case _408450004:
			return "408450004";/* SLEEP MEDICINE */
		case _419815003:
			return "419815003";/* RADIATION ONCOLOGY */
		case _394577000:
			return "394577000";/* ANESTHESIOLOGY */
		case _405278004:
			return "405278004";/* CERTIFIED REGISTERED NURSE ANESTHETIST */
		case _408464004:
			return "408464004";/* COLORECTAL SURGERY (PROCTOLOGY) */
		case _59058001:
			return "59058001";/* unsure - UNDEFINED PHYSICIAN TYPE (SPECIFY) */
		case _394806003:
			return "394806003";/* PALLIATIVE MEDICINE: HOSPICE/PALLIATIVE CARE FROM CSV */
		case _394593009:
			return "394593009";/* MEDICAL ONCOLOGY */
		case _721939001:
			return "721939001";/* PERIPHERAL VASCULAR DISEASE */
		case _1251536003:
			return "1251536003";/* SPORTS MEDICINE */
		case _394610002:
			return "394610002";/* NEUROSURGERY */
		case _394649004:
			return "394649004";/* NUCLEAR MEDICINE */
		case _408455009:
			return "408455009";/* INTERVENTIONAL RADIOLOGY */
		case _419321007:
			return "419321007";/* SURGICAL ONCOLOGY */
		case _409968004:
			return "409968004";/* PREVENTIVE MEDICINE: PREVENTATIVE MEDICINE FROM CSV */
		case _21450003:
			return "21450003";/* NEUROPHYSICHIATRY */
		case _40204001:
			return "40204001";/* HEMATOLOGIST */
		case _773568002:
			return "773568002";/* EMERGENCY MEDICINE */
		case _394609007:
			return "394609007";/* GENERAL SURGERY */
		case _309364005:
			return "309364005";/* GERIATRIC PHYSICHIATRY */
		case _1251551007:
			return "1251551007";/* CARDIAC ELECTROPHYSIOLOGY */
		case _408471009:
			return "408471009";/* ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY */
		case _309445003:
			return "309445003";/* nurse - ANESTHESIOLOGY ASSISTANT */
		case NULL:
			return "null";
		}
		return null;
	}

	public String getSystem() {
		return "https://www.snomed.org/";
	}

	public String getDefinition() {
		switch (this) {
		case _394814009:
			return "General Practice";/* GENERAL PRACTICE */
		case _419192003:
			return "Internal Medicine";/* INTERNAL MEDICINE */
		case _419772000:
			return "Family Practice";/* FAMILY PRACTISE */
		case _722138006:
			return "Physical Theraphy";/* PHYSICAL THERAPHY */
		case _722170006:
			return "Chiropractic";/* CHIROPRACTIC */
		case _224571005:
			return "Nurse Practitioner";/* NURSE PRACTITIONER */
		case _310191001:
			return "Clinical Psychologist";/* CLINICAL PSYCHOLOGIST */
		case _158950001:
			return "Medical Social Worker";/* MEDICAL SOCIAL WORKER: CLINICAL SOCIAL WORKER FROM CSV */
		case _224570006:
			return "Clinical Nurse Specialist";/* CLINICAL NURSE SPECIALIST */
		case _394594003:
			return "Ophtamology";/* OPHTHALMOLOGY */
		case _394587001:
			return "Psychiatry";/* PSYCHIATRY */
		case _449161006:
			return "Physician Assistant";/* PHYSICIAN ASSISTANT */
		case _394612005:
			return "Urology";/* UROLOGY */
		case _394611003:
			return "Plastic Surgery";/* PLASTIC SURGERY: PLASTIC AND RECOSTRUCTIVE SURGERY FROM CSV */
		case _310105000:
			return "Optometry";/* OPTOMETRY */
		case _394584008:
			return "Gastroenterology";/* GASTROENTEROLOGY */
		case _394591006:
			return "Neurology";/* NEUROLOGY */
		case _768837005:
			return "Hospitalist";/* HOSPITALIST */
		case _394537008:
			return "Pediatrics";/* PEDIATRICS: MEDICAL PEDIATRIC FROM CSV */
		case _394810000:
			return "Rheumatology";/* RHEUMATOLOGY */
		case _722166003:
			return "Podiatry";/* PODIATRY */
		case _224534008:
			return "Certified Nurse Midwife";/* CERTIFIED NURSE MIDWIFE */
		case _394583002:
			return "Endocrinology";/* ENDOCRINOLOGY */
		case _394914008:
			return "Radiology";/* RADIOLOGY: DIAGNOSTIC RADIOLOGY FROM CSV */
		case _309418004:
			return "Audiologist";/* AUDIOLOGIST */
		case _394579002:
			return "Cardiology";/* CARDIOLOGY: CARDIOVASCULAR DISEASE (CARDIOLOGY) FROM CSV */
		case _394585009:
			return "Obstetrics/Gynecology";/* OBSTETRICS/GYNECOLOGY */
		case _394582007:
			return "Dermatology";/* DERMATOLOGY */
		case _394801008:
			return "Ortopedic Surgery";/* ORTHOPEDIC SURGERY: SURGERY- TRAUMA AND ORTOPEDICS */
		case _722424008:
			return "Physical Medicine and Rehabilitation";/* PHYSICAL MEDICINE AND REHABILITATION */
		case _159033005:
			return "Dietitian";/* DIETITIAN: REGISTERED DIETITIAN OR NUTRITION PROFESSIONAL FROM CSV */
		case _446701002:
			return "Addiction Medicine";/* ADDICTION MEDICINE */
		case _408456005:
			return "Thoracic Surgery";/* THORACIC SURGERY */
		case _159026005:
			return "Speech/Language Therapist";/* SPEECH/LANGUAGE THERAPIST: SPEECH LANGUAGE PATHOLOGIST FROM CSV */
		case _418112009:
			return "Pulmonary Medicine";/* PULMONARY MEDICINE: PULMONARY DISEASE FROM CSV */
		case _394882004:
			return "Interventional Pain Management";/* INTERVENTIONAL PAIN MANAGEMENT (SPECIALTY) */
		case _418960008:
			return "Otolaryngology";/* OTOLARYNGOLOGY */
		case _394803006:
			return "Hematopathology";/* hematopathology - HEMATOLOGY/ONCOLOGY */
		case _408463005:
			return "Vascular Surgery";/* VASCULAR SURGERY */
		case _310157000:
			return "Hand Surgery";/* HAND SURGERY */
		case _408466002:
			return "Cardiac Surgery";/* CARDIAC SURGERY: INTERVENTIONAL CARDIOLOGY FROM CSV */
		case _394595002:
			return "Pathology";/* PATHOLOGY */
		case _394811001:
			return "Geriatric Medicine";/* GERIATRIC MEDICINE */
		case _394807007:
			return "Infecticious Disease";/* INFECTIOUS DISEASE */
		case _394605001:
			return "Oral Surgery";/* ORAL SURGERY */
		case _408457001:
			return "Maxillofacial Surgery";/* MAXILLOFACIAL SURGERY */
		case _408439002:
			return "Allergy/Immunology";/* _721943002 - ALLERGY/ ---_408480009 IMMUNOLOGY?? */
		case _394589003:
			return "Nephrology";/* NEPHROLOGY */
		case _309337009:
			return "Pain Management";/* PAIN MANAGEMENT SPECIALIST */
		case _224587008:
			return "Occupational Theraphy";/* OCCUPATIONAL THERAPY */
		case _408446006:
			return "Gynecological Oncology";/* GYNECOLOGICAL ONCOLOGY */
		case _408478003:
			return "Critical Care Medicine";/* CRITICAL CARE MEDICINE: CRITICAL CARE (INTENSIVISTS) FROM CSV */
		case _408450004:
			return "Sleep Medicine";/* SLEEP MEDICINE */
		case _419815003:
			return "Radiation Oncology";/* RADIATION ONCOLOGY */
		case _394577000:
			return "Anesthesiology";/* ANESTHESIOLOGY */
		case _405278004:
			return "Certified Registered Nurse Anesthetist";/* CERTIFIED REGISTERED NURSE ANESTHETIST */
		case _408464004:
			return "Colorectal Surgery";/* COLORECTAL SURGERY (PROCTOLOGY) */
		case _59058001:
			return "Undefined Physician Type";/* UNDEFINED PHYSICIAN TYPE (SPECIFY) */
		case _394806003:
			return "Palliative Medicine";/* PALLIATIVE MEDICINE: HOSPICE/PALLIATIVE CARE FROM CSV */
		case _394593009:
			return "Medical Oncology";/* MEDICAL ONCOLOGY */
		case _721939001:
			return "Peripheral Vascular Disease";/* PERIPHERAL VASCULAR DISEASE */
		case _1251536003:
			return "Sport Medicine";/* SPORTS MEDICINE */
		case _394610002:
			return "Neurosurgery";/* NEUROSURGERY */
		case _394649004:
			return "Nuclear Medicine";/* NUCLEAR MEDICINE */
		case _408455009:
			return "Interventional Radiology";/* INTERVENTIONAL RADIOLOGY */
		case _419321007:
			return "Surgical Oncology";/* SURGICAL ONCOLOGY */
		case _409968004:
			return "Preventive Medicine";/* PREVENTIVE MEDICINE: PREVENTATIVE MEDICINE FROM CSV */
		case _21450003:
			return "Neurophysichiatry";/* NEUROPHYSICHIATRY */
		case _40204001:
			return "Hematologist";/* HEMATOLOGIST */
		case _773568002:
			return "Emergency Medicine";/* EMERGENCY MEDICINE */
		case _394609007:
			return "General Surgery";/* GENERAL SURGERY */
		case _309364005:
			return "Geriatric Physichiatry";/* GERIATRIC PHYSICHIATRY */
		case _1251551007:
			return "Cardiac Electrophysiology";/* CARDIAC ELECTROPHYSIOLOGY */
		case _408471009:
			return "Advanced Heart Failure and Transplant Cardiology";/* ADVANCED HEART FAILURE AND TRANSPLANT CARDIOLOGY */
		case _309445003:
			return "Anesthesiology Assistant";/* nurse - ANESTHESIOLOGY ASSISTANT */
		case NULL:
			return "null";
		}
		return null;
	}
}

