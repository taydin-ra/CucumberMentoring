package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-report"
        },
        tags = {"@SmokeTest"},
        features = {"src/test/java/featureFiles"},
        glue = {"StepDefinition"},
        dryRun = false
)
public class SmokeTest extends AbstractTestNGCucumberTests {
}
