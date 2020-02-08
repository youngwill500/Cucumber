package com.hrms.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) //An annotation that uses JUnit, it exeuctues the cumber.class, with this annotation JUnit will know it has to execute this case as a cucumber case
@CucumberOptions(
		features = "C:\\Users\\12406\\eclipse-workspace\\HrmsCucumberFramework\\src\\test\\resources\\features\\Login.feature"
		,glue="com/hrms/steps"
		,dryRun=false
		,plugin= {"pretty","html:target/html/cucumber-default-report"}
		,monochrome = true
		,tags= {"@regression"}
		)

public class RegressionRunner {

}
