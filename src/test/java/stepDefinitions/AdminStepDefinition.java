package stepDefinitions;

import com.pages.AdminLoginFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminStepDefinition {
	AdminLoginFunctions adminLoginfunctions;
	@Given("admin login with emailId {string} and password {string}")
	public void admin_login_with_email_id_and_password(String Id, String password) {
		adminLoginfunctions= new AdminLoginFunctions();
		adminLoginfunctions.adminLogin(Id, password);
	}
	@When("click on co-curricular field from admin page and click symposium field")
	public void click_on_co_curricular_field_from_admin_page_and_click_symposium_field() {
	   
	}
	@Then("click on pending button and search with studentId {string}")
	public void click_on_pending_button_and_search_with_student_id(String string) {
	   
	}
	@When("select certificate {string} and click approve button")
	public void select_certificate_and_click_approve_button(String string) {
	  
	}
	@Then("click logout button")
	public void click_logout_button() {
	}

}
