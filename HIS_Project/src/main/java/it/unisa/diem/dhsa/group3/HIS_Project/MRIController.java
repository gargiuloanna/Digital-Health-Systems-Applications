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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;

/**
 * Controller for the MRI interface.
 *
 */
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
    private ImageView progressFilter;
	@FXML
	private Button viewallButton;


	private ObservableList<ServiceRequestResource> orderslist;
	static ObservableList<ServiceRequestResource> selectedlist = FXCollections.observableArrayList();

	/**
	 * Initializes the controller of the MRI interface 
	 */
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progressBar.setVisible(true);
		progressFilter.setVisible(false);
		orderslist = FXCollections.observableArrayList();

		getAll();

		ViewOrders.selectionModelProperty().getValue().selectedIndexProperty()
				.addListener((prop, oldValue, newValue) -> {
					selectedlist.clear();
					try {
					selectedlist.add(orderslist.get((int) newValue));
					}catch (IndexOutOfBoundsException e) {
						selectedlist.clear();
					}
				});
	}

	/**
	 * Filters by date the service requests of the orders list, showing the ones with a date after or equal to the one selected
	 * @param event
	 */
	@FXML
	void FilterPressed(ActionEvent event) {
		if (dateField.getValue() == null) {
			Alert alert = new Alert(AlertType.INFORMATION, "Select a date", ButtonType.OK);
			alert.showAndWait();
		} else {
			selectedlist.clear();
			DateTimeType date = new DateTimeType(dateField.getValue().toString());
			progressFilter.setVisible(true);
			getOccurrence(date);
		}

	}

	/**
	 * Filters the service requests of the orders list showing the ones that refer to the given patient
	 * @param event
	 */
	@FXML
	void searchPressed(ActionEvent event) {
		if (searchField.getText().isEmpty() || searchField.getText().isBlank()) {
			Alert alert = new Alert(AlertType.INFORMATION, "Insert a Patient ID", ButtonType.OK);
			alert.showAndWait();
			;
		} else {
			progressBar.setVisible(true);
			getPatientStudies();
			progressBar.setVisible(false);
		}
	}

	/**
	 * Shows the PDF report associated with the selected service request.
	 * It displays an information box specifying if the file is loaded.
	 * It displays an alert box if the file non found or the order is not selected.
	 * @param event
	 */
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

	/**
	 * Switches to the LoadResult interface to insert the details of MRI.
	 * It displays an alert box if the order is not selected.
	 * @param event
	 * @throws IOException
	 */
	@FXML
	void loadPressed(ActionEvent event) throws IOException {
		if (MRIController.selectedlist.size() == 0) {
			Alert alert = new Alert(AlertType.INFORMATION, "Select an order", ButtonType.OK);
			alert.showAndWait();
		} else {
			handle(event, "LoadResults");
		}
	}
	
   
	/**
	 * Loads from the server all the service requests and shows them in the orders list.
	 * @param event
	 */
	@FXML
    void viewAll(ActionEvent event) {
	   
	   getAll();
    }

	/* --- Private Service Methods --- */
	
    /**
     * Searches the orders list for patients with the given identifier.
     */
	private void getPatientStudies() { 
		 ObservableList<ServiceRequestResource> tmp = FXCollections.observableArrayList();
		 for (ServiceRequestResource r : orderslist) {
			 if(r.getSubject_id().equalsIgnoreCase(searchField.getText()))
				 tmp.add(r);
			}
		 orderslist.clear();
		 orderslist.addAll(tmp);
	 }
	
	 
	/**
	 * Searches the server for service requests with date after or equal to the one given as an input.
	 * @param date the filter to use to search for service requests
	 * It displays an alert box showing whether at least a request was found or not.
	 * It displays an alert box in case of error during the connection to the server
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
					orderslist.clear();
				} else {
					Alert alert = new Alert(AlertType.INFORMATION, "Request found for this date", ButtonType.OK);
					alert.showAndWait();
					orderslist.clear();
					for (Resource p : r)
						if (r != null)
							orderslist.add(new ServiceRequestResource((ServiceRequest) p));

				}
				progressBar.setVisible(false);
				progressFilter.setVisible(false);
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

	/**
	 * Sets the primary page to the fxml given as input.
	 * @param event
	 * @param fxml the name of the fxml file to switch to
	 * @throws IOException
	 */
	private void handle(ActionEvent event, String fxml) throws IOException {
		App.setRoot("LoadResults");

	}

	
	/**
	 * Gets all the service requests from the server.
	 * It displays an alert box in the case of error during the connection with the server
	 */
	private void getAll() {
		Service<List<ServiceRequest>> getResource = new Service<List<ServiceRequest>>() {

			@Override
			protected Task<List<ServiceRequest>> createTask() throws FhirClientConnectionException {
				return new Task<List<ServiceRequest>>() {

					@SuppressWarnings("unchecked")
					@Override
					protected List<ServiceRequest> call() throws Exception {
						return (List<ServiceRequest>) ServerInteraction.getResources(ServiceRequest.class);
					};
				};
			}
		};

		getResource.start();
		getResource.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				List<ServiceRequest> l = getResource.getValue();
				orderslist.clear();
				for (ServiceRequest p : l) {
					orderslist.add(new ServiceRequestResource(p));
				}
				ViewOrders.setItems(orderslist);
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
