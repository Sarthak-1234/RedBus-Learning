package Generic;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import IniateUrl.Initate;
import manager.PropertyFilesReader;

public class Utils {
	
	
	
	public static void launchURL() throws IOException {

		if(PropertyFilesReader.getValue("environment").equalsIgnoreCase("prod")) {
		Initate.driver.get("https://redbus.in");
		} else if(PropertyFilesReader.getValue("environment").equalsIgnoreCase("qa")) {
			System.out.println("I want to launch in qa but url is not there");
		} else if(PropertyFilesReader.getValue("environment").equalsIgnoreCase("dev")) {
			System.out.println("I want to launch in dev but url is not there");
		}
	}
	
//	public static void explictFunction(WebElement ele) {
//		wait = new WebDriverWait(Initate.driver, 30);
//		wait.until(ExpectedConditions.alertIsPresent());
//	}

}
