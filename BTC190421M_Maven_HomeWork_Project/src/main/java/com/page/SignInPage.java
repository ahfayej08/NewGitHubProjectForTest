package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class SignInPage {

	WebDriver dr;
	@FindBy(name="email") WebElement emailPath;
	@FindBy(name="password") WebElement passwordPath;
	@FindBy(xpath="//button[text()='Sign In']") WebElement SignInPath;
	@FindBy(xpath="//div[text()='Sign In']") WebElement verifysignInTextPath;
	@FindBy(xpath="//p[@class='_5dh9B']") WebElement verifyErrorTextPath;
	
	
	
	public SignInPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	
	public void typeEmail() {
		Helper.myType(emailPath, "heyandhi");
		
	}
	public void verifySignInText() {
		Helper.verifyElement(verifysignInTextPath);
		
	}
	public void verifyErrorText() {
		Helper.verifyText(verifyErrorTextPath, "The username or password you entered was not found. Please try again.");
		
	}
	public void typePassWord() {
		Helper.myType(passwordPath, "12345");
		
	}
	public void clickSignIn() {
		Helper.clickOnElement(SignInPath);
	}
	

}
