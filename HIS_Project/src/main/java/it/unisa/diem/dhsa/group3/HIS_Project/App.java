package it.unisa.diem.dhsa.group3.HIS_Project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import org.apache.commons.lang3.SystemUtils;

import it.unisa.diem.dhsa.group3.state.Context;

/**
 * JavaFX Application
 */
public class App extends Application {

    private static Scene scene;
    private Icon icon;
   
    /**
     * Public Constructor
     */
    public App() {
    	super();
    	icon = new Icon();
    	
    }
    
    /**
     * Starts the application
     */
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
    }

    /**
     * Sets the root of the application
     * @param fxml
     * @throws IOException
     */
    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    /**
     * Loads the FXML file associated to the application
     * @param fxml
     * @return
     * @throws IOException
     */
    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    /**
     * Takes the context and launch application
     * @param args
     */
    public static void main(String[] args) {
    	Context.getContext();
    	Context.getContext().newRestfulGenericClient(Context.server);
        launch();
    }

}