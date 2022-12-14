package CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvToBeanBuilder;

import ca.uhn.fhir.rest.client.api.IGenericClient;
import resources.BaseResource;
import state.Memory;

public class ReadCSV {

	public  static Map<String, Resource> readCSV(Class<? extends BaseResource> specificClass, String path) {

		Iterator<BaseResource> iter;
		Map<String, Resource> resources = new HashMap<String, Resource>();
		BaseResource bean;
		try {
			iter = new CsvToBeanBuilder<BaseResource>(new BufferedReader(new FileReader(path)))
					.withType(specificClass).build().iterator();
			while(iter.hasNext()) {
				bean = iter.next();
				resources.put(bean.getId(), bean.createResource());
			}
		} catch (IllegalStateException | FileNotFoundException e) {
			e.printStackTrace();
		}
		Memory.getMemory().put(specificClass, resources);
		
		return resources;
	}
}
