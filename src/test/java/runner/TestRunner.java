package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;

	//@RunWith(Cucumber.class)
	//@CucumberOptions(features= {"classpath:features/CucumberFeature.feature"}, glue = {"steps"},plugin = {"pretty"})
	@CucumberOptions(features= {"src/test/java/features"}, glue = {"steps"},plugin = {"pretty"})
	public class TestRunner extends AbstractTestNGCucumberTests{ //extends AbstractTestNGCucumberTests
		
		
	}
	
	

	