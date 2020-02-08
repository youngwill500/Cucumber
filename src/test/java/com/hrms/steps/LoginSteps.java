package com.hrms.steps;

import com.hrms.pages.LoginPageElements;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginSteps extends CommonMethods {

	LoginPageElements login;

	@Given("I open browser and navigated to the HRMS")
	public void i_open_browser_and_navigated_to_the_HRMS() {
		BaseClass.setUp();
	}

	@When("I enter valid username and valid password")
	public void i_enter_valid_username_and_valid_password() {
		login = new LoginPageElements();
		sendText(login.username, "Admin");
		sendText(login.password, "Syntax@123");

	}

	@When("I click on login")
	public void i_click_on_login() {
		click(login.loginBtn);

	}

	@Then("I successfully logged in")
	public void i_successfully_logged_in() {
		System.out.println("I am logged in");
	}

	@When("I enter valid username and invalid password")
	public void I_enter_valid_username_and_invalid_password() {
		login = new LoginPageElements();
		sendText(login.username, "admin");
		sendText(login.password, "anything");

	}

	@Then("I see error message")
	public void I_see_error_message() {
		boolean error = login.errorMsg.isDisplayed();
		Assert.assertTrue("The error message is not displayed", error);
	}

	@Then("I close browser")
	public void i_close_browser() {
		tearDown();
	}

	//////////////////////////////////////////////////////////////////////
	@When("I click on login button")
	public void i_click_on_login_button() {
		click(login.loginBtn);
	}

	@When("I enter {string} and {string}")
	public void i_enter_and(String string, String string2) {

	}

	@Then("I see {string}")
	public void i_see(String string) {

	}

}
