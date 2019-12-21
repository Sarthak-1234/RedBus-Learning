package TestCase;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import IniateUrl.Initate;

@Listeners(Listners.listnr.class)
public class RedBusTestCase extends Initate {
	
	@Test
	public void searchRedBus() throws InterruptedException, IOException{
		
//		obj.insertFrom();
//		Thread.sleep(3000);
//		obj.selectFrom();
		
//		Assert.assertEquals("", expected, actual);
//		Assert.assertTrue(apki condition true honi chahiye);
//		Assert.assertFalse(aapki condition false honi chahiye);
		
		//Assert.assertTrue(driver.findElement(By.xpath("")).getText().contains("Kashimiri Gate"));
		//Assert.assertTrue(obj.bctFrom());
		
		//Assert.assertEquals("title is not matching", "Redbus title", obj.homeTitle());
		
		try {
		Assert.assertTrue(true);
		} catch(Exception e) {
			//screenshot
		}
		

	}

}
