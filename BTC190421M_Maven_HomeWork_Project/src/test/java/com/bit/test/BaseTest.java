package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	/*
	 * what is Page Object Model?
	 * Page Object Model is a design pattern which has become popular in test automation
	 * for enhancing test maintenance and reducing code duplication
	 * 
	 * why we need page object model? 
	 * The benefit is that if the UI changes for the page,
	 * the tests themselves don't need to change, 
	 * only the code within the page object needs to change.
	 *  
	 * what is the benefit of POM?
	 * avoid code duplication
	 * business readable 
	 * naming convention 
	 * Page Object Model is an Object Repository design pattern in Selenium WebDriver.
	 * Page Factory is an optimized way to create object repository in POM concept.
	 *  
	 *  what loadable component?
	 *  its an abstract class
	 *  
	 *  
	 *  
	 */
	WebDriver dr;
	Properties prop;
	
	@Before
	public void openBrowser() throws IOException {
		prop = ReadPropFile.readFile("C:\\Users\\user1\\eclipse-workspace\\BTC190421M_Maven_HomeWork_Project\\config.properties");
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.geko.driver", "C:\\Users\\user1\\Downloads\\geckodriver.exe");
			dr.manage().window().maximize();
			dr = new FirefoxDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new EdgeDriver();
			dr.manage().window().maximize();
		}else if(browser.equals("ie")) {
			System.setProperty("webdriver.internetexplorer.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new InternetExplorerDriver();
			dr.manage().window().maximize();
		}
		dr.get(prop.getProperty("url"));
		
	}
	
	@After
	public void close() throws InterruptedException {
		Thread.sleep(4000);
		dr.quit();
	}
	

}
