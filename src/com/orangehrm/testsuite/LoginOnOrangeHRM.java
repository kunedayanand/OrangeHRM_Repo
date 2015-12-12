package com.orangehrm.testsuite;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.FindBy;

public class LoginOnOrangeHRM {
	@FindBy(id="txtUsername")
	WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	public void loginPanel(String u,String p)
	{
		username.clear();
		Sleeper.sleepTightInSeconds(1);
		username.sendKeys(u);
		password.clear();
		Sleeper.sleepTightInSeconds(1);
		password.sendKeys(p);
		login.click();
	}
	

}
