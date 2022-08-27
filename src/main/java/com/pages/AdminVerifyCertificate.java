package com.pages;

import java.util.LinkedList;
import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseFactory.StudentBaseClass;
import com.utilities.UtilitiesClass;

public class AdminVerifyCertificate extends StudentBaseClass {

	UtilitiesClass util;

	public AdminVerifyCertificate() {
		util = new UtilitiesClass(driver);
		PageFactory.initElements(driver, this);  //.class
	}

	@FindBy(xpath = "//*[text()='Co Curricular Achievements']")
	public WebElement admincoCurricularAchivement;

	@FindBy(xpath = "//*[text()='Symposium']")
	public WebElement adminSymposium;

	@FindBy(xpath = "//*[text()='Approved Symposiums']")
	public WebElement approval;

	@FindBy(xpath = "//*[text()='pending Symposiums']")
	public WebElement pending;

	@FindBy(xpath = "//*[text()='Decline Symposiums']")
	public WebElement decline;

	@FindBy(xpath = "//*[@class='form-control form-control-sm']")
	public WebElement searchbox;

	@FindBy(xpath = "//*[@class='odd']/td[3]")
	public WebElement fetchtitle;

	@FindBy(xpath = "(//*[@class='item-edit'])[1]")
	public WebElement adminAction;

	@FindBy(xpath = "(//*[@class='btn btn-gradient-success'])[2]")
	public WebElement adminAPPorval;

	@FindBy(xpath = "(//*[@class='btn btn-gradient-success'])[1]")
	public WebElement adminDecline;

	@FindBy(xpath = "//*[@id='datatable']/tbody/tr/td[3]")
	public List<WebElement> CertificateTitles;

	@FindBy(xpath = "//*[@href='http://maplogik.com/index.php/admin/logout']")
	public WebElement adminlogout;

	public void admincocurricular() {
		util.waitForElementClickable(admincoCurricularAchivement).click();
	}

	public void adminsymposium() {
		util.waitForElementClickable(adminSymposium).click();
	}

	public void approval() {
		util.waitForElementClickable(approval).click();
	}

	public void pending() {
		pending.click();
	}

	public void decline() {
		util.waitForElementClickable(decline).click();
	}

	public void adminSearch() {
		searchbox.sendKeys(prop.getProperty("student_id"));
	}

	public void adminSelectTitile() {
		String text = fetchtitle.getText();
		searchbox.sendKeys(text);
	}

	public void adminaction() {
		adminAction.click();

	}

	public void adminApproval() {
		util.waitForElementClickable(adminAPPorval).click();
	}

	public void adminDecline() {
		adminDecline.click();
	}

	int num = 1;

	public void certificateSearch(String cerficateName) {
		List<WebElement> allTitles = CertificateTitles;
		for (int i = 0; i < allTitles.size(); i++) {
			String certificationDetailPage = "//*[@id='datatable']/tbody/tr[" + num + "]/td[6]/a[1]";
			if (allTitles.get(i).getText().equalsIgnoreCase(cerficateName)) {
				driver.findElement(By.xpath(certificationDetailPage)).click();
				break;
			} else {
				num++;
			}
		}
		
	}

	public List<String> actualCertificateTitle(String certifTitle) {
		List<String> actualTitle = new LinkedList<>();
		List<WebElement> allPendingTitles = CertificateTitles;
		for (WebElement element : allPendingTitles) {
			if (element.getText().equalsIgnoreCase(certifTitle)) {
				actualTitle.add(element.getText());
				break;
			} else {
				num++;
			}
		}
		return actualTitle;
	}

	public void adminLogout() {
		adminlogout.click();
	}
}


























