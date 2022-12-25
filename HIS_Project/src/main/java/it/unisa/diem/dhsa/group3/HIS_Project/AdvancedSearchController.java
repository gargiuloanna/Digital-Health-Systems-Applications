package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class AdvancedSearchController extends BasicController {

    @FXML
    private DatePicker BirthDatePicker;

    @FXML
    private TextField BirthPlaceField;

    @FXML
    private DatePicker DeathDatePicker;

    @FXML
    private TextField FirstNameField;

    @FXML
    private TextField LastNameField;

    @FXML
    private TableView<?> table;
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		return;
	}
	
	
	

}
