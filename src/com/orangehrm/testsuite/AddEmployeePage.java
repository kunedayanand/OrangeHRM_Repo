package com.orangehrm.testsuite;

import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage {
	Menu menu=null;
	public AddEmployeePage(WebDriver driver)
	{
		menu=PageFactory.initElements(driver,Menu.class);
	}
	@FindBy(linkText="Add Employee")
	WebElement addEmployee;
	@FindBy(id="firstName")
	WebElement firstName;
	@FindBy(id="middleName")
	WebElement middleName;
	@FindBy(id="lastName")
	WebElement lastName;
	@FindBy(id="employeeId")
	WebElement employeeId;
	@FindBy(id="chkLogin")
	WebElement chkLogin;
	@FindBy(id="user_name")
	WebElement user_name;
	@FindBy(id="user_password")
	WebElement user_password;
	@FindBy(id="re_password")
	WebElement re_password;
	@FindBy(id="status")
	WebElement status;
	@FindBy(id="btnSave")
	WebElement btnSave;
	public void empRegistration(Row r)
	{
		firstName.clear();
		firstName.sendKeys(r.getCell(0).getStringCellValue());
		middleName.clear();
		middleName.sendKeys(r.getCell(1).getStringCellValue());
		lastName.clear();
		lastName.sendKeys(r.getCell(2).getStringCellValue());
		employeeId.sendKeys(r.getCell(3).getStringCellValue());
		if(r.getCell(4).getStringCellValue().equals("Y"))
		{
			if(!chkLogin.isSelected())
			{
				chkLogin.click();
			}
			user_name.clear();
			user_name.sendKeys(r.getCell(5).getStringCellValue());
			user_password.clear();
			user_password.sendKeys(r.getCell(6).getStringCellValue());
			re_password.clear();
			re_password.sendKeys(r.getCell(7).getStringCellValue());
			status.sendKeys(r.getCell(8).getStringCellValue());
			
		}
		else
		{
			if(chkLogin.isSelected())
			{
				chkLogin.click();
			}
		}
		btnSave.click();
	
	}
	

}
