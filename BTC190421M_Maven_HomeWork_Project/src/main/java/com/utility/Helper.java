package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Helper {
	
	public static void mouseHoverOver(WebDriver dr, WebElement element) {
		Actions a = new Actions(dr);
		a.moveToElement(element).build().perform();
	}
	public static void clickOnElement(WebElement element) {
		waitForElement(element).click();
		
	}
	public static WebElement waitForElement(WebElement element) {
		ExpectedConditions.invisibilityOf(element);
		return element;	
	}
	public static void selectAnyElement(WebElement element, String value ) {
		new Select(element).selectByVisibleText(value);
			
	}
	public static void myType(WebElement element, String value ) {
		element.sendKeys(value);
		
	}
	public static void verifyText(WebElement element, String expectedText ) {
		String actualText = element.getText();
		System.out.println("This is actual text"+actualText);
		if(actualText.equals(expectedText)) {
			System.out.println("Actual text is match.");
		}else {
			System.out.println("Actual text did not match.");
		}
		
	}
	public static void verifyElement(WebElement element) {
		if(element.isDisplayed()) {
			System.out.println("It is visible");
		}else {
			System.out.println("It is not visible");
		}
		
	}
	

}
