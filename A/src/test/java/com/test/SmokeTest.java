package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.HomePage;

public class SmokeTest {
	
	WebDriver dr;
//	BaseTest b;
//	HomePage hp;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		b = new BaseTest();
//		b.openBrowser();
	}
	
	@Test
	public void test() {
//		hp = b.navigateToURL();
		dr.get("https://www.autotrader.com/");
		System.out.println(dr.getTitle());
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
//		b.closeBrowser();
	}
	
	
	
	
	
	
	
	
	

}
