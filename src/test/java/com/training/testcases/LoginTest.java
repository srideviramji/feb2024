package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.pages.NewLoginPage;
import com.training.utilities.PropertiesFile;
import com.training.utilities.ScreenshotUtility;

public class LoginTest extends BaseTest {
	
		NewLoginPage loginpage;
		WebDriver driver;
		PropertiesFile prop;
		ScreenshotUtility screen = new ScreenshotUtility();
		
		
		@BeforeMethod
		public void beforeMethod() {
		driver = getDriver();
		driver.get("https://login.salesforce.com/");
		  loginpage = new NewLoginPage(driver);
		}
		
		@Test
		
		public void login() {
			loginpage.enterintousername("sridevi@road.sandbox");
			loginpage.enterintopassword("salesforce123");
			loginpage.checkrememberme();
		    loginpage.clicklogin();
		}
		
		
		@AfterMethod
		public void teardown() {
			screen.takescreenshot(driver);
			close();
		}

		

		
	}
	
	

