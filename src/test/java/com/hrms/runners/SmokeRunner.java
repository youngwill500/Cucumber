package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //An annotation that uses JUnit, it exeuctues the cumber.class, with this annotation JUnit will know it has to execute this case as a cucumber case
@CucumberOptions(
		features = "src/test/resources/features"
		,glue="com.hrms.steps"
		,dryRun=false
		,plugin= {"pretty","html:target/html/cucumber-default-report","json:target/cucumber.json"}
		,monochrome = true
		,tags= {"@smoke"}
		)

public class SmokeRunner {

}
