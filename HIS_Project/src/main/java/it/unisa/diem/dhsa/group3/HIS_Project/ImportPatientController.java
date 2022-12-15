package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import it.unisa.diem.dhsa.group3.CSV.ReadCSV;
import it.unisa.diem.dhsa.group3.resources.PatientResource;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;


// Controller FINITO
public class ImportPatientController {

    
    @FXML
    private TextField patientField;

    @FXML
    private TextField patientField1;

    @FXML
    private TextField patientField2;

    @FXML
    private TextField patientField3;

    @FXML
    private TextField patientField4;

    @FXML
    private TextField patientField5;

    @FXML
    void SwitchToOpeningPage() throws IOException {
    	App.setRoot("OpeningPage");
    }

    @FXML
    private void load_csv_btn()throws IOException{
    	FileChooser chooser = new FileChooser();
    	File filename = chooser.showOpenDialog(null);
    	if (filename != null) {
    		// System.out.println(filename);
    		try {
    			Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class, filename.getCanonicalPath());

    		} catch (IOException e) {
    			System.out.println(e.getStackTrace());
    		}

    	}
    }
    
    
    
}

