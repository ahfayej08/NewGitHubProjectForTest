package com.qa.dillards.test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.dillards.pages.HomePage;
import com.qa.utility.Helper;
import com.qa.utility.ReadPropFile;

public class BaseTest {
	
	WebDriver dr;
	Properties prop;
	
	@BeforeMethod
	public void openBrowser() throws IOException {
		
		prop = ReadPropFile.readFile("C:\\Users\\user1\\eclipse-workspace\\Dillards_Fan_Shop\\src\\main\\java\\com\\qa\\config\\config.properties");
		String browser = prop.getProperty("browser");
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();
			dr.manage().deleteAllCookies();
			dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "");
			dr = new FirefoxDriver();
		}else if(browser.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\msedgedriver.exe");
			dr = new EdgeDriver();
		}else {
			System.out.println("Browser not found");
		}
		dr.get(prop.getProperty("url"));
	
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException, IOException {
		//Helper.takeScreenShot(dr, "dillards_screen_shot");
		Thread.sleep(3000);
		dr.quit();
		
	}

}
