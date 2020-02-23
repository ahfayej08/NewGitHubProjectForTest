package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class MenJeanPage {
WebDriver driver;
	
	public MenJeanPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="") WebElement menJeanProduct;
	@FindBy(xpath="") WebElement menJean;
	
	public ProductDetailPage clickOnMenProduct() {
		Helper.clickOnElement(menJeanProduct);
		return new ProductDetailPage(driver);
		
	}

}
