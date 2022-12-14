package enumerations;

import org.hl7.fhir.exceptions.FHIRException;

public enum EncountersSettingCode {

	_162673000,/*General examination of patient (procedure)*/
	_185347001,/*Encounter for problem - Encounter for Problem - Encounter for problem (procedure)*/
	_50849002,/*Emergency room admission (procedure) - Emergency Room Admission*/
	_185349003,/*Encounter for 'check-up' - Encounter for check up (procedure) - Encounter for check up*/
	_85345009,/*Encounter for symptom*/
	_928471000000103,/*Urgent care clinic (procedure)*/
	_64111008,/*Office Visit*/
	_32485007,/*Hospital admission*/
	_308646001,/*Death Certification*/
	_424441002,/*Prenatal initial visit*/
	_170579000,/*Hypertension follow-up encounter*/
	_698314001,/*Consultation for treatment*/
	_270427003,/*Patient-initiated encounter*/
	_424619006,/*Prenatal visit*/
	_183460006,/*Obstetric emergency hospital admission*/
	_169762003,/*Postnatal visit*/
	_410620009,/*Well child visit (procedure)*/
	_371883000,/*Outpatient procedure*/
	_305411003,/*Admission to thoracic surgery department*/
	_390906007,/*Follow-up encounter*/
	_183495009,/*Non-urgent orthopedic admission*/
	_305351004,/*Admission to intensive care unit (procedure)*/
	_308335008,/*Patient encounter procedure*/
	_170837001,/*Allergic disorder initial assessment*/
	_170838006,/*Allergic disorder follow-up assessment*/
	_230690007,/*Stroke*/
	_210098006,/*Domiciliary or rest home patient evaluation and management*/
	_305408004,/*Admission to surgical department*/
	_410429000,/*Cardiac Arrest*/
	_394701000,/*Asthma follow-up*/
	_183478001,/*Emergency hospital admission for asthma*/
	_773093006,/*Emergency Encounter*/
	_394656005,/*Encounter Inpatient*/
	_448337001,/*Telemedicine consultation with patient*/
	_79094001,/*Initial Psychiatric Interview with mental status evaluation*/
	_47505003,/*posttraumatic stress disorder*/
	_185345009,/*Encounter for symptom (procedure)*/
	_223484005,/*Discussion about treatment (procedure)*/
	_439740005,/*Postoperative follow-up visit (procedure)*/
	_410410006,/*Screening surveillance (regime/therapy)*/
	_185389009,/*Follow-up visit (procedure)*/
	_56876005,/*Drug rehabilitation and detoxification*/
	_22298006,/*Myocardial Infarction*/
	_310061009,/*Gynecology service (qualifier value)*/
	_387713003,/*Surgical procedure (procedure)*/
	_86013001,/*Periodic reevaluation and management of healthy individual (procedure)*/
	_183801001,/*Inpatient stay 3 days*/
	_185317003,/*Telephone encounter (procedure)*/
	_16434671000119101,/*Diagnosis of cystic fibrosis using sweat test and gene test*/
	_305336008,/*Admission to hospice (procedure)*/
	NULL;
	
	public static EncountersSettingCode fromCode(String codeString) throws FHIRException {
		if (codeString == null || "".equals(codeString)) return NULL;
		if (" _162673000".equals(codeString)) return _162673000;
		if (" _185347001".equals(codeString)) return _185347001;
		if (" _50849002".equals(codeString)) return _50849002;
		if (" _185349003".equals(codeString)) return _185349003;
		if (" _85345009".equals(codeString)) return _85345009;
		if (" _928471000000103".equals(codeString)) return _928471000000103;
		if (" _185349003".equals(codeString)) return _185349003;
		if (" _64111008".equals(codeString)) return _64111008;
		if (" _32485007".equals(codeString)) return _32485007;
		if (" _308646001".equals(codeString)) return _308646001;
		if (" _424441002".equals(codeString)) return _424441002;
		if (" _170579000".equals(codeString)) return _170579000;
		if (" _698314001".equals(codeString)) return _698314001;
		if (" _270427003".equals(codeString)) return _270427003;
		if (" _424619006".equals(codeString)) return _424619006;
		if (" _183460006".equals(codeString)) return _183460006;
		if (" _169762003".equals(codeString)) return _169762003;
		if (" _410620009".equals(codeString)) return _410620009;
		if (" _371883000".equals(codeString)) return _371883000;
		if (" _305411003".equals(codeString)) return _305411003;
		if (" _390906007".equals(codeString)) return _390906007;
		if (" _183495009".equals(codeString)) return _183495009;
		if (" _185347001".equals(codeString)) return _185347001;
		if (" _305351004".equals(codeString)) return _305351004;
		if (" _308335008".equals(codeString)) return _308335008;
		if (" _170837001".equals(codeString)) return _170837001;
		if (" _170838006".equals(codeString)) return _170838006;
		if (" _230690007".equals(codeString)) return _230690007;
		if (" _210098006".equals(codeString)) return _210098006;
		if (" _305408004".equals(codeString)) return _305408004;
		if (" _50849002".equals(codeString)) return _50849002;
		if (" _410429000".equals(codeString)) return _410429000;
		if (" _394701000".equals(codeString)) return _394701000;
		if (" _183478001".equals(codeString)) return _183478001;
		if (" _773093006".equals(codeString)) return _773093006;
		if (" _394656005".equals(codeString)) return _394656005;
		if (" _448337001".equals(codeString)) return _448337001;
		if (" _79094001".equals(codeString)) return _79094001;
		if (" _47505003".equals(codeString)) return _47505003;
		if (" _185345009".equals(codeString)) return _185345009;
		if (" _223484005".equals(codeString)) return _223484005;
		if (" _439740005".equals(codeString)) return _439740005;
		if (" _410410006".equals(codeString)) return _410410006;
		if (" _185389009".equals(codeString)) return _185389009;
		if (" _185347001".equals(codeString)) return _185347001;
		if (" _56876005".equals(codeString)) return _56876005;
		if (" _22298006".equals(codeString)) return _22298006;
		if (" _310061009".equals(codeString)) return _310061009;
		if (" _387713003".equals(codeString)) return _387713003;
		if (" _86013001".equals(codeString)) return _86013001;
		if (" _183801001".equals(codeString)) return _183801001;
		if (" _185317003".equals(codeString)) return _185317003;
		if (" _16434671000119101".equals(codeString)) return _16434671000119101;
		if (" _305336008".equals(codeString)) return _305336008;
		throw new FHIRException("Unknown EncountersSettingCode code '" + codeString + "'");
	}

	public static EncountersSettingCode fromCSV(String description) {
		if (description == null || "".equals(description)) return NULL;
		if ("General examination of patient (procedure)".equals(description)) return _162673000;
		if ("Encounter for problem".equals(description)) return _185347001;
		if ("Emergency room admission (procedure)".equals(description)) return _50849002;
		if ("Encounter for 'check-up'".equals(description)) return _185349003;
		if ("Encounter for symptom".equals(description)) return _85345009;
		if ("Urgent care clinic (procedure)".equals(description)) return _928471000000103;
		if ("Encounter for check up (procedure)".equals(description)) return _185349003;
		if ("Office Visit".equals(description)) return _64111008;
		if ("Hospital admission".equals(description)) return _32485007;
		if ("Death Certification".equals(description)) return _308646001;
		if ("Prenatal initial visit".equals(description)) return _424441002;
		if ("Hypertension follow-up encounter".equals(description)) return _170579000;
		if ("Consultation for treatment".equals(description)) return _698314001;
		if ("Patient-initiated encounter".equals(description)) return _270427003;
		if ("Prenatal visit".equals(description)) return _424619006;
		if ("Obstetric emergency hospital admission".equals(description)) return _183460006;
		if ("Postnatal visit".equals(description)) return _169762003;
		if ("Well child visit (procedure)".equals(description)) return _410620009;
		if ("Outpatient procedure".equals(description)) return _371883000;
		if ("Admission to thoracic surgery department".equals(description)) return _305411003;
		if ("Follow-up encounter".equals(description)) return _390906007;
		if ("Non-urgent orthopedic admission".equals(description)) return _183495009;
		if ("Encounter for Problem".equals(description)) return _185347001;
		if ("Admission to intensive care unit (procedure)".equals(description)) return _305351004;
		if ("Patient encounter procedure".equals(description)) return _308335008;
		if ("Allergic disorder initial assessment".equals(description)) return _170837001;
		if ("Allergic disorder follow-up assessment".equals(description)) return _170838006;
		if ("Stroke".equals(description)) return _230690007;
		if ("Domiciliary or rest home patient evaluation and management".equals(description)) return _210098006;
		if ("Admission to surgical department".equals(description)) return _305408004;
		if ("Emergency Room Admission".equals(description)) return _50849002;
		if ("Cardiac Arrest".equals(description)) return _410429000;
		if ("Asthma follow-up".equals(description)) return _394701000;
		if ("Emergency hospital admission for asthma".equals(description)) return _183478001;
		if ("Emergency Encounter".equals(description)) return _773093006;
		if ("Encounter Inpatient".equals(description)) return _394656005;
		if ("Telemedicine consultation with patient".equals(description)) return _448337001;
		if ("Initial Psychiatric Interview with mental status evaluation".equals(description)) return _79094001;
		if ("posttraumatic stress disorder".equals(description)) return _47505003;
		if ("Encounter for symptom (procedure)".equals(description)) return _185345009;
		if ("Discussion about treatment (procedure)".equals(description)) return _223484005;
		if ("Postoperative follow-up visit (procedure)".equals(description)) return _439740005;
		if ("Screening surveillance (regime/therapy)".equals(description)) return _410410006;
		if ("Follow-up visit (procedure)".equals(description)) return _185389009;
		if ("Encounter for problem (procedure)".equals(description)) return _185347001;
		if ("Drug rehabilitation and detoxification".equals(description)) return _56876005;
		if ("Myocardial Infarction".equals(description)) return _22298006;
		if ("Gynecology service (qualifier value)".equals(description)) return _310061009;
		if ("Surgical procedure (procedure)".equals(description)) return _387713003;
		if ("Periodic reevaluation and management of healthy individual (procedure)".equals(description)) return _86013001;
		if ("Inpatient stay 3 days".equals(description)) return _183801001;
		if ("Telephone encounter (procedure)".equals(description)) return _185317003;
		if ("Diagnosis of cystic fibrosis using sweat test and gene test".equals(description)) return _16434671000119101;
		if ("Admission to hospice (procedure)".equals(description)) return _305336008;

		return null;
	}
	
	public String toCode() {
		switch (this) {
		case _162673000 : return "162673000";
		case _185347001 : return "185347001";
		case _50849002 : return "50849002";
		case _185349003 : return "185349003";
		case _85345009 : return "85345009";
		case _928471000000103 : return "928471000000103";
		case _64111008 : return "64111008";
		case _32485007 : return "32485007";
		case _308646001 : return "308646001";
		case _424441002 : return "424441002";
		case _170579000 : return "170579000";
		case _698314001 : return "698314001";
		case _270427003 : return "270427003";
		case _424619006 : return "424619006";
		case _183460006 : return "183460006";
		case _169762003 : return "169762003";
		case _410620009 : return "410620009";
		case _371883000 : return "371883000";
		case _305411003 : return "305411003";
		case _390906007 : return "390906007";
		case _183495009 : return "183495009";
		case _305351004 : return "305351004";
		case _308335008 : return "308335008";
		case _170837001 : return "170837001";
		case _170838006 : return "170838006";
		case _230690007 : return "230690007";
		case _210098006 : return "210098006";
		case _305408004 : return "305408004";
		case _410429000 : return "410429000";
		case _394701000 : return "394701000";
		case _183478001 : return "183478001";
		case _773093006 : return "773093006";
		case _394656005 : return "394656005";
		case _448337001 : return "448337001";
		case _79094001 : return "79094001";
		case _47505003 : return "47505003";
		case _185345009 : return "185345009";
		case _223484005 : return "223484005";
		case _439740005 : return "439740005";
		case _410410006 : return "410410006";
		case _185389009 : return "185389009";
		case _56876005 : return "56876005";
		case _22298006 : return "22298006";
		case _310061009 : return "310061009";
		case _387713003 : return "387713003";
		case _86013001 : return "86013001";
		case _183801001 : return "183801001";
		case _185317003 : return "185317003";
		case _16434671000119101 : return "16434671000119101";
		case _305336008 : return "305336008";
		case NULL: return null;
		}
		return null;
	}

	public String getSystem() {
		return "https://www.snomed.org/";
	}

	public String getDefinition() {
		switch (this) {
		case _162673000 : return "General examination of patient (procedure)";
		case _50849002 : return "Emergency room admission (procedure)";
		case _85345009 : return "Encounter for symptom";
		case _928471000000103 : return "Urgent care clinic (procedure)";
		case _185349003 : return "Encounter for check up (procedure)";
		case _64111008 : return "Office Visit";
		case _32485007 : return "Hospital admission";
		case _308646001 : return "Death Certification";
		case _424441002 : return "Prenatal initial visit";
		case _170579000 : return "Hypertension follow-up encounter";
		case _698314001 : return "Consultation for treatment";
		case _270427003 : return "Patient-initiated encounter";
		case _424619006 : return "Prenatal visit";
		case _183460006 : return "Obstetric emergency hospital admission";
		case _169762003 : return "Postnatal visit";
		case _410620009 : return "Well child visit (procedure)";
		case _371883000 : return "Outpatient procedure";
		case _305411003 : return "Admission to thoracic surgery department";
		case _390906007 : return "Follow-up encounter";
		case _183495009 : return "Non-urgent orthopedic admission";
		case _305351004 : return "Admission to intensive care unit (procedure)";
		case _308335008 : return "Patient encounter procedure";
		case _170837001 : return "Allergic disorder initial assessment";
		case _170838006 : return "Allergic disorder follow-up assessment";
		case _230690007 : return "Stroke";
		case _210098006 : return "Domiciliary or rest home patient evaluation and management";
		case _305408004 : return "Admission to surgical department";
		case _410429000 : return "Cardiac Arrest";
		case _394701000 : return "Asthma follow-up";
		case _183478001 : return "Emergency hospital admission for asthma";
		case _773093006 : return "Emergency Encounter";
		case _394656005 : return "Encounter Inpatient";
		case _448337001 : return "Telemedicine consultation with patient";
		case _79094001 : return "Initial Psychiatric Interview with mental status evaluation";
		case _47505003 : return "posttraumatic stress disorder";
		case _185345009 : return "Encounter for symptom (procedure)";
		case _223484005 : return "Discussion about treatment (procedure)";
		case _439740005 : return "Postoperative follow-up visit (procedure)";
		case _410410006 : return "Screening surveillance (regime/therapy)";
		case _185389009 : return "Follow-up visit (procedure)";
		case _185347001 : return "Encounter for problem (procedure)";
		case _56876005 : return "Drug rehabilitation and detoxification";
		case _22298006 : return "Myocardial Infarction";
		case _310061009 : return "Gynecology service (qualifier value)";
		case _387713003 : return "Surgical procedure (procedure)";
		case _86013001 : return "Periodic reevaluation and management of healthy individual (procedure)";
		case _183801001 : return "Inpatient stay 3 days";
		case _185317003 : return "Telephone encounter (procedure)";
		case _16434671000119101 : return "Diagnosis of cystic fibrosis using sweat test and gene test";
		case _305336008 : return "Admission to hospice (procedure)";
		case NULL: return null;
		}
		return null;
	}

}
