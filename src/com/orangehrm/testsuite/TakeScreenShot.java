package com.orangehrm.testsuite;

import java.io.IOException;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TakeScreenShot extends Constants{
	@Test
	public void screenShotTest() throws IOException
	{
		String runMode=eo.getCellData(dataenginepath, 0, 3, 2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Screenshot test case skipped");
		}
		else
		{
			screen.getScreenShot(driver, "Addemp_page");
		}
	}

}

