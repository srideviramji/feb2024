package com.training.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.training.base.BasePage;


public class HomePage2 extends BasePage {
	WebDriver driver;
	
	
	public HomePage2(WebDriver driver) {
		super(driver);
	}
	


	@FindBy(xpath="//a[text()='Home']")
	WebElement hometab;
	
	@FindBy(id="name")
	WebElement Name;
	
	@FindBy(id = "lname")
	WebElement FatherName;
	
	

	public void clickonHome() {
		waitForElement(hometab);
		hometab.click();	
	}
	
	public void enterintoname(String strName) {
		Name.sendKeys(strName);
	}
	public void enterintoFatherName(String strFatherName ) {
		FatherName.sendKeys(strFatherName);
	}

}
