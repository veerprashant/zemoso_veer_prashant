package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/Demo.feature",
        glue = "stepDefination",
        dryRun = false,
        tags = "@US-1001 not @"

)
public class RunnerForTags {
}

