package com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utility.Helper;

public class HomePage {
	
	WebDriver dr;
	@FindBy(xpath="//div[text()='Back To School']") WebElement backToSchoolMainMenu;
	@FindBy(xpath="//a[text()='Activewear']") WebElement clickOnActivewearSubMenu;
	@FindBy(xpath="//a[@href='/g/shoes?s1_deals_and_promotions=CLEARANCE&id=dept20000018']") WebElement clickOnShoesSubMenu;
	@FindBy(xpath="//a[text()='Backpacks']") WebElement clickOnBackpacksSubMenu;
	@FindBy(xpath="//*[@id=\"sec:subMenuLevel2\"]/div/div/ul/li[1]/a") WebElement clickOnUniformsSubMenu;
	@FindBy(xpath="//*[@id=\"sec:subMenuLevel2\"]/div/div/ul/li[2]/a") WebElement clickOnJeansSubMenu;
	
	public HomePage(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
		
	}
	
	public void hoverOverOnBackToSchool() {
		Helper.mouseHoverOver(dr, backToSchoolMainMenu);
	}
	public ActivewearPage clickOnActivewear() {
		Helper.clickOnElement(clickOnActivewearSubMenu);
		return new ActivewearPage(dr);		
	}
	public ShoesPage clickOnShoes() {
		Helper.clickOnElement(clickOnShoesSubMenu);
		return new ShoesPage(dr);		
	}
	public BackpacksPage clickOnBackpacks() {
		Helper.clickOnElement(clickOnBackpacksSubMenu);
		return new BackpacksPage(dr);		
	}
	public UniformsPage clickOnUniforms() {
		Helper.clickOnElement(clickOnUniformsSubMenu);
		return new UniformsPage(dr);		
	}
	public JeansPage clickOnJeans() {
		Helper.clickOnElement(clickOnJeansSubMenu);
		return new JeansPage(dr);		
	}
	
	
	

}
