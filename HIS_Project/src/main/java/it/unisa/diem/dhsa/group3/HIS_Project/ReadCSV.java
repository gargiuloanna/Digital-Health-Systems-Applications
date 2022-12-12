package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvToBeanBuilder;

import ca.uhn.fhir.rest.client.api.IGenericClient;

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
				//System.out.println(bean.toString());
				resources.put(bean.getId(), bean.createResource());
			}
		} catch (IllegalStateException | FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return resources;
	}
}
