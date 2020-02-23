package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class BackpacksPage {
	WebDriver dr;
	@FindBy(xpath="//h6[text()='Jansport Big Student Backpack']") WebElement clickOnFirstProd;
	
	public BackpacksPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public BackpacksProductDetailPage clickOnFirstProductOfBackpacks() {
		Helper.clickOnElement(clickOnFirstProd);
		return new BackpacksProductDetailPage(dr);
	}

}
