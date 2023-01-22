package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.CSV.LoadCSV;
import it.unisa.diem.dhsa.group3.state.Memory;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
import javafx.beans.binding.Bindings;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;

public class ImportCSVsController extends BasicController {

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
	private TextField transactionField;

	@FXML
	private Button sendBtn;
	
	@FXML
	private CheckBox checkBox;
	
	@FXML
	private ImageView progressFilter;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		progressFilter.setVisible(false);
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

		sendBtn.disableProperty().bind(Bindings.isEmpty(patientField.textProperty())
				.and(Bindings.isEmpty(organizationField.textProperty()))
				.and(Bindings.isEmpty(providerField.textProperty())).and(Bindings.isEmpty(payerField.textProperty()))
				.and(Bindings.isEmpty(encounterField.textProperty())));

	}

	@FXML
	void send_clicked(ActionEvent event) {
		progressFilter.setVisible(true);
		boolean patientOK = check(patientField, "patient", true);
		boolean organizationOK = check(organizationField, "organization", true);
		boolean payerOK = check(payerField, "payers", true);
		boolean providerOK = false;
		boolean encounterOK = false;

		// check that dependecies are ok before importing all
		if (!patientOK && !payerOK && !organizationOK) {
			clearAll();
			return;
		}
		providerOK = check(providerField, "provider", organizationOK);
		encounterOK = check(encounterField, "encounter", organizationOK && patientOK && providerOK && payerOK);
		
		
		check(transactionField, "payer transitions", patientOK && payerOK);
		check(proceduresField, "procedures ", patientOK && encounterOK);
		check(conditionField, "conditions", patientOK && encounterOK);
		check(allergyField, "allergies", patientOK && encounterOK);
		check(careplansField, "care plans", patientOK && encounterOK);
		check(observationField, "observations", patientOK && encounterOK);
		check(medicationField, "medications", patientOK && encounterOK);
		check(immunizationField, "immunizations", patientOK && encounterOK);
		check(imagingStudiesField, "imaging studies", patientOK && encounterOK);
		check(devicesField, "devices", patientOK && encounterOK);
		try{
			upload();
		} catch (FhirClientConnectionException e) {
			error("Error in the connection with the server");
		}
		clearAll();

	}

	@FXML
	private void load_csv_btn(ActionEvent event) throws IOException {

		Button source = (Button) event.getSource();
		HBox hbox = (HBox) source.getParent();
		TextField tf = (TextField) hbox.getChildren().get(1);
		try {
			String filename = file_chooser();
			tf.setText(filename);

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
		transactionField.clear();
	}

	private String get_source_text(TextField field) {
		HBox hbox = (HBox) field.getParent();
		Text text = (Text) hbox.getChildren().get(0);
		return text.getText();
	}
	
	private void upload() {
    	
				
    	Service<String> upload = new Service<String>() {

			@Override
			protected Task<String> createTask() throws FhirClientConnectionException {
				return new Task<String>() {

					@Override
					protected String call() throws FhirClientConnectionException {
						ServerInteraction.sendToServer(checkBox.isSelected());
						return "uploaded";

					};
				};
			}
		};

		upload.start();
		upload.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				Alert alert = new Alert(AlertType.NONE, "Resources uploaded correctly.",ButtonType.OK);
				alert.showAndWait();
				progressFilter.setVisible(false);
				
			}
		});
		
		upload.setOnFailed(new EventHandler<WorkerStateEvent>() {
			
			@Override
			public void handle(WorkerStateEvent event) {
				if (upload.getException() != null && upload.getException().getClass() == FhirClientConnectionException.class) {
					Alert alert = new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",ButtonType.OK);
					alert.showAndWait();
				}

			}
		});
		
		
		upload.setOnCancelled(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				Alert alert = new Alert(AlertType.ERROR, "cancelled.",ButtonType.OK);
				alert.showAndWait();
				
			}
			
		});
		
    }
}
