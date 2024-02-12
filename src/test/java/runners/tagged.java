package runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\Tagged.feature",
glue = "stepDefinitions", tags = "@regression")
public class tagged extends AbstractTestNGCucumberTests {





