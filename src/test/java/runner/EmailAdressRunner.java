package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

        features = {"src/test/java/feature/Case 2 This email address is already registered in the system.feature"},
        glue = {"stepDefinition"},
        dryRun = false
)
public class EmailAdressRunner extends AbstractTestNGCucumberTests {
}
