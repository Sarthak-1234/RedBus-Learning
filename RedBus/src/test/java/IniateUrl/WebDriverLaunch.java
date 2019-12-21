package IniateUrl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import manager.PropertyFilesReader;

public class WebDriverLaunch {
	
	public static WebDriver driver;
	
	public static WebDriver launchDriver() throws IOException {
		
		//if
		
		
//		System.out.println(PropertyFilesReader.getValue("browser"));
//		System.out.println(PropertyFilesReader.getValue("environment"));
		
		
		
		if(PropertyFilesReader.getValue("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver_windows.exe");
			ChromeOptions opt = new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);	//actual object
			driver.manage().window().maximize();
			System.out.println("Succuessfully launched drier");
			} else if(PropertyFilesReader.getValue("browser").equalsIgnoreCase("ff")) {
				System.out.println("I am launcing ff but it is not initialized");
			} else if(PropertyFilesReader.getValue("browser").equalsIgnoreCase("ie")) {
				System.out.println("I am launcing ie but it is not initialized");
			}
		return driver;
	}

}
