package com.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = { "C:\\Users\\user1\\eclipse-workspace\\A\\Feature\\Autotrader.feature"},
		glue = {"C:\\Users\\user1\\eclipse-workspace\\A\\src\\test\\java\\com\\test\\StepDefinationTest.java"},
		plugin = {"pretty", "html:Autotrader"})
public class CucumberRunner {

}
