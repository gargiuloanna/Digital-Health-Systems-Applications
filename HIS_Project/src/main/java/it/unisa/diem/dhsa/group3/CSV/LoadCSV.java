package it.unisa.diem.dhsa.group3.CSV;

import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import it.unisa.diem.dhsa.group3.resources.PatientResource;

public final class LoadCSV {
	
	public static void importing_resource(String filename) {
		if (filename != null) {
			Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class, filename);
		}
	}
	
}
