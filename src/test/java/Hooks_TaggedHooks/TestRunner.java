package Hooks_TaggedHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"Features//Hooks_TaggedHooks.feature"},
glue = "Hooks_TaggedHooks",monochrome = true,
dryRun = false)
public class TestRunner {

}
