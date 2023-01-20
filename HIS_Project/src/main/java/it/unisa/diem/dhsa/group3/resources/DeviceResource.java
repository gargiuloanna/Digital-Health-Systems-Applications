package it.unisa.diem.dhsa.group3.resources;

import java.util.Date;
import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.Device.DeviceUdiCarrierComponent;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvDate;

import it.unisa.diem.dhsa.group3.state.Memory;

public class DeviceResource extends BaseResource {

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
	private Date START;

	@CsvBindByName
	@CsvDate("yyyy-MM-dd'T'HH:mm")
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

	public String getUDI() {
		return UDI;
	}

	public void setUDI(String uDI) {
		UDI = uDI;
	}

	@Override
	public String toString() {
		return "DeviceResource [Id=" + super.getId() + ",START=" + START + ", STOP=" + STOP + ", PATIENT=" + PATIENT
				+ ", ENCOUNTER=" + ENCOUNTER + ", CODE=" + CODE + ", DESCRIPTION=" + DESCRIPTION + ", UDI=" + UDI + "]";
	}

	@Override
	public Resource createResource() {

		// A type of a manufactured item that is used in the provision of healthcare
		// without being substantially changed through that activity. The device may be
		// a medical or non-medical device.
		Device dev = new Device();
		// DeviceRequest represents a request for a patient to employ a medical device.
		// The device may be an implantable device, or an external assistive device.
		DeviceRequest d = new DeviceRequest();
		// A record of a device being used by a patient where the record is the result
		// of a report from the patient or another clinician.
		DeviceUseStatement stat = new DeviceUseStatement();

		// add identifier
		stat.addIdentifier().setSystem("https://www.uuidgenerator.net").setValue(super.getId());

		// add time: Start when the device was associated to the patient, Stop when the
		// device was removed-->(fields: start, stop)
		if (STOP != null)
			d.setOccurrence(new Period().setStart(START).setEnd(STOP));
		else
			d.setOccurrence(new Period().setStart(START));

		// add patient (field: patient)
		Patient patient = (Patient) Memory.getMemory().get(PatientResource.class).get(PATIENT);
		d.setSubject(new Reference(patient));

		// add SNOMED code and description of the device (fields: code, description)
		d.setCode(new CodeableConcept(new Coding("https://www.snomed.org/", CODE, DESCRIPTION)));

		// add Encounter (field: encounter)
		Encounter e = (Encounter) Memory.getMemory().get(EncounterResource.class).get(ENCOUNTER);
		d.setEncounter(new Reference(e));

		// add full UDI carrier(as the human readable form (HRF) representation of the
		// barcode (field: UDI)
		// string as printed on the packaging of the device) to the device instance
		DeviceUdiCarrierComponent comp = new DeviceUdiCarrierComponent();
		comp.setCarrierHRF(UDI);
		dev.addUdiCarrier(comp);

		// Link between the record of the device and the device used
		stat.setDevice(new Reference(dev));

		// Allows linking the DeviceUseStatement to the underlying Request
		stat.getDerivedFrom().add(new Reference(d));

		return stat;

	}

}
