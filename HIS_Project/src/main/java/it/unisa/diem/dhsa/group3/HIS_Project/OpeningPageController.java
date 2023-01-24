package it.unisa.diem.dhsa.group3.HIS_Project;


import java.io.IOException;
import javafx.fxml.FXML;

/**
 * Controller for the OpeningPage interface.
 *
 */
public class OpeningPageController {

    
	/**
	 * Switches from the opening page of the application to PatientAdmission interface.
	 * @throws IOException
	 */
	@FXML
    private void patient_admission_btn()throws IOException{
    	App.setRoot("PatientAdmission");
    }
    
    
	/**
	 * Switches from the opening page of the application to OrderRegistration interface.
	 * @throws IOException
	 */
	@FXML
    private void order_registration_btn ()throws IOException{
    	App.setRoot("OrderRegistration");
    }
    
	/**
	 * Switches from the opening page of the application to MRI interface.
	 * @throws IOException
	 */
	@FXML
    private void mri_btn()throws IOException{
    	App.setRoot("MRI");
    } 
	
	/**
	 * Switches from the opening page of the application to ImportCSV interface.
	 * @throws IOException
	 */
	@FXML
    private void import_csv_btn()throws IOException{
    	App.setRoot("ImportCSVs");
    }
}

