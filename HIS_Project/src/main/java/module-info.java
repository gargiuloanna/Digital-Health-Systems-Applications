module it.unisa.diem.dhsa.group3.HIS_Project {
    requires javafx.controls;
    requires javafx.fxml;
	requires hapi.fhir.base;
	requires java.desktop;
	requires org.hl7.fhir.r4;

    opens it.unisa.diem.dhsa.group3.HIS_Project to javafx.fxml;
    exports it.unisa.diem.dhsa.group3.HIS_Project;
}
