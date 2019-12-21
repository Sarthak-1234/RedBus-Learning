package manager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFilesReader {
	
	public static FileInputStream fis;
	public static Properties prop;
	
	
	public static String getValue(String value) throws IOException {
		//System.out.println("I am in property file reader");
		fis = new FileInputStream("C:\\Users\\Sarthak Chadha\\Desktop\\wetransfer-912f79\\RedBus\\src\\test\\resources\\propertyfiles\\config.properties");
		prop = new Properties();
		prop.load(fis);
		return prop.getProperty(value);
	}

}
