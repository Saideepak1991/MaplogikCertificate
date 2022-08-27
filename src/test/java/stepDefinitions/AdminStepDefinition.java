package stepDefinitions;

import java.util.List;

import org.junit.Assert;

import com.pages.AdminLocators;
import com.pages.AdminVerifyCertificate;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	AdminLocators adminLocators;
	AdminVerifyCertificate adminVerifyCertificate;

	@Given("admin login with emailId and password")
	public void admin_login_with_emailid_and_password() {
		adminLocators = new AdminLocators();
		adminLocators.adminid();
		adminLocators.adminpassword();
		adminLocators.loginbutton();
	}

	@When("click on co-curricular field from admin page and click symposium field")
	public void click_on_co_curricular_field_from_admin_page_and_click_symposium_field() {
		adminVerifyCertificate = new AdminVerifyCertificate();
		adminVerifyCertificate.admincocurricular();
		adminVerifyCertificate.adminsymposium();
	}

	@Then("click on pending button and search with studentId")
	public void click_on_pending_button_and_search_with_student_id() {
		adminVerifyCertificate.pending();
		adminVerifyCertificate.adminSearch();
	}

	@When("select certificate and click approve button")
	public void select_certificate_and_click_approve_button() {
		adminVerifyCertificate.certificateSearch(AdminVerifyCertificate.prop.getProperty("approve"));
		adminVerifyCertificate.adminApproval();
	}

	@When("select certificate  and click decline button")
	public void select_certificate_and_click_decline_button() {
		adminVerifyCertificate.certificateSearch(AdminVerifyCertificate.prop.getProperty("decline"));
		adminVerifyCertificate.adminDecline();
	}
	
	@Then("verify the pending certificate title")
	public void verify_the_pending_certificate_title() {
		adminVerifyCertificate.pending();
		List<String> actualCertificateTitle = adminVerifyCertificate.actualCertificateTitle(AdminVerifyCertificate.prop.getProperty("pending"));
		String expected = AdminVerifyCertificate.prop.getProperty("pending");
		Assert.assertEquals(expected, actualCertificateTitle.get(0));
	}

	@Then("verify the approve certificate title")
	public void verify_the_approve_certificate_title() {
		adminVerifyCertificate.approval();
		List<String> actualCertificateTitle = adminVerifyCertificate.actualCertificateTitle(AdminVerifyCertificate.prop.getProperty("approve"));
		String expected = AdminVerifyCertificate.prop.getProperty("approve");
		Assert.assertEquals(expected, actualCertificateTitle.get(0));
	}
	
	@Then("verify the decline certificate title")
	public void verify_the_decline_certificate_title() {
		adminVerifyCertificate.decline();
		List<String> actualCertificateTitle = adminVerifyCertificate.actualCertificateTitle(AdminVerifyCertificate.prop.getProperty("decline"));
		String expected = AdminVerifyCertificate.prop.getProperty("decline");
		Assert.assertEquals(expected, actualCertificateTitle.get(0));
	}
	@Then("click logout button")
	public void click_logout_button() {
		adminVerifyCertificate.adminLogout();
	}

	
}
