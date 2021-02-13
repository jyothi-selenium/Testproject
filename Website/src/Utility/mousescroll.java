package Utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class mousescroll 

{   static WebDriver driver;
	public static void scroll()
	{
		
		((JavascriptExecutor)driver).executeScript("scroll(0,200");
		
		
	}
	
	
	
}
