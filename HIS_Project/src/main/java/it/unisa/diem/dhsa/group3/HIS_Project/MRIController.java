package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;

import javafx.fxml.FXML;

public class MRIController {

    @FXML
    void SwitchToOpeningPage() throws IOException {
    	App.setRoot("OpeningPage");
    }

}

