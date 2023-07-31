package runnerfiles;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="/cucumberdemoproject1/src/test/java/feature-file/demoregistration.feature ", 
glue= "StepDefinitions", tags="@RegressionTest")

public class demoregistration {

}
