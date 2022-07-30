package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/test/java/featuresFile",
glue={"stepDefinitions" , "hooks"} ,
dryRun=false,
tags="@tag"

)
public class MyTestRunner {

}

//"C:\\Users\\SAI PAVEEN\\eclipse-workspace\\CucumberMaplogik\\src\\test\\java\\featuresFile\\Student.feature",