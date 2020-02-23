package com.bit.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
	ChromeDriver dr;
	@FindBy(xpath = "")
	WebElement profilePageLogo;

	public ProfilePage(ChromeDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}

	public void verifyProfilePage() {
		boolean b = profilePageLogo.isDisplayed();
		if (b) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	
	

}
