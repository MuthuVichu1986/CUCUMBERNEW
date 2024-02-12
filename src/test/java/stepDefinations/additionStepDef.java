package stepDefinations;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class additionStepDef {
	@Given("I want to display the input value")
	public void i_want_to_display_the_input_value(DataTable table) {
		List<Integer> value = table.asList(Integer.class);
		System.out.println("Value are" + value);
	}
	@When("I perform add")
	public void i_perform_add() {
	
	}
	@Then("the result should be {int}")
	public void the_result_should_be(Integer int1) {
	  System.out.println("Total ="+ int1);
	}
}
