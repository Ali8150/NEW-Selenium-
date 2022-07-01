package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/mohammadali/eclipse-workspace/Automation/src/test/java/features"
		,glue={"stepDefinition"}
		)

public class TestRunner {

}