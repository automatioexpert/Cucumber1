package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "features" },glue = 
"F:/SeleniumMastery/Cucumber1/src/main/java/features/Login1.feature")
public class TestRunner {

}
