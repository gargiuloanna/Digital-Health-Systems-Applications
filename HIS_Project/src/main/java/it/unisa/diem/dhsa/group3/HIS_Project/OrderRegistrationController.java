package it.unisa.diem.dhsa.group3.HIS_Project;


import java.io.IOException;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class OrderRegistrationController {

    @FXML
    private TextField CodeField;

    @FXML
    private TextArea DetailsField;

    @FXML
    private TextField Field;

    @FXML
    private TextField IDField;

    @FXML
    private Button SendOrderButton;

    @FXML
    private TextField StatsField;

    @FXML
    private TextField SubjectField;

    @FXML
    private TextField TargetField;

    @FXML
    private TextField searchPatientField;

    @FXML
    private CheckBox summaryButton;

    @FXML
    void SwitchToOpeningPage() throws IOException {
    	App.setRoot("OpeningPage");
    }
    

    @FXML
    void searchCode(ActionEvent event) {

    }

    @FXML
    void sendOrderPressed(ActionEvent event) {

    }

    @FXML
    void summaryChecked(ActionEvent event) {

    }

}
