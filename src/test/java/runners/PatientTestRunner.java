package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\naushad.alam\\eclipse-workspace\\DaVitaCucumberFramework\\src\\test\\resources\\functionalTests\\Patient.feature",
glue= {"stepDefinitions"},
plugin = { "pretty", "html:test-output", "json:json_output/cucumber.json"},
monochrome = true,
strict = true,
dryRun = false
  )

@Test

public class PatientTestRunner extends AbstractTestNGCucumberTests {

}
