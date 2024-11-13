package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


//features is the features folder of features file
//glue is the folder of step definitions class
// monochrome is true for a good formatting inside the console
//Generate HTML Report and store it
@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Features/Background.feature", glue = {"StepDefinitions"},
monochrome = true,
plugin = { "pretty","html:target/HTMLReports/htmlReport.html",
					"json:target/JSONReports/jsonReport.json",
					"junit:target/JunitReports/junitReport.xml"}
//tags ="@SmokeTest and @Regression"
				)

public class RunnerTest {

}
