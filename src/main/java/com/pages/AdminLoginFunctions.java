package com.pages;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;

public class AdminLoginFunctions extends AdminLocators  {
	
		
		UtilitiesClass util;
		
		public AdminLoginFunctions() {
			util = new UtilitiesClass(driver);
		}
		
		public AdminLoginFunctions adminLogin(String admId,String admPassword) {
		util.sendKey(adminId, admId);
		util.sendKey(adminpassword, admPassword);
		util.click(loginButton);
		return new AdminLoginFunctions();
	}
}
