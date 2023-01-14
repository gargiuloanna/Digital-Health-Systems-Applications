package it.unisa.diem.dhsa.group3.HIS_Project;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class OrderRegistrationController extends BasicController{

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
    private VBox VboxContainer;
    
    @Override
	public void initialize(URL url, ResourceBundle rb) {

    	VboxContainer.setDisable(true);
    	SendOrderButton.disableProperty().bind(Bindings.isEmpty(searchPatientField.textProperty())
    			.and(Bindings.isEmpty(IDField.textProperty())));

	}

    @FXML
    void searchCode(ActionEvent event) {
		VboxContainer.setDisable(false);
		searchPatientField.setDisable(true);
		searchPatientField.clear();
    }

    @FXML
    void sendOrderPressed(ActionEvent event) {
    	if (VboxContainer.isDisable()) {
    		searchCode(event);
    	}
    }

    @FXML
    void summaryChecked(ActionEvent event) {

    }

}
