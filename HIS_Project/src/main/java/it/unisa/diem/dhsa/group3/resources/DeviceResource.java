package it.unisa.diem.dhsa.group3.resources;

import java.sql.Date;

import org.hl7.fhir.r4.model.Base64BinaryType;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.Coding;
import org.hl7.fhir.r4.model.Device;
import org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent;
import org.hl7.fhir.r4.model.DeviceRequest;
import org.hl7.fhir.r4.model.DeviceUseStatement;
import org.hl7.fhir.r4.model.Encounter;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Period;
import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class DeviceResource extends BaseResource {
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm'Z'")
	private Date START;
	
	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm'Z'")
	private Date STOP;
	
	@CsvBindByName
	private String PATIENT = "";
	
	@CsvBindByName
	private String ENCOUNTER = "";
	
	@CsvBindByName
	private String CODE;
	
	@CsvBindByName
	private String DESCRIPTION = "";
	
	@CsvBindByName
	private String UDI;

	@SuppressWarnings("deprecation")
	@Override
	public Resource createResource() {

		Device dev = new Device();
		DeviceRequest d = new DeviceRequest();
		DeviceUseStatement stat = new DeviceUseStatement();
		
		//add time: Start, Stop
		if(STOP != null)
			d.setOccurrence(new Period().setStart(START).setEnd(STOP));
		else
			d.setOccurrence(new Period().setStart(START));
		//add patient
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT); //get the patient with id PATIENT 
		d.setSubjectTarget(patient);
		
		//add SNOMED code and description
		d.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));
		
		//add Encounter
		Encounter e = (Encounter) Memory.getMemory().get(OrganizationResource.class).get(ENCOUNTER);
		d.setEncounterTarget(e);
		
		//add UDI code
		DeviceUdiCarrierComponent comp = new DeviceUdiCarrierComponent();
		comp.setCarrierAIDCElement(new Base64BinaryType(UDI));
		dev.addUdiCarrier(comp);
		stat.setDeviceTarget(dev);
		
		stat.getDerivedFromTarget().add(d);	
		
		
		return stat;
		
		
	}
	

}
