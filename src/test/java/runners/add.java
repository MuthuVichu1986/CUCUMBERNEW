package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\addition.feature",
glue = "stepDefinitions")
public class add extends AbstractTestNGCucumberTests{

}




