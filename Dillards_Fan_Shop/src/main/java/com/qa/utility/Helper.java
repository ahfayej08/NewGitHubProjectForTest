package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.io.Files;

public class Helper {
	public static WebDriver dr;

	public static void click(WebElement ele) {
		waitForElement(ele).click();

	}

	public static void myEnter( WebElement ele) {
		Actions a = new Actions(dr);
		a.sendKeys(Keys.ENTER);
	}

	public static void hoverOver( WebElement ele) {
		Actions a = new Actions(dr);
		a.moveToElement(ele).build().perform();
	}

	public static void scrollDown() {
		JavascriptExecutor js = ((JavascriptExecutor) dr);
		js.executeScript("window.scrollBy(0,1000)");
	}

	public static WebElement waitForElement(WebElement ele) {
		ExpectedConditions.invisibilityOf(ele);
		return ele;
	}

	public static void type(WebElement ele, String value) {
		clearText(ele).sendKeys(value);
	}

	public static WebElement clearText(WebElement ele) {
		ele.clear();
		return ele;
	}

	public static void selectElementByIndex(WebElement ele, int indexNumber) {
		new Select(ele).selectByIndex(indexNumber);
	}

	public static void selectElementByVisibleText(WebElement ele, String visibleValue) {
		new Select(ele).selectByVisibleText(visibleValue);
	}

	public static void selectElementByValue(WebElement ele, String value) {
		new Select(ele).selectByValue(value);
	}
	
	public static String verfiyTitle(String expectedTitle) {
		String actualTitle = dr.getTitle();
//		boolean b = actualTitle.equals(expectedTitle);
//		System.out.println("Title is matched or not " + b);
		Assert.assertEquals(actualTitle, expectedTitle);
		return actualTitle;
	}

	public static String verfiyURL(String expectedURl) {
		String actualURL = dr.getCurrentUrl();
		boolean b = actualURL.equals(expectedURl);
		System.out.println("Url is matched or not " + b);
		return actualURL;
	}

	public static void verfiyLogo(WebElement ele) {
		boolean b = ele.isDisplayed();
		System.out.println("Logo is displayed or not " + b);
	}
	
	public static void takeScreenShot(String fileName) throws IOException {
		int num = (int)(Math.random()*1000)+1;
		File f = ((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
//		Files.copy(f, new File("C:\\Users\\user1\\eclipse-workspace\\Dillards_Fan_Shop\\ScreenShots"+fileName+num+".png"));
		
	}
	

}
