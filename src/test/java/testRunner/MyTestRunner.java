package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features =
"C:\\Users\\SAI PAVEEN\\eclipse-workspace\\CucumberMaplogik\\src\\test\\java\\featuresFile\\Admin.feature",
glue={"stepDefinitions" , "hooks"} ,
dryRun=true

)


public class MyTestRunner {

}
