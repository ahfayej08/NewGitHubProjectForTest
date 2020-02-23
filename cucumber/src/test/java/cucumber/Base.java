package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	WebDriver driver;
	
	public void  openBrowser() 
	{
		System.out.println("chrome browser opened");
		System.setProperty("webdriver.chrome.driver", "/Users/bittechconsulting/Downloads/chromedriver");
		 driver=new ChromeDriver();
		 driver.get("https://www.eshopper24.com/");
	}

}
