module it.unisa.diem.dhsa.group3.HIS_Project {
    requires transitive javafx.controls;
    requires javafx.fxml;
	requires hapi.fhir.base;
	requires transitive org.hl7.fhir.r4;
	requires javafx.base;
	requires org.hl7.fhir.utilities;
	requires com.opencsv;
	requires transitive java.sql;
	requires javafx.graphics;
	requires org.apache.commons.lang3;
	requires transitive java.desktop;
	requires pdfbox.app;
	

    opens it.unisa.diem.dhsa.group3.HIS_Project to javafx.fxml;
    exports it.unisa.diem.dhsa.group3.HIS_Project;
    exports it.unisa.diem.dhsa.group3.resources;
}
