package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;

import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Identifier;
import org.hl7.fhir.r4.model.Patient;
import org.hl7.fhir.r4.model.Resource;
import org.hl7.fhir.r4.model.codesystems.V3MaritalStatus;

import it.unisa.diem.dhsa.group3.CSV.ReadCSV;
import it.unisa.diem.dhsa.group3.enumerations.PIdentifier;
import it.unisa.diem.dhsa.group3.resources.PatientResource;

import org.hl7.fhir.r4.model.Address;
import org.hl7.fhir.r4.model.CodeableConcept;
import org.hl7.fhir.r4.model.DecimalType;
import org.hl7.fhir.r4.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.r4.model.Extension;

import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.scene.control.TabPane;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;

public class PatientAdmissionController implements Initializable {

	@FXML
	private TextField LONField;

	@FXML
	private TextField LastNameField;

	@FXML
	private MenuButton RacePicker;

	@FXML
	private DatePicker BirthDatePicker;

	@FXML
	private TextField LATField;

	@FXML
	private TextField PrefixField;

	@FXML
	private DatePicker DeathDatePicker;

	@FXML
	private TextField CountyField;

	@FXML
	private TextField StateField;

	@FXML
	private TextField CoverageField;

	@FXML
	private TextField DriversField;

	@FXML
	private TextField MaidenField;

	@FXML
	private TextField ZIPField;

	@FXML
	private Button SubmitButton;

	@FXML
	private Button LoadPatient;

	@FXML
	private TextField SSNField;

	@FXML
	private TextField AddressField;

	@FXML
	private TextField IDField;

	@FXML
	private TextField FirstNameField;

	@FXML
	private TextField BirthPlaceField;

	@FXML
	private RadioButton MgenderButton;

	@FXML
	private RadioButton FgenderButton;

	@FXML
	private TextField searchPatientField;

	@FXML
	private RadioButton NOgenderButton;

	@FXML
	private TextField CityField;

	@FXML
	private TextField ExpensesField;

	@FXML
	private TextField SuffixField;

	@FXML
	private MenuButton EthnicityField;

	@FXML
	private TextField PassportField;

	@FXML
	private TabPane TabPane;

	@FXML
	private Label patientID;

	@FXML
	private MenuButton MaritalMenuButton;

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		// setting up the switching of the buttons
		MgenderButton.selectedProperty().addListener((p, o, n) -> {
			if (n == true) {
				FgenderButton.setSelected(false);
				NOgenderButton.setSelected(false);
			}
		});

		FgenderButton.selectedProperty().addListener((p, o, n) -> {
			if (n == true) {
				MgenderButton.setSelected(false);
				NOgenderButton.setSelected(false);
			}
		});

		NOgenderButton.selectedProperty().addListener((p, o, n) -> {
			if (n == true) {
				FgenderButton.setSelected(false);
				MgenderButton.setSelected(false);
			}
		});

		NOgenderButton.setSelected(true); // select one

		disableFields(); // disable fields that must not be accessible at the opening

		// binding of the button with the fields that should enable it
		SubmitButton.disableProperty().bind(Bindings.isEmpty(searchPatientField.textProperty())
				.and(Bindings.isEmpty(FirstNameField.textProperty())));

	}

	@FXML
	void backPressed(ActionEvent event) throws IOException {
		App.setRoot("OpeningPage");
	}

	@FXML
	void searchCode(ActionEvent event) {
		enableFields();
	}

	@FXML
	void submitPressed(ActionEvent event) throws IOException {
		if (TabPane.isDisabled())
			searchCode(event);

	}

	@FXML
	void LoadPatientPressed(ActionEvent event) {

		FileChooser chooser = new FileChooser();
		File filename = chooser.showOpenDialog(null);
		if (filename != null) {
			// System.out.println(filename);
			try {
				Map<String, Resource> patients = ReadCSV.readCSV(PatientResource.class, filename.getCanonicalPath());
				fillFields((Patient) patients.get("6fc3e360-ae68-c411-e091-4734df51eb18"));
				// .get("ce9bd436-6b59-0452-86a4-61f3642736bc"));
				// .get("8b0484cd-3dbd-8b8d-1b72-a32f74a5a846"));
				// TODO remove selecting patient

			} catch (IOException e) { // TODO Dovrebbe generare l'eccezione sugetCanonicalPath quando non viene
				// scelto nulla - ma sarebbe null efacciamo già l'if //e.printStackTrace(); }
			}

		}

	}

	@FXML
	void maritalSelected(ActionEvent event) {
		MenuItem e = (MenuItem) event.getSource();
		MaritalMenuButton.setText(e.getText());
		String maritalCode = maritalCode(e.getText());
		System.out.println(maritalCode); // TODO remove
	}

	private String maritalCode(String maritalText) {
		switch (maritalText) {
		case "Marriage contract has been declared null and to not have existed":
			return "A";
		case "Marriage contract has been declared dissolved and inactive":
			return "D";
		case "Subject to an Interlocutory Decree.":
			return "I";
		case "Legally Separated":
			return "L";
		case "A current marriage contract is active":
			return "M";
		case "More than 1 current spouse":
			return "P";
		case "No marriage contract has ever been entered":
			return "S";
		case "Person declares that a domestic partner relationship exists.":
			return "T";
		case "Currently not in a marriage contract.":
			return "U";
		case "The spouse has died":
			return "W";
		default:
			return "?";
		}
	}

	@FXML
	void raceSelected(ActionEvent event) {
		MenuItem e = (MenuItem) event.getSource();
		RacePicker.setText(e.getText());
		String raceCode = e.getText().split(" ")[0].toLowerCase();
		// System.out.println(raceCode); //TODO remove
	}

	@FXML
	void ethnicitySelected(ActionEvent event) {
		MenuItem e = (MenuItem) event.getSource();
		EthnicityField.setText(e.getText());

		String ethnicityCode;
		if (e.getText().equals("Hispanic or Latino"))
			ethnicityCode = "hispanic";
		else
			ethnicityCode = "nonhispanic";
		// System.out.println(ethnicityCode); //TODO remove
	}

	private void enableFields() {
		TabPane.setDisable(false);
		IDField.setDisable(false);
		patientID.setDisable(false);
		searchPatientField.clear();
		searchPatientField.setDisable(true);
	}

	private void disableFields() {
		searchPatientField.clear();
		TabPane.setDisable(true);
		IDField.setDisable(true);
		patientID.setDisable(true);
	}

	private void fillFields(Patient patient) {

		// add id
		IDField.setText(patient.getId()); // TODO now it is empty because it is not on the server

		int index = 0;
		// it insert the first name in the field of the name
		for (HumanName humanName : patient.getName()) {
			if (humanName.getUse().equals(HumanName.NameUse.OFFICIAL)) {
				index = humanName.getGiven().size() - 1;
				FirstNameField.setText(humanName.getGiven().get(index).toString());
				// it insert the last name in the field of the names
				LastNameField.setText(humanName.getFamily());
				// it insert the prefix in the corresponding field
				index = humanName.getPrefix().size() - 1;
				PrefixField.setText(humanName.getPrefix().get(index).asStringValue().toString());
				// it insert the first name in the corresponding field
				index = humanName.getSuffix().size() - 1;
				SuffixField.setText(humanName.getSuffix().get(index).asStringValue());
			}
			if (humanName.getUse().equals(HumanName.NameUse.MAIDEN)) {
				// it insert the last name in the field of the names
				MaidenField.setText(humanName.getFamily());
				MaidenField.setDisable(true); // only one maiden name for person
			}
		}

		// it insert the first name in the corresponding field
		Date date = patient.getBirthDate();
		// selecting birth and death date
		if (date != null) {
			BirthDatePicker.setValue(LocalDate.parse(date.toString())); // other methods are deprecated or don't work
			BirthDatePicker.setDisable(true);
		}
		if (patient.hasDeceasedDateTimeType()) {
			date = patient.getDeceasedDateTimeType().getValue();
			DeathDatePicker.setValue(LocalDate.parse(date.toString())); // other methods are deprecated or don't work
			DeathDatePicker.setDisable(true);
		} // else System.out.println("he is not dead");

		// set gender
		if (patient.getGender().equals(AdministrativeGender.FEMALE))
			FgenderButton.setSelected(true);
		else if (patient.getGender().equals(AdministrativeGender.MALE))
			MgenderButton.setSelected(true);
		else
			NOgenderButton.setSelected(true); // this is when it is null, other or unknown

		String url = "http://hl7.org/fhir/StructureDefinition/patient-birthPlace";
		// set birth place
		if (patient.getExtensionByUrl(url) != null) {
			Address ad = (Address) patient.getExtensionByUrl(url).getValue();
			BirthPlaceField.setText(ad.getText());
			BirthPlaceField.setDisable(true);
		}

		// get race
		url = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-race";

		if (patient.getExtensionByUrl(url) != null) {
			CodeableConcept code = (CodeableConcept) patient.getExtensionByUrl(url)
					.getExtensionByUrl("http://hl7.org/fhir/us/core/ValueSet/omb-race-category").getValue();
			RacePicker.setText(code.getCodingFirstRep().getDisplay());
			RacePicker.setDisable(true);
		}

		// get ethnicity
		url = "http://hl7.org/fhir/us/core/StructureDefinition/us-core-ethnicity";
		if (patient.getExtensionByUrl(url) != null) {
			CodeableConcept code = (CodeableConcept) patient.getExtensionByUrl(url)
					.getExtensionByUrl("http://hl7.org/fhir/us/core/ValueSet/omb-ethnicity-category").getValue();
			EthnicityField.setText(code.getCodingFirstRep().getDisplay());
			EthnicityField.setDisable(true);
		}

		// identifiers
		for (Identifier identifier : patient.getIdentifier()) {
			if (!identifier.getType().getCoding().isEmpty()) // it happens - the first is empty
				if (identifier.getType().getCoding().get(0).getCode().equals(PIdentifier.SS.toCode())) {
					SSNField.setText(identifier.getValue());
				} else if (identifier.getType().getCoding().get(0).getCode().equals(PIdentifier.DL.toCode())) {
					DriversField.setText(identifier.getValue());
				} else if (identifier.getType().getCoding().get(0).getCode().equals(PIdentifier.PPN.toCode())) {
					PassportField.setText(identifier.getValue());
				}
		}

		// marital
		MaritalMenuButton.setText(
				V3MaritalStatus.fromCode(patient.getMaritalStatus().getCodingFirstRep().getCode()).getDefinition());

		// address
		index = patient.getAddress().size() - 1;
		CityField.setText(patient.getAddress().get(index).getCity());
		CountyField.setText(patient.getAddress().get(index).getDistrict());
		ZIPField.setText(patient.getAddress().get(index).getPostalCode());
		StateField.setText(patient.getAddress().get(index).getState());
		AddressField.setText(patient.getAddress().get(index).getLine().get(0).toString());

		// get lat and lon
		url = "http://hl7.org/fhir/StructureDefinition/geolocation";
		if (patient.getExtensionByUrl(url) != null) {
			DecimalType dec = (DecimalType) patient.getExtensionByUrl(url).getExtensionByUrl("latitude").getValue();
			LATField.setText(dec.asStringValue());
			dec = (DecimalType) patient.getExtensionByUrl(url).getExtensionByUrl("longitude").getValue();
			LONField.setText(dec.asStringValue());
		}

	}

}
