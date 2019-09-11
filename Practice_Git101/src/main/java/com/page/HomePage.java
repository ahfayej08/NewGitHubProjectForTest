package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.Helper;

public class HomePage {
	WebDriver dr;
	
	
	public HomePage() {
		// TODO Auto-generated constructor stub
	}
	
	public void clickOn() {
		Helper.clickOnElement(dr.findElement(By.id("")));
	}

}
