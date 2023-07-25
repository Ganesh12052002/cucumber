package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommentDefinition {
	@Given("user is logged in")
	public void user_is_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("COMMENT GIVEN2");
	}

	@When("user enters comment")
	public void user_enters_comment() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("COMMENT WHEN1");
	}

	@Then("comment must be posted")
	public void comment_must_be_posted() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("COMMENT THEN1");
	}

	@Given("user is logged in two")
	public void user_is_logged_in_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("COMMENT GIVEN2");
	}

	@When("user enters comment two")
	public void user_enters_comment_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("COMMENT WHEN2");
	}

	@Then("comment must be posted two")
	public void comment_must_be_posted_two() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("COMMENT THEN2");
	}

}
