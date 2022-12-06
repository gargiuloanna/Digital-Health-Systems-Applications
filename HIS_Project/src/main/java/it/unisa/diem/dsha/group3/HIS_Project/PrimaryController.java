package it.unisa.diem.dsha.group3.HIS_Project;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
        System.out.println("Hai pullato. Congratulazioni!!!!!")
    }
}
