package com.utility;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Helper {

	public static String[] copyArray(List<WebElement> elements) {
		String y[] = new String[elements.size()];
		int i = 0;
		for (WebElement ele : elements) {
			String value = ele.getText();
			y[i] = value;
			i++;

		}
		return y;
	}

	public static String[] getTextFromManu(List<WebElement> elements, String[] expectedText) {
		String[] menuNames = new String[elements.size()];
		int i = 0;
		for (WebElement temporaryEle : elements) {
			menuNames[i] = temporaryEle.getText();
			System.out.println("Actual text : " + menuNames[i]);
			i++;
		}
		for (int x = 0; x < menuNames.length; x++) {
			if (expectedText[x].equals(menuNames[x])) {
				System.out.println("Index Number " + x + " matches");
			} else {
				System.out.println("Index Number: " + x + " does not match");
			}
		}
		return menuNames;
	}

	public static void clickOnAnyElement(WebElement ele) {
		ele.click();
	}

	public static void typeOnAnyElement(WebElement ele, String value) {
		ele.sendKeys(value);
	}

	public static void selectAnyElement(WebElement ele, String visibleText) {
		new Select(ele).selectByVisibleText(visibleText);
	}

	public static String verifyTitle(WebDriver dr,String expectedTitle) {
		String actualTitle = dr.getTitle();
		System.out.println("Actual title : " + actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle);
		return actualTitle;

	}

	public static String verifyURL(WebDriver dr) {
		String actualUrl = dr.getCurrentUrl();
		System.out.println("Actual Url : " + actualUrl);
		
		return actualUrl;

	}

}
