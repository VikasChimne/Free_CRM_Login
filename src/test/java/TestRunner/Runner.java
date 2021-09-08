package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
       (  features = "C:\\Users\\user\\eclipse-workspace\\Free_CRM_Login\\Features",//to tell cucumber where is your feature file are...
		glue = "StepDefinition", // to tell cucumber where is your step definition code reside in the framework......
		
		plugin = {"pretty", // to generate reports
			      
				"html:target/html/htmlreport.html",
			      "json:target/json/file.json",
		},
		dryRun = true, // to tell whether to test run(true) or actual run(false)

		monochrome = true
    		   )




public class Runner {

}
