package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class BackpackCheckOutPage {
	WebDriver dr;
	@FindBy(id="checkoutButton") WebElement clickOnCheckOutAgain;
	
	public BackpackCheckOutPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public SignInPage clickOnCheckOut() {
		Helper.clickOnElement(clickOnCheckOutAgain);
		return new SignInPage(dr);
	}

}
