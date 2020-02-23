package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	ChromeDriver dr;
	@FindBy(id="email") WebElement emailTextBox;
	@FindBy(id="pass") WebElement passwordTextBox;
	@FindBy(id="u_0_2") WebElement loginButton;
	

	public HomePage(ChromeDriver dr) {
		this.dr = dr;
	}

	public void typeEmail() {
		emailTextBox.sendKeys("email or userid here");

	}

	public void typePassWord() {
		passwordTextBox.sendKeys("password here");
	}

	public ProfilePage clickOnLogIn() {
		loginButton.click();
		return new ProfilePage(dr);
		
	}

}
