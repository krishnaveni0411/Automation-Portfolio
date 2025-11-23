package com.mycompany.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BeforeClass;

public class LandingPage extends BeforeClass {

	//WebDriver driver;

	public LandingPage(WebDriver driver) {
		super(driver);
	//	this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id= "userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement password;
	
	@FindBy(id="login")
	WebElement login;
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public String errorMessage() {
		String error_message = "";
		return error_message;
	}
	
	public ProductCatogry LoingApplication(String mailId, String logincode) {
		userEmail.sendKeys(mailId);
		password.sendKeys(logincode);
		login.click();
		ProductCatogry productCatorgy = new ProductCatogry(driver);
		return productCatorgy;
	}
	
}