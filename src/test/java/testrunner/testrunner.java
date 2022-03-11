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
//        dryRun = true,
        plugin = { "pretty","html:reports/cucumber-pretty"}
        )

public class testrunner {
	
}