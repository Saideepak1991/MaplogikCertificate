package com.pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;

public class AdminLocators extends StudentBaseClass {

	UtilitiesClass util;

	public AdminLocators() {
		util = new UtilitiesClass(driver);
		PageFactory.initElements(driver, this);
	}
// command
	@FindBy(id = "login-email")
	public WebElement adminId;

	@FindBy(xpath = "//*[@id='login-password']")
	public WebElement adminPassword;

	@FindBy(xpath = "//*[text()='Log in']")
	public WebElement loginButton;

	public void adminid() {
		adminId.sendKeys(prop.getProperty("admin_id"));
	}

	public void adminpassword() {
		adminPassword.sendKeys(prop.getProperty("admin_pass"));
	}

	public void loginbutton() {
		loginButton.click();
	}

	
}
