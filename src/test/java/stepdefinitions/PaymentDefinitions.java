package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PaymentDefinitions {
	@Given("user already has an account on gpay")
	public void user_already_has_an_account_on_gpay() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("GIVEN");
	}

	@When("userid is correct")
	public void userid_is_correct() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("WHEN");
	}

	@Then("gpay message should be sent")
	public void gpay_message_should_be_sent() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("THEN");
	}

}
