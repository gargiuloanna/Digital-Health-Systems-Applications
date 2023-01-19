package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.Account;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Coverage;
import org.hl7.fhir.r4.model.Coverage.CostToBeneficiaryComponent;
import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Money;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Practitioner;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.enumerations.EncounterClass;
import it.unisa.diem.dhsa.group3.state.Memory;

public class EncounterResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date START;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
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

		// set the status (a must have value)
		e.setStatus(getStatus());

		// set patient present at the encounter (field: patient, a must have value)
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		e.setSubject(new Reference(patient));

		// set organization that is primarily responsible for this Encounter's services
		// (field: organization)
		Organization o = (Organization) Memory.getMemory().get(OrganizationResource.class).get(ORGANIZATION);
		e.setServiceProvider(new Reference(o));

		// set provider responsible for providing the service (field: provider)
		Practitioner practitioner = (Practitioner) Memory.getMemory().get(ProviderResource.class).get(PROVIDER);
		e.addParticipant().setIndividual(new Reference(practitioner));

		// set payer with its coverage through the account resource
		String id = PATIENT.concat(PAYER).concat(String.valueOf(START.getYear() + 1900));
		Organization payer = (Organization) Memory.getMemory().get(PayerResource.class).get(PAYER);
		Coverage cov = (Coverage) Memory.getMemory().get(CoverageResource.class).get(id);
		Account a = new Account();
		if (cov != null) {
			cov.getCostToBeneficiary().add(
					new CostToBeneficiaryComponent().setValue(new Money().setCurrency("USD").setValue(PAYER_COVERAGE)));
			a.addCoverage().setCoverage(new Reference(cov));
		} else {
			Coverage c = new Coverage();
			c.setPolicyHolder(new Reference(payer));
			c.addCostToBeneficiary().setValue(new Money().setCurrency("USD").setValue(PAYER_COVERAGE));
			a.addCoverage().setCoverage(new Reference(c));
		}
		e.getAccount().add(new Reference(a));

		// set concepts representing classification of patient encounter (field:
		// encounterclass, a must have value)
		EncounterClass eclass = EncounterClass.fromCSV(ENCOUNTERCLASS);
		e.setClass_(new Coding(eclass.getSystem(), eclass.toCode(), eclass.getDefinition()));

		// Specific type of encounter (fields: code, description, must have values)
		// EncountersSettingCode code = EncountersSettingCode.fromCSV(DESCRIPTION);
		e.addType(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));

		// set the reason the encounter takes place, expressed as a code (fields:
		// reasoncode, reasondescription)
		e.addReasonCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));

		return e;

	}

}
