package runner;


import org.testng.annotations.Test;

import controls.RetryAnalyzer;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"C://Users//samir//Downloads//Evalution b37//Alphabin Assignment//AmazonCucumber//amazonsearchfilter//src//test//resources//features//amazonSearch.feature"},
		glue = {"stepDefinition"}		
		)

@Test(retryAnalyzer = RetryAnalyzer.class)
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
