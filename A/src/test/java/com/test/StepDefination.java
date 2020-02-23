package com.test;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class StepDefination {
	WebDriver dr;
	
	BaseTest baseTest;
	
	@Given("^open blank Browser$")
	public void open_blank_Browser() throws Throwable {
	baseTest = new BaseTest();
	baseTest.openBrowser();
}

	@When("^user Nevigate To Autotrader$")
	public void user_Nevigate_To_Autotrader() throws Throwable {
		baseTest.navigateToURL();
	}
	
	
	
	
	
	
	
}
