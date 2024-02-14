package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Pages.SearchResult;
import Pages.ShoppingCart;

public class PlaceOrderCaseStudyStepDef {

	WebDriver driver = TestBase.getDriver();
	HomePage homePage;
	SearchResult searchResult;
	ShoppingCart cartPage;
	
	public PlaceOrderCaseStudyStepDef() {
		homePage = new HomePage(driver);
		searchResult = new SearchResult(driver);
		cartPage = new ShoppingCart(driver);
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    TestBase.openUrl("https://tutorialsninja.com/demo/");
	}
	@When("User search an item {string}")
	public void user_search_an_item(String strItem) {
	    homePage.searchItems(strItem);
	}
	@Then("Item must be listed")
	public void item_must_be_listed() {
		Assert.assertTrue(searchResult.isItemListed());
		System.out.println("Search Result is displayed successfully");
	}
	@Given("User should be on Search result page")
	public void user_should_be_on_search_result_page() {
		searchResult.viewItemDetails();
	}
	@When("User add item to cart")
	public void user_add_item_to_cart() {
		searchResult.addToCart();
	}
	@Then("Item must be added")
	public void item_must_be_added() {
		cartPage.doClickCart();
	}
	@When("User do checkout")
	public void user_do_checkout() {
		cartPage.doCheckOut();
	}
	@Then("Should navigated to Checkout page")
	public void should_navigated_to_checkout_page() {
		String expectedTitle = "Checkout";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("Item checkout successfully");
	}
}