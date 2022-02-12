package background_steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="Features\\background.feature",
glue= {"background_steps"},
monochrome = true,
plugin = {"pretty","html:target/html-records"}
		)
public class Test_Runner {

}
