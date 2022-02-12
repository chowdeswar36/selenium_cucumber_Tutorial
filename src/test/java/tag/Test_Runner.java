package tag;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\tag.feature",
glue = "tag",
monochrome = true,
dryRun = false,
tags = "@SmokeTest or @RegressionTest",
plugin = {"pretty","html:target/html-records"})
public class Test_Runner {

}
