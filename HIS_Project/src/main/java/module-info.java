module it.unisa.diem.dhsa.group3.HIS_Project {
    requires javafx.controls;
    requires javafx.fxml;
	requires hapi.fhir.base;
	requires java.desktop;
	requires transitive org.hl7.fhir.r4;
	requires javafx.base;
	requires org.hl7.fhir.utilities;
	requires com.opencsv;
	requires transitive java.sql;

    opens it.unisa.diem.dhsa.group3.HIS_Project to javafx.fxml;
    exports it.unisa.diem.dhsa.group3.HIS_Project;
}
