package com.bit.ui.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {
	
	WebDriver dr;
	
	@Test
	public void test1() throws InterruptedException {
		System.out.println("test1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.facebook.com/");
		Thread.sleep(2000);
		dr.quit();

	}
	@Test
	public void test2() throws InterruptedException {
		System.out.println("test2");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/");
		Thread.sleep(2000);
		dr.quit();
	}

}
