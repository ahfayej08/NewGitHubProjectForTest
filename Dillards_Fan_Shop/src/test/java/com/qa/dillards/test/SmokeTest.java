package com.qa.dillards.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.qa.dillards.pages.HomePage;
import com.qa.utility.Helper;

public class SmokeTest extends BaseTest{
	HomePage homePage;
	
	@Test
	public void homePageTest() throws IOException {
		homePage = new HomePage(dr);
		homePage.titleTest();
		homePage.urlTest();
		homePage.logoTest();
		Helper.takeScreenShot("Dillard_screenShot");
		
	}

}
