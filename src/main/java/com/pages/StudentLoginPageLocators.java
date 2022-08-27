package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;



public class StudentLoginPageLocators extends StudentBaseClass {

	UtilitiesClass util;

	

	public StudentLoginPageLocators() {
		util = new UtilitiesClass(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "login-student-id")
	public WebElement stuId;  //studidtxtbox
	
	@FindBy(xpath="//*[@id='login-mobile']")
	public WebElement phoneNo;
	
	@FindBy(xpath="//*[text()='Log in']")
	public WebElement loginButton;
	
	@FindBy(xpath="//*[@id='test_otp']")
	public WebElement testOtp;
	
	@FindBy(xpath="//*[@id='login-otp']")
	public WebElement loginOtpTextBox;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement submitButton;
	
	public void stuid() {  //fillstuidtxtbox
		stuId.sendKeys(prop.getProperty("student_id"));
		//System.out.println(stuId);
	}
	public void stuphonenum() {
		phoneNo.sendKeys(prop.getProperty("stu_phnumber"));
	}
	public void loginbutton() {
		loginButton.click();
	}
	
	public void getotp() {
		util.waitForTextMatch(By.id("test_otp"));
		String getotp= testOtp.getText();
		loginOtpTextBox.sendKeys(getotp);
	}
	public void submitbutton() {
		submitButton.click();
	}
}


