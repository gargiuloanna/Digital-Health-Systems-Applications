package it.unisa.diem.dhsa.group3.CSV;

import it.unisa.diem.dhsa.group3.resources.*;
import it.unisa.diem.dhsa.group3.state.Memory;

public final class LoadCSV {

	public static void importing_resource(String filename, String resource) {
		
		resource = resource.toLowerCase();
		Class<? extends BaseResource> resourceClass = LoadCSV.get_class(resource);
		assert(resourceClass != null);
		if (filename != null) {
			Memory.getMemory().put(resourceClass, ReadCSV.readCSV(resourceClass, filename));
		}
	}

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
		case "procedures":
			return ProcedureResource.class;
		case "providers":
			return ProviderResource.class;
		}
		return null;

	}
	
}
