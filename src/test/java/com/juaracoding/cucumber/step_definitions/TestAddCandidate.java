package com.juaracoding.cucumber.step_definitions;

import com.juaracoding.cucumber.pages.AddCandidatePage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAddCandidate {

    WebDriver driver;
    private static ExtentTest extentTest;
    private AddCandidatePage addCandidatePage = new AddCandidatePage();

    public TestAddCandidate() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //VALID
    @When("User click recruitment")
    public void user_click_recruitment() {
        addCandidatePage.clickMenuRecruitment();
        extentTest.log(LogStatus.PASS, "User click recruitment");
    }
    @When("User click add candidate")
    public void user_click_add_candidate() {
    	addCandidatePage.clickAddRecruitment();
    	extentTest.log(LogStatus.PASS, "User click add candidate");
    }
    @When("User enter full middle and last name")
    public void user_enter_full_middle_and_last_name() {
    	addCandidatePage.enterName("fauzan", "yafie", "muyassar");
    	extentTest.log(LogStatus.PASS, "User enter full middle and last name");
    }
    @When("User select vacancy")
    public void user_select_vacancy() {
    	addCandidatePage.selectVacancy();
    	
    	extentTest.log(LogStatus.PASS, "User select vacancy");
    }
    @When("User enter email")
    public void user_enter_email() {
    	addCandidatePage.enterEmail("fauzan@gmail.com");
    	extentTest.log(LogStatus.PASS, "User enter email");
    }
    @When("User enter phone number")
    public void user_enter_phone_number() {
    	addCandidatePage.enterContact("081234567890");
    	extentTest.log(LogStatus.PASS, "User enter phone number");
    }
    @When("User upload resume")
    public void user_upload_resume() {
    	addCandidatePage.uploadResume("C:\\Users\\fauza\\Documents\\upload.pdf");
    	extentTest.log(LogStatus.PASS, "User upload resume");
    }
    @When("User enter keyword")
    public void user_enter_keyword() {
    	addCandidatePage.enterKeyword("QA, Senior, Work");
    	extentTest.log(LogStatus.PASS, "User enter keyword");
    }
    @When("User enter date of application")
    public void user_enter_date_of_application() {
    	addCandidatePage.enterDate("2022-12-17");
    	extentTest.log(LogStatus.PASS, "User enter date of application");
    }
    @When("User enter notes")
    public void user_enter_notes() {
    	addCandidatePage.enterNotes("Lorem ipsum dolor sit amet.");
    	extentTest.log(LogStatus.PASS, "User enter notes");
    }
    @When("User click consent to keep data")
    public void user_click_consent_to_keep_data() {
    	addCandidatePage.clickConcent();
    	extentTest.log(LogStatus.PASS, "User click consent to keep data");
    }
    @When("User click save button")
    public void user_click_save_button() {
    	addCandidatePage.clickBtnSubmit();
    	extentTest.log(LogStatus.PASS, "User click save button");
    }
    @Then("User get success notification")
    public void user_get_success_notification() {
    	Assert.assertEquals(addCandidatePage.successMsg(), "Successfully Saved");
    	extentTest.log(LogStatus.PASS, "User click save button");
    }
    //INVALID
    @When("User enter full middle and last name invalid")
    public void user_enter_full_middle_and_last_name_invalid() {
    	addCandidatePage.enterName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    	Assert.assertEquals(addCandidatePage.nameValidation(), "Should not exceed 30 characters");
    	extentTest.log(LogStatus.PASS, "User enter full middle and last name invalid");
    }
    @When("User enter email invalid")
    public void user_enter_email_invalid() {
    	addCandidatePage.enterEmail("fauzan");
    	Assert.assertEquals(addCandidatePage.emailValidation(), "Expected format: admin@example.com");
    	extentTest.log(LogStatus.PASS, "User enter email invalid");
    }
    @When("User enter phone number invalid")
    public void user_enter_phone_number_invalid() {
    	addCandidatePage.enterContact("xxxxxxxxxxxx");
    	Assert.assertEquals(addCandidatePage.contactValidation(), "Allows numbers and only + - / ( )");
    	extentTest.log(LogStatus.PASS, "User enter phone number invalid");
    }
    @When("User upload resume invalid")
    public void user_upload_resume_invalid() {
    	addCandidatePage.uploadResume("C:\\Users\\fauza\\Documents\\ep1.pdf");
    	Assert.assertEquals(addCandidatePage.resumeValidation(), "Attachment Size Exceeded");
    	extentTest.log(LogStatus.PASS, "User upload resume invalid");
    }
    @Then("User get failed notification")
    public void user_get_failed_notification() {
    	Assert.assertEquals(addCandidatePage.addFailed(), "Recruitment");
    	extentTest.log(LogStatus.PASS, "User get failed notification");
    }
}
