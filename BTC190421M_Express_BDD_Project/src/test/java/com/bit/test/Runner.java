package com.bit.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\user1\\eclipse-workspace\\BTC190421M_Express_BDD_Project\\compareTextOfArray.feature"},
tags = {"@smoke"}, plugin = {"pretty","html:verifyMenuText"})


public class Runner {

}
