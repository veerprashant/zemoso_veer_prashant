package testRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".idea/AmazonAssignmentFeature/WithLogin.feature",
glue = "stepDefination",
        dryRun = false,
        publish = true
)
public class RunnerForWithLogIn {

}
