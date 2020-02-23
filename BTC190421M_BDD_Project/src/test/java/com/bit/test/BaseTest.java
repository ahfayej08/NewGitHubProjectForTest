package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {
	//ChromeDriver dr;
	WebDriver dr;
	public void openBrowser1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}
//	public void openBrowser(String br) {
////		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
////		dr = new ChromeDriver();
//		if(br.equals("chrome")) {
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Downloads\\chromedriver.exe");
//			dr = new ChromeDriver();
//		}else if(br.equals("edge")) {
//			System.setProperty("webdriver.edge.driver", "C:\\Users\\user1\\Downloads\\MicrosoftWebDriver.exe");
//			dr = new EdgeDriver();
//		}else {
//			System.out.println("browser did not match");
//		}
//		
//	}
	
	/*
	 * public HomePage nevigateUrl() { //dr.get("https://www.facebook.com/");
	 * //return new HomePage(dr);
	 * 
	 * }
	 */
	
	

}
