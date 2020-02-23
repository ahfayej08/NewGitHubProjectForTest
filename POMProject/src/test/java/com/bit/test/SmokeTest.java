package com.bit.test;

import org.junit.Test;

import pages.HomePage;
import pages.JeanPage;
import pages.MenJeanPage;
import pages.ProductDetailPage;

public class SmokeTest extends BaseTest {
	HomePage homePage;
	MenJeanPage menJeanPage;
	JeanPage jeanPage;
	ProductDetailPage productDetailPage;
	
	@Test
	public void buyJeansPant() {
		homePage = new HomePage(driver);
		homePage.hoverOverOnBackToSchool();
		jeanPage = homePage.clickOnJeans();
		jeanPage.verifyDiscountBanner();
		menJeanPage = jeanPage.clickMenJean();
		productDetailPage = menJeanPage.clickOnMenProduct();
		
	}

}
