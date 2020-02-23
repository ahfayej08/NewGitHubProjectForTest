package com.bit.ui.test;

import java.io.File;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Log4Practice {
	
	Logger log = Logger.getLogger(Log4Practice.class);
	@Test
	public void test1() {
		DOMConfigurator.configure("log4j.xml");
		log.fatal("fatal");
		log.error("error");
		log.warn("warn");
		log.info("info");
		log.debug("debug");
		log.trace("trace");
	}
	
	WebDriver dr;
	WebElement ele;
	@Test
	public void windowHandle() {
		Actions a = new Actions(dr);
		String pwin = dr.getWindowHandle();
		a.contextClick(ele).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER);
		Set<String> cwin = dr.getWindowHandles();
		for(String win : cwin) {
			if(!win.equals("pwin")) {
				dr.switchTo().window(win);
			}
		}
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
