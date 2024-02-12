package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "src\\test\\resources\\Feature\\add.feature",
glue = "stepDefinitions")
public class addExample extends AbstractTestNGCucumberTests{
	
}



