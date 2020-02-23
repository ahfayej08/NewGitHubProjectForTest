package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	
	/*
	 * testcase1
	 * go to bittechusa.com
	 * search for "Testominal" menu
	 * if find click on it
	 * 
	 * TestCase2
	 * go to eshopper24.com
	 * get first product from
	 * cotton saree in homePage then
	 * check whether the product is in 
	 * cotton sareePage or not
	 * 
	 * 
	 * 
	 * using .xml file we get to run our test in different way
	 * 
	 * 
	 * 
	 */
	
	
	
	
	
	
	WebDriver dr;
	Properties prop;

	@Before
	public void openBrowser() throws IOException {
		prop = ReadPropFile
				.readFile("C:\\Users\\user1\\eclipse-workspace\\BTC190421M_PracticeTest_In_Class\\config.properties");
		String browser = prop.getProperty("browser");
		

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();

		}else if(browser.equals("fireFox")) {
			System.setProperty("webdriver.geko.driver", "C:\\Users\\user1\\Downloads\\geckodriver.exe");
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
			
		}

	}

	@After
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(3000);
		dr.quit();
	}

}
