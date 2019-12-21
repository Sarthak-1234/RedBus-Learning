package Listners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import IniateUrl.Initate;

//Interface - contract - implements keyword
//Inhertiance -- parent ki property child ke pass - extends keyworkd


public class listnr implements ITestListener{
	
	public void captureScreenshot() throws IOException {
		System.out.println("I am in capture screeshot function");
		TakesScreenshot takescreenshotobject= ((TakesScreenshot) Initate.driver);
		File src = takescreenshotobject.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Sarthak Chadha\\Desktop\\history\\bcd.jpg");
		FileUtils.copyFile(src, dest);
		
		//(double) int
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("TestCase passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("TestCase failed");
		try {
			captureScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("TestCase skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("TestCase started");
	}

}
