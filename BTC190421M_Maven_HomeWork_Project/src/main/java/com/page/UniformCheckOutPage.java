package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class UniformCheckOutPage {
	WebDriver dr;
	@FindBy(id="checkoutButton") WebElement checkOutIdPath;
	
	public UniformCheckOutPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public SignInPage clickOnCheckOutAgain() {
		Helper.clickOnElement(checkOutIdPath);
		return new SignInPage(dr);
	}

}
