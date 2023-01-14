package it.unisa.diem.dhsa.group3.resources;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.SystemUtils;

import it.unisa.diem.dhsa.group3.HIS_Project.App;
import it.unisa.diem.dhsa.group3.HIS_Project.Icon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class test extends Application {

    private static Scene scene;
    private Icon icon;
   
    public test() {
    	super();
    	icon = new Icon();
    	
    }
    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("OpeningPage"), 1000, 650);
        if (SystemUtils.IS_OS_MAC) {
        	icon.macIntegration(stage);
        }
        icon.addIcons(stage);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Health Information System");
        stage.show();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        File selectedDirectory = directoryChooser.showDialog(stage);
        File[] files = selectedDirectory.listFiles();
        DiagnosticReportResource dr = null;
        //Abe604_Frami345_b8dd1798-beef-094d-1be4-f90ee0e6b7d51.2.840.99999999.26401232.758647660200.dcm
        for (File file: files) {
        	dr = new DiagnosticReportResource(file);
        }
        //System.out.println(selectedDirectory.getCanonicalPath());
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
    	
        launch();
    }

}
