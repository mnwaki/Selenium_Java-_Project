package com.cucumber;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(
	format = {"pretty"},
	glue = "com.test",
	features = "classpath:cucumber"
		)

public class TestRunner {
	
}