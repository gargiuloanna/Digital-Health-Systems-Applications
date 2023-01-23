package it.unisa.diem.dhsa.group3.HIS_Project;

import org.hl7.fhir.r4.model.DiagnosticReport;
import org.hl7.fhir.r4.model.ImagingStudy;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.ServiceRequest;

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
import javafx.scene.text.Text;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.FileChooser;

/**
 * Controller for the LoadResults interface.
 *
 */
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
    @FXML
    private Text fileLabel;
    
    private File chosen = new File ("");
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		progressBar.setVisible(false);
		
		ServiceRequestResource r = MRIController.selectedlist.get(0);
	
		
    	patientField.setText(r.getSubject_id());
    	requestField.setText(r.getId());
    	Date date = r.getDate();
    	datePicker.setValue(LocalDate.of(date.getYear()+1900, date.getMonth()+1, date.getDate()));
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
		if(emptyFields()) {
    		Alert alert = new Alert(AlertType.ERROR, "Fill the fields",ButtonType.OK);
			alert.showAndWait();			
		}else {
		uploadReport();
		}
    }

    @FXML
    void loadAction(ActionEvent event) {
    	FileChooser f = new FileChooser();
    	FileChooser.ExtensionFilter fileExtensions = new FileChooser.ExtensionFilter("DICOM Extension", "*.dcm");
    	f.getExtensionFilters().add(fileExtensions);
    	chosen = f.showOpenDialog(null);
    	if (chosen == null)
    			return;
    	try {
    		String path = "";
    		if (chosen.getCanonicalPath().length()>48) {
    			path= "..." + chosen.getCanonicalPath().substring(chosen.getCanonicalPath().length()-48);
        	}
    		fileLabel.setText(path);
    		startDicomViewer(chosen.getCanonicalPath());
    	} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    }   
    
    private static void startDicomViewer(String path) throws IOException, InterruptedException {
    	String[] cmd = {"java", "-jar", "src/main/resources/it/unisa/diem/dhsa/group3/HIS_Project/DicomView.jar", path};
		Process pr =  Runtime.getRuntime().exec(cmd);
		pr.waitFor();
    }
	
	private void uploadReport() {
    	//define report
    	DiagnosticReportResource r = new DiagnosticReportResource();
    	
    	//create imaging study
    	ImagingStudyResource i = new ImagingStudyResource(
    			Date.from(datePicker.getValue().atStartOfDay(ZoneId.of("Europe/Paris")).toInstant()), patientField.getText(), encounterField.getText(), 
    			bodycodeField.getText(), bodydesField.getText(), modcodeField.getText(), moddesField.getText(),
    			sopcodeField.getText(), sopdesField.getText());
    	
    	//upload imaging study on server
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
    	}
    	
    	upload(r, i);
    	}
    	

private void upload(DiagnosticReportResource r, ImagingStudyResource i) {
	ImagingStudy s = (ImagingStudy) i.createResource();
	//check id
	System.out.println("IMAGING RESOURCE ID      " +  i.getId() + " ASSEGNATO A DIAGNOSTIC REPORT");
	System.out.println("IMAGING STUDY IDENTIFIER " +  s.getIdentifierFirstRep().getValue());
	
	Service<String> upload = new Service<String>() {

		@Override
		protected Task<String> createTask() throws FhirClientConnectionException {
			
			return new Task<String>() {

				@Override
				protected String call() throws FhirClientConnectionException {
					return ServerInteraction.uploadResource(s.getIdentifierFirstRep().getValue(), s, true);

				};
			};
		}
	};

	upload.start();
	upload.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

		@Override
		public void handle(WorkerStateEvent event) {
			String id = upload.getValue();
			Alert alert = new Alert(AlertType.NONE, "Study with id:" +id +" updated correctly.",ButtonType.OK);
			alert.showAndWait();
			progressBar.setVisible(false);
	    	if(r != null) {
	    	progressBar.setVisible(true);
	    	uploadDiagnosticReport(r, s);
	    	}
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
	
	
	private void uploadDiagnosticReport(DiagnosticReportResource r, ImagingStudy i){
		DiagnosticReport s = (DiagnosticReport) r.createResource();
		System.out.println("DIAGNOSTIC IMAGING IDENTIFIER " +  s.getImagingStudyFirstRep().getIdentifier().getValue());
		Service<String> upload = new Service<String>() {

			@Override
			protected Task<String> createTask() throws FhirClientConnectionException {
				
				return new Task<String>() {

					@Override
					protected String call() throws FhirClientConnectionException {
						return ServerInteraction.uploadResource(s.getIdentifierFirstRep().getValue(), s, true);

					};
				};
			}
		};
	
		upload.start();
		upload.setOnSucceeded(new EventHandler<WorkerStateEvent>() {

			@Override
			public void handle(WorkerStateEvent event) {
				String id = upload.getValue();
				try {
					 
					 Patient p = (Patient)ServerInteraction.getResource(Patient.class, r.getPatientId());
					 ServiceRequest srr = (ServiceRequest) ServerInteraction.getResource(ServiceRequest.class, r.getServiceRequest());
					PDF.createPDF(PDF.getDataFieds(r, i, p, srr));
					Alert alert = new Alert(AlertType.NONE, "Report with id:" +id +" updated correctly.",ButtonType.OK);
					alert.showAndWait();
					progressBar.setVisible(false);
				} catch (FhirClientConnectionException e) {
					Alert alertConnection= new Alert(AlertType.ERROR, "Error in the connection to the server.\nPlease retry.",ButtonType.OK);
					alertConnection.showAndWait();
					progressBar.setVisible(false);
				} catch (IOException e) {
					e.printStackTrace();
					Alert alertPDF= new Alert(AlertType.ERROR, "Error in the creation of the PDF.\nPlease retry.",ButtonType.OK);
					alertPDF.showAndWait();
					progressBar.setVisible(false);
				}
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
