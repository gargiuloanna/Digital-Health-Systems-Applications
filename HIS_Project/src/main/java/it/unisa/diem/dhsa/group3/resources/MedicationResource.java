package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;

import org.hl7.fhir.r4.model.Account;
import org.hl7.fhir.r4.model.Annotation;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Coverage;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.MedicationKnowledge;
import org.hl7.fhir.r4.model.MedicationStatement;
import org.hl7.fhir.r4.model.Money;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class MedicationResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date START;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date STOP;

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	private String PAYER = "";

	@CsvBindByName
	private String ENCOUNTER = "";

	@CsvBindByName
	private String CODE;

	@CsvBindByName
	private String DESCRIPTION = "";

	@CsvBindByName
	private Float BASE_COST;

	@CsvBindByName
	private Float PAYER_COVERAGE;

	@CsvBindByName
	private int DISPENSES;

	@CsvBindByName
	private Float TOTALCOST;

	@CsvBindByName
	private String REASONCODE; // o è un numero o è null

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

	public String getPAYER() {
		return PAYER;
	}

	public void setPAYER(String pAYER) {
		PAYER = pAYER;
	}

	public String getENCOUNTER() {
		return ENCOUNTER;
	}

	public void setENCOUNTER(String eNCOUNTER) {
		ENCOUNTER = eNCOUNTER;
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

	public Float getBASE_COST() {
		return BASE_COST;
	}

	public void setBASE_COST(Float bASE_COST) {
		BASE_COST = bASE_COST;
	}

	public Float getPAYER_COVERAGE() {
		return PAYER_COVERAGE;
	}

	public void setPAYER_COVERAGE(Float pAYER_COVERAGE) {
		PAYER_COVERAGE = pAYER_COVERAGE;
	}

	public int getDISPENSES() {
		return DISPENSES;
	}

	public void setDISPENSES(int dISPENSES) {
		DISPENSES = dISPENSES;
	}

	public Float getTOTALCOST() {
		return TOTALCOST;
	}

	public void setTOTALCOST(Float tOTALCOST) {
		TOTALCOST = tOTALCOST;
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
		return "MedicationResource [START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT + ", PAYER=" + PAYER
				+ ", ENCOUNTER=" + ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", BASE_COST="
				+ BASE_COST + ", PAYER_COVERAGE=" + PAYER_COVERAGE + ", DISPENSES=" + DISPENSES + ", TOTALCOST="
				+ TOTALCOST + ", REASONCODE=" + REASONCODE + ", REASONDESCRIPTION=" + REASONDESCRIPTION + "]";
	}


	@Override
	public Resource createResource() {
		
		MedicationStatement med = new MedicationStatement();
		
		//set identifier
		med.addIdentifier().setSystem("https://www.uuidgenerator.net").setValue(super.getId());

		// add effective period: the period in which the medication was/is taken (fields: start, stop) 
		if (STOP != null)
			med.setEffective(new Period().setEnd(STOP).setStart(START));
		else
			med.setEffective(new Period().setStart(START));

		// add patient involved (field: patient)
		Patient p = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		med.setSubject(new Reference(p));

		// add encounter (field: encounter)
		Encounter e = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		med.setContext(new Reference(e));

		// set medication --SYSTEM: RxNORM (fields: code, description)
		med.setMedication(new CodeableConcept(new Coding("www.nlm.nih.gov/research/umls/rxnorm", CODE, DESCRIPTION)));

		// add base cost for the medicine (base_cost)
		MedicationKnowledge cost = new MedicationKnowledge();
		cost.addCost(new MedicationKnowledge.MedicationKnowledgeCostComponent()
				.setCost(new Money().setCurrency("USD").setValue(BASE_COST)));
		cost.getAssociatedMedication().add(new Reference(med));

		// add reason (fields: reasoncode, reasondescription)
		med.addReasonCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));

		//add account to code payer and payer_coverage
		Account ac = new Account();
		Coverage c = new Coverage();
		Organization payer = (Organization) Memory.getMemory().get(PayerResource.class).get(PAYER);
		c.setPolicyHolder(new Reference(payer));
		c.addCostToBeneficiary().setValue(new Money().setCurrency("USD").setValue(PAYER_COVERAGE));
		ac.addCoverage().setCoverage(new Reference(c));
		med.addContained(ac);
		
		// add expenses and total_cost as annotation
		Annotation a = new Annotation();
		a.setText("Number of times the prescription was filled is = " + DISPENSES +" The total cost of the prescription, including all dispenses is:  " + TOTALCOST+ "$");
		med.addNote(a);
		
		return med;
	}

}
