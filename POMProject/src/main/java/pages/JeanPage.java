package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class JeanPage {
	WebDriver driver;
	
	
	public JeanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="") WebElement discountBanner;
	@FindBy(xpath="") WebElement menJean;
	
	public void verifyDiscountBanner() {
		Helper.verifyElement(discountBanner);
		
	}
	public MenJeanPage clickMenJean() {
		Helper.clickOnElement(menJean);
		return new MenJeanPage(driver);
		
	}

}
