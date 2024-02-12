@package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddStepDef {
	@Given("I want to write a step with {word}")
	public void i_want_to_write_a_step_with(String name) {
		System.out.println("Name is : " + name);
	}
	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
		System.out.println("Input value are : " + int1);
	}
	@Then("I verify the {string} in step")
	public void i_verify_the_fail_in_step(String result) {
		System.out.println("Status are : " + result);
	   
	}
}

}
