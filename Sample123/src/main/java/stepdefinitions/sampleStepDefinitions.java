package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepactions.sampleStepActions;

public class sampleStepDefinitions {
	
	sampleStepActions action;
	
	public sampleStepDefinitions() {
		action = new sampleStepActions();
	}

	@Given("^User opens browser$")
	public void user_opens_browser() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   action.OpenBrowser();
	}
	
	@Given("^User login with credentials$")
	public void user_login_with_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    action.Login();
	}
	
	@When("^User click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions	  
	}
	
	@Then("^User logout from the web site$")
	public void user_logout_from_the_web_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@When("^User clicks on Trouble logging in link$")
	public void user_clicks_on_Trouble_logging_in_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  //action.TroubleLogin();
	}

	@Then("^User naviagtes to Forgot User ID / IPIN page$")
	public void user_naviagtes_to_Forgot_User_ID_IPIN_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@When("^User clicks on Retrieve ID link$")
	public void user_clicks_on_Retrieve_ID_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
//	 action.RetrieveID();
	}

	@Then("^User navigates to Forgot your User ID page$")
	public void user_navigates_to_Forgot_your_User_ID_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions

	}



}
