package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class taggedStepDef {
	@Given("I have items in the cart page")
	public void i_have_items_in_the_cart_page() {
	   System.out.println("I have items in the cart page");
	}
	@When("I view the cart")
	public void i_view_the_cart() {
		System.out.println("I view the cart");
	}
	@Then("I should see the items in the cart")
	public void i_should_see_the_items_in_the_cart() {
		System.out.println("I should see the items in the cart");
	}
	@When("I have remove the item from cart")
	public void i_have_remove_the_item_from_cart() {
		System.out.println("I have remove the item from cart");
	}
	@Then("the item should be removed successfully")
	public void the_item_should_be_removed_successfully() {
		System.out.println("the item should be removed successfully");
	}
	@Given("I am on the product page")
	public void i_am_on_the_product_page() {
		System.out.println("I am on the product page");
	}
	@When("I add the item to cart")
	public void i_add_the_item_to_cart() {
		System.out.println("I add the item to cart");
	}
	@Then("the item should be added successfully")
	public void the_item_should_be_added_successfully() {
		System.out.println("the item should be added successfully");
	}

}
