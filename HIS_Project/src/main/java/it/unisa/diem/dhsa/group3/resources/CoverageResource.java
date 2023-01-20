package it.unisa.diem.dhsa.group3.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Coverage;
import org.hl7.fhir.r4.model.Organization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.codesystems.SubscriberRelationship;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class CoverageResource extends BaseResource {

	@CsvBindByName
	private String PATIENT = "";

	@CsvBindByName
	//@CsvDate("yyyy")
	private String START_YEAR;

	@CsvBindByName
	//@CsvDate("yyyy")
	private String END_YEAR;

	@CsvBindByName
	private String PAYER = "";

	@CsvBindByName
	private String OWNERSHIP = "";
	
	@Override
	public String getId() {
		//return PATIENT.concat(PAYER).concat(String.valueOf(END_YEAR.getDate()+1900));
		return PATIENT.concat(PAYER).concat(END_YEAR);
	}

	public String getPATIENT() {
		return PATIENT;
	}

	public void setPATIENT(String pATIENT) {
		PATIENT = pATIENT;
	}

	public String getSTART_YEAR() {
		return START_YEAR;
	}

	public void setSTART_YEAR(String sTART_YEAR) {
		START_YEAR = sTART_YEAR;
	}

	public String getEND_YEAR() {
		return END_YEAR;
	}

	public void setEND_YEAR(String eND_YEAR) {
		END_YEAR = eND_YEAR;
	}

	public String getPAYER() {
		return PAYER;
	}

	public void setPAYER(String pAYER) {
		PAYER = pAYER;
	}

	public String getOWNERSHIP() {
		return OWNERSHIP;
	}

	public void setOWNERSHIP(String oWNERSHIP) {
		OWNERSHIP = oWNERSHIP;
	}

	@Override
	public String toString() {
		return "CoverageResource [Id=" + this.getId() + ", PATIENT=" + PATIENT + ", START_YEAR=" + START_YEAR
				+ ", END_YEAR=" + END_YEAR + ", PAYER=" + PAYER + ", OWNERSHIP=" + OWNERSHIP + "]";
	}

	@Override
	public Resource createResource() {
		
		Coverage cov = new Coverage();

		// set identifier
		cov.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(this.getId());
		// set the patient who is the subscriber of the policy (field: patient)
		// The party who has signed-up for or 'owns' the contractual relationship to the
		// policy
		// or to whom the benefit of the policy for services rendered to them or their
		// family is due
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		cov.setSubscriber(new Reference(patient));

		// set period during which the coverage is in force (fields: start_year,
		// end_year)
		SimpleDateFormat d = new SimpleDateFormat("yyyy");
		try {
			cov.setPeriod(new Period().setStart(d.parse(START_YEAR)).setEnd(d.parse(END_YEAR)));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		

		// set the organization owner of the insurance coverage (field: payer)
		Organization pay = (Organization) Memory.getMemory().get(PayerResource.class).get(PAYER);
		cov.setPolicyHolder(new Reference(pay));

		// set the beneficiary relationship to the subscriber (patient)--> (field:
		// ownership)
		SubscriberRelationship ownership;
		try {
			ownership = SubscriberRelationship.fromCode(OWNERSHIP.toUpperCase());
		} catch (FHIRException e) {
			ownership = SubscriberRelationship.OTHER;
		}
		if (ownership == null)
			ownership = SubscriberRelationship.NULL;
		cov.setRelationship(new CodeableConcept(
				new Coding(ownership.getDefinition(), ownership.getSystem(), ownership.getDefinition())));
		
		return cov;
	}

}
