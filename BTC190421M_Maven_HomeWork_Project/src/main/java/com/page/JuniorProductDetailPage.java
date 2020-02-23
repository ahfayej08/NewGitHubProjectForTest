package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class JuniorProductDetailPage {
	WebDriver dr;
	@FindBy(xpath="//select[@name='size']") WebElement selectSizePath;
	@FindBy(xpath="//img[@alt='Dark Grey']") WebElement selectColorPath;
	@FindBy(xpath="//p[text()='Add To Cart']") WebElement addToCartPath;
	@FindBy(xpath="//button[@class='_2IHEY kB1qW m0Pqn _3Vfsm _3W9dp']") WebElement clickOnCheckOutPath;
	@FindBy(xpath="//strong[text()='Derek Heart Womens Long Sleeve Hoodie-Juniors']") WebElement verifyTextPath;
	@FindBy(name="quantity") WebElement selectquantity;
	
	public JuniorProductDetailPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void selectSizeForProduct() {
		Helper.selectAnyElement(selectSizePath, "medium");
	}
	public void selectQuantityForProduct() {
		Helper.selectAnyElement(selectquantity, "2");
	}
	
	public void clickaddToCart() {
		Helper.clickOnElement(addToCartPath);
		
	} 
	public void verifyTextIsDisplayed() {
		Helper.verifyText(verifyTextPath, "Derek Heart Womens Long Sleeve Hoodie-Juniors");
		
	} 
	public CheckOutPage clickCheckOut() {
		Helper.clickOnElement(clickOnCheckOutPath);
		return new CheckOutPage(dr);
		
	} 

}
