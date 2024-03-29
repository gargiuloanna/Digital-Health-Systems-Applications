package it.unisa.diem.dhsa.group3.HIS_Project;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Patient;

import it.unisa.diem.dhsa.group3.enumerations.PIdentifier;

/**
 * 
 * This class allow to store Patient informations used in the AdvancedSearch interface
 *
 */
public class PatientListElem {

	String firstName = "";
	String lastName = "";
	String birthdate = "";
	String deathdate = "";
	String SSN = "";
	String id = "";

	/**
	 * Public Constructor that maps the fields from a FHIR Patient Resource
	 * @param patient - FHIR Resource passed to the constructor
	 */
	public PatientListElem(Patient patient) {
		
		firstName = patient.getNameFirstRep().getGivenAsSingleString();
		lastName = patient.getNameFirstRep().getFamily();

		if (patient.getBirthDate() != null) {
			birthdate = LocalDate.ofInstant(patient.getBirthDate().toInstant(), 
					ZoneId.of("Europe/Paris")).format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));
		}

		if (patient.hasDeceasedDateTimeType())
			deathdate = LocalDate.ofInstant(patient.getDeceasedDateTimeType().getValue().
					toInstant(), ZoneId.of("Europe/Paris")).format(DateTimeFormatter.ofPattern("dd/MM/YYYY"));

		List<Identifier> list = patient.getIdentifier();

		for (Identifier i : list) {
			if (i.getSystemElement().getValue() != null
					&& i.getSystemElement().getValue().startsWith("https://github.com/synthetichealth/synthea")) {
				if (i.getValue() != null)
					id = i.getValue();
				else
					id = "";

			} else if (i.getType().getCodingFirstRep().getSystemElement().getValue() != null && i.getType()
					.getCodingFirstRep().getSystemElement().getValue().startsWith(PIdentifier.SS.getSystem())) {
				if (i.getValue() == null)
					SSN = "";
				else
					SSN = i.getValue();
			}

		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getDeathdate() {
		return deathdate;
	}

	public void setDeathdate(String deathdate) {
		this.deathdate = deathdate;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
