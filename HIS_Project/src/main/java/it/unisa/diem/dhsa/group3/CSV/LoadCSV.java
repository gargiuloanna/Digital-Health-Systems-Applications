package it.unisa.diem.dhsa.group3.CSV;

import it.unisa.diem.dhsa.group3.resources.*;
import it.unisa.diem.dhsa.group3.state.Memory;

/**
 * The class allows to read a bunch of CSVs and sava them in the Memory map
 *
 */
public final class LoadCSV {
	
	/**
	 * The method get the FHIR class corresponding to the CSV read and inserts in the Memory map the corresponding class, and the resources
	 * created reading the CSV.
	 * @param filename  the file to read
	 * @param resource	the string associated with the name of the resource
	 */
	public static void importing_resource(String filename, String resource) {
		
		resource = resource.toLowerCase();
		Class<? extends BaseResource> resourceClass = LoadCSV.get_class(resource);
		assert(resourceClass != null);
		if (filename != null) {
			Memory.getMemory().put(resourceClass, ReadCSV.readCSV(resourceClass, filename));
		}
	}

	/**
	 * The method maps the string corresponding to the name of the resource to the actual class of the resource.
	 * @param resource the string name of the resource
	 * @return the class of the resource
	 */
	public static Class<? extends BaseResource> get_class(String resource) {
		switch (resource) {
		case "patients":
			return PatientResource.class;
		case "allergies":
			return AllergyIntoleranceResource.class;
		case "conditions":
			return ConditionResource.class;
		case "devices":
			return DeviceResource.class;
		case "encounters":
			return EncounterResource.class;
		case "careplans":
			return CareplanResource.class;
		case "imaging studies":
			return ImagingStudyResource.class;
		case "immunizations":
			return ImmunizationResource.class;
		case "medications":
			return MedicationResource.class;
		case "observations":
			return ObservationResource.class;
		case "organizations":
			return OrganizationResource.class;
		case "payers":
			return PayerResource.class;
		case "transactions":
			return CoverageResource.class;
		case "procedures":
			return ProcedureResource.class;
		case "providers":
			return ProviderResource.class;
		}
		return null;

	}
	
}
