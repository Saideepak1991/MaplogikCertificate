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

	@FindBy(id = "login-email")
	public static WebElement adminId;

	@FindBy(xpath = "//*[@id='login-password']")
	public static WebElement adminPassword;

	@FindBy(xpath = "//*[text()='Log in']")
	public static WebElement loginButton;

	

	public void adminid() {
		adminId.sendKeys(prop.getProperty("admin_id"));
	}

	public void adminpassword() {
		adminPassword.sendKeys(prop.getProperty("admin_pass"));
	}

	public void loginbutton() {
		loginButton.click();
	}

	

	// public By adminId = By.id("login-email");

	// public By adminpassword = By.id("login-password");

	// public By loginButton = By.xpath("//*[text()='Log in']");

	// public By adminlogout =
	// By.xpath("//*[@href='http://maplogik.com/index.php/admin/logout']");

	// public By admincoCurricularAchivement = By.xpath("//*[text()='Co Curricular
	// Achievements']");

	// public By adminsymposium = By.xpath("//*[text()='Symposium']");

	// public By approval = By.xpath("//*[text()='Approved Symposiums']");

	// public By pending = By.xpath("//*[text()='pending Symposiums']");

	// public By decline = By.xpath("//*[text()='Decline Symposiums']");

	// public By searchbox = By.xpath("//*[@class='form-control form-control-sm']");
	// public By fetchtitle = By.xpath("//*[@class='odd']/td[3]");
}
