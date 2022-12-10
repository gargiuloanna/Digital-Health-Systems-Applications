package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvToBeanBuilder;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.rest.client.api.IGenericClient;

public class prova {

	public static void main(String[] args) {
		
		String path = "../csv/patients.csv";
		FhirContext ctx = FhirContext.forR4();
		String serverBase = "https://hapi.fhir.org/baseR4";

		IGenericClient client = ctx.newRestfulGenericClient(serverBase);


		Iterator<PatientResource> iter;
		Map<String, Resource> patients = new HashMap<String, Resource>();
		PatientResource bean;
		try {
			iter = new CsvToBeanBuilder<PatientResource>(new BufferedReader(new FileReader(path)))
					.withType(PatientResource.class).build().iterator();
			while(iter.hasNext()) {
				bean = iter.next();
				System.out.println(bean.toString());
				patients.put(bean.getId(), bean.createResource());
			}
		} catch (IllegalStateException | FileNotFoundException e) {
			e.printStackTrace();
		}
		

		//String encoded =
		//ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(patients.get(0));
		//System.out.println(encoded);

	}

}
