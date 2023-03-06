package com.cucumber.step_definitions;

import com.cucumber.pages.AddPage;
import com.cucumber.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestAdd {

	private static WebDriver driver;
    private static ExtentTest extentTest;
    private AddPage addPage = new AddPage();
	
    public TestAdd() {
    	driver = Hooks.driver;
        extentTest = Hooks.extentTest;
        driver.get(Constants.URL_ADD);
	}
    
    @When("User click item")
	public void user_click_item() {
	    addPage.clickBtn();
	    extentTest.log(LogStatus.PASS, "User click item");
	}
	@Then("User get item in chart")
	public void user_get_item_in_chart() {
	    Assert.assertEquals(addPage.items(), "1");
	    extentTest.log(LogStatus.PASS, "User get item in chart");
	}
	
	@When("User click remove")
	public void user_click_remove() {
		addPage.clickBtn();
		extentTest.log(LogStatus.PASS, "User click remove");
	}
	@Then("User removed item in chart")
	public void user_removed_item_in_chart() {
	    Assert.assertEquals(addPage.itemNull(), "");
		extentTest.log(LogStatus.PASS, "User removed item in chart");
	}
}
