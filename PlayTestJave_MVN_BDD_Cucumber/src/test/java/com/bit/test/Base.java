package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	WebDriver dr;
	
	public void openBlankBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
	}
	public void goToURL() {
		dr.get("https://www.express.com/");
	}
	public void closeBrowser() {
		dr.quit();
		
	}
	

}
