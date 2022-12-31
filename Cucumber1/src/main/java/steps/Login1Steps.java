package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1Steps {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user_is_on_the_login_page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		
		System.out.println("user_enters_username_and_password");
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		System.out.println("user_clicks_on_login_button");
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {
		System.out.println("user_should_be_successfully_logged_in");
	}

}
