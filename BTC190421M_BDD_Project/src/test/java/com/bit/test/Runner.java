package com.bit.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\user1\\eclipse-workspace\\BTC190421M_BDD_Project\\login.feature" }, 
tags = {"@smoke" },plugin = {"pretty", "html:login"})
/*
 * what is glue?
 * It contains the location of Feature Files and
 * the package containing the corresponding Step Files. 
 * 
 * what is features?
 * just to run particular feature 
 */

public class Runner {

}
