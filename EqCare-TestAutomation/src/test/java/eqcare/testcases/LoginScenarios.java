package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.pages.BaseClass;

public class LoginScenarios extends BaseClass {

	LoginPage login;

	@Test
	public void loginToApplication() {
		
		login=PageFactory.initElements(driver, LoginPage.class);

		login.typeUserName();
		
		login.typePassword();
		
		login.clickOnLoginButton();
		
	}

	
}