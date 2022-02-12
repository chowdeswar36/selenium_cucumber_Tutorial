package DataTable;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features\\datatable.feature",
glue = "DataTable",
monochrome = true,
dryRun = false,
plugin = {"pretty","html:target/html-records"})
public class Test_Runner {

}
