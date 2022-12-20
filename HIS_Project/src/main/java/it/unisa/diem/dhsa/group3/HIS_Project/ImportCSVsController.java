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
import it.unisa.diem.dhsa.group3.state.Memory;
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
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

// Controller FINITO
public class ImportCSVsController implements Initializable {

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

	@FXML
	private Button sendBtn;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		encounterField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(organizationField.textProperty().isEmpty())
						.or(providerField.textProperty().isEmpty()).or(payerField.textProperty().isEmpty()));

		providerField.disableProperty().bind(organizationField.textProperty().isEmpty());

		transactionField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(payerField.textProperty().isEmpty()));
		proceduresField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		conditionField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		conditionField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		allergyField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		careplansField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		conditionField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		careplansField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		observationField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		medicationField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		immunizationField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		imagingStudiesField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		devicesField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));
		supplyField.disableProperty()
				.bind((patientField.textProperty().isEmpty()).or(encounterField.textProperty().isEmpty()));

		sendBtn.disableProperty().bind(Bindings.isEmpty(patientField.textProperty())
				.and(Bindings.isEmpty(organizationField.textProperty()))
				.and(Bindings.isEmpty(providerField.textProperty())).and(Bindings.isEmpty(payerField.textProperty()))
				.and(Bindings.isEmpty(encounterField.textProperty())));

	}

	@FXML
	void send_clicked(ActionEvent event) {

		boolean patientOK = check(patientField, "patient", true);
		boolean organizationOK = check(organizationField, "organization", true);
		boolean providerOK = check(providerField, "provider", true);
		boolean payerOK = false;
		boolean encounterOK = false;

		// check that dependecies are ok before importing all
		if (!patientOK && !payerOK && !organizationOK) {
			clearAll();
			return;
		}
		encounterOK = check(encounterField, "encounter", organizationOK && patientOK && providerOK && payerOK);
		providerOK = check(providerField, "provider", organizationOK);
		
		check(transactionField, "payer transition", patientOK && payerOK);
		check(proceduresField, "procedures ", patientOK && encounterOK);
		check(conditionField, "condition", patientOK && encounterOK);
		check(allergyField, "allergies", patientOK && encounterOK);
		check(careplansField, "care plans", patientOK && encounterOK);
		check(observationField, "observations", patientOK && encounterOK);
		check(medicationField, "medications", patientOK && encounterOK);
		check(immunizationField, "immunizations", patientOK && encounterOK);
		check(imagingStudiesField, "imaging studies", patientOK && encounterOK);
		check(devicesField, "devices", patientOK && encounterOK);
		check(supplyField, "supplies", patientOK && encounterOK);

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

	private boolean check(TextField field, String message, boolean condition) {

		if (field.getText().isEmpty() |!condition)
			return false;
		
		if (!(new File(field.getText()).exists())
				| Memory.getMemory().containsKey(LoadCSV.get_class(message))) {
			error("Choose a valid " + message + " CSV");
			return false;
		} else {
			LoadCSV.importing_resource(field.getText(), get_source_text(field));
			return true;
		}
			
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

	private String get_source_text(TextField field) {
		HBox hbox = (HBox) field.getParent();
		Text text = (Text) hbox.getChildren().get(0);
		return text.getText();
	}
}
