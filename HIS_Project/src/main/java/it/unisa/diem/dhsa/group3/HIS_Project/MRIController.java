package it.unisa.diem.dhsa.group3.HIS_Project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class MRIController extends BasicController{

    @FXML
    private Button LoadButton;
    
    @FXML
    private Button FilterButton;

    @FXML
    private ListView<?> ViewOrders;

    @FXML
    private Button ViewReportButton;

    @FXML
    private ListView<?> ViewSelectedOrder;

    @FXML
    private DatePicker dateField;

    @FXML
    private TextField filterField;

    @FXML
    private Button searchButton;

    @FXML
    private TextField searchField;

    
    @FXML
    void loadPressed(ActionEvent event) {

    }

    @FXML
    void searchPressed(ActionEvent event) {

    }

    @FXML
    void viewPressed(ActionEvent event) {

    }
    
    @FXML
    void FilterPressed(ActionEvent event) {

    }

	

}
