package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    
    @FXML
    private void mri_btn()throws IOException{
    	System.out.println("mri");
    }

    @FXML
    private void order_registration_btn ()throws IOException{
    	System.out.println("order registration");
    }

    @FXML
    private void patient_admission_btn()throws IOException{
    	System.out.println("patient admission");
    }

    @FXML
    private void patient_discharge_btn()throws IOException{
    	System.out.println("patient discharge");
    }
}
