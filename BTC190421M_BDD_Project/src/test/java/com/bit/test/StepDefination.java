package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	BaseTest b;
	HomePage h;
	ProfilePage p;
	
	/*
	 * how to run from commandline? 
	 * mvn test -Dcucumber tags@tagname
	 * what are cucumber hook? 
	 * Annotion @before and @after
	 * tag = it runs against every sceniro
	 * 
	 * Customize tag is which tag you want to run it against like @smoke or @regression
	 * 
	 * go to express.com
	 * get all the menu text
	 * store that into array 
	 * store expected data into another array
	 * compare  it 
	 * 
	 * then but a product
	 * and go up to checkout label using bdd/cucumber project along with pom
	 * 
	 */
	@Before
	public void start() {
		System.out.println("cucumberhook agiainst ever scenario");
		
	}
	@After
	public void end() {
		System.out.println("cucumberhook agiainst ever scenario");
		
	}
	@Before("@smoke")
	public void start1() {
		System.out.println("cucumberhook agiainst only smoke");
		
	}
	@After("@smoke")
	public void end1() {
		System.out.println("cucumberhook agiainst only smoke");
		
	}
	
	
	
	
	
	
	
	
	@Given("^open chrome browser$")
	public void open_chrome_browser() throws Throwable {
		b = new BaseTest();
		
		
	}

	@Given("^nevigate to url$")
	public void nevigate_to_url() throws Throwable {
		
	    
	}

	@When("^user type userid in email text box$")
	public void user_type_userid_in_email_text_box() throws Throwable {
		h.typeEmail();
	    
	}

	@When("^user type password in password text box$")
	public void user_type_password_in_password_text_box() throws Throwable {
		h.typePassWord();
	    
	}

	@When("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		p = h.clickOnLogIn();
	}

	@Then("^user should see his profile page$")
	public void user_should_see_his_profile_page() throws Throwable {
//		String verifyTitle = dr.getTitle();
//		System.out.println(verifyTitle);
		
	    
	}
	
	@When("^user type <\"([^\"]*)\"> in email text box$")
	public void user_type_in_email_text_box(String arg1) throws Throwable {
		//dr.findElement(By.id("email")).sendKeys(arg1);

	}

	@When("^user type <\"([^\"]*)\"> in password text box$")
	public void user_type_in_password_text_box(String arg1) throws Throwable {
		//dr.findElement(By.id("pass")).sendKeys(arg1);
	    
	}
	

	@Then("^user should not see his profile page$")
	public void user_should_not_see_his_profile_page() throws Throwable {
		System.out.println("not valid");
	   
	}


}
