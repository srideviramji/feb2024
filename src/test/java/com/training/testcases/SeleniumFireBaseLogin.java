package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import com.training.utilities.PropertiesFile;



public class SeleniumFireBaseLogin extends BaseTest {
	LoginPage loginpage;
	WebDriver driver;
	
	
	@BeforeMethod
	public void beforeMethod() {
	driver = getDriver();
	PropertiesFile prop = new PropertiesFile();
	driver.get("https://selenium-prd.firebaseapp.com/");
    loginpage = new LoginPage(driver);
	}
	
	@Test
	
	public void login() {
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin123");
		loginpage.clicklogin();
		
		
	
	}
	@Test
	public void invalidLogin() {
		
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin1234");
		loginpage.clicklogin();
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		close();
	}

	
}
