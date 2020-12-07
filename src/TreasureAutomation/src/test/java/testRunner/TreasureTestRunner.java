package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"feature"},
		glue = "stepDefinitions",
		monochrome = true

)

public class TreasureTestRunner {
	
	

}
