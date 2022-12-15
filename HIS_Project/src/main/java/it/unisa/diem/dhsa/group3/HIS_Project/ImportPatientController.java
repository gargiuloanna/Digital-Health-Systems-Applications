package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import it.unisa.diem.dhsa.group3.CSV.ReadCSV;
import it.unisa.diem.dhsa.group3.resources.PatientResource;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;

// Controller FINITO
public class ImportPatientController {

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
	void send_clicked(ActionEvent event) {
		
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
			//Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class, filename);

		} catch (IOException | NullPointerException e) {
			System.out.println(e.getStackTrace());
		}

	}

	private String file_chooser() throws IOException {
		FileChooser chooser = new FileChooser();
		File filename = chooser.showOpenDialog(null);
		if (filename != null) {
			// System.out.println(filename);
			return filename.getCanonicalPath();
		}
		throw new NullPointerException("file not selected");
	}

}
