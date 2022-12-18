package com.juaracoding.cucumber.pages;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.cucumber.drivers.DriverSingleton;

public class AddCandidatePage {
	private WebDriver driver;

    public AddCandidatePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(xpath = "//span[normalize-space()='Recruitment']")
    WebElement menuRecruitment;
    
    @FindBy(xpath = "//button[normalize-space()='Add']")
    WebElement btnAdd;
    
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    
    @FindBy(xpath = "//input[@placeholder='Middle Name']")
    WebElement middleName;
    
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div")
    WebElement vacancy;
    
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div/div/div[2]/div/div[2]/div[6]")
    WebElement vacancy2;
    
    @FindBy(xpath = "//input[@type=\"file\"]")
    WebElement resume;
  
    @FindBy(xpath = "//div[3]/div/div[1]/div/div[2]/input")
    WebElement email;
    
    @FindBy(xpath = "//div[3]/div/div[2]/div/div[2]/input")
    WebElement contact;
    
    @FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
    WebElement keywords;
    
    @FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
    WebElement date;
    
    @FindBy(xpath = "//textarea[@placeholder='Type here']")
    WebElement notes;
    
    @FindBy(xpath = "//div/div[2]/div/label/span/i")
    WebElement consent;
    
    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;
    
    @FindBy(xpath = "//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]")
    WebElement successMsg;
    
    //INVALID
    @FindBy(xpath = "//div[@class='oxd-input-group']//div[1]//span[1]")
    WebElement nameValidation;
    
    @FindBy(xpath = "//span[normalize-space()='Expected format: admin@example.com']")
    WebElement emailValidation;
    
    @FindBy(xpath = "//span[normalize-space()='Allows numbers and only + - / ( )']")
    WebElement contactValidation;
    
    @FindBy(xpath = "//span[normalize-space()='Attachment Size Exceeded']")
    WebElement resumeValidation;
    
    @FindBy(xpath = "//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
    WebElement addFailed;
    
    public void clickMenuRecruitment() {
    	menuRecruitment.click();
    }
    
    public void clickAddRecruitment() {
    	btnAdd.click();
    }
    
    public void enterName(String firstName, String middleName, String lasName) {
    	this.firstName.sendKeys(firstName);
    	this.middleName.sendKeys(middleName);
    	this.lastName.sendKeys(lasName);
    }
    
    public void selectVacancy() {
    	vacancy.click();
    	vacancy2.click();
    }
    
    public void uploadResume(String resume) {
    	this.resume.sendKeys(resume);
    }
    
    public void enterEmail(String email) {
    	this.email.sendKeys(email);
    }
    
    public void enterContact(String contact) {
    	this.contact.sendKeys(contact);
    }
    
    public void enterKeyword(String keywords) {
		this.keywords.sendKeys(keywords);
	}
    
    public void enterDate(String dateInvalid) {
    	date.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		date.sendKeys(dateInvalid);
	}
    
    public void enterNotes(String notes) {
		this.notes.sendKeys(notes);
	}
    
    public void clickConcent() {
		consent.click();
	}
    
    public void clickBtnSubmit() {
		btnSubmit.click();
	}
    
    public String successMsg() {
		return successMsg.getText();
	}
    
    public String nameValidation() {
    	return nameValidation.getText();
    }
    
    public String emailValidation() {
		return emailValidation.getText();
	}
    
    public String contactValidation() {
    	return contactValidation.getText();
	}
    
    public String resumeValidation() {
    	return resumeValidation.getText();
	}
    
    public String addFailed() {
		return addFailed.getText();
	}
}
