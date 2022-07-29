package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.baseFactory.StudentBaseClass;
import com.pages.StudentLoginFunctions;
import com.pages.StudentLoginPageLocators;
import com.pages.StudentUploadCertificate;

import hooks.HooksClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class StudentStepDefinition {

	StudentLoginFunctions studentFunction;
	StudentUploadCertificate studentuploadcertificate;
	

	@Given("enter userid {string} and phonenumber {string}")
	public void enter_userid_and_phonenumber(String studentid, String phonenumber) {
		studentFunction=new StudentLoginFunctions();
		studentFunction.loginstd(studentid, phonenumber);
		
	}

	@Given("user click the Co-curriculam field and symposium field")
	public void user_click_the_co_curriculam_field_and_symposium_field() {
		studentuploadcertificate=new StudentUploadCertificate();
		studentuploadcertificate.clickCocurriclar();
		
	}
	@Then("user fill all the details in the symposiums field and submit")
	public void user_fill_all_the_details_in_the_symposiums_field_and_submit(DataTable dataTable) {
		//studentuploadcertificate.uploadcertificate(String titletext,String eventselect,String conducted,String year,String levelselect,String awardselect);
		List<Map<String,String>> keyValue= dataTable.asMaps(String.class, String.class);
              // String title=keyValue.get(0).get("title");
		//for (Map<String, String> map : keyValue) {
	//		System.out.println(map);
		}
		
		

	@Then("click the logout button")
	public void click_the_logout_button() {
	   
	}
}
	



