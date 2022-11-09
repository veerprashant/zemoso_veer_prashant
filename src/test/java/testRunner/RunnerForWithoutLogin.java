package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import java.awt.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".idea/AmazonAssignmentFeature/WithoutLogin.feature",
glue = "stepDefination",
        publish = true,
        dryRun = false
)
public class RunnerForWithoutLogin {
}
