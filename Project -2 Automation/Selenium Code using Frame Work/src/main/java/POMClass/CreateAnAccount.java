package com.mycompany.app;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BeforeClass;


public class CreateAnAccount extends BeforeClass{
	WebDriver driver;

	public CreateAnAccount(WebDriver driver) {
		// TODO Auto-generated constructor stub
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


	public String randomMail() {
		  String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder word = new StringBuilder();
	        Random random = new Random();

	        int length = 8; // Minimum 8 characters

	        for (int i = 0; i < length; i++) {
	            word.append(chars.charAt(random.nextInt(chars.length())));
	        }
	        String randommail = word.toString();
	        String generatedMailId= randommail+"@krishn.com";
	        
	        System.out.println("Random Word: " + word.toString());
	        System.out.println("generated MailID: "+ generatedMailId);
	        return generatedMailId;
	    }
	
	@FindBy(css=".text-reset")
	WebElement registerHereButton;
	
	@FindBy(id="firstName")
	WebElement firstName;
	
	@FindBy(id="lastName")
	WebElement lastName;
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userMobile")
	WebElement userMobile;
	
	@FindBy(css="*.custom-select")
	WebElement occupationDropDown;
	
	@FindBy(xpath="//input[@value='Female']")
	WebElement genderSelect;
	
	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(css="input[type=\"checkbox\"]")
	WebElement checkBoxForAge;
	
	@FindBy(id="login")
	WebElement registerButton;
	
	@FindBy(css=".headcolor")
	WebElement confirmPage;
	
	@FindBy(css=".btn-primary")
	WebElement backToLogin;
	
	public void goToPage() {
		driver.get("https://rahulshettyacademy.com/client/");
	}
	
	
	public String registerForm(String PhoneNumber, String Password) {
		registerHereButton.click();
		firstName.sendKeys("Krishna");
		lastName.sendKeys("veni");
		String generatedMailId = randomMail();
		userEmail.sendKeys(generatedMailId);
		userMobile.sendKeys(PhoneNumber);
		selectOccupation();
		genderSelect.click();
		userPassword.sendKeys(Password); 
		confirmPassword.sendKeys(Password);
		checkBoxForAge.click();
		registerButton.click();
		return generatedMailId;
	}
	public String confirmationPage() {
		String confirmMess=confirmPage.getText();
		
		return confirmMess;
	}
	
	public void backToLogin() {
		backToLogin.click();
		 
	}
	
	public void selectOccupation() {
		occupationDropDown.click();
		Select options = new Select(occupationDropDown);
		options.selectByValue("3: Engineer");
		
	}
	
	}
