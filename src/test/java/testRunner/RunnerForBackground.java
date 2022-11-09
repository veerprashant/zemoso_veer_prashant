package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/Background.feature",
        glue = "stepDefination",
        dryRun = false,
        plugin = {"pretty","html:test-ouput"}
)
public class RunnerForBackground {

}
