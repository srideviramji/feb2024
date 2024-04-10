package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.training.base.BasePage;

public class NewLoginPage extends BasePage {
		
		public NewLoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

		WebDriver driver;
	

		@FindBy(id="username")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(id="rememberUn")
		WebElement rememberme;
		
		@FindBy(id = "Login")
		WebElement login;
		
		public void enterintousername(String strusername) {
			waitForElement(username);
			username.sendKeys(strusername);	
		}
		
		public void enterintopassword(String strpassword) {
			password.sendKeys(strpassword);
		}
		public void checkrememberme(){
	        rememberme.click();
			
		}
		
		public void clicklogin() {
			login.click();
		}
		public void loginintoapplication() {
			username.sendKeys(" ");
			password.sendKeys(" ");
			login.click();
		}

}

	

