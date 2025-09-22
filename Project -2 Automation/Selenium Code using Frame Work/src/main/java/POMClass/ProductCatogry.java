package com.mycompany.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BeforeClass;

public class ProductCatogry extends BeforeClass {
	//WebDriver driver;


	public ProductCatogry(WebDriver driver) {
		super(driver);
		// this.driver = driver;
		PageFactory.initElements(driver, this);
	
	}
	@FindBy(css= "*.col-lg-4")
	List<WebElement> products;
	
	By product = By.cssSelector("*.col-lg-4");
	By addToCart = By.cssSelector(".card-body button:last-of-type");
	By toastMess = By.cssSelector("*.toast-success");
	
	
	public List<WebElement> getProductList() {
		waitForWebElementToAppear(product);
		return products;
	
	}
	public WebElement getProductName(String productName) {
	WebElement prod = products.stream()
			.filter(product -> product.findElement(By.cssSelector("b")).getText().equals(productName))
			.findFirst().orElse(null);
	return prod;
	}
	
	public CartProducts addProductToCart(String productName) throws InterruptedException {
		WebElement prod = getProductName(productName);
		prod.findElement(addToCart).click();
		waitForWebElementToAppear(toastMess);
		Thread.sleep(2000);
		CartProducts cartProducts = new CartProducts(driver);
		return cartProducts;
	}
	
	
}
