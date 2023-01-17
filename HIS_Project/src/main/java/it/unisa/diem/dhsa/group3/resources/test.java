package it.unisa.diem.dhsa.group3.resources;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.SystemUtils;
import com.aspose.imaging.fileformats.dicom.DicomImage;
import com.aspose.imaging.imageoptions.DicomOptions;
import com.pixelmed.display.DicomImageViewer;

import it.unisa.diem.dhsa.group3.HIS_Project.App;
import it.unisa.diem.dhsa.group3.HIS_Project.Icon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
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
        //stage.show();
        DirectoryChooser directoryChooser = new DirectoryChooser();
        //File selectedDirectory = directoryChooser.showDialog(stage);
        //File[] files = selectedDirectory.listFiles();
        //File file = new FileChooser().showOpenDialog(stage);
        DiagnosticReportResource dr = null;
        //Abe604_Frami345_b8dd1798-beef-094d-1be4-f90ee0e6b7d51.2.840.99999999.26401232.758647660200.dcm
        //for (File file: files) {
        	System.out.println("coso");
        		//System.out.println(file.getName());
        		dr = new DiagnosticReportResource(null);
        		//System.out.println(file.getName());
        	//} 
        	//byte[] array = dr.getPixelDataAsByte();
        	//Image image = convertToFxImage(Arrays.copyOfRange(array, 0, array.length/256));
        	//ImageView imageView = new ImageView();
            //Setting image to the image view
        	
        	//DicomImage di = new DicomImage(new ByteArrayInputStream(array));
        	//System.out.println(new ByteArrayInputStream(array));
        	//di.save("src/main/resources/uno.dcm", new DicomOptions());
        	//String[] args = {"src/main/resources/uno.dcm",};
    		//DicomImageViewer.main(args);
        	/*while (image.getProgress()<1);
        	
        	System.out.println(image.getException());
            imageView.setImage(image);
            //Setting the image view parameters
            imageView.setX(10);
            imageView.setY(10);
            imageView.setFitWidth(256);
            imageView.setPreserveRatio(true);
            //Setting the Scene object
            Group root = new Group(imageView);
            Scene scene = new Scene(root, 256, 256);
            stage.setTitle("Displaying Image");
            stage.setScene(scene);
            stage.show();*/
        	//break;
        //}
        
        
        //System.exit(0);
        //System.out.println(selectedDirectory.getCanonicalPath());
    }
    
    private static Image convertToFxImage(byte[]data) throws IOException {
		/*InputStream bis = new ByteArrayInputStream(data);
		System.out.println(bis);
	    BufferedImage image = ImageIO.read(bis);
	    WritableImage wr = null;
	    if (image != null) {
	        wr = new WritableImage(image.getWidth(), image.getHeight());
	        PixelWriter pw = wr.getPixelWriter();
	        for (int x = 0; x < image.getWidth(); x++) {
	            for (int y = 0; y < image.getHeight(); y++) {
	                pw.setArgb(x, y, image.getRGB(x, y));
	            }
	        }
	    }else System.out.println("eh no");*/

	    return  new Image(new ByteArrayInputStream(data),256,256, true, false);
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