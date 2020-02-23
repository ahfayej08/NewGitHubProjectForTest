package com.alu.test;

import org.testng.annotations.Test;

public class SmokeTest extends BaseTest{
	/*
	 * what is Page Object Model?
	 * Page Object Model is a design pattern which has become popular in test automation
	 * for enhancing test maintenance and reducing code duplication
	 * 
	 * why we need page object model? 
	 * The benefit is that if the UI changes for the page,
	 * the tests themselves don't need to change, 
	 * only the code within the page object needs to change.
	 *  
	 * what is the benefit of POM?
	 * avoid code duplication
	 * business readable 
	 * naming convention 
	 * Page Object Model is an Object Repository design pattern in Selenium WebDriver.
	 * Page Factory is an optimized way to create object repository in POM concept.
	 *  
	 *  what loadable component?
	 *  its an abstract class
	 *  
	 *  
	 *  
	 *  
	 * what is testNG?
	 * testNG is unit test framework
	 * TDD --test Driven Development 
	 * 
	 * what is the reason to use testNG?
	 * -design test cases in a sygstematic way
	 * - html report
	 * - different annotations
	 * - Priorities/sequence
	 * - dependency
	 * - grouping
	 * - data provider
	 * - 
	 * 
	 * testNG is open source, free jar files
	 * 
	 * 
	 * 
	 * 
	 * 	 */
	@Test
	public void aluTest1() {
		System.out.println("aluTest1 SmokeTest");
		System.out.println("hello");
		
	}
	
	@Test
	public void aluTest2() {
		System.out.println("aluTest2 SmokeTest");
		
	}
	
	@Test
	public void aluTest3() {
		System.out.println("aluTest3 SmokeTest");
		
		
	}

}
