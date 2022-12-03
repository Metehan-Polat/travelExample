package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Case 1RegisterCoralTravel.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class RegisterCoralRunner extends AbstractTestNGCucumberTests {
}
