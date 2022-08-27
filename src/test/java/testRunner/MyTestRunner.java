package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/test/java/featuresFile",
glue={"stepDefinitions" , "hooks"} ,
dryRun=false,
tags="@tag",
monochrome=true,
plugin= {"pretty",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)
public class MyTestRunner {

}



//"C:\\Users\\SAI PAVEEN\\eclipse-workspace\\CucumberMaplogik\\src\\test\\java\\featuresFile\\Student.feature",