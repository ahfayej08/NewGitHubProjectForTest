package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class UniformsPage {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"content\"]/main/article/div[3]/div[4]/div/div[2]/section/div[1]/div[1]/div/ul/li[1]/div/div/div/div/div[2]/div/a[1]/h6") WebElement clickOnFirstProd;
	
	public UniformsPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public UniformProductDetailPage clickOnFirstUniformProduct() {
		Helper.clickOnElement(clickOnFirstProd);
		return new UniformProductDetailPage(dr);
	}

}
