package hooks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseFactory.StudentBaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends StudentBaseClass {
	

	@Before(order=0,value = "@studentLogin")
	public void studenturl() {
		openBrowser();
		driver.get(prop.getProperty("student_login_url"));
	}
	
	@Before(order=1,value = "@admin")
	public static void AdminUrl() {
		openBrowser();
		driver.get(prop.getProperty("admin_url"));
	}

	@After
	public void tearDown() {
		driver.close();

	}
}





