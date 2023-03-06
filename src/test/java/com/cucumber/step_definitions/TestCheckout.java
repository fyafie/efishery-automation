package com.cucumber.step_definitions;

import com.cucumber.pages.CheckoutPage;
import com.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckout {
	
	private static WebDriver driver;
    private static ExtentTest extentTest;
    private CheckoutPage checkoutPage = new CheckoutPage();
	
    public TestCheckout() {
    	driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URL_CHART);
	}
    
    @When("User click checkout")
    public void user_click_checkout() {
        checkoutPage.clickCheckoutBtn();
        extentTest.log(LogStatus.PASS, "User click checkout");
    }
    @And("User input name")
    public void user_input_name() {
        checkoutPage.fillFirstName("fauzan");
        extentTest.log(LogStatus.PASS, "User input name");
    }
    @And("User input last name")
    public void user_input_last_name() {
    	checkoutPage.fillLastName("yafie");
    	extentTest.log(LogStatus.PASS, "User input last name");
    }
    @And("User input zip")
    public void user_input_zip() {
        checkoutPage.fillZip("14045");
        extentTest.log(LogStatus.PASS, "User input zip");
    }
    @And("User click continue")
    public void user_click_continue() {
        checkoutPage.clickContinue();
        extentTest.log(LogStatus.PASS, "User click continue");
    }
    @And("User click finish")
    public void user_click_finish() {
        checkoutPage.clickFinish();
        extentTest.log(LogStatus.PASS, "User click finish");
    }
    @Then("User get success notification")
    public void user_get_success_notification() {
        Assert.assertEquals(checkoutPage.getNotification(), "Thank you for your order!");
        extentTest.log(LogStatus.PASS, "User get success notification");
    }
}
