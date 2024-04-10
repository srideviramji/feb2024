package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.training.base.BasePage;

public class LoginPage extends BasePage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id="email_field")
	WebElement username;
	
	@FindBy(id="password_field")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Login')]")
	WebElement login;
	
	

	public void enterintousername(String strusername) {
		waitForElement(username);
		username.sendKeys(strusername);	
	}
	
	public void enterintopassword(String strpassword) {
		password.sendKeys(strpassword);
	}
	public void clicklogin() {
		login.click();
	}
	public void loginintoapplication() {
		username.sendKeys(" ");
		password.sendKeys(" ");
		login.click();
	}

//	public void enterintoUsername(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void enterintoPassword(String string) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	public void clickLogin() {
//		// TODO Auto-generated method stub
//		
//	}

}
