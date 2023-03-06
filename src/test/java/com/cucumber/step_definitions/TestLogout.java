package com.cucumber.step_definitions;

import com.cucumber.pages.LogoutPage;
import com.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogout {
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private LogoutPage logoutPage = new LogoutPage();
	
    public TestLogout() {
    	driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URL_ADD);
	}
    
    @When("User click menu")
    public void user_click_menu() {
        logoutPage.clickMenuBtn();
    	extentTest.log(LogStatus.PASS, "User click menu");
    }
    @When("User click logout")
    public void user_click_logout() {
        logoutPage.clickLogout();
    	extentTest.log(LogStatus.PASS, "User click logout");
    }
    @Then("User back to login page")
    public void user_back_to_login_page() {
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.saucedemo.com/");
    	extentTest.log(LogStatus.PASS, "User back to login page");
    }
}
