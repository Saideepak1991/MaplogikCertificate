package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.baseFactory.StudentBaseClass;
import com.pages.StudentCertificationPageLocator;

import com.pages.StudentLoginPageLocators;

import hooks.HooksClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StudentStepDefinition {
	StudentLoginPageLocators studentloginpagelocators;
	
	StudentCertificationPageLocator studentCertificatePageLocator;

	@Given("login student username and password")
	public void login_student_username_and_password() {
		studentloginpagelocators = new StudentLoginPageLocators();
		studentloginpagelocators.stuid();
		studentloginpagelocators.stuphonenum();
		studentloginpagelocators.loginbutton();
		studentloginpagelocators.getotp();
		studentloginpagelocators.submitbutton();
	}

	@Given("user click the Co-curriculam field and symposium field")
	public void user_click_the_co_curriculam_field_and_symposium_field() {
		studentCertificatePageLocator = new StudentCertificationPageLocator();
		studentCertificatePageLocator.cocurriculam();
		studentCertificatePageLocator.symposium();
	}

	@Then("user fill all the details in the symposiums field and submit")
	public void user_fill_all_the_details_in_the_symposiums_field_and_submit() {
		
		studentCertificatePageLocator.puttitle(1);
		studentCertificatePageLocator.event(1);
		studentCertificatePageLocator.symposiumconducted(1);
		studentCertificatePageLocator.dateandyear();
		studentCertificatePageLocator.level();
		studentCertificatePageLocator.award();
		studentCertificatePageLocator.certificate();
		studentCertificatePageLocator.submit();
			
		studentCertificatePageLocator.puttitle(12);
		studentCertificatePageLocator.event(12);
		studentCertificatePageLocator.symposiumconducted(12);
		studentCertificatePageLocator.dateandyear();
		studentCertificatePageLocator.level();
		studentCertificatePageLocator.award();
		studentCertificatePageLocator.certificate();
		studentCertificatePageLocator.submit();
			
		studentCertificatePageLocator.puttitle(123);
		studentCertificatePageLocator.event(123);
		studentCertificatePageLocator.symposiumconducted(123);
		studentCertificatePageLocator.dateandyear();
		studentCertificatePageLocator.level();
		studentCertificatePageLocator.award();
		studentCertificatePageLocator.certificate();
		studentCertificatePageLocator.submit();
	}

	@Then("click the logout button")
	public void click_the_logout_button() {
		studentCertificatePageLocator.StudentLogout();
	}
}
