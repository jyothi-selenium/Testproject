package com.score.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.score.pages.LoginPage;

import Utility.ConfigReader;

public class BaseClass 

{  
	WebDriver driver;
	
	 @BeforeClass
	public void invokebrowser() throws Throwable
	{
		
		
		ConfigReader config = new ConfigReader();
		System.setProperty("webdriver.chrome.driver",config.getchromepath());
		LoginPage login=PageFactory.initElements(driver, LoginPage.class);
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get(config.getURL());
		
		
			
	}
	 
	 
	/* @AfterMethod
	 public void CloseBrowser()
	 {
		 
		 driver.quit();
		 
		 
		 
	 }*/

}
