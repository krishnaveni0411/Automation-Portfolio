package com.mycompany.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTest.Retry;
import BaseTest.BaseTest;

public class CompleteCodeDataProvider extends BaseTest {
	
	
	@Test (dataProvider= "getDataFromJsonFile", retryAnalyzer=Retry.class)
	public void submitOrder(HashMap<String, String> input) throws InterruptedException, IOException {
		
		LandingPage landingPage = launchApplication();
		ProductCatogry productCatorgy =landingPage.LoingApplication(input.get("email"), input.get("password")); 
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(input.get("productName"));
		CartProducts cartProducts = productCatorgy.addProductToCart(input.get("productName"));
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(input.get("productName"));
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
	   public Object[][] getDataFromJsonFile() throws IOException {
		List<HashMap<String, String>> data = getJsonToMap(System.getProperty("user.dir")+"\\src\\test\\\\java\\TestData\\TestData.json");
		return new Object[][] {{data.get(0)}, {data.get(1)}};
		// the first array set data is in data.get(0) and the 2nd set of array is in data.get(1). 	
	}

}