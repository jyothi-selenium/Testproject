package Utility;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Calendar 
{
@FindBy(xpath="//tbody/tr/td/select[@month='Month selector']")
WebElement month;

@FindBy(linkText="<")
WebElement prev;

WebDriver driver;


public  void select_date(WebDriver ldriver,String monthname)

{
	try {
		Set<String> windowid=ldriver.getWindowHandles();
		Iterator<String> itr=windowid.iterator();
		Thread.sleep(3000);
		String parentwindow=itr.next();
		Thread.sleep(3000);
		String childwindow=itr.next();
		Thread.sleep(3000);
		ldriver.switchTo().window(childwindow);
		Thread.sleep(3000);
		//ldriver.findElement(By.linkText("20"));
		//Thread.sleep(6000);
		Select mon = new Select(month);
		Thread.sleep(3000);
		mon.selectByVisibleText(monthname);
		Thread.sleep(6000);
		prev.click();
		Thread.sleep(3000);
	
	} catch (InterruptedException e) 
	{
		
		e.printStackTrace();
	}
	

	
	
}

}
