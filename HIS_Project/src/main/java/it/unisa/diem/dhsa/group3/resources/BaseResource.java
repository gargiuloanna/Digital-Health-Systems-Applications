package it.unisa.diem.dhsa.group3.resources;

import java.util.UUID;

import org.hl7.fhir.r4.model.Resource;
import com.opencsv.bean.CsvBindByName;

/**
 * 
 * This class represents the base class to map all the resources used in the application
 *
 */
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

	/**
	 * This constructor initializes the Id to a random identifier from the UUID library
	 */
	public BaseResource() {
		Id = UUID.randomUUID().toString();
	}

	public BaseResource(String id) {
		this();
		if (id != "" && id != null)
			Id = id;

	}

}
