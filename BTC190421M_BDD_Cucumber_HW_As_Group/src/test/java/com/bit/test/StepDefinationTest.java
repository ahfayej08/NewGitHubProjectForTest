package com.bit.test;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationTest {
	BaseTest baseTest;
	HomePage homePage;
	
	
	@Given("^open Blank Browser$")
	public void open_Blank_Browser() throws Throwable {
		baseTest.openBrowser();	   
	}

	@Then("^navigate to Url$")
	public void navigate_to_Url() throws Throwable {
		homePage = baseTest.navigateToURL();
	}

	@When("^verify Main Menu Text$")
	public void verify_Main_Menu_Text() throws Throwable {
		//homePage.verifyExpressMainMenuTxt();
	    
	}

	@Then("^verify Express Title$")
	public void verify_Express_Title() throws Throwable {
		homePage.verify_ExpressTitle();	   
	}

	
	
	
	
	
	
	
	
	

}
