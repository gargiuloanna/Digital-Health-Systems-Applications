package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.r4.model.Resource;

import com.opencsv.bean.CsvBindByName;

public abstract class BaseResource {
	
	@CsvBindByName
	private String Id;
	
	public abstract Resource createResource();
	
	public String getId() {
		return Id;
	}
	
	public void setId(String id) {
		Id = id;
	}
	
	
}
