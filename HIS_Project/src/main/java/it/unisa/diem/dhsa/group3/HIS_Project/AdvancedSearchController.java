package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.List;
import java.util.ResourceBundle;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class AdvancedSearchController extends BasicController {

	@FXML
	private DatePicker BirthDatePicker;
	@FXML
	private DatePicker DeathDatePicker;
	@FXML
	private TextField FirstNameField;
	@FXML
	private TextField LastNameField;
	@FXML
	private TableView<PatientListElem> table;
	@FXML
	private TableColumn<PatientListElem, String> birthColumn;
	@FXML
	private TableColumn<PatientListElem, String> deathColumn;
	@FXML
	private TableColumn<PatientListElem, String> firstColumn;
	@FXML
	private TableColumn<PatientListElem, String> identifierColumn;
	@FXML
	private TableColumn<PatientListElem, String> lastColumn;
	@FXML
	private TableColumn<PatientListElem, String> ssnColumn;
	@FXML
	private Button searchButton;
	@FXML
	private ImageView progressBar;

	private ObservableList<PatientListElem> list;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progressBar.setVisible(false);
		list = FXCollections.observableArrayList();

		firstColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
		lastColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
		birthColumn.setCellValueFactory(new PropertyValueFactory<>("birthdate"));
		deathColumn.setCellValueFactory(new PropertyValueFactory<>("deathdate"));
		ssnColumn.setCellValueFactory(new PropertyValueFactory<>("SSN"));
		identifierColumn.setCellValueFactory(new PropertyValueFactory<>("id"));

		table.setItems(list);

		searchButton.disableProperty()
				.bind(Bindings.isEmpty(FirstNameField.textProperty())
						.and(Bindings.isEmpty(LastNameField.textProperty()))
						.and(BirthDatePicker.valueProperty().isNull())
						.and(DeathDatePicker.valueProperty().isNull()));
		
		table.setEditable(true);
		identifierColumn.setCellFactory((TextFieldTableCell.forTableColumn()));
		identifierColumn.setEditable(true);
	}

	@FXML
	@Override
	void SwitchToOpeningPage(ActionEvent event) throws IOException {
		App.setRoot("PatientAdmission");
	}
	
	@FXML
	void searchPatient(ActionEvent event) {
		getPatients(new Service<List<Resource>>() {

			@Override
			protected Task<List<Resource>> createTask() throws FhirClientConnectionException {
				
				return new Task<List<Resource>>() {

					@Override
					protected List<Resource> call() throws FhirClientConnectionException {
						String name = FirstNameField.getText();
						String family = LastNameField.getText();
						LocalDate birth = BirthDatePicker.getValue();
						LocalDate death = DeathDatePicker.getValue();
						return ServerInteraction.advancedPatientSearch(name, family, birth, death);

					};
				};
			}
		});

	}

	@FXML
	void viewAll(ActionEvent event) {
		getPatients(new Service<List<Resource>>() {

			@Override
			protected Task<List<Resource>> createTask() throws FhirClientConnectionException {
				
				return new Task<List<Resource>>() {

					@Override
					protected List<Resource> call() throws FhirClientConnectionException {
						String name = "";
						String family = "";
						LocalDate birth = null;
						LocalDate death = null;
						return ServerInteraction.advancedPatientSearch(name, family, birth, death);

					};
				};
			}
		});

	}

	private void getPatients(Service<List<Resource>> service) {

		list.clear();
		progressBar.setVisible(true);

		service.start();
		service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				List<Resource> r = service.getValue();
				if (r.size() == 0) {
					Alert alert = new Alert(AlertType.INFORMATION, "Patient not found", ButtonType.OK);
					alert.showAndWait();
				} else
					for (Resource p : r)
						if (r != null)
							list.add(new PatientListElem((Patient) p));
				progressBar.setVisible(false);
				

			}
		});
		service.setOnFailed(new EventHandler<WorkerStateEvent>() {
			@Override
			public void handle(WorkerStateEvent event) {
				if (service.getException() != null
						&& service.getException().getClass() == FhirClientConnectionException.class) {
					Alert alert = new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",
							ButtonType.OK);
					alert.showAndWait();
				}
				progressBar.setVisible(false);

			}
		});

	}

}
