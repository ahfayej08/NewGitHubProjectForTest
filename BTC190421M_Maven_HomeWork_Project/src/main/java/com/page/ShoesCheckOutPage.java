package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ShoesCheckOutPage {
	WebDriver dr;
	@FindBy(id="checkoutButton") WebElement clickOnCheckOutAgain;
	
	public ShoesCheckOutPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public SignInPage clickOnCheckOutAgain() {
		Helper.clickOnElement(clickOnCheckOutAgain);
		return new SignInPage(dr);
		
	}

}
