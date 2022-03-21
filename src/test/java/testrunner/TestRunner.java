package testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber.html"},
		monochrome=true, 
		tags = "@tag",
		features = {"src/test/resources/com.features"}, 
		glue= "stepdefinitions")


public class TestRunner{


}