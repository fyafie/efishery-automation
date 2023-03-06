package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.drivers.DriverSingleton;

public class CheckoutPage {
private WebDriver driver;
	
	public CheckoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//div[2]/button[2]")
	WebElement Checkout;
	
	public void clickCheckoutBtn() {
		Checkout.click();
	}
	
	@FindBy(xpath = "//input[@id='first-name']")
	WebElement FirstName;
	public void fillFirstName(String FirstName){
        this.FirstName.sendKeys(FirstName);
    }
	
	@FindBy(xpath = "//input[@id='last-name']")
	WebElement LastName;
	public void fillLastName(String LastName){
        this.LastName.sendKeys(LastName);
    }
	
	@FindBy(xpath = "//input[@id='postal-code']")
	WebElement Zip;
	public void fillZip(String Zip){
        this.Zip.sendKeys(Zip);
    }
	
	@FindBy(xpath = "//input[@id='continue']")
	WebElement Continue;
	public void clickContinue() {
		Continue.click();
	}
	
	@FindBy(xpath = "//button[@id='finish']")
	WebElement Finish;
	public void clickFinish() {
		Finish.click();
	}
	
	@FindBy(xpath = "//h2[@class='complete-header']")
	WebElement Notification;
	public String getNotification() {
		return Notification.getText();
	}
}
