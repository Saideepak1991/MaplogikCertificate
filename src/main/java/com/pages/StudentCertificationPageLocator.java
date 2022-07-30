package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;

public class StudentCertificationPageLocator extends StudentBaseClass{
	
UtilitiesClass util;
	
	public StudentCertificationPageLocator() {
		util = new UtilitiesClass(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[text()='Co Curricular Achievements']")
	public static WebElement cocurricularAchievements;
	
	@FindBy(xpath="//*[text()='Symposium']")
	public static WebElement symposium;
	
	@FindBy(xpath="//*[@id='title']")
	public static WebElement title;
	
	@FindBy(xpath="//*[@name='category']")
	public static WebElement eventcategory;
	
	@FindBy(xpath="//*[@id='conducted_by']")
	public static WebElement symposiumconducted;
	
//	@FindBy(xpath="//*[@class='picker__button--today']")
//	public static WebElement dateandyear;
	
	@FindBy(xpath="//*[@name='level']")
	public static WebElement level;
	
	@FindBy(id = "pd-months-year")
	public static WebElement dateAndYear;
	
	@FindBy(xpath="//*[@name='award']")
	public static WebElement award;
	
	@FindBy(id = "certificate")
	public static WebElement certificate;
	
	@FindBy(xpath="//*[@id='submitbtn']")
	public static WebElement submitbutton;
	
	public void cocurriculam() {
		util.waitForElementPresent(cocurricularAchievements).click();
	}
	public void symposium() {
		util.waitForElementPresent(symposium).click();
	}	
	
	public void puttitle(Integer sampNum) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Integer num=sampNum;
		String title1 ="title"+num.toString();
		title.sendKeys(prop.getProperty(title1));
	}
	public void event(Integer sampNum) {
		Integer num=sampNum;
		String Eve ="Event"+num.toString();
		util.selectByText(eventcategory, prop.getProperty(Eve));
	}
	public void symposiumconducted(Integer sampNum) {
		Integer num=sampNum;
		String contacted ="contactedBy"+num.toString();
		symposiumconducted.sendKeys(prop.getProperty(contacted));
	}
	public void dateandyear() {
		String selectTodayDateCss = "'button.picker__button--today'";
		dateAndYear.click();
		util.jsClick(selectTodayDateCss);
		//dateandyear.click();	
	}
	public void level() {
		util.selectByText(level, prop.getProperty("level"));
	}
	public void award() {
		util.selectByText(award, prop.getProperty("award"));
		
	}
	public void certificate() {
		util.uploadFile(certificate,prop.getProperty("certificate"));	
	}
	public void submit() {
		submitbutton.click();
	}
	
}