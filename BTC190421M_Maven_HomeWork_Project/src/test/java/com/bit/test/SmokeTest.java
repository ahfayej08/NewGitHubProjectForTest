package com.bit.test;

import org.junit.Test;

import com.page.ActivewearJuniorPage;
import com.page.ActivewearPage;
import com.page.BackpackCheckOutPage;
import com.page.BackpacksPage;
import com.page.BackpacksProductDetailPage;
import com.page.CheckOutPage;
import com.page.HomePage;
import com.page.JeansPage;
import com.page.JeansProductDetailPage;
import com.page.JuniorProductDetailPage;
import com.page.ShoesCheckOutPage;
import com.page.ShoesFirstProductDetailPage;
import com.page.ShoesPage;
import com.page.SignInPage;
import com.page.UniformCheckOutPage;
import com.page.UniformProductDetailPage;
import com.page.UniformsPage;

public class SmokeTest extends BaseTest {
	/*
	 * Maven is a build automation tool used primarily for Java projects. 
	 * Maven addresses two aspects of building software: first, it describes how software is built, 
	 * and second, it describes its dependencies.
	 * src/main/java -creating all the senarioes for project
	 * src/main/resources -all the suporting file to build java
	 * src/test/java -test related files
	 * src/test/resources -test dependencies/suporting file for test
	 */
	HomePage homePage;
	
	ActivewearPage activewearPage;
	ActivewearJuniorPage activewearJuniorPage;
	JuniorProductDetailPage juniorProductDetailPage;
	CheckOutPage checkOutPage;
	
	SignInPage signInPage;
	
	ShoesPage shoesPage;
	ShoesFirstProductDetailPage shoesFirstProductDetailPage;
	ShoesCheckOutPage shoesCheckOutPage;
	
	BackpacksPage backpacksPage;
	BackpacksProductDetailPage backpacksProductDetailPage;
	BackpackCheckOutPage backpackCheckOutPage;
	
	UniformsPage uniformsPage;
	UniformProductDetailPage uniformProductDetailPage;
	UniformCheckOutPage uniformCheckOutPage;
	
	JeansPage jeansPage;
	JeansProductDetailPage jeansProductDetailPage;
	
	@Test
	public void buyProductOnJcPenny() {
		homePage = new HomePage(dr);
		homePage.hoverOverOnBackToSchool();
		activewearPage = homePage.clickOnActivewear();
		activewearJuniorPage = activewearPage.clickOnJunior();
		juniorProductDetailPage = activewearJuniorPage.clickOnFirstItem();
		juniorProductDetailPage.selectSizeForProduct();
		juniorProductDetailPage.selectQuantityForProduct();
		juniorProductDetailPage.clickaddToCart();
		juniorProductDetailPage.verifyTextIsDisplayed();
		checkOutPage = juniorProductDetailPage.clickCheckOut();
		signInPage = checkOutPage.clickOnCheckOutAgain();
		signInPage.verifySignInText();
		signInPage.typeEmail();
		signInPage.typePassWord();
		signInPage.clickSignIn();
		signInPage.verifyErrorText();
		
	}
	
	@Test
	public void buySecondProductOnJcPenny() {
		homePage = new HomePage(dr);
		homePage.hoverOverOnBackToSchool();
		shoesPage = homePage.clickOnShoes();
		shoesFirstProductDetailPage = shoesPage.clickOnFirstShoesProduct();
		shoesFirstProductDetailPage.selectShoeSize();
		shoesFirstProductDetailPage.clickShoeColor();
		shoesFirstProductDetailPage.clickAddToCart();
		shoesCheckOutPage = shoesFirstProductDetailPage.clickCheckOut();
		signInPage = shoesCheckOutPage.clickOnCheckOutAgain();
		signInPage.verifySignInText();
		signInPage.typeEmail();
		signInPage.typePassWord();
		signInPage.clickSignIn();
		signInPage.verifyErrorText();
		
	}
	
	@Test
	public void buyThirdProductOnJcPenny() {
		homePage = new HomePage(dr);
		homePage.hoverOverOnBackToSchool();
		
		backpacksPage = homePage.clickOnBackpacks();
		backpacksProductDetailPage = backpacksPage.clickOnFirstProductOfBackpacks();
		backpacksProductDetailPage.clickColor();
		backpacksProductDetailPage.clickAddToCart();
		backpackCheckOutPage = backpacksProductDetailPage.clickCheckOut();
		signInPage = backpackCheckOutPage.clickOnCheckOut();		
		
		signInPage.verifySignInText();
		signInPage.typeEmail();
		signInPage.typePassWord();
		signInPage.clickSignIn();
		signInPage.verifyErrorText();
		
	}
	
	@Test
	public void buyFourthProductOnJcPenny() {
		homePage = new HomePage(dr);
		homePage.hoverOverOnBackToSchool();
		
		uniformsPage = homePage.clickOnUniforms();
		uniformProductDetailPage = uniformsPage.clickOnFirstUniformProduct();
		uniformProductDetailPage.selectSize();
		uniformProductDetailPage.selectQuantity();
		uniformProductDetailPage.clickOnColor();
		uniformProductDetailPage.clickOnAddToCart();
		uniformCheckOutPage = uniformProductDetailPage.clickOnCheckOut();
		signInPage = uniformCheckOutPage.clickOnCheckOutAgain();
		
		signInPage.verifySignInText();
		signInPage.typeEmail();
		signInPage.typePassWord();
		signInPage.clickSignIn();
		signInPage.verifyErrorText();
		
	}
	
	@Test
	public void buyFifthProductOnJcPenny() {
		homePage = new HomePage(dr);
		homePage.hoverOverOnBackToSchool();
		
		jeansPage = homePage.clickOnJeans();
		jeansProductDetailPage = jeansPage.clickOnFirstJeansProduct();
		jeansProductDetailPage.selectSize();
		jeansProductDetailPage.selectQuantity();
		jeansProductDetailPage.clickOnAddToCart();
		checkOutPage = jeansProductDetailPage.clickOnCheckOut();
		checkOutPage.clickOnCheckOutAgain();
		
		signInPage.verifySignInText();
		signInPage.typeEmail();
		signInPage.typePassWord();
		signInPage.clickSignIn();
		signInPage.verifyErrorText();
		
	}
	

}
