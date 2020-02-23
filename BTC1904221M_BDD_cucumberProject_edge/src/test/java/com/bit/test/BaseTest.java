package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	WebDriver dr;
	
	public void open_Browser() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\MicrosoftWebDriver.exe");
		dr = new EdgeDriver();
	}
	public void nevigate_to_Url() {
		dr.get("https://www.seleniumhq.org/");
	}

}
