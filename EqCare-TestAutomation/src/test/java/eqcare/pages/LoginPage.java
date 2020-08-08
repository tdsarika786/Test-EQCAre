package eqcare.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import eqcare.helper.Utility;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	
	By user=By.name("textFieldInput");
	
	By password=By.name("password");
	
	By loginButton=By.xpath("//*[@data-role='login-button']");

	

	public void typeUserName()
	{
		Utility.waitForWebElement(driver, user).sendKeys("sarikaqa7+e1@gmail.com");
	}
	
	public void typePassword()
	{
		Utility.waitForWebElement(driver, password).sendKeys("Abcde#123");
		
	}
	
	public void clickOnLoginButton()
	{
		Utility.waitForWebElement(driver, loginButton).click();
	}
	
	


}