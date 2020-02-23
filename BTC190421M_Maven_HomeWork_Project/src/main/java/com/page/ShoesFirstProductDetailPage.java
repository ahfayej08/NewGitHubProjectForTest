package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ShoesFirstProductDetailPage {
	WebDriver dr;
	@FindBy(name="size") WebElement selectSizePath;
	@FindBy(xpath="//img[@alt=\"Red\"]") WebElement clickColorPath;
	@FindBy(xpath="//p[text()='Add To Cart']") WebElement clickAddToCartPath;
	@FindBy(xpath="//button[@data-automation-id='at-panel-checkout-button']") WebElement clickCheckOutPath;
	
	public ShoesFirstProductDetailPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);		
	}
	
	public void selectShoeSize() {
		Helper.selectAnyElement(selectSizePath, "2");
	}
	public void clickShoeColor() {
		Helper.clickOnElement(clickColorPath);
	}
	public void clickAddToCart() {
		Helper.clickOnElement(clickAddToCartPath);
	}
	public ShoesCheckOutPage clickCheckOut() {
		Helper.clickOnElement(clickCheckOutPath);
		return new ShoesCheckOutPage(dr);
	}
	
	
	

}
