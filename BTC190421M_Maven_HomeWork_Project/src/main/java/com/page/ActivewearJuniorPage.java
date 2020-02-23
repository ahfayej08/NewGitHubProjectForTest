package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ActivewearJuniorPage {
	WebDriver dr;
	@FindBy(xpath="//img[@src='//s7d4.scene7.com/is/image/JCPenney/DP0711201913012520M.tif?wid=350&hei=350&op_usm=.4,.8,0,0&resmode=sharp2']") WebElement clickOnFirstProduct;
	
	public ActivewearJuniorPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public JuniorProductDetailPage clickOnFirstItem() {
		Helper.clickOnElement(clickOnFirstProduct);
		return new JuniorProductDetailPage(dr);
	}

}
