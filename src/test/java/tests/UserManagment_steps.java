package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserManagment_steps {
	
	BrowserUtils utils = new BrowserUtils();
	LoginPage loginpage = new LoginPage();
	
	//valid credential login test- start
	
	@Given("A a user, I am login page")
	public void a_a_user_i_am_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I enter valid user email and valid password")
	public void i_enter_valid_user_email_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("Click on the logi button")
	public void click_on_the_logi_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should be logged in")
	public void i_should_be_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}
