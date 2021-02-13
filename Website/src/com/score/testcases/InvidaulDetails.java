package com.score.testcases;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.score.pages.Customer;
import com.score.pages.Customer_Individual;
import com.score.pages.LoginPage;
import com.score.pages.Menu;
import com.score.pages.SideMenu;

import Utility.Calendar;
import Utility.mousescroll;
import Utility.readExcel;

public class InvidaulDetails extends BaseClass {
	

	@Test(priority = 0)
	public void enterInvidualdetails() throws Throwable {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		Menu menu = PageFactory.initElements(driver, Menu.class);
		Customer customer = PageFactory.initElements(driver, Customer.class);
		SideMenu sidemenu = PageFactory.initElements(driver, SideMenu.class);
		Customer_Individual cusindividual = PageFactory.initElements(driver, Customer_Individual.class);

		Thread.sleep(1000);
		login.Login("Vyas", "abc");
		Thread.sleep(5000);
		menu.clickokalert();

		Thread.sleep(5000);
		menu.mousehover_customer(driver);

		Thread.sleep(5000);
		customer.Click_Invidual();

		Thread.sleep(5000);
		sidemenu.Click_Invidualdetails();
		Thread.sleep(2000);

	}

	@Test(dataProvider = "dataset", priority = 1)
	public void enterinvidualdetails(String custtype, String cutomertitile, String custname, String guardiantitile,
			String guardianname, String relationshipwithguard, String addres1, String addres2, String address3,
			String phone1, String phone2, String mobile, String Fax, String classfication, String remarks)
			throws Throwable {
		Customer_Individual customerindividul = PageFactory.initElements(driver, Customer_Individual.class);
		Calendar cal = new 	Calendar();
		Thread.sleep(3000);
		mousescroll.scroll();
		Thread.sleep(3000);
		
        customerindividul.Enter_details(custtype, cutomertitile, custname, guardiantitile, guardianname,
				relationshipwithguard, addres1, addres2, address3, phone1, phone2, mobile, Fax, classfication, remarks);
		
        Set<String> windowid=driver.getWindowHandles();
		Iterator<String> itr=windowid.iterator();
		Thread.sleep(3000);
		String parentwindow=itr.next();
		Thread.sleep(3000);
		String childwindow=itr.next();
		Thread.sleep(3000);
		driver.switchTo().window(childwindow);
		Thread.sleep(3000);
       // driver.findElement(By.linkText("20")).click();
        driver.manage().window().maximize();
        Thread.sleep(3000);
     cal.select_date(driver, "March");
   
    	 
    	   
    	   
  

	}

	@DataProvider(name = "dataset")
	public Object[][] readexcel() throws Throwable {
		readExcel read = new readExcel("F:\\Book1.xls");
		int count = read.getlastrow(0) + 1;
		Object[][] data = new Object[count][15];

		for (int i = 0; i < count; i++) {

			data[i][0] = read.readdata(0, i, 0);

			data[i][1] = read.readdata(0, i, 1);
			data[i][2] = read.readdata(0, i, 2);
			data[i][3] = read.readdata(0, i, 3);
			data[i][4] = read.readdata(0, i, 4);
			data[i][5] = read.readdata(0, i, 5);
			data[i][6] = read.readdata(0, i, 6);
			data[i][7] = read.readdata(0, i, 7);
			data[i][8] = read.readdata(0, i, 8);
			data[i][9] = read.readdata(0, i, 9);
			data[i][10] = read.readdata(0, i, 10);
			data[i][11] = read.readdata(0, i, 11);
			data[i][12] = read.readdata(0, i, 12);
			data[i][13] = read.readdata(0, i, 13);
			data[i][14] = read.readdata(0, i, 14);
 
		}

		return data;
	}

}
