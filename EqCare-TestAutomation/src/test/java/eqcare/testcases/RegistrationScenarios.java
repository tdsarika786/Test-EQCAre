package eqcare.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import eqcare.pages.LoginPage;
import eqcare.pages.RegistrationPage;
import eqcare.pages.BaseClass;

public class RegistrationScenarios extends BaseClass {

	RegistrationPage register;
	
	@Test
	public void registerToApplication() throws InterruptedException
	{
		register=PageFactory.initElements(driver, RegistrationPage.class);
		
		register.notEnrolledRegisteration();
		
		
	}

}