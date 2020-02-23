package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
//	List of steps run before each of the scenarios

	WebDriver dr;

	public void open_Browser(String b) { 
		if (b.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
			dr = new ChromeDriver();
			dr.manage().window().maximize();

		} else if (b.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\MicrosoftWebDriver.exe");
			dr = new EdgeDriver();
			dr.manage().window().maximize();

		} else {
			System.out.println("browser didn't match");
		}
	}
	
	public HomePage nevigatetoURL() {
		dr.get("https://www.express.com/");
		return new HomePage(dr);
		
	}

	public void close_Browser() {
		dr.quit();
	}

}
