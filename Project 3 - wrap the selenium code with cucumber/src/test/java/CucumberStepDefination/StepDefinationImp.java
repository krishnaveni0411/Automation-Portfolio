package CucumberStepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import BaseTest.BaseTest;

import com.mycompany.app.CartProducts;
import com.mycompany.app.LandingPage;
import com.mycompany.app.ProductCatogry;

public class StepDefinationImp extends BaseTest{
	
public LandingPage landingPage;
public ProductCatogry productCatorgy;
public CartProducts cartProducts;
	

@Given ("I landed on Ecommerce page")
	public void I_landed_on_Ecommerce_page() throws IOException {
		landingPage = launchApplication();	
	}
	
	@Given("^Logged in with username (.+) and password (.+)$")
	public void Logged_in_with_username_and_password(String userName, String password) {
		productCatorgy =landingPage.LoingApplication(userName, password);
	}
	@When("^add the product (.+) to the cart$")
	public void add_product_to_the_cart(String productName) throws InterruptedException {
		List<WebElement> products = productCatorgy.getProductList();
		productCatorgy.getProductName(productName);
		cartProducts = productCatorgy.addProductToCart(productName);
		System.out.println("Checking for product in the cart...");
		cartProducts.getCartProducts().forEach(p -> System.out.println("Product in cart: " + p.getText()));
		Boolean match = cartProducts.cartProducts(productName);
		Assert.assertTrue(match);
	}
	@And("^checkout (.+) and submit the order$")
	public void checkout_and_submit_the_order(String productName) throws InterruptedException {
		cartProducts.checkOut();
		cartProducts.fillTheForm();
	}
	@Then("{string} message is displayed on confirmation page.")
	public void message_is_diplayed_on_confirmation_page(String string) {
		String orderconfirmMess =  cartProducts.orderConfirmationPage();
		System.out.println(orderconfirmMess);
		Assert.assertTrue(orderconfirmMess.equalsIgnoreCase("Thankyou for the order."));
		System.out.println("Test completed successfully!");
		tearDown();	
	}
	@Then("{string} message is displayed")
	public void message_is_displayed(String errorMessage) throws Throwable {
		Assert.assertEquals(errorMessage, landingPage.errorMessage());
	}
	

}
