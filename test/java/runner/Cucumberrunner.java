package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features/Accounts.feature",
glue="stepdefinition",
monochrome = true,
publish = true
)
public class Cucumberrunner extends AbstractTestNGCucumberTests{

}
