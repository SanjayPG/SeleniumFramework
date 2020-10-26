package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;



	//@RunWith(Cucumber.class)
	//@CucumberOptions(features= {"classpath:features/CucumberFeature.feature"}, glue = {"steps"},plugin = {"pretty"})
	@CucumberOptions(features= {"src/test/java/features"}, glue = {"steps"},plugin = {"pretty"})
	public class TestRunner extends AbstractTestNGCucumberTests{ //extends AbstractTestNGCucumberTests
		private TestNGCucumberRunner testNGCucumberRunner=null;
		
		@BeforeClass(alwaysRun=true)
		public void setupClass()
		{
			testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
		}
		
		@Test(dataProvider = "features")
		public void runTest(CucumebrFeatureWrapper cucumebrFeatureWrapper)
		{
			testNGCucumberRunner.runScenario(pickle);
		}
		
		
		@DataProvider
		public Object[][] features()
		{
			return testNGCucumberRunner.provideScenarios();			
		}
		
		@AfterClass(alwaysRun=true)
		public void finish()
		{
			testNGCucumberRunner.finish();
		}
		
		
	}
	
	

	