package com.test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;

public class BaseTest {
	
	WebDriver dr;
	Properties pro = new Properties();
	
	public void openBrowser() {
		String browser = pro.getProperty("browser");
		if(browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}else if (browser.equals("firefox")) {
		
	}
	else if (browser.equals("ie")) {
		
	}
	else {
		System.out.println("Browser didn't match.");
	}
	
}
	
	public HomePage navigateToURL() {
		dr.get(pro.getProperty("url"));
		return new HomePage(dr);
	}
	
	public void closeBrowser() {
		dr.quit();
	}

}
