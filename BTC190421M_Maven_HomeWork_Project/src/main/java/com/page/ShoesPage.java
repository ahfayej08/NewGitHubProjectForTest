package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ShoesPage {
	WebDriver dr;
	@FindBy(xpath="//h6[text()='Converse Chuck Taylor All Star Unisex Sneakers - Little Kids']") WebElement clickOnFirstProd;
	
	public ShoesPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public ShoesFirstProductDetailPage clickOnFirstShoesProduct() {
		Helper.clickOnElement(clickOnFirstProd);
		return new ShoesFirstProductDetailPage(dr);
	}
	

}
