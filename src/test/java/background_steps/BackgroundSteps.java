package background_steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		System.out.println("user is on the login page");
	}
	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
		System.out.println("user enters the username and password");
	}


	@When("user clicks on the login")
	public void user_clicks_on_the_login() {
		System.out.println("user clicks on the login");
	}

	@Then("user navigated to login page")
	public void user_navigated_to_login_page() {
		System.out.println("user navigated to login page");
	}

	@When("user clicks on the application link")
	public void user_clicks_on_the_application_link() {
		System.out.println("user clicks on the application link");
	}

	@Then("user able to see logout button")
	public void user_able_to_see_logout_button() {
		System.out.println("user able to see logout button");
	}

	@When("user clicks on the dashboard link")
	public void user_clicks_on_the_dashboard_link() {
		System.out.println("user clicks on the dashboard link");
	}

	@Then("user able to see dashboard")
	public void user_able_to_see_dashboard() {
		System.out.println("user able to see dashboard");
	}

}
