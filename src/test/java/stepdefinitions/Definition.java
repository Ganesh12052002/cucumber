package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Definition {
	

	@Given("User is on the login screen")
	public void user_is_on_the_login_screen() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("**GIVEN**");
	  
	}
	
	@When("user provides correct username")
	public void user_provides_correct_username_user(DataTable user) {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("when is working");
	}



	@When("user provides correct password={string}")
	public void user_provides_correct_password(String p) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("password"+p);
	}

	
	

	@Then("User must login")
	public void user_must_login() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("THEN");
	}

	@Then("error should not be there")
	public void error_should_not_be_there() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("**BUT**");
	}



	




}
