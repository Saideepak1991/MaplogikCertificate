package com.utilities;

import java.io.File;

import java.time.Duration;
import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseFactory.StudentBaseClass;

public class UtilitiesClass extends StudentBaseClass{

	WebDriver driver;
	WebDriverWait wait;
	Actions actions;

	public UtilitiesClass(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitForElementClickable(WebElement webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}

	public void uploadFile(WebElement element, String directory) {
		element.sendKeys(new File(directory).getAbsolutePath());
	}

	public void selectByText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public boolean waitForTextMatch(By locator) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		return wait.until(ExpectedConditions.textMatches(locator, Pattern.compile("\\d+")));
	}

	public WebElement waitForElementPresent(WebElement webelement) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		//WebElement element = driver.findElement(locator);
		return wait.until(ExpectedConditions.elementToBeClickable(webelement));
	}

	public void jsClick(String cssSelector) {
		((JavascriptExecutor) driver).executeScript("document.querySelector(" + cssSelector + ").click();");
	}


}