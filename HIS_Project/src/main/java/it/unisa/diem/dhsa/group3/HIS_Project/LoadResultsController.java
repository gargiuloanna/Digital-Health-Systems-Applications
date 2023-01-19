package it.unisa.diem.dhsa.group3.HIS_Project;


import org.hl7.fhir.r4.model.DiagnosticReport;

import ca.uhn.fhir.rest.client.exceptions.FhirClientConnectionException;

import java.io.File;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

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
    @FXML
    private ImageView progressBar;

    private File chosen = new File ("");
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progressBar.setVisible(false);
		
		ServiceRequestResource r = MRIController.selectedlist.get(0);
	
		
    	patientField.setText(r.getSubject_id());
    	requestField.setText(r.getId());
    	Date date = r.getDate();
    	datePicker.setValue(LocalDate.of(date.getYear()+1900, date.getMonth()+1, date.getDay()));
    	encounterField.setText(r.getEncounter_id());
    	detailsField.setText(r.getDetails());
    	
	}
	
	@FXML
	@Override
	void SwitchToOpeningPage(ActionEvent event) throws IOException {
		App.setRoot("MRI");
	}
	
	@FXML
    void confirmAction(ActionEvent event) {
		DiagnosticReportResource r = createDiagnosticReport();
    	try {
    		if(r != null) {
    			progressBar.setVisible(true);
	    		PDF.createPDF(PDF.getDataFieds(r));
	    		uploadDiagnosticReport((DiagnosticReport) r.createResource());
	    		progressBar.setVisible(false);
    		}
		} catch (IOException e) {
			Alert alert = new Alert(AlertType.ERROR, "Error in the creation of the PDF\n Please Retry.",ButtonType.OK);
			alert.showAndWait();
		} catch (FhirClientConnectionException e) {
			Alert alert = new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",
					ButtonType.OK);
			alert.showAndWait();
		}
    }

    @FXML
    void loadAction(ActionEvent event) {
    	FileChooser f = new FileChooser();
    	FileChooser.ExtensionFilter fileExtensions = new FileChooser.ExtensionFilter("DICOM Extension", "*.dcm");
    	f.getExtensionFilters().add(fileExtensions);
    	System.out.println(f.getSelectedExtensionFilter());
    	chosen = f.showOpenDialog(null);
    	
    }    
	
	private DiagnosticReportResource createDiagnosticReport() {
    	
    	if(emptyFields()) {
    		Alert alert = new Alert(AlertType.ERROR, "Fill the fields",ButtonType.OK);
			alert.showAndWait();			
			return null;
    	}
    	else {
    	//define report
    	DiagnosticReportResource r = new DiagnosticReportResource();
    	
    	//create imaging study
    	ImagingStudyResource i = new ImagingStudyResource(
    			Date.from(datePicker.getValue().atStartOfDay(ZoneId.of("Europe/Paris")).toInstant()), patientField.getText(), encounterField.getText(), 
    			bodycodeField.getText(), bodydesField.getText(), modcodeField.getText(), moddesField.getText(),
    			sopcodeField.getText(), sopdesField.getText());
    	
    	//set fields
    	r.setPatientId(patientField.getText());
    	r.setEncounter(encounterField.getText());
    	r.setServiceRequest(MRIController.selectedlist.get(0).getId()); 
    	r.setImagingStudy(i.getId());
    	r.setConclusion(conclusionField.getText());
    	
    	//set media if present
    	if(!chosen.toString().equals("")) {
    		r.setImage(chosen);
    		chosen = new File("");
    		System.out.println("chosen after assigning the image"+ chosen);
    	}
    	return r;
    	}
    	
    	

	}
	
	private void uploadDiagnosticReport(DiagnosticReport r){
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
