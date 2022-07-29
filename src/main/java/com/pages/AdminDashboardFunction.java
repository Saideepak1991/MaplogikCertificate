package com.pages;

import com.utilities.UtilitiesClass;

public class AdminDashboardFunction extends AdminLocators {

	UtilitiesClass util;

	public AdminDashboardFunction() {
		util = new UtilitiesClass(driver);
	}
	public void adminhomepage() {
		util.waitForElementPresent(admincoCurricularAchivement).click();
		util.waitForElementPresent(adminsymposium).click();
	}
	public void certificateapproval() {
		util.click(approval);
		util.sendKey(searchbox, "4RECSC0603");
		util.getText(fetchtitle);
		//util.sendKey(searchbox, fetchtitle);
		
	}
	public void certificatepending() {

		util.click(pending);
	}

	public void certificatedecline() {

		util.click(decline);

	}

}
