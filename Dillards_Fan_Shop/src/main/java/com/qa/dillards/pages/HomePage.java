package com.qa.dillards.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.utility.Helper;

public class HomePage {
	WebDriver dr;
	String expectedURL = "https://www.dillards.com/";
	String expectedTitle = "Dillard's - Official Site of Dillard's Department Stores - Dillards.com | The Style of Your Life";
	@FindBy(xpath = "/html/body/div[2]/div/section[1]/div/header/div/div[1]/div/a/img\r\n")
	WebElement dillardsLogo;
	
	

	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	

	public void titleTest() {
		
		Helper.verfiyTitle(expectedTitle);

	}

	public void logoTest() {
		Helper.verfiyLogo(dillardsLogo);
	}

	public void urlTest() {
		Helper.verfiyURL(expectedURL);
	}

}
