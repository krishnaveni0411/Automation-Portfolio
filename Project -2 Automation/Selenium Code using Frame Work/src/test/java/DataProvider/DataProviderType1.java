package com.mycompany.app;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTest.BaseTest;

public class CompleteCodeDataProvider extends BaseTest {
	@Test (dataProvider= "getData")
	public void submitOrder(String mailId, String password, String productName) throws InterruptedException, IOException {
		
		LandingPage landingPage = launchApplication();
		ProductCatogry productCatorgy =landingPage.LoingApplication(mailId,password); 
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(productName);
		CartProducts cartProducts = productCatorgy.addProductToCart(productName);
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(productName);
		Assert.assertTrue(match);
		cartProducts.checkOut();
		cartProducts.fillTheForm();
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		System.out.println(orderconfirmMess);
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Test completed successfully!");
		tearDown();
		
	}
	
	@DataProvider 
	  public Object[][] getData(){
	  return new Object[][] {{"krishanveni123@krish.com", "Qazwsx@123", "ADIDAS ORIGINAL"}, {"krish123@krish.com", "Qazwsx@123","ADIDAS ORIGINAL"}};
	// In this data the second set email and password is wrong so the test will fail. 
	}
	

}
