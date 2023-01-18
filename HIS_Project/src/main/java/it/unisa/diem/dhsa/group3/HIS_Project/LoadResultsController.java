package it.unisa.diem.dhsa.group3.HIS_Project;


import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.ImagingStudy;
import org.hl7.fhir.r4.model.ServiceRequest;


import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.ResourceBundle;

import it.unisa.diem.dhsa.group3.resources.DiagnosticReportResource;
import it.unisa.diem.dhsa.group3.resources.ImagingStudyResource;
import it.unisa.diem.dhsa.group3.resources.ServiceRequestResource;
import it.unisa.diem.dhsa.group3.state.PDF;
import it.unisa.diem.dhsa.group3.state.ServerInteraction;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.concurrent.WorkerStateEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoadResultsController extends BasicController{

	@FXML
    private TextField bodycodeField;
    @FXML
    private TextField bodydesField;
    @FXML
    private TextArea conclusionField;
    @FXML
    private Button confirmButton;
    @FXML
    private DatePicker datePicker;
    @FXML
    private TextArea detailsField;
    @FXML
    private TextField encounterField;
    @FXML
    private Button lodButton;
    @FXML
    private TextField modcodeField;
    @FXML
    private TextField moddesField;
    @FXML
    private TextField patientField;
    @FXML
    private TextField requestField;
    @FXML
    private TextField sopcodeField;
    @FXML
    private TextField sopdesField;

    
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ServiceRequestResource r = MRIController.selectedlist.get(0);
	
		
    	patientField.setText(r.getSubject_id());
    	requestField.setText(r.getId());
    	Date date = r.getDate();
    	datePicker.setValue(LocalDate.of(date.getYear()+1900, date.getMonth()+1, date.getDay()));
    	encounterField.setText(r.getEncounter_id());
    	detailsField.setText(r.getDetails());
    	
	}
	
	@FXML
	void SwitchToOpeningPage(ActionEvent event) throws IOException {
		App.setRoot("MRI");
	}
	
	@FXML
    void confirmAction(ActionEvent event) {
		DiagnosticReportResource r = createDiagnosticReport();
    	try {
    		PDF.createPDF(r.getPatientId(), 
    				r.getEncounter(), 
    				r.getConclusion(), 
    				MRIController.selectedlist.get(0).getDetails(), 
    				r.getId(), 
    				r.getServiceRequest(), 
    				r.getImagingStudy());
    		upload((DiagnosticReport) r.createResource());
			//PDF.createPDF("encounter","patientId","conclusion", "nodetails", "id");
			Alert alert = new Alert(AlertType.CONFIRMATION, "Results Loaded",ButtonType.OK);
			alert.showAndWait();
			handle(event, "MRI");
		} catch (IOException e) {
			Alert alert = new Alert(AlertType.ERROR, "Error in the creation of the PDF\n Please Retry.",ButtonType.OK);
			alert.showAndWait();
		}
    }

    @FXML
    void loadAction(ActionEvent event) {
    	//if we want to load the image
    }    
	
	private DiagnosticReportResource createDiagnosticReport() {
    	
    	if(emptyFields()) {
    		Alert alert = new Alert(AlertType.ERROR, "Fill the fields",ButtonType.OK);
			alert.showAndWait();
			
			return null;
    	}
    	else {
    	DiagnosticReportResource r = new DiagnosticReportResource();
    	ImagingStudyResource i = new ImagingStudyResource(
    			Date.from(datePicker.getValue().atStartOfDay(ZoneId.of("Europe/Paris")).toInstant()), patientField.getText(), encounterField.getText(), 
    			bodycodeField.getText(), bodydesField.getText(), modcodeField.getText(), moddesField.getText(),
    			sopcodeField.getText(), sopdesField.getText());
    	
    	r.setPatientId(patientField.getText());
    	r.setEncounter(encounterField.getText());
    	r.setServiceRequest(MRIController.selectedlist.get(0).getId()); 
    	r.setImagingStudy(i.getId());
    	r.setConclusion(conclusionField.getText());
    	//luigia puoi fare una prova
    	return r;
    	}
    	
    	

	}
	
	private void handle(ActionEvent event, String fxml) {
    	Stage stage;
        Parent root;
        stage=(Stage) ((Button)(event.getSource())).getScene().getWindow();
        try {
			root = FXMLLoader.load(App.class.getResource(fxml + ".fxml"));
			Scene scene = new Scene(root);
	        stage.setScene(scene);
	        stage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}

    }
	
	private void upload(DiagnosticReport r){
		Service<String> upload = new Service<String>() {

			@Override
			protected Task<String> createTask() throws FhirClientConnectionException {
				
				return new Task<String>() {

					@Override
					protected String call() throws FhirClientConnectionException {
						return ServerInteraction.uploadResource(r.getIdentifierFirstRep().getValue(), r, true);

					};
				};
			}
		};

		upload.start();
		upload.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				String id = upload.getValue();
				Alert alert = new Alert(AlertType.NONE, "Request with id:" +id +" updated correctly.",
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
	}
	
	private boolean emptyFields() {
		if (bodycodeField.getText().isBlank() || bodycodeField.getText().isEmpty() ||
 	   bodydesField.getText().isBlank() || bodydesField.getText().isEmpty() ||
 	   modcodeField.getText().isBlank() || modcodeField.getText().isEmpty() ||
 	   moddesField.getText().isBlank() || moddesField.getText().isEmpty() ||
 	   sopcodeField.getText().isBlank() || sopcodeField.getText().isEmpty() ||
 	   sopdesField.getText().isBlank() || sopdesField.getText().isEmpty())
			return true;
		return false;
	}
	}
