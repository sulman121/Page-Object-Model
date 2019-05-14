package RunnerPackage;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/Feature", glue = { "Steps" }, dryRun = false, monochrome = true, plugin = {
				"pretty", "html:target/site/cucumber-pretty" }

)

public class Runner {

	private TestNGCucumberRunner testngcucumberrunner;

	@BeforeClass(alwaysRun = true)
	public void SetUpClass() throws Exception {

		testngcucumberrunner = new TestNGCucumberRunner(this.getClass());
	}

	@Test(dataProvider = "features")
	public void feature(PickleEventWrapper eventwrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable {

		testngcucumberrunner.runScenario(eventwrapper.getPickleEvent());
	}

	@DataProvider
	public Object[][] features() {
		return testngcucumberrunner.provideScenarios();
	}

	@AfterClass(alwaysRun = true)
	public void teardown() {
		testngcucumberrunner.finish();
	}

}
