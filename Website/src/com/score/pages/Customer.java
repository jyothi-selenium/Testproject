package com.score.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Customer

{
@FindBy(linkText="Individual")
WebElement indvidual;
	
@FindBy(linkText="Corporate")
WebElement corporate;
	

@FindBy(linkText="Change Address")
WebElement changeadress;
	

@FindBy(linkText="Closing")
WebElement closing;
	
@FindBy(linkText="Reports")
WebElement reports;
	

	public void Click_Invidual() 
	{
		indvidual.click();

	}
	
	public void Click_corporate() 
	{
		corporate.click();

	}
	
	public void Click_changeaddress() 
	{
		changeadress.click();

	}
	
	public void Click_closing() 
	{
		
		closing.click();
	}
	
	public void Click_Reports() 
	{
		reports.click();
		

	}

}
