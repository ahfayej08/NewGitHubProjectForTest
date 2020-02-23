package com.bit.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	Base b;
	

	@Given("^open Browser$")
	public void open_Browser() throws Throwable {
		b = new Base();
		b.openBlankBrowser();
	   
	}

	@Given("^navigate TO URL$")
	public void navigate_TO_URL() throws Throwable {
	   b.goToURL();
	}

	@When("^get all main menu text$")
	public void get_all_main_menu_text() throws Throwable {
	   
	}

	@When("^store that into array$")
	public void store_that_into_array() throws Throwable {
	   
	}

	@When("^store expected data into another array$")
	public void store_expected_data_into_another_array() throws Throwable {
	  
	}

	@Then("^compare expected with actual array$")
	public void compare_expected_with_actual_array() throws Throwable {
	  
	}
	
	@Then("^close Browser$")
	public void close_Browser() throws Throwable {
		Thread.sleep(3000);
	    b.closeBrowser();
	}

	
	
}
