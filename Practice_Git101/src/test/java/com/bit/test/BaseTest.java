package com.bit.test;

import org.junit.After;
import org.junit.Before;

public class BaseTest {
	
	@Before
	public void openBrowser() {
		System.out.println("Before");
		System.out.println("Before");
		
	}
	@After
	public void closeBrowser() {
		System.out.println("After");
		System.out.println("After");

		
	}

}
