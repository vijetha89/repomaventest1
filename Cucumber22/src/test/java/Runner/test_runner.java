package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//resources//Feature//login.feature"},
	glue= {"StepDefinition"},
	tags = "@Positive",
	dryRun=false, //to check whether you missed an step in the scenario 	
	monochrome=true, // to make the console output in better format
	strict=true, //it will check whether any step is not defined in step definition
	plugin= {"html:testoutput.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}
		)

public class test_runner {

}
