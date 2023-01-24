package it.unisa.diem.dhsa.group3.HIS_Project;

import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;

import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.ServiceRequest;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;
import it.unisa.diem.dhsa.group3.resources.ServiceRequestResource;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
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
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;

/**
 * Controller for the OrderRegistration interface.
 *
 */
public class OrderRegistrationController extends BasicController{

	@FXML
    private TextField IDField;

    @FXML
    private Button SendOrderButton;

    @FXML
    private MenuButton category;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TextArea details;

    @FXML
    private TextField encounterField;

    @FXML
    private MenuButton intent;

    @FXML
    private TextField patientField;

    @FXML
    private MenuButton request;

    @FXML
    private TextField requesterField;

    @FXML
    private MenuButton status;
    @FXML
    private ImageView progressBar;
   
    
    /**
	 *Initializes the controller.
	 */
    @Override
	public void initialize(URL location, ResourceBundle resources) {
    	progressBar.setVisible(false);
	}

    /**
     * Set the code of the request
     * @param event
     */
    @FXML
    void requestSelected(ActionEvent event) {
    	MenuItem e = (MenuItem) event.getSource();
		request.setText(e.getText());
    }


    /**
     * Set the category of the request
     * @param event
     */
    @FXML
    void categorySelected(ActionEvent event) {
    	MenuItem e = (MenuItem) event.getSource();
		category.setText(e.getText());
    }

    /**
     * Set the intent of the request
     * @param event
     */
    @FXML
    void intentSelected(ActionEvent event) {
    	MenuItem e = (MenuItem) event.getSource();
		intent.setText(e.getText());
    }

    /**
     * Set the status of the request
     * @param event
     */
    @FXML
    void statusSelected(ActionEvent event) {
    	MenuItem e = (MenuItem) event.getSource();
		status.setText(e.getText());
    }

    /**
     * Performs checks to confirm that the fields are filled and that the date is valid.
     * If the fields are filled, and the date is after today, searches the patient on the server through the getPatient method.
     * @param event
     */
    @FXML
    void sendOrderPressed(ActionEvent event) {
    	if(emptyFields()) {
    		Alert alert = new Alert(AlertType.ERROR, "Fill all the fields",ButtonType.OK);
			alert.showAndWait();
    	}
    	else {
	    	if(datepicker.getValue().isBefore(LocalDate.now())) {
	    		Alert alert = new Alert(AlertType.ERROR, "Select a valid date",ButtonType.OK);
	    		alert.showAndWait();
	    	}else {
	    		progressBar.setVisible(true);
	    		getPatient();
	    	}
    	}
    	
    }
    
    /**
     * Create a service request taken the data fields from the interface
     * @param p - FHIR Patient Resource to which the request refers to
     * @return a ServiceRequestResource Object
     * @throws FhirClientConnectionException
     */
    private ServiceRequestResource create(Patient p) throws FhirClientConnectionException{
    	ServiceRequestResource r = new ServiceRequestResource(IDField.getText(), status.getText().toLowerCase(), intent.getText().toLowerCase(), request.getText(), 
    			p.getIdentifierFirstRep().getValue(), encounterField.getText(), category.getText(), 
    			Date.from(datepicker.getValue().atStartOfDay(ZoneId.of("Europe/Paris")).toInstant()), new Date(), requesterField.getText(), details.getText());
    	return r;
 
    }

    /**
     * Upload a FHIR ServiceRequest Resource on the server
     * It displays an alert box to show whether the upload was successful or there was an error duirng the connection to the server.
     * @param r - ServiceRequestResource to upload
     */
    private void upload(ServiceRequestResource r) {
    	
    	ServiceRequest rr = (ServiceRequest) r.createResource();
				
    	Service<String> upload = new Service<String>() {

			@Override
			protected Task<String> createTask() throws FhirClientConnectionException {
				// TODO Auto-generated method stub
				return new Task<String>() {

					@Override
					protected String call() throws FhirClientConnectionException {
						return ServerInteraction.uploadResource(rr.getIdentifierFirstRep().getValue(), rr, true);

					};
				};
			}
		};

		upload.start();
		upload.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				String id = upload.getValue();
				Alert alert = new Alert(AlertType.NONE, "Resource with id:" +id +" updated correctly.",
						ButtonType.OK);
				alert.showAndWait();
				
			}
		});
		
		upload.setOnFailed(new EventHandler<WorkerStateEvent>() {
			
			@Override
			public void handle(WorkerStateEvent event) {
				if (upload.getException() != null
						&& upload.getException().getClass() == FhirClientConnectionException.class) {
					Alert alert = new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",
							ButtonType.OK);
					alert.showAndWait();
				}

			}
		});
		
		
		upload.setOnCancelled(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				Alert alert = new Alert(AlertType.ERROR, "cancelled.",
						ButtonType.OK);
				alert.showAndWait();
				
			}
			
		});
		
    }
    
    /**
     * Check if all the fields are filled or not
     * @return True if one of the fiels is empty, false otherwise.
     */
    private boolean emptyFields() {
    	if(IDField.getText().isBlank() || IDField.getText().isEmpty() ||
    	   status.getText().isBlank() || status.getText().isEmpty() ||
    	   intent.getText().isBlank() || intent.getText().isEmpty() ||
    	   request.getText().isBlank()|| request.getText().isEmpty() || 
    	   patientField.getText().isBlank() || patientField.getText().isEmpty() ||
    	   encounterField.getText().isBlank() || encounterField.getText().isEmpty() ||
    	   category.getText().isBlank() || category.getText().isEmpty() || 
    	   datepicker.getValue().toString() == "" || datepicker.getValue().toString() == null ||
    	   category.getText().isBlank() || category.getText().isEmpty() || 
    	   requesterField.getText().isBlank() || requesterField.getText().isEmpty() ||
    	   details.getText().isBlank() || details.getText().isEmpty())
    		return true;
    
    return false;
    }
    
    /**
     * Searches for the patient to associate with the service request on the server.
     * if the search is successful, it returns the patient found.
     * Otherwise, it displays alert box if an error occurs(patient not found or connection aborted)
     */
    private void getPatient() {

		Service<Resource> getResource = new Service<Resource>() {

			@Override
			protected Task<Resource> createTask() throws FhirClientConnectionException {
				
				return new Task<Resource>() {

					@Override
					protected Resource call() throws FhirClientConnectionException {
						String id = patientField.getText();
						return ServerInteraction.getResource(Patient.class, id);

					};
				};
			}
		};

		getResource.start();
		getResource.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				Resource r = getResource.getValue();
				Patient p = (Patient) r;
				if (r != null) {
					ServiceRequestResource s = create(p);
					upload(s);
				} else {
					Alert alert = new Alert(AlertType.INFORMATION, "Patient NOT found", ButtonType.OK);
					alert.showAndWait();
				}
				progressBar.setVisible(false);
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

			}
		});
		

	}

}
