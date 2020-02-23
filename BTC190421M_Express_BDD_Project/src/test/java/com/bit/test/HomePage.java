package com.bit.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {
	
	WebDriver dr;
	@FindBy(xpath="//ul[@class='nav-container']/li") List<WebElement> menuOfText;
	String[] expectedText = {
			"MEN","WOMEN", "JEANS", "NEW ARRIVALS", "SALES", "LABELS WE LOVE", "STYLE"};
	
	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void getTextAndVerify() {
		Helper.getAnyWebelements(menuOfText, expectedText);
		
	}
	
	
	
	
	
	

}
