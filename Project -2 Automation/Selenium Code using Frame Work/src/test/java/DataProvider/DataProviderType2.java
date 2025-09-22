package com.mycompany.app;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import BaseTest.BaseTest;
public class CompleteCodeDataProvider extends BaseTest {
	@Test (dataProvider= "getDatafromHashMap")
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
	  public Object[][] getDatafromHashMap(){
	  HashMap<String, String> map = new HashMap<String, String>();
	  map.put("email", "krishanveni123@krish.com");
	  map.put("password", "Qazwsx@123");
	  map.put("productName", "ADIDAS ORIGINAL");
	  
	  HashMap<String, String> map1 = new HashMap<String, String>();
	  map1.put("email", "krish123@krish.com");
	  map1.put("password", "Qazwsx@123");
	  map1.put("productName", "ADIDAS ORIGINAL");
	// In this data the second set email and password is wrong so the test will fail.
	return new Object[][] {{map},{map1}};
	  } 
}
