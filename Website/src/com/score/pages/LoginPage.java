package com.score.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	
	@FindBy(id="txtUserName")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnScoreLogin")
	WebElement Login;
	
	public void Login(String uname,String paswd)
	{
		username.sendKeys(uname);
		password.sendKeys(paswd);
		Login.click();
		
		
			
	}
	

}
