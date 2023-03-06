package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.drivers.DriverSingleton;

public class LogoutPage {
private WebDriver driver;
	
	public LogoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//div[1]/div/button")
	WebElement Menu;

	public void clickMenuBtn() {
		Menu.click();
	}
	
	@FindBy(xpath = "//div[1]/nav/a[3]")
	WebElement Logout;
	
	public void clickLogout() {
		Logout.click();
	}
}
