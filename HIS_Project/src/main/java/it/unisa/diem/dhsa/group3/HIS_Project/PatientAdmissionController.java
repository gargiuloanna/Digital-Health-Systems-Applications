package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;


public class PatientAdmissionController {

    @FXML
    private TextField LONField;

    @FXML
    private TextField LastNameField;

    @FXML
    private TextField RacePicker;

    @FXML
    private DatePicker BirthDatePicker;

    @FXML
    private TextField LATField;

    @FXML
    private TextField PrefixField;

    @FXML
    private DatePicker DeathDatePicker;

    @FXML
    private TextField CountryField;

    @FXML
    private TextField StateField;

    @FXML
    private TextField CoverageField;

    @FXML
    private TextField DriversField;

    @FXML
    private TextField MaidenField;

    @FXML
    private TextField ZIPField;

    @FXML
    private Button SubmitButton;

    @FXML
    private TextField SSNField;

    @FXML
    private TextField AddressField;

    @FXML
    private TextField IDField;

    @FXML
    private TextField FirstNameField;

    @FXML
    private TextField BirthPlaceField;

    @FXML
    private RadioButton MgenderButton;

    @FXML
    private RadioButton FgenderButton;

    @FXML
    private TextField searchPatientField;

    @FXML
    private RadioButton NOgenderButton;

    @FXML
    private TextField CityField;

    @FXML
    private TextField ExpensesField;

    @FXML
    private TextField SuffixField;

    @FXML
    private TextField EthnicityField;

    @FXML
    private TextField PassportField;

    @FXML
    private TextField MaritalField;

    
    public void initialize(URL url, ResourceBundle rb) {
    
    }
   
    @FXML
    void searchCode(ActionEvent event){
    	System.out.println("searching...");
    }
    @FXML
    void submitPressed(ActionEvent event) throws IOException {
    	App.setRoot("OpeningPage");
    }

}
