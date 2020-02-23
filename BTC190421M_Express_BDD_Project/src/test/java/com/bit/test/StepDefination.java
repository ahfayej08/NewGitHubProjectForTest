package com.bit.test;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {

	WebDriver dr;
	BaseTest b;
	HomePage homePage;

	@Given("^open browser$")
	public void open_browser(DataTable arg1) throws Throwable {
		List<List<String>> browsers = arg1.raw();
		String browser = browsers.get(0).get(1);
		b.open_Browser(browser);

	}

	@Given("^nevigate url$")
	public void nevigate_url() throws Throwable {
		homePage = b.nevigatetoURL();

	}

	@When("^compare array of menu text$")
	public void compare_array_of_menu_text() throws Throwable {
		//homePage.getTextAndVerify();

	}

	@When("^buy a product$")
	public void buy_a_product() throws Throwable {

	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {

	}

	/*
	 * @Given("^open browser$") public void open_browser(DataTable arg1) throws
	 * Throwable { // List<List<String>> browsers = arg1.raw(); // String browser =
	 * browsers.get(0).get(0); // b.open_Browser(browser);
	 * 
	 * 
	 * 
	 * }
	 * 
	 * @Given("^nevigate url$") public void nevigate_url() throws Throwable {
	 * homePage = b.nevigatetoURL(); }
	 * 
	 * @When("^get all text from main menu and store them into array$") public void
	 * get_all_text_from_main_menu_and_store_them_into_array() throws Throwable {
	 * homePage.getTextAndVerify(); }
	 * 
	 * @When("^store expected data into another array$") public void
	 * store_expected_data_into_another_array() throws Throwable {
	 * 
	 * }
	 * 
	 * @Then("^compare expaected vs actual$") public void
	 * compare_expaected_vs_actual() throws Throwable {
	 * 
	 * }
	 */

}
