package com.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber.drivers.DriverSingleton;

public class AddPage {
	private WebDriver driver;
	
	public AddPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
	
	@FindBy(xpath = "//div[1]/div[2]/div[2]/button")
	WebElement Add;
	
	public void clickBtn() {
		Add.click();
	}
	
	@FindBy(xpath = "//div[3]/a/span")
	WebElement items;
	
	public String items() {
		return items.getText();
	}
	
	@FindBy(xpath = "//div[3]/a")
	WebElement itemNull;
	
	public String itemNull() {
		return itemNull.getText();
	}
}
