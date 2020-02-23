package MyRunner;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "C:\\Users\\user1\\eclipse-workspace\\BTC190421M_BDD_Project\\login.feature" }, 
tags = {"@smoke" },plugin = {"pretty", "html:login"})
public class TestRunner {

}
