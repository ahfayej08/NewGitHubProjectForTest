package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class JeansPage  {
	WebDriver dr;
	@FindBy(xpath="//*[@id=\"content\"]/main/article/div[3]/div[4]/div/div[2]/section/div[1]/div[1]/div/ul/li[1]/div/div/div/div/div[1]/div[2]/a/div/div/img") WebElement clickOnFirstProd;
	
	public JeansPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public JeansProductDetailPage clickOnFirstJeansProduct() {
		Helper.clickOnElement(clickOnFirstProd);
		return new JeansProductDetailPage(dr);
	}


}
