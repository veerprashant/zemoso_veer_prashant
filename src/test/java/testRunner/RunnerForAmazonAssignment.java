package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".idea/AmazonAssignmentFeature/AmazonAssignment.feature",
        glue = "stepDefination",
        publish = true,
        dryRun = false,
        tags = "@WithoutLogin or @WithLogin"
)
public class RunnerForAmazonAssignment {


}
