package com.bit.test;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper; 

public class HomePage {
	WebDriver dr;

	String expected_Title = "Men's and Women's Clothing - Shop jeans, dresses, and suits";
	String[] expectedMenuTxt = { "MEN", "WOMEN", "JEANS", "NEW ARRIVALS", "SALE", "LABELS WE LOVE", "STYLE" };
	@FindBy(xpath = "//ul[@class='nav-container']/li")
	List<WebElement> mainMenu;

	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);

	}

	public void verify_ExpressTitle() {
		Helper.verifyTitle(dr, expected_Title);
	}

	public void verifyExpressMainMenuTxt() {
		Helper.getTextFromManu(mainMenu, expectedMenuTxt);
	}

}
