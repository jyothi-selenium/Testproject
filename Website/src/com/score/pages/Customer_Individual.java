package com.score.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Utility.Calendar;

public class Customer_Individual 
{
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlCustomerType")
	WebElement customertype;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnSave")
	WebElement Add;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnEdit")
	WebElement View;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnqcView")
	WebElement qcview;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnNominee")
	WebElement nominee;
	
	@FindBy(name="ctl00$ContentPlaceHolder1$btnCancel")
	WebElement close;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlCusTitle")
	WebElement customer_title;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusName")
	WebElement customername;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlCusParentTitle")
	WebElement i_guardiantitile;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusParentName")
	WebElement i_guardian;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlRelation")
	WebElement i_relationshipwith_guardian;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusPerAddress1")
	WebElement i_address1;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusPerAddress2")
	WebElement i_address2;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusPerAddress3")
	WebElement i_adress3;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusPhone1")
	WebElement i_phone1;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusPhone2")
	WebElement i_phone2;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusMobile")
	WebElement i_mobile;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusFax")
	WebElement i_fax;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_ddlClassification")
	WebElement i_classification;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtCusRemarks")
	WebElement i_remarks;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_TabContainerCustomer_TabPersonal_Img3")
	WebElement Dob;
	
	
	public void Enter_details(String custtype,String cutomertitile,String custname,String guardiantitile,String guardianname,String relationshipwithguardian,String addres1,String addres2,String address3,String phone1,String phone2,String mobile,String Fax,String classfication,String remarks) throws Throwable 
	{
		Add.click();
		Thread.sleep(3000);
		Select customertyp = new Select(customertype);
		Thread.sleep(4000);
		customertyp.selectByVisibleText(custtype);
		Thread.sleep(3000);
		Select honor= new Select(customer_title);
		Thread.sleep(3000);
		honor.selectByVisibleText(cutomertitile);
		Thread.sleep(3000);
		customername.sendKeys(custname);
		Thread.sleep(3000);
		Select guardiantitle = new Select(i_guardiantitile);
		Thread.sleep(3000);
		guardiantitle.selectByVisibleText(guardiantitile);
		Thread.sleep(3000);
		i_guardian.sendKeys(guardianname);
		Thread.sleep(3000);
		Select i_relationshipwithguardian = new Select(i_relationshipwith_guardian);
		Thread.sleep(3000);
		i_relationshipwithguardian.selectByVisibleText(relationshipwithguardian);
		Thread.sleep(3000);
		i_address1.sendKeys(addres1);
		Thread.sleep(3000);
		i_address2.sendKeys(addres2);
		Thread.sleep(3000);
		i_adress3.sendKeys(address3);
		Thread.sleep(3000);
		i_phone1.sendKeys(phone1);
		Thread.sleep(3000);
		i_phone2.sendKeys(phone2);
		Thread.sleep(3000);
		i_mobile.sendKeys(mobile);
		Thread.sleep(3000);
		i_fax.sendKeys(Fax);
		Thread.sleep(3000);
		Select classificatn = new Select(i_classification);
		Thread.sleep(3000);
		classificatn.selectByVisibleText(classfication);
		Thread.sleep(6000);
		i_remarks.sendKeys(remarks);
		Thread.sleep(6000);
		Dob.click();
		//Thread.sleep(6000);
		//Calendar cal= new Calendar();
		//Thread.sleep(6000);
		
		//cal.select_date("March");
		//.sleep(6000);
		
		
	}
	

}
