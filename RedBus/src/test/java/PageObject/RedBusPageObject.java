package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusPageObject {
	
public WebDriver driver;
public RedBusPageObject(WebDriver driver1)
	{
		
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}
	
//CSS Formula 1: If u are using classname
////tagname.classname
////=======>iframe[class='demo-frame']
//
//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
//
//
//
////CSS Formula 1: If u are using id
////tagname#id
////input#age
////------------>input[id='age']
//driver.findElement(By.cssSelector("input#age")).sendKeys("sarthak");
//driver.findElement(By.xpath("//input[@id='src']")).sendKeys("delhi");
//	@FindBy(xpath = "//input[@id='src']");
	
	@FindBy(css = "input#src")
	WebElement inputFrm;
	
	@FindBy(xpath = "//ul[@class = 'autoFill']//li")
	List<WebElement> destlist;
	
	
	
	
	
	public void insertFrom(){
		inputFrm.sendKeys("Del");
	}
	
	public void selectFrom(){
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//ul[@class = 'autoFill']//li")));
		for(int i =0;i<destlist.size();i++)
		{
			//String destval = destlist.get(i).getText();
			//System.out.println(destval);
			if(destlist.get(i).getText().contains("Kashmiri Gate"))
			{
			destlist.get(i).click();
			break;					
			}
			
		
		}	
	}

	public boolean bctFrom() {
//		boolean b = driver.findElement(By.xpath("")).getText().contains("Kashimiri Gate");
//		return b;
		
		return driver.findElement(By.xpath("")).getText().contains("Kashimiri Gate");
	}

	public String tryFunction() {
		//driver.findElement(By.xpath("")).getText();
		
		//return driver.findElement(By.xpath("")).getText();
		return "abc";
	}

	public String homeTitle() {
		return driver.getTitle();
	}

}
