package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroundex {
	@Given("First")
	public void first() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GIVEN");
	}

	@When("Second")
	public void second() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("WHEN");
	}

	@Then("Third")
	public void third() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("THEN");
	}
	@Given("background given one")
	public void background_given_one() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("GIVEN ONE");
	}

	@When("background when one")
	public void nackground_when_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("WHEN ONE");
	}

	@Then("background then one")
	public void background_then_one() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("THEN ONE");
	}

	@Given("background given two")
	public void background_given_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("GIVEN TWO");
	}

	@When("background when two")
	public void nackground_when_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("WHEN TWO");
	}

	@Then("background then two")
	public void background_then_two() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("THEN TWO");
	}

}
