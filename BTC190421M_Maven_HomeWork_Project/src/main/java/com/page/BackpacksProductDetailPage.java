package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class BackpacksProductDetailPage {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"content\"]/main/article/section/section[3]/div[2]/section[2]/section/div[2]/div[1]/div[2]/div[1]/div/ul/li[3]/div/button/div/img") WebElement clickOnColorPath;
	@FindBy(xpath="//*[@id=\"GlobalOptions-AddToCart\"]/button/div/p[2]") WebElement clickOnAddToCartPath;
	@FindBy(xpath="//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]") WebElement clickCheckOutPath;
	
	public BackpacksProductDetailPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void clickColor() {
		Helper.clickOnElement(clickOnColorPath);
	}
	public void clickAddToCart() {
		Helper.clickOnElement(clickOnAddToCartPath);
	}
	public BackpackCheckOutPage clickCheckOut() {
		Helper.clickOnElement(clickCheckOutPath);
		return new BackpackCheckOutPage(dr);
	}

}
