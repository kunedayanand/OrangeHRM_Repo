package com.orangehrm.testsuite;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class Screenshot {
	public void getScreenShot(WebDriver driver,String filename) throws IOException
	{
		File srcfFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfFile, new File("C:\\Users\\alok\\Downloads\\OrangeHRM_July16Batch-master\\OrangeHRM_July16Batch-master\\src\\com\\orangehrm\\screenshots\\"+filename+".png"));
		Sleeper.sleepTightInSeconds(4);
	}

}
