package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.r4.model.*;
import org.hl7.fhir.r4.model.codesystems.V3MaritalStatus;
import org.hl7.fhir.r4.model.codesystems.V3AdministrativeGender;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;

public class PatientsParser extends CSVParser {

	public PatientsParser(String pathToCSV) {
		super(pathToCSV);
	}

	@Override
	public Resource createResource(String[] args, Map<String, Integer> head) {

		Patient p = new Patient();
		// Definition of the considered profile
		p.setMeta(new Meta().addProfile("https://hl7.org/fhir/us/core/StructureDefinition-us-core-patient"));

		p.setId(args[head.get("id")]);

		// Definition of the birthdate and deathdate(fields: birthdate, deathdate)
		// with the addition of the extension birthplace
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			p.setBirthDate(dateFormat.parse(args[head.get("birthdate")]));
			if(!args[head.get("deathdate")].isEmpty())
				p.setDeceased(new DateTimeType(dateFormat.parse(args[head.get("deathdate")])));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Extension birthplace = new Extension("http://hl7.org/fhir/StructureDefinition/patient-birthPlace",
				new Address().setText(args[head.get("birthplace")]));
		p.addExtension(birthplace);

		// Definition of the identifiers (fields: id, drivers, passport, ssn)
		p.addIdentifier().setSystem("https://github.com/synthetichealth/synthea").setValue(args[head.get("id")]);
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.SS.getSystem(), PIdentifier.SS.toCode(), PIdentifier.SS.getDefinition())))
				.setValue(args[head.get("ssn")]));
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.DL.getSystem(), PIdentifier.DL.toCode(), PIdentifier.DL.getDefinition())))
				.setValue(args[head.get("drivers")]));
		p.addIdentifier(new Identifier().setType(new CodeableConcept(
				new Coding(PIdentifier.PPN.getSystem(), PIdentifier.PPN.toCode(), PIdentifier.PPN.getDefinition())))
				.setValue(args[head.get("passport")]));

		// Definition of the official name (fields: first, last, prefix, suffix)
		p.addName().setUse(HumanName.NameUse.OFFICIAL).setFamily(args[head.get("last")])
				.addGiven(args[head.get("first")]).addPrefix(args[head.get("prefix")])
				.addSuffix(args[head.get("suffix")]);
		// Definition of the maiden name (fields: first, maiden, prefix, suffix)
		p.addName().setUse(HumanName.NameUse.MAIDEN).setFamily(args[head.get("maiden")])
				.addGiven(args[head.get("first")]).addPrefix(args[head.get("prefix")])
				.addSuffix(args[head.get("suffix")]);

		// Definition of the address (fields: address, city, state,county, zip) with the
		// extensions for the latitude and longitude
		p.addAddress().setCity(args[head.get("city")]).addLine(args[head.get("address")])
				.setDistrict(args[head.get("county")]).setPostalCode(args[head.get("zip")])
				.setState(args[head.get("state")]);
		Extension loc = new Extension("http://hl7.org/fhir/StructureDefinition/geolocation");
		p.addExtension(loc);
		Extension lat = new Extension("latitude", new DecimalType(args[head.get("lat")]));
		Extension lon = new Extension("longitude", new DecimalType(args[head.get("lon")]));
		loc.addExtension(lat);
		loc.addExtension(lon);

		// Definition of the marital status (field: marital)
		V3MaritalStatus status = V3MaritalStatus.valueOf(args[head.get("marital")]);
		p.setMaritalStatus(new CodeableConcept(new Coding(status.getSystem(), status.toCode(), status.getDisplay())));

		// Definition of the two extensions and connected subextensions for the race and
		// the etnicity
		OMBRaceCategories race = OMBRaceCategories.fromCSV(args[head.get("race")]);
		OMBEtnicityCategories eth = OMBEtnicityCategories.fromCSV(args[head.get("ethnicity")]);
		Extension ra = new Extension("http://hl7.org/fhir/us/core/StructureDefinition/us-core-race");
		p.addExtension(ra);
		Extension subRa = new Extension("http://hl7.org/fhir/us/core/ValueSet/omb-race-category",
				new CodeableConcept(new Coding(race.getSystem(), race.toCode(), race.getDefinition())));
		ra.addExtension(subRa);
		Extension et = new Extension("http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity");
		p.addExtension(et);
		Extension subEt = new Extension("http://hl7.org/fhir/us/core/ValueSet/omb-ethnicity-category",
				new CodeableConcept(new Coding(eth.getSystem(), eth.toCode(), eth.getDefinition())));
		et.addExtension(subEt);

		// Definition of the gender(field: gender)
		V3AdministrativeGender sex = V3AdministrativeGender.valueOf(args[head.get("gender")]);
		p.setGender(Enumerations.AdministrativeGender.valueOf(sex.getDefinition().toUpperCase()));

		return p;
	}

}
