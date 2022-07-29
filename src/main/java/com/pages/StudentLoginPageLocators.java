package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;



public class StudentLoginPageLocators extends StudentBaseClass {

	UtilitiesClass util;

	// By Locator

	public StudentLoginPageLocators() {
		util = new UtilitiesClass(driver);
	}

	public By stuId = By.id("login-student-id");

	public static By phoneNo = By.id("login-mobile");

	public static By loginButton = By.xpath("//*[text()='Log in']");

	public By testOtp = By.id("test_otp");

	public By loginOtpTextBox = By.id("login-otp");

	public By submitButton = By.xpath("//button[text()='Submit']");

	public static By logout = By.xpath("//*[@href='http://maplogik.com/index.php/student/logout']");

	public static By  cocurricularAchievements = By.xpath("//*[text()='Co Curricular Achievements']");

	public static By symposium = By.xpath("//*[text()='Symposium']");   

	public static By title = By.id("title");
	public static By eventcategory = By.xpath("//*[@name='category']");
	public static By symposiumconducted = By.id("conducted_by");

	public static By dateandyear = By.id("//*[@class='picker__button--today']");
	public static By level = By.xpath("//*[@name='level']");

	public static By award = By.xpath("//*[@name='award']");
	public static By certificate = By.id("certificate");
	public static By submitbutton = By.id("submitbtn");

}

