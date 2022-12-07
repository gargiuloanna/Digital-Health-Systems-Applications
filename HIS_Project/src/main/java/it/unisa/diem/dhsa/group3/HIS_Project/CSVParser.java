package it.unisa.diem.dhsa.group3.HIS_Project;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hl7.fhir.r4.model.Resource;
public abstract class CSVParser {

	List<Resource> resources;
	String pathToCSV;
	Map<String, Integer> head;
	
	public CSVParser(String pathToCSV) {
		this.resources = new ArrayList<Resource>();
		this.pathToCSV = pathToCSV;
		this.head = new HashMap<>();
	}
	
	public void readCSV() {
		String headers; 
		String line;
		Resource res;
		String[] columns;
		try (BufferedReader br = new BufferedReader(new FileReader(this.pathToCSV))) { 
			headers = br.readLine();
			columns = headers.split(",");
			for(int i = 0; i < columns.length; i++) {
				this.head.put(columns[i].toLowerCase(), i);
			}		
			System.out.println(head.toString());
			while((line = br.readLine()) != null){
				res = null;
				res = createResource(line.split(","), head);
				if(res != null) {
					this.resources.add(res);
				}
				
			} 
		} 
		catch (Exception e){ System.out.println(e);
		}
	}

	public abstract Resource createResource(String[] args, Map<String, Integer> head);
	
}
