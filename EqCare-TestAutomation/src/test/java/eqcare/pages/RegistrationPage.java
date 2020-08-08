package eqcare.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import eqcare.helper.Utility;

public class RegistrationPage {

	WebDriver driver;

	public RegistrationPage(WebDriver ldriver) {
		this.driver = ldriver;
	}

	By registerLink = By.xpath("//*[@data-role='register-button']");

	By password = By.name("password");

	By password1 = By.xpath("(//*[@name='password'])[2]");

	By loginButton = By.xpath("//*[@data-role='login-button']");

	By emailAddress = By.xpath("//*[@placeholder='Enter your e-mail']");

	By firstName = By.xpath("//*[@placeholder='Enter your First Name']");

	By lastName = By.xpath("//*[@placeholder='Enter your Last Name']");

	By address = By.xpath("//*[@placeholder='Enter your address']");

	By city = By.xpath("//*[@placeholder='Enter your city']");

	By postalCode = By.xpath("//*[@placeholder='Enter your Postal Code']");

	By dob = By.xpath("//*[@placeholder='yyyy-mm-dd']");

	By phoneNumber = By.xpath("//*[@placeholder='Enter your phone number']");

	// By nextBtn = By.xpath("//*[@placeholder='account-info-step-next-button']");

//	By emailAdd = By.xpath("//*[@placeholder='Enter your phone number']");

//	By termsCond = By.xpath("//*[@placeholder='Enter your phone number']");

	By gender = By.xpath("//*[@for='gender-female']");

	By nextBtn = By.xpath("//*[@data-role='patient-info-step-next-button']");

	By checkBox1 = By.xpath("(//*[@name='checkboxFieldInput'])[1]");

	By checkBox2 = By.xpath("(//*[@name='checkboxFieldInput'])[2]");

	By confirmButton = By.xpath("//*[@data-role='confirmation-step-register-button']");

	By notCoverageButton = By.xpath("//*[@data-role='not-covered-button']");

	By accountInfoBtn = By.xpath("//*[@data-role='account-info-step-next-button']");

	By nextBtn2 = By.xpath("//*[@data-role='password-step-next-button']");

	By confirmationEmailText = By.xpath("//h2[text()='One last step']");

	
	
	public void notEnrolledRegisteration() throws InterruptedException {
		
		
		Utility.waitForWebElement(driver, registerLink).click();
		
		Utility.waitForWebElement(driver, notCoverageButton).click();

		Utility.waitForWebElement(driver, emailAddress).sendKeys("sarikaqa7+e2@gmail.com");

		Utility.waitForWebElement(driver, firstName).sendKeys("Sarika");

		Utility.waitForWebElement(driver, lastName).sendKeys("Test");

		Utility.waitForWebElement(driver, gender).click();
	
		Utility.waitForWebElement(driver, nextBtn).click();

		Utility.waitForWebElement(driver, address).sendKeys("Test 12");

		Utility.waitForWebElement(driver, city).sendKeys("Montreal");

		Utility.waitForWebElement(driver, postalCode).sendKeys("H3A 1C2");

		Utility.waitForWebElement(driver, dob).sendKeys("2000-11-11");

		Utility.waitForWebElement(driver, phoneNumber).sendKeys("514-222-2277");

		Utility.waitForWebElement(driver, accountInfoBtn).click();

		Utility.waitForWebElement(driver, password).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, password1).sendKeys("Abcde#123");

		Utility.waitForWebElement(driver, nextBtn2).click();	

		Utility.waitForWebElement(driver, checkBox1).click();

	    Utility.waitForWebElement(driver, checkBox2).click();

		Utility.waitForWebElement(driver, confirmButton).click();

		WebElement ele = Utility.waitForWebElement(driver, confirmationEmailText);
		
		String confirmationText = ele.getText();
		
		Assert.assertEquals(confirmationText, "One last step");
	}

}