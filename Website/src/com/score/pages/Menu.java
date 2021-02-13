package com.score.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Menu 

{
	
	@FindBy(linkText="Customer")
	WebElement customer;
	
	@FindBy(linkText="Share")
	WebElement share;
	
	@FindBy(linkText="Deposits")
	WebElement deposits;
	
	
	@FindBy(linkText="Loan")
	WebElement loan;
	
	@FindBy(linkText="Accounts")
	WebElement accounts;
	
	@FindBy(linkText="Schdule")
	WebElement schdule;
	
	@FindBy(linkText="Masters")
	WebElement masters;
	
	@FindBy(linkText="General")
	WebElement general;
	
	@FindBy(linkText="MIS")
	WebElement mis;

	@FindBy(linkText="Security")
	WebElement security;
	
	@FindBy(xpath="//button[@class='ui-button ui-corner-all ui-widget']")
	WebElement alertok;
	
	
	
	public void mousehover_customer(WebDriver driver)
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(customer).perform();
		
	}
	
	
	
	
	public void clickokalert()
	{
		
		alertok.click();
		
	}
	
	
	
	
	
	
	

}
