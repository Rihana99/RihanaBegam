package com.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\HP\\eclipse-workspace\\Develop\\new"
		+ "\\Feb_Cucumber\\src\\test\\java\\com\\app\\feature",
		glue = "stepdefinition",
		dryRun = false)

public class Runner {

}
