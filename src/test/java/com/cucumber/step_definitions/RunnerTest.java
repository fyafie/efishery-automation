package com.cucumber.step_definitions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "",
        features = {"src/main/resources/features/01.Login.feature",
        		"src/main/resources/features/02.Add.feature",
        		"src/main/resources/features/03.Checkout.feature",
        		"src/main/resources/features/04.Logout.feature"
					},
        glue = "com.cucumber.step_definitions",
        plugin = {"pretty","html:target/cucumber-reports.html","json:target/cucumber.json"})
public class RunnerTest extends AbstractTestNGCucumberTests {

}
