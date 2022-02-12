package scenario_outline;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\scenario_outline.feature",
glue = "scenario_outline",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/html-records"})
public class Test_Runner {

}
