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
	Properties prop;
	

	@Before
	public void openBrowser1() throws FileNotFoundException, IOException {
		openBrowser();
		driver.get(propRead().getProperty("student_login_url"));
	}
	@Before
	public void openbrowser2() throws FileNotFoundException, IOException {
		openBrowser();
		driver.get(propRead().getProperty("admin_login_url"));
	}

	//@After
//	public void tearDown() {
//		driver.close();

	}






