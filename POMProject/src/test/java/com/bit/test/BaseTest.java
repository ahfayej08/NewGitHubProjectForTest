package com.bit.test;

import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.utility.ReadPropFile;

public class BaseTest {
	WebDriver driver;
	Properties prop;
	
	@Before
	public void open() throws IOException {
		prop = ReadPropFile.readFile("C:\\Users\\user1\\eclipse-workspace\\POMProject\\config.properties");
		String browser = prop.getProperty("browser");
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			driver = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.get(prop.getProperty("url"));
		
	}

}
