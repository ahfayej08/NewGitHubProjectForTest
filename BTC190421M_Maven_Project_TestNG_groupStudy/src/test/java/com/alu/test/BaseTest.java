package com.alu.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
//  @Test(dataProvider = "dp")
//  public void f(Integer n, String s) {
//  }
	
	
  @BeforeMethod
  public void beforeMethod1() {
	  System.out.println("beforeMethod1");
	  
  }


  @BeforeMethod
  public void beforeMethod3() {
	  System.out.println("beforeMethod3");
  }
  @BeforeMethod
  public void beforeMethod4() {
	  System.out.println("beforeMethod4");
  }

  @AfterMethod
  public void afterMethod1() {
	  System.out.println("afterMethod1");
	  System.out.println("good day");

  }
  @AfterMethod
  public void afterMethod2() {
	  System.out.println("afterMethod2");
	  
  }
  
  @BeforeMethod
  public void beforeMethod2() {
	  System.out.println("beforeMethod2");
  }
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "a" },
//      new Object[] { 2, "b" },
//    };
//  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
