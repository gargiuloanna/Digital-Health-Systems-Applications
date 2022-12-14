package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import it.unisa.diem.dhsa.group3.CSV.ReadCSV;
import it.unisa.diem.dhsa.group3.resources.PatientResource;
import javafx.fxml.FXML;
import javafx.stage.FileChooser;


// Controller FINITO
public class OpeningPageController {

    
    @FXML
    private void patient_admission_btn()throws IOException{
    	App.setRoot("PatientAdmission");
    }
    
    @FXML
    private void order_registration_btn ()throws IOException{
    	App.setRoot("OrderRegistration");
    }
    
    @FXML
    private void mri_btn()throws IOException{
    	App.setRoot("MRI");
    } 

    @FXML
    private void patient_discharge_btn()throws IOException{
    	App.setRoot("PatientDischarge");
    }
    
    @FXML
    private void load_csv_btn()throws IOException{
    	FileChooser chooser = new FileChooser();
    	File filename = chooser.showOpenDialog(null);
    	if (filename != null) {
    		// System.out.println(filename);
    		try {
    			Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class, filename.getCanonicalPath());
    			// TODO remove selecting patient

    		} catch (IOException e) { // TODO Dovrebbe generare l'eccezione sugetCanonicalPath quando non viene
    			// scelto nulla - ma sarebbe null efacciamo già l'if //e.printStackTrace(); }
    		}

    	}
    }
    
    
    
}

