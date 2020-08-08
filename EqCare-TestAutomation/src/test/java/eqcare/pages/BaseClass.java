package eqcare.pages;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import eqcare.factories.BrowserFactory;
import eqcare.factories.DataProviderFactory;


public class BaseClass {

	public WebDriver driver, driver1;

	
	@BeforeClass
	public void setUp()
	{
		System.out.println("Log:INFO- Setting up Browser and Application");
		
		driver=BrowserFactory.getApplication(DataProviderFactory.getConfig().getValue("Browser"),
			DataProviderFactory.getConfig().getValue("ponyEnv"));

		
		System.out.println("Log:INFO- Browser and application is ready");
	}
	
	@AfterClass
	public void tearDown()
	{
		System.out.println("Log:INFO- Terminating browser");
		
		BrowserFactory.closeApplication(driver);
		
		System.out.println("Log:INFO- Browser terminated");
	}
	
}
