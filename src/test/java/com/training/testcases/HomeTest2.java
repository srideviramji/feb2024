package com.training.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.base.BaseTest;
import com.training.pages.HomePage2;
import com.training.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTest2 extends BaseTest {
	LoginPage loginpage;
	WebDriver driver;
	HomePage2 homepage;
	
	
	@BeforeMethod
	public void beforeMethod() {
		driver = getDriver();
	driver.get("https://selenium-prd.firebaseapp.com/");
    loginpage = new LoginPage(driver);
    homepage = new HomePage2(driver);
	}
	
	@Test
	
	public void testfnamelastName() {
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://selenium-prd.firebaseapp.com/");
//		
//		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin123");
		loginpage.clicklogin();
		homepage.clickonHome();
		homepage.enterintoname("Sridevi");
		homepage.enterintoFatherName("Srinivasan");
		
		
	
	}
	public void testlastName() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterintousername("admin123@gmail.com");
		loginpage.enterintopassword("admin123");
		loginpage.clicklogin();
		homepage.clickonHome();
		homepage.enterintoFatherName("Srinivasan");
		
		
	
	}
	@AfterMethod
	public void teardown() {
		close();
	}
	

}
