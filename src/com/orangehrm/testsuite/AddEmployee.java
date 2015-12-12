package com.orangehrm.testsuite;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class AddEmployee  extends Constants{
	
	@Test
	public void addEmployeeTest() throws IOException, InterruptedException
	{
		
		String runMode=eo.getCellData(dataenginepath,0,2,2);
		if(runMode.equals("N"))
		{
			throw new SkipException("Add Emp test case skipped");
		}
		else
		{
			AddEmployeePage addemp=PageFactory.initElements(driver,AddEmployeePage.class);
		
			int rowCount=eo.getRowCount(emplistpath,0);
			for(int i=1;i<=rowCount;i++)
			{
				addemp.menu.pim();
				Thread.sleep(6000);
				addemp.addEmployee.click();
				Thread.sleep(6000);
				Row r=eo.getRow(emplistpath,0,i);
				addemp.empRegistration(r);
			}
		}
	}

}
