package com.baseFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StudentBaseClass {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;

	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAI PAVEEN\\OneDrive\\Desktop\\Testing\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		try {
			fis = new FileInputStream("./src/test/resources/config/config.properties");
			prop = new Properties();
			prop.load(fis);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
