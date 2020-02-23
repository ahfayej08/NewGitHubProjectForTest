package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class ActivewearPage {
	WebDriver dr;
	@FindBy(xpath="//img[@title='Juniors']") WebElement clickToJunior;
	
	public ActivewearPage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public ActivewearJuniorPage clickOnJunior() {
		Helper.clickOnElement(clickToJunior);
		return new ActivewearJuniorPage(dr);
		
	}

}
