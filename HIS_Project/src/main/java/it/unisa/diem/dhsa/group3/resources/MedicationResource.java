package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;


import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.MedicationKnowledge;
import org.hl7.fhir.r4.model.MedicationStatement;
import org.hl7.fhir.r4.model.Money;
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

		// add effective period: the period in which the medication was/is taken
		if (STOP != null)
			med.setEffective(new Period().setEnd(STOP).setStart(START));
		else
			med.setEffective(new Period().setStart(START));

		// add patient
		Patient p = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		med.setSubject(new Reference(p));

		// add encounter
		Encounter e = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		med.setContext(new Reference(e));

		// set medication --SYSTEM: RxNORM
		med.setMedication(new CodeableConcept(new Coding("www.nlm.nih.gov/research/umls/rxnorm", CODE, DESCRIPTION)));

		// add base cost for the medicine
		MedicationKnowledge cost = new MedicationKnowledge();
		cost.addCost(new MedicationKnowledge.MedicationKnowledgeCostComponent()
				.setCost(new Money().setCurrency("USD").setValue(BASE_COST)));
		cost.getAssociatedMedication().add(new Reference(med));

		// add reason
		med.addReasonCode(new CodeableConcept(new Coding("https://www.snomed.org/", REASONCODE, REASONDESCRIPTION)));

		// add expenses
		/*Annotation a = new Annotation();
		a.setText("DISPENSES= " + DISPENSES + "TOTALCOST= " + TOTALCOST + "PAYER_COVERAGE= " + PAYER_COVERAGE);
		med.addNote(a);*/
		
		return med;
	}

}
