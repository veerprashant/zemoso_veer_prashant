package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/LoginDD.feature",
       glue = "stepDefination",
        publish = true,
        dryRun = false
)
public class Run {
}
