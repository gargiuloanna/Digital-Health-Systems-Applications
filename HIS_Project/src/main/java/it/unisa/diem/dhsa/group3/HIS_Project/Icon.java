package it.unisa.diem.dhsa.group3.HIS_Project;

import java.awt.Taskbar;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.SystemUtils;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public final class Icon {

	private static Image icon, icon16, icon32, icon64, icon120, icon128, icon256, icon512;

	public Icon() {
		icon512 = new Image(this.getClass().getResourceAsStream("images/icons8-medical-doctor-96.png"));
	}

	public void setIcons(Stage stage) {
		// <a target="_blank"
		// href="https://icons8.com/icon/OESdlMYQIKWs/medical-doctor">Medical Doctor</a>
		// icon by <a target="_blank" href="https://icons8.com">Icons8</a>
		stage.getIcons().add(icon512);
		
		

		Taskbar taskbar=Taskbar.getTaskbar();
		BufferedImage image;
		if (SystemUtils.IS_OS_MAC)	
			try {
				image = ImageIO.read(getClass().getResource("images/icons8-medical-doctor-96.png"));
				taskbar.setIconImage(image);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		/*
		try {
			Class util;
			Object application;
			if (exists("com.apple.eawt.Application")) {
				util = Class.forName("com.apple.eawt.Application");
				System.out.println("sono qui");
				Method getApplication = util.getMethod("getApplication");
				System.out.println("sono qui");
				application = getApplication.invoke(util);
				System.out.println("sono qui");
				Class params[] = new Class[1];
				System.out.println("sono qui");
				params[0] = Image.class;
				System.out.println("sono qui");
				Method setDockIconImage = util.getMethod("setDockIconImage", params);
				URL url = App.class.getClassLoader().getResource("icons/icon120.png");
				System.out.println("sono qui");
				setDockIconImage.invoke(application, icon);
			}
			System.out.println("non sono qui");
		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			System.out.println("NoSuchMethodException");
		} catch (InvocationTargetException e) {
			System.out.println("InvocationTargetException");
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */

	}
	
	public boolean exists(String className)
	{
	    try {
	        Class.forName( className, false, null );
	        return true;
	    }
	    catch (ClassNotFoundException exception) {
	        return false;
	    }
	}
}
