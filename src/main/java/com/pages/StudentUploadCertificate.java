package com.pages;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;

public class StudentUploadCertificate extends StudentLoginPageLocators {
	
UtilitiesClass util;
	
	public StudentUploadCertificate() {
		util = new UtilitiesClass(driver);
	}
	
	
	public void clickCocurriclar() {
	//	util.waitForElementClickable(cocurricularAchievements).click();
		util.waitForElementPresent(cocurricularAchievements).click();
		util.waitForElementPresent(symposium).click();	
	  //  util.waitForElementClickable(symposium).click();	
	}
	
	public StudentUploadCertificate uploadcertificate(String titletext,String eventselect,String conducted,String year,String levelselect,String awardselect) {
		
		util.sendKey(title, titletext);
		util.selectByText(eventcategory, eventselect);
		util.sendKey(symposiumconducted, conducted);
		//util.sendKey(dateandyear,year);
		String selectTodayDateCss = "'button.picker__button--today'";
		util.jsClick(selectTodayDateCss);
	 
		util.selectByText(level, levelselect);
		util.selectByText(award, awardselect);
		//util.click(certificate);
		util.uploadFile(certificate,"./src/main/resources/certificate/certificate.pdf");
		util.click(submitbutton);
		return new StudentUploadCertificate();
	}

}
