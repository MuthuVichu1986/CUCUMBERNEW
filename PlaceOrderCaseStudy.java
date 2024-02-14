package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\PlaceOrderCaseStudy.feature",
glue = "stepDefinition")
public class PlaceOrderCaseStudy extends AbstractTestNGCucumberTests {

}
