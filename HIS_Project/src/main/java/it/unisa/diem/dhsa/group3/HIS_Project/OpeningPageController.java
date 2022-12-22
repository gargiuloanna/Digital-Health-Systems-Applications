package it.unisa.diem.dhsa.group3.HIS_Project;


import java.io.IOException;
import javafx.fxml.FXML;


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
    private void import_csv_btn()throws IOException{
    	App.setRoot("ImportCSVs");
    }
    
    
    
}

