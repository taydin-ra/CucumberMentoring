package utilities;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        plugin = {
                "html:target/cucumber-report",
                "json:target/cucumber.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/extent_report/index.html" // extent report plugin
        },
        tags = {"@SmokeTest"},
        features = {"src/test/java/featureFiles"},
        glue = {"StepDefinition"},
        dryRun =false
)
public class SmokeTest extends AbstractTestNGCucumberTests {
}
