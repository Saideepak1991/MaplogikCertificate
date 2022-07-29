package com.pages;

import com.utilities.UtilitiesClass;

public class StudentLoginFunctions extends StudentLoginPageLocators {

	UtilitiesClass util;
	
	public StudentLoginFunctions() {
		util = new UtilitiesClass(driver);
	}
	
	public StudentLoginFunctions loginstd(String stdid, String phoneNumber) {
		util.sendKey(stuId, stdid);
		util.sendKey(phoneNo, phoneNumber);
		util.click(loginButton);
		util.waitForTextMatch(testOtp);
		String otp = util.getText(testOtp);
		util.sendKey(loginOtpTextBox, otp);
		util.click(submitButton);
		return new StudentLoginFunctions();
}
//	public void logout() {
//		util.click(submitbutton);
//	}
}