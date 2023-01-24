package it.unisa.diem.dhsa.group3.HIS_Project;

import java.awt.Taskbar;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * 
 * This class allow to assign a Icon to the application
 *
 */
public final class Icon {

	private Image icon, icon16, icon32, icon48, icon64, icon96, icon100;
	private BufferedImage image;

	/**
	 * Public Constructor
	 */
	public Icon() {
		icon = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-100.png"));
		icon16 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-16.png"));
		icon32 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-32.png"));
		icon48 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-48.png"));
		icon64 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-64.png"));
		icon96 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-96.png"));
		icon100 = new Image(this.getClass().getResourceAsStream("icons/icons8-medical-doctor-100.png"));
		
		try {
			image = ImageIO.read(getClass().getResource("icons/icons8-medical-doctor-100.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Manages the IOS MAC integration to display the Icon
	 * @param stage
	 */
	public void macIntegration(Stage stage) {
		Taskbar taskbar = Taskbar.getTaskbar();
		taskbar.setIconImage(image);

	}
	
	/**
	 * Adds the icon to the application
	 * @param stage
	 */
	public void addIcons(Stage stage) {
		stage.getIcons().add(icon);
		stage.getIcons().add(icon16);
		stage.getIcons().add(icon32);
		stage.getIcons().add(icon48);
		stage.getIcons().add(icon64);
		stage.getIcons().add(icon96);
		stage.getIcons().add(icon100);
	}
}
