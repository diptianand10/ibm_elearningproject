package testrunner;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue= {"stepdefinition", "hooks"},
        monochrome = true,
        tags={"@wall, @inbox"},
        plugin = { "pretty","html:reports/cucumber-pretty",
        		"json:reports/cucumber-pretty/Cucumber.json",
        		"junit:reports/cucumber-pretty/Cucumber.xml"}
        )

public class testrunner {
	
}