package com.cucumber.step_definitions;

import com.cucumber.pages.LoginPage;
import com.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLogin {

    private static WebDriver driver;
    private static ExtentTest extentTest;
    private LoginPage loginPage = new LoginPage();

    public TestLogin() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URL);
    }

    @When("User enter username password invalid")
    public void user_enter_username_password_invalid() {
    	loginPage.login("admin", "admin");
        extentTest.log(LogStatus.PASS, "User enter username password invalid");
    }

    @Then("User stay in login page")
    public void user_stay_in_login_page() {
    	Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.saucedemo.com/");
    	extentTest.log(LogStatus.PASS, "User stay in login page");
    }
    
    // Valid Login
    @When("User enter username password valid")
    public void user_enter_username_password_valid() {
        loginPage.login("standard_user", "secret_sauce");
        extentTest.log(LogStatus.PASS, "User enter username password valid");
    }
    
    @Then("User go to product page")
    public void user_go_to_product_page() {
        Assert.assertEquals(driver.getCurrentUrl().toString(), "https://www.saucedemo.com/inventory.html");
    	extentTest.log(LogStatus.PASS, "User go to product page");
    }
    
    @And("User click button login")
    public void user_click_button_login() {
    	loginPage.clickBtnLogin();
    	extentTest.log(LogStatus.PASS, "User click button login");
    }
    

}
