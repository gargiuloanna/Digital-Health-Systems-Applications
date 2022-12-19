package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Immunization;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Quantity;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.Annotation;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class ImmunizationResource extends BaseResource {
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm'Z'")
	private Date DATE;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String ENCOUNTER = "";
	
	@CsvBindByName
	private String CODE = "";
	
	@CsvBindByName
	private String DESCRIPTION = "";
	
	@CsvBindByName
	private Float BASE_COST;
	
	

	@Override
	public Resource createResource() {
		Immunization i = new Immunization();
		
		//add date
		i.setRecorded(DATE);

		//add patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		i.setPatientTarget(patient);
		//add encounter
		Encounter encounter = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		i.setEncounterTarget(encounter);
		
		//set vaccine
		i.setVaccineCode(new CodeableConcept(new Coding("https://www2a.cdc.gov/vaccines/iis/iisstandards/vaccines.asp?rpt=cvx", CODE, DESCRIPTION)));
		
		//add note for BASE COST
		Annotation a = new Annotation();
		a.makeProperty(0, "BASE_COST");
		a.setProperty("BASE_COST", new Quantity().setValue(BASE_COST));
		i.addNote(a);
		
		return null;
	}

}
