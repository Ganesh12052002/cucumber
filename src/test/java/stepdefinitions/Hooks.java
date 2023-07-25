package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hooks {
	@Before("@SmokeTest")
	public void beforefeature() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Before Scenario");
	}

	@After("@SmokeTest")
	public void afterfeature() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("After Scenario");
	}
	
	@Given("example of given one")
	public void example_of_given_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GIVEN ONE MOBILE TEST");
	}

	@When("example of when one")
	public void example_of_when_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("WHEN ONE MOBILE TEST");
	}
	
	@Then("example of then one")
	public void example_of_then_one() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("THEN ONE MOBILE TEST");
	}

	@Given("example of given two")
	public void example_of_given_two() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("GIVEN ONE WEBSITE TEST");
	}

	@When("example of when two")
	public void example_of_when_two() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("WHEN ONE WEBSITE TEST");
	}

	@Then("example of then two")
	public void example_of_then_two() {
	    // Write code here that turns the phrase above into concrete actions
		  System.out.println("THEN ONE WEBSITE TEST");
	}
}
