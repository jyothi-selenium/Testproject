package com.score.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.score.pages.LoginPage;

import Utility.ConfigReader;

public class VerifyLogin extends BaseClass {

	@Test
	public void ValidLoginCheck() throws Throwable {

		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.Login("Vyas", "abc");
		Thread.sleep(3000);

	}

}
