package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Condition;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Meta;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Reference;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ConditionResource extends BaseResource {
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date START;
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd")
	private Date STOP;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String ENCOUNTER = "";
	
	@CsvBindByName
	private String CODE;
	
	@CsvBindByName
	private String DESCRIPTION = "";

	@Override
	public Resource createResource() {

		//Definition of the condition resource with the reference to the patient involved
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		Condition c = new Condition(new Reference(patient));
		
		// Definition of the considered profile
		c.setMeta(new Meta().addProfile("http://hl7.org/fhir/us/core/StructureDefinition/us-core-condition-encounter-diagnosis"));
		
		//add period
		Period period = new Period();
		period.setStart(START).setEnd(STOP);
		c.setOnset(period);
		
		//add encounter reference
		Encounter e = (Encounter) Memory.getMemory().get(OrganizationResource.class).get(ENCOUNTER);
		c.setEncounterTarget(e);
		
		//add the snomed code with the description
		c.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));
		
		return c;
	}

}
