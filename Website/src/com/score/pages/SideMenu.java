package com.score.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SideMenu 
{

	
	@FindBy(linkText="Individual Details")
	WebElement indvidual_details;
	
	@FindBy(linkText="Property")
	WebElement property;
	
	@FindBy(linkText="Qualification")
	WebElement qualification;

	@FindBy(linkText="Dependants")
	WebElement dependants;
	
	@FindBy(linkText="Identity")
	WebElement identity;
	
	@FindBy(linkText="Quick Customer")
	WebElement quick_customer;
	
	@FindBy(linkText="Regional Address")
	WebElement regional_address;
	
	@FindBy(linkText="Customer Other Bank")
	WebElement customer_otherbank;
	
	public void Click_Invidualdetails() 
	{
		indvidual_details.click();

	}
	
	public void Click_property() 
	{
		property.click();

	}
	
	public void Click_qualification() 
	{
		qualification.click();

	}
}
