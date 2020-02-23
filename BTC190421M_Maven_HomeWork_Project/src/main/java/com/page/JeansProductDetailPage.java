package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class JeansProductDetailPage {
	WebDriver dr;
	@FindBy(name="size") WebElement selectSizePath;
	@FindBy(name="quantity") WebElement selectQuantityPath;
	@FindBy(xpath="//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]") WebElement clickOnAddToCartPath;
	@FindBy(xpath="//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]") WebElement clickOnCheckOutPath;
	
	public JeansProductDetailPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void selectSize() {
		Helper.selectAnyElement(selectSizePath, "1");
	}
	public void selectQuantity() {
		Helper.selectAnyElement(selectQuantityPath, "3");
	}
	public void clickOnAddToCart() {
		Helper.clickOnElement(clickOnAddToCartPath);
	}
	public CheckOutPage clickOnCheckOut() {
		Helper.clickOnElement(clickOnCheckOutPath);
		return new CheckOutPage(dr);
	}
	

}
