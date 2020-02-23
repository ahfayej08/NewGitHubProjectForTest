package com.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	
	RemoteWebDriver dr1;
	
	public void openB() {
		dr1 = new ChromeDriver();
	}
	
	WebDriver driver;
//	
//	
//	@Before
//	public void open() throws IOException {
//		String browser = System.getProperty("browser");
//		//String browser = prop.getProperty("browser");
//		if(browser.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
//			driver = new ChromeDriver();
//		}else if(browser.equals("firefox")) {
//			System.setProperty("webdriver.gecko.driver", "");
//			driver = new FirefoxDriver();
//		}else if(browser.equals("ie")) {
//			driver = new InternetExplorerDriver();
//		}
//		//driver.get(prop.getProperty("urlinhere"));
//	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	WebDriver dr;
	Properties prop;
	
	@Before
	public void open() throws IOException {
		prop = ReadPropFile.readFile("C:\\Users\\user1\\eclipse-workspace\\BTC190421M_MAVEN_PROJECT\\config.properties");
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr1 = new ChromeDriver();
			dr1.manage().window().maximize();
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			dr1 = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\msedgedriver.exe");
			dr1 = new EdgeDriver();
		}
		dr1.get(prop.getProperty("url"));
	}
	
	

}
