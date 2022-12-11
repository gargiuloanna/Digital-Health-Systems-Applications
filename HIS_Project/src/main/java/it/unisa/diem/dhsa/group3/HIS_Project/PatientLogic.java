package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvToBeanBuilder;


public class PatientLogic extends ApplicationLogic{

	public PatientLogic() {
		super();
		this.path = "../csv/patients.csv";
				//"../csv/patients3.csv"; //TODO remove after setting up the final application
	}
	
	public  Map<String, Resource> readCSV() {

		Iterator<PatientResource> iter;
		Map<String, Resource> patients = new HashMap<String, Resource>();
		PatientResource bean;
		try {
			iter = new CsvToBeanBuilder<PatientResource>(new BufferedReader(new FileReader(path)))
					.withType(PatientResource.class).build().iterator();
			while(iter.hasNext()) {
				bean = iter.next();
				//System.out.println(bean.toString());
				patients.put(bean.getId(), bean.createResource());
			}
		} catch (IllegalStateException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return patients;
		
		//String encoded =
		//ctx.newXmlParser().setPrettyPrint(true).encodeResourceToString(patients.get(0));
		//System.out.println(encoded);

	}

}
