package mavendemo;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",
    glue = {"stepdefinition"},
    plugin = {"pretty", "html:target/cucumber-report.html"},
    monochrome = true
)
public class testrunner {
}
