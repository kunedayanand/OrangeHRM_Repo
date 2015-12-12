package com.orangehrm.extentreports_program;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport {
	@Test
	public void reportOnExtent() throws IOException
	{
		ExtentReports report=new ExtentReports("C:\\Users\\alok\\Downloads\\OrangeHRM_July16Batch-master\\OrangeHRM_July16Batch-master\\src\\com\\orangehrm\\reports\\samplereport.html",true);
		ExtentTest test=report.startTest("Sample test");
		FirefoxDriver driver=new FirefoxDriver();
		test.log(LogStatus.INFO, "Launched the browser");
		driver.get("http://google.co.in");
		test.log(LogStatus.INFO, "Navigated  to url");
		driver.manage().window().maximize();
		test.log(LogStatus.INFO, "Maximized the browser");
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\alok\\Downloads\\OrangeHRM_July16Batch-master\\OrangeHRM_July16Batch-master\\src\\com\\orangehrm\\screenshots\\Google.png"));
		Sleeper.sleepTightInSeconds(4);
		test.addScreenCapture("C:\\Users\\alok\\Downloads\\OrangeHRM_July16Batch-master\\OrangeHRM_July16Batch-master\\src\\com\\orangehrm\\screenshots\\Google.png");
		report.endTest(test);
		report.flush();
	}

}
