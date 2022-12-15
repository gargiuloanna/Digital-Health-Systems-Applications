package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;
import java.util.Optional;
import java.util.ResourceBundle;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import it.unisa.diem.dhsa.group3.CSV.LoadCSV;
import it.unisa.diem.dhsa.group3.CSV.ReadCSV;
import it.unisa.diem.dhsa.group3.resources.PatientResource;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

// Controller FINITO
public class ImportPatientController implements Initializable{

	@FXML
	private TextField allergyField;

	@FXML
	private TextField careplansField;

	@FXML
	private TextField conditionField;

	@FXML
	private TextField devicesField;

	@FXML
	private TextField encounterField;

	@FXML
	private TextField imagingStudiesField;

	@FXML
	private TextField immunizationField;

	@FXML
	private TextField medicationField;

	@FXML
	private TextField observationField;

	@FXML
	private TextField organizationField;

	@FXML
	private TextField patientField;

	@FXML
	private TextField payerField;

	@FXML
	private TextField proceduresField;

	@FXML
	private TextField providerField;

	@FXML
	private TextField supplyField;

	@FXML
	private TextField transactionField;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

		encounterField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(organizationField.textProperty().isEmpty())
				.or(providerField.textProperty().isEmpty())
				.or(payerField.textProperty().isEmpty())
				);
		
		providerField.disableProperty().bind(
				organizationField.textProperty().isEmpty());
		
		transactionField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(payerField.textProperty().isEmpty())
				);
		proceduresField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		conditionField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		conditionField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		allergyField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		careplansField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		conditionField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		careplansField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		observationField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		medicationField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		immunizationField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		imagingStudiesField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		devicesField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		supplyField.disableProperty().bind(
				(patientField.textProperty().isEmpty())
				.or(encounterField.textProperty().isEmpty())
				);
		
	}

	@FXML
	void send_clicked(ActionEvent event) {
		boolean patientOK = check(patientField, "patient");
		boolean organizationOK = check(organizationField, "organization");
		boolean providerOK = check(providerField, "provider");
		boolean payerOK = false;
		boolean encounterOK = false;
		
		//check that dependecies are ok before importing all
		if (!patientOK || !payerOK || !organizationOK) {
			clearAll();
			return;
		}
		encounterOK = check(encounterField, "encounter");
		providerOK = check(providerField, "provider");
		
		if(patientOK)
			LoadCSV.importing_resource(patientField.getText());
		if (payerOK)
			LoadCSV.importing_resource(payerField.getText());
		if (organizationOK)
			LoadCSV.importing_resource(organizationField.getText());
		if (providerOK && 
				organizationOK)
			LoadCSV.importing_resource(providerField.getText());
		if (encounterOK && 
				organizationOK && patientOK && providerOK && payerOK)
			LoadCSV.importing_resource(encounterField.getText());
		if (check(transactionField, "payer transition") && patientOK && payerOK)
			LoadCSV.importing_resource(transactionField.getText());
		if (check(proceduresField, "procedures ") && patientOK && encounterOK)
			LoadCSV.importing_resource(proceduresField.getText());
		if (check(conditionField, "condition") && patientOK && encounterOK)
			LoadCSV.importing_resource(conditionField.getText());
		if (check(allergyField, "allergies") && patientOK && encounterOK)
			LoadCSV.importing_resource(allergyField.getText());
		if (check(careplansField, "care plans") && patientOK && encounterOK)
			LoadCSV.importing_resource(careplansField.getText());
		if (check(observationField, "observations") && patientOK && encounterOK)
			LoadCSV.importing_resource(observationField.getText());
		if (check(medicationField, "medications") && patientOK && encounterOK)
			LoadCSV.importing_resource(medicationField.getText());
		if (check(immunizationField, "immunizations") && patientOK && encounterOK)
			LoadCSV.importing_resource(immunizationField.getText());
		if (check(imagingStudiesField, "imaging studies") && patientOK && encounterOK)
			LoadCSV.importing_resource(imagingStudiesField.getText());
		if (check(devicesField, "devices") && patientOK && encounterOK)
			LoadCSV.importing_resource(devicesField.getText());
		if (check(supplyField, "supplies") && patientOK && encounterOK)
			LoadCSV.importing_resource(devicesField.getText());

		clearAll();

	}

	@FXML
	void SwitchToOpeningPage() throws IOException {
		App.setRoot("OpeningPage");
	}

	@FXML
	private void load_csv_btn(ActionEvent event) throws IOException {

		Button source = (Button) event.getSource();
		HBox hbox = (HBox) source.getParent();
		TextField tf = (TextField) hbox.getChildren().get(1);
		try {
			String filename = file_chooser();
			tf.setText(filename);
			// Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class,
			// filename);

		} catch (IOException | NullPointerException e) {
			System.out.println(e.getStackTrace());
		}

	}

	private String file_chooser() throws IOException {
		FileChooser chooser = new FileChooser();
		File filename = chooser.showOpenDialog(null);
		if (filename != null) {
			return filename.getCanonicalPath();
		}
		throw new NullPointerException("file not selected");
	}

	private void error(String message) {
		Alert alert = new Alert(AlertType.ERROR, message, ButtonType.OK);
		alert.showAndWait();
	}

	private boolean check(TextField field, String message) {
		if (field.getText().isEmpty() | !(new File(field.getText()).exists())) {
			error("Choose a valid "+ message + " CSV");
		} else {
			LoadCSV.importing_resource(field.getText());
			return true;
		}
		return false;
	}

	private void clearAll() {
		allergyField.clear();
		careplansField.clear();
		conditionField.clear();
		devicesField.clear();
		encounterField.clear();
		imagingStudiesField.clear();
		immunizationField.clear();
		medicationField.clear();
		observationField.clear();
		organizationField.clear();
		patientField.clear();
		payerField.clear();
		proceduresField.clear();
		providerField.clear();
		supplyField.clear();
		transactionField.clear();
	}

}
