package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class UniformProductDetailPage {
	WebDriver dr;
	@FindBy(name="size") WebElement selectSizePath;
	@FindBy(name="quantity") WebElement selectQuantityPath;
	@FindBy(xpath="//p[text()='Add To Cart']") WebElement clickOnAddToCartPath;
	@FindBy(xpath="//*[@id=\"atPanelContent\"]/div/section/section/section[1]/div[2]/div/button[2]") WebElement clickOnCheckOutPath;
	@FindBy(xpath="//*[@id=\"content\"]/main/article/section/section[3]/div[2]/section[2]/section/div[4]/div[1]/div[2]/div[1]/div/ul/li[3]/div/button/div/img") WebElement clickOnColorPath;
	
	
	public UniformProductDetailPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void selectSize() {
		Helper.selectAnyElement(selectSizePath, "medium");
	}
	public void selectQuantity() {
		Helper.selectAnyElement(selectQuantityPath, "2");
	}
	public void clickOnColor() {
		Helper.clickOnElement(clickOnColorPath);
	}
	public void clickOnAddToCart() {
		Helper.clickOnElement(clickOnAddToCartPath);
	}
	public UniformCheckOutPage clickOnCheckOut() {
		Helper.clickOnElement(clickOnCheckOutPath);
		return new UniformCheckOutPage(dr);		
	}
	

}
