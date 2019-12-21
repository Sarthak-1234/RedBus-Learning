package IniateUrl;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import Generic.Utils;
import PageObject.RedBusPageObject;
import manager.PropertyFilesReader;

public class Initate {
	
	public static WebDriver driver; //instance
	public RedBusPageObject obj;
	
	
	@BeforeClass
	public void initiateStuff() throws IOException{
		driver = WebDriverLaunch.launchDriver();
		//System.out.println("Launching url");
		Utils.launchURL();

		obj = new RedBusPageObject(driver);
	}
	
	

}
