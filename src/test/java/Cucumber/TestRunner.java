package Cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (tags = "@validcredential", features ="src/test/java/cucumber", glue = "Cucumber.stepDefinitions", monochrome = true, plugin = {"html:report/cucumber.html"})
public class TestRunner extends AbstractTestNGCucumberTests
{
	
	
	

}
