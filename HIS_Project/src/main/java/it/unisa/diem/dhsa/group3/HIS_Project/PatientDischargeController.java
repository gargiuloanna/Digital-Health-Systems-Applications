package it.unisa.diem.dhsa.group3.HIS_Project;

import java.awt.event.ActionEvent;
import java.io.IOException;

import javafx.fxml.FXML;

public class PatientDischargeController {

    @FXML
    void SwitchToOpeningPage() throws IOException {
    	App.setRoot("OpeningPage");
    }
}
