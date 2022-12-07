package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.Location.LocationPositionComponent;
import org.hl7.fhir.r4.model.codesystems.V3MaritalStatus;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

public class PatientsParser extends CSVParser {

	public PatientsParser(String pathToCSV) {
		super(pathToCSV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Resource createResource(String[] args, Map<String, Integer> head) {
		// added: id, birthdate, address, city, zip, state, deathdate, prefix, suffix,marital, 
		// gender, lat, lon
		// sconosciuti: maiden
		//  race, ethnicity, birthplace, county,
		// ssn, drivers, passport sembrano essere altri id e si possono aggiungere cosÃ¬
		// hc_expenses, hc_coverage credo siano legate alla risorsa HealthcareService
		Patient p = new Patient();
		Location l = new Location();
		DateFormat df = DateFormat.getDateInstance();
		p.addIdentifier().setSystem("urn:system").setValue(args[head.get("id")]);
		p.addName().setFamily(args[head.get("last")]).addGiven(args[head.get("first")])
				.addPrefix(args[head.get("prefix")]).addSuffix(args[head.get("suffix")]);
		Address a = p.addAddress().setCity(args[head.get("city")]).addLine(args[head.get("address")])
				.setPostalCode(args[head.get("zip")]).setState(args[head.get("state")]);

		try {
			p.setBirthDate(df.parse(args[head.get("birthdate")]));
			if (!args[head.get("deathdate")].isEmpty())
				p.setDeceased(new DateType(df.parse(args[head.get("deathdate")])));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if (!args[head.get("marital")].isEmpty()) {
			V3MaritalStatus status = V3MaritalStatus.valueOf(args[head.get("marital")]);
			CodeableConcept code = new CodeableConcept(new Coding(
					"http://terminology.hl7.org/CodeSystem/v3-MaritalStatus", status.toCode(), status.getDisplay()));
			p.setMaritalStatus(code);

		}
		l = l.setAddress(a).setPosition(new LocationPositionComponent(new DecimalType(args[head.get("lon")]),
				new DecimalType(args[head.get("lat")])));
		p.setGender(Enumerations.AdministrativeGender.valueOf(args[head.get("gender")]));

		return p;
	}

}
