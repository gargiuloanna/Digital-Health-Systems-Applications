package it.unisa.diem.dhsa.group3.CSV;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.hl7.fhir.r4.model.Resource;
import com.opencsv.bean.CsvToBeanBuilder;
import it.unisa.diem.dhsa.group3.resources.BaseResource;
import it.unisa.diem.dhsa.group3.state.Memory;

/**
 * The class provides methods to read a single CSV
 *
 */
public class ReadCSV {

	/**
	 * The method reads a CSV file and saves into the Memory map the class of the resource read and a map of all the resources read from
	 * the CSV.
	 * @param specificClass the class of the resources contained in the CSV
	 * @param path the path of the file
	 * @return the map containing the (id of the resource, resource) for each entry of the csv
	 */
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
