package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.*;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.enumerations.EncounterClass;
import it.unisa.diem.dhsa.group3.state.Memory;

public class EncounterResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date START;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date STOP;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String ORGANIZATION = "";

	@CsvBindByName
	private String PROVIDER = "";

	@CsvBindByName
	private String PAYER = "";

	@CsvBindByName
	private String ENCOUNTERCLASS = "";

	@CsvBindByName
	private String CODE;

	@CsvBindByName
	private String DESCRIPTION = "";

	@CsvBindByName
	private Float BASE_ENCOUNTER_COST;

	@CsvBindByName
	private Float TOTAL_CLAIM_COST;

	@CsvBindByName
	private Float PAYER_COVERAGE;

	@CsvBindByName
	private String REASONCODE;

	@CsvBindByName
	private String REASONDESCRIPTION = "";

	public Date getSTART() {
		return START;
	}

	public void setSTART(Date sTART) {
		START = sTART;
	}

	public Date getSTOP() {
		return STOP;
	}

	public void setSTOP(Date sTOP) {
		STOP = sTOP;
	}

	public String getPATIENT() {
		return PATIENT;
	}

	public void setPATIENT(String pATIENT) {
		PATIENT = pATIENT;
	}

	public String getORGANIZATION() {
		return ORGANIZATION;
	}

	public void setORGANIZATION(String oRGANIZATION) {
		ORGANIZATION = oRGANIZATION;
	}

	public String getPROVIDER() {
		return PROVIDER;
	}

	public void setPROVIDER(String pROVIDER) {
		PROVIDER = pROVIDER;
	}

	public String getPAYER() {
		return PAYER;
	}

	public void setPAYER(String pAYER) {
		PAYER = pAYER;
	}

	public String getENCOUNTERCLASS() {
		return ENCOUNTERCLASS;
	}

	public void setENCOUNTERCLASS(String eNCOUNTERCLASS) {
		ENCOUNTERCLASS = eNCOUNTERCLASS;
	}

	public String getCODE() {
		return CODE;
	}

	public void setCODE(String cODE) {
		CODE = cODE;
	}

	public String getDESCRIPTION() {
		return DESCRIPTION;
	}

	public void setDESCRIPTION(String dESCRIPTION) {
		DESCRIPTION = dESCRIPTION;
	}

	public Float getBASE_ENCOUNTER_COST() {
		return BASE_ENCOUNTER_COST;
	}

	public void setBASE_ENCOUNTER_COST(Float bASE_ENCOUNTER_COST) {
		BASE_ENCOUNTER_COST = bASE_ENCOUNTER_COST;
	}

	public Float getTOTAL_CLAIM_COST() {
		return TOTAL_CLAIM_COST;
	}

	public void setTOTAL_CLAIM_COST(Float tOTAL_CLAIM_COST) {
		TOTAL_CLAIM_COST = tOTAL_CLAIM_COST;
	}

	public Float getPAYER_COVERAGE() {
		return PAYER_COVERAGE;
	}

	public void setPAYER_COVERAGE(Float pAYER_COVERAGE) {
		PAYER_COVERAGE = pAYER_COVERAGE;
	}

	public String getREASONCODE() {
		return REASONCODE;
	}

	public void setREASONCODE(String rEASONCODE) {
		REASONCODE = rEASONCODE;
	}

	public String getREASONDESCRIPTION() {
		return REASONDESCRIPTION;
	}

	public void setREASONDESCRIPTION(String rEASONDESCRIPTION) {
		REASONDESCRIPTION = rEASONDESCRIPTION;
	}

	@Override
	public String toString() {
		return "EncounterResource [Id=" + super.getId() + ", START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT
				+ ", ORGANIZATION=" + ORGANIZATION + ", PROVIDER=" + PROVIDER + ", PAYER=" + PAYER + ", ENCOUNTERCLASS="
				+ ENCOUNTERCLASS + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_ENCOUNTER_COST="
				+ BASE_ENCOUNTER_COST + ", TOTAL_CLAIM_COST=" + TOTAL_CLAIM_COST + ", PAYER_COVERAGE=" + PAYER_COVERAGE
				+ ", REASONCODE=" + REASONCODE + ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}
	
	private Encounter.EncounterStatus getStatus() {
		if (STOP.after(START) && STOP != null)
			return Encounter.EncounterStatus.FINISHED;
		if (START != null && STOP == null)
			return Encounter.EncounterStatus.INPROGRESS;
		if (START == null && STOP == null)
			return Encounter.EncounterStatus.NULL;
		if (START.after(DateTimeType.now().getValue()))
			return Encounter.EncounterStatus.PLANNED;
		if (STOP.before(START))
			return Encounter.EncounterStatus.CANCELLED;
		else
			return Encounter.EncounterStatus.UNKNOWN;

	}

	public Resource createResource() {

		Encounter e = new Encounter();
		// Definition of the considered profile
		e.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-encounter"));

		// set identifier
		e.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(super.getId());

		// set period
		Period period = new Period();
		if (STOP != null)
			period.setStart(START).setEnd(STOP);
		else
			period.setStart(START);
		e.setPeriod(period);

		e.setStatus(getStatus());
		
		// set patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); 
		e.setSubject(new Reference(patient));

		// set organization
		Organization o = (Organization) Memory.getMemory().get(OrganizationResource.class).get(ORGANIZATION);
		e.setServiceProvider(new Reference(o));

		// set provider
		Practitioner practitioner = (Practitioner) Memory.getMemory().get(ProviderResource.class).get(PROVIDER);
		e.addParticipant().setIndividual(new Reference(practitioner));

		// set payer
		/*Organization payer = (Organization) Memory.getMemory().get(PayerResource.class).get(PAYER);
		Account a = new Account();
		a.addCoverage().setCoverage(new Reference().setIdentifier(payer.getIdentifier().get(0)));*/


		EncounterClass eclass = EncounterClass.fromCSV(ENCOUNTERCLASS);
		e.setClass_(new Coding(eclass.getSystem(), eclass.toCode(), eclass.getDefinition()));

		// code & description
		//EncountersSettingCode code = EncountersSettingCode.fromCSV(DESCRIPTION);
		e.addType(new CodeableConcept(new Coding("https://www.snomed.org/",CODE, DESCRIPTION)));

		// TODO:base encounter cost e total claim cost
		// Annotation ann = new Annotation();
		// ann.setText("TOTAL_CLAIM_COST= " + TOTAL_CLAIM_COST +"PAYER_COVERAGE=
		// "+PAYER_COVERAGE);
		// e.addNote(ann);

		// add reason code 
		e.addReasonCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));

		return e;

	}


}
