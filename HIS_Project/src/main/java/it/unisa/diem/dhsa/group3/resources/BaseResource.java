package it.unisa.diem.dhsa.group3.resources;

import java.util.UUID;

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
	
	public BaseResource() {
		 Id = UUID.randomUUID().toString();
	}
	

	public BaseResource(String id) {
		this();
		if (id != "" && id != null)
			Id = id;
				
	}
	
	
	
	
	
}
