module it.unisa.diem.dhsa.group3.HIS_Project {
    requires javafx.controls;
    requires javafx.fxml;

    opens it.unisa.diem.dhsa.group3.HIS_Project to javafx.fxml;
    exports it.unisa.diem.dhsa.group3.HIS_Project;
}
