package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import org.hl7.fhir.r4.model.DateTimeType;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.ServiceRequest;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.resources.ServiceRequestResource;
import it.unisa.diem.dhsa.group3.state.PDF;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

public class MRIController extends BasicController {
	/* MRI */
	@FXML
	private Button LoadButton;
	@FXML
	private Button FilterButton;
	@FXML
	private ListView<ServiceRequestResource> ViewOrders;
	@FXML
	private Button ViewReportButton;
	@FXML
	private ListView<ServiceRequestResource> ViewSelectedOrder;
	@FXML
	private DatePicker dateField;
	@FXML
	private TextField filterField;
	// search patient
	@FXML
	private Button searchButton;
	// search patient
	@FXML
	private TextField searchField;
	@FXML
	private ImageView progressBar;
	@FXML
	private Button viewallButton;


	private ObservableList<ServiceRequestResource> orderslist;
	static ObservableList<ServiceRequestResource> selectedlist = FXCollections.observableArrayList();

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progressBar.setVisible(true);

		orderslist = FXCollections.observableArrayList();

		getAll();

		// potrebbe smettere di funzionare se garbage collected
		ViewOrders.selectionModelProperty().getValue().selectedIndexProperty()
				.addListener((prop, oldValue, newValue) -> {
					selectedlist.clear();
					selectedlist.add(orderslist.sorted().get((int) newValue));
				});
	}

	@FXML
	void FilterPressed(ActionEvent event) {

		if (dateField.getValue() == null) {
			Alert alert = new Alert(AlertType.INFORMATION, "Select a date", ButtonType.OK);
			alert.showAndWait();
		} else {
			DateTimeType date = new DateTimeType(dateField.getValue().toString());

			/*
			 * date.setDay(dateField.getValue().getDayOfMonth());
			 * date.setMonth(dateField.getValue().getMonthValue());
			 * date.setYear(dateField.getValue().getYear()); date.setPrecision();
			 */

			progressBar.setVisible(true);
			getOccurrence(date);
			progressBar.setVisible(false);
		}

	}

	@FXML
	void searchPressed(ActionEvent event) {
		if (searchField.getText().isEmpty() || searchField.getText().isBlank()) {
			Alert alert = new Alert(AlertType.INFORMATION, "Insert a Patient ID", ButtonType.OK);
			alert.showAndWait();
			;
		} else {
			progressBar.setVisible(true);
			// getPatientStudies();
			progressBar.setVisible(false);
		}
	}

	@FXML
	void viewPressed(ActionEvent event) {
		try {
			PDF.loadPDF(selectedlist.get(0).getId());
			Alert alert = new Alert(AlertType.INFORMATION, "Loaded PDF", ButtonType.OK);
			alert.showAndWait();
		} catch (IOException | IllegalArgumentException e) {
			Alert alert = new Alert(AlertType.ERROR, "An error occurred while loading the pdf.\nPlease Retry.",
					ButtonType.OK);
			alert.showAndWait();
		} catch (IndexOutOfBoundsException e) {
			Alert alert = new Alert(AlertType.ERROR, "Select an order", ButtonType.OK);
			alert.showAndWait();
		}
	}

	@FXML
	void loadPressed(ActionEvent event) throws IOException {
		if (MRIController.selectedlist.size() == 0) {
			Alert alert = new Alert(AlertType.INFORMATION, "Select an order", ButtonType.OK);
			alert.showAndWait();
		} else {
			handle(event, "LoadResults");
		}
	}
	
	   @FXML
	    void viewAll(ActionEvent event) {
		   getAll();
	    }

	/* --- Private Service Methods --- */
	/*
	 * private void getPatientStudies() { orderslist.clear(); for
	 * (ServiceRequestResource r: orderslist){ if (r.getSubject_id() ==
	 * searchField.getText()) orderslist.add(r);
	 * 
	 * } Service<List<Resource>> getResource = new Service<List<Resource>>() {
	 * 
	 * @Override protected Task<List<Resource>> createTask() throws
	 * FhirClientConnectionException { return new Task<List<Resource>>() {
	 * 
	 * @Override protected List<Resource> call() throws Exception { String
	 * id_patient = searchField.getText(); return
	 * ServerInteraction.getPatientServiceRequests(id_patient); }; }; } };
	 * 
	 * getResource.start(); getResource.setOnSucceeded(new
	 * EventHandler<WorkerStateEvent>() {
	 * 
	 * @Override public void handle(WorkerStateEvent event) { List<Resource> r =
	 * getResource.getValue(); if (r.size() == 0) { Alert alert = new
	 * Alert(AlertType.INFORMATION, "No requests found for this patient",
	 * ButtonType.OK); alert.showAndWait(); } else for (Resource p : r) if (r !=
	 * null) orderslist.add(new ServiceRequestResource((ServiceRequest) p));
	 * progressBar.setVisible(false);
	 * 
	 * } });
	 * 
	 * getResource.setOnFailed(new EventHandler<WorkerStateEvent>() {
	 * 
	 * @Override public void handle(WorkerStateEvent event) { if
	 * (getResource.getException() != null && getResource.getException().getClass()
	 * == FhirClientConnectionException.class) { Alert alert = new
	 * Alert(AlertType.ERROR,
	 * "Error in the connection to the server.\nPlease retry.", ButtonType.OK);
	 * alert.showAndWait(); }
	 * 
	 * } });
	 * 
	 * }
	 */

	private void getOccurrence(DateTimeType date) {
		Service<List<Resource>> service = new Service<List<Resource>>() {

			@Override
			protected Task<List<Resource>> createTask() throws FhirClientConnectionException {
				return new Task<List<Resource>>() {

					@Override
					protected List<Resource> call() throws Exception {
						return ServerInteraction.getOccurrenceServiceRequests(date);
					};
				};
			}
		};

		service.start();
		service.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				List<Resource> r = service.getValue();
				if (r.size() == 0) {
					Alert alert = new Alert(AlertType.INFORMATION, "No requests found for this date", ButtonType.OK);
					alert.showAndWait();
				} else {
					orderslist.clear();
					Alert alert = new Alert(AlertType.INFORMATION, "Request found for this date", ButtonType.OK);
					alert.showAndWait();
					for (Resource p : r)
						if (r != null)
							orderslist.add(new ServiceRequestResource((ServiceRequest) p));

				}
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

			}
		});
	}

	private void handle(ActionEvent event, String fxml) throws IOException {
		App.setRoot("LoadResults");

	}

	private void getAll() {
		Service<List<ServiceRequest>> getResource = new Service<List<ServiceRequest>>() {

			@Override
			protected Task<List<ServiceRequest>> createTask() throws FhirClientConnectionException {
				return new Task<List<ServiceRequest>>() {

					@Override
					protected List<ServiceRequest> call() throws Exception {
						return ServerInteraction.getServiceRequestResources();
					};
				};
			}
		};

		getResource.start();
		getResource.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				List<ServiceRequest> l = getResource.getValue();
				for (ServiceRequest p : l) {
					orderslist.add(new ServiceRequestResource(p));
				}
				ViewOrders.setItems(orderslist.sorted());
				ViewSelectedOrder.setItems(selectedlist);
				progressBar.setVisible(false);//

			}
		});

		getResource.setOnFailed(new EventHandler<WorkerStateEvent>() {
			@Override
			public void handle(WorkerStateEvent event) {
				if (getResource.getException() != null
						&& getResource.getException().getClass() == FhirClientConnectionException.class) {
					Alert alert = new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",
							ButtonType.OK);
					alert.showAndWait();
				}
				progressBar.setVisible(false);

			}
		});
	}

}
