package Asses1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\Asses1 .feature",
glue = "Asses1",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/html-records"})
public class Test_Runner {

}
