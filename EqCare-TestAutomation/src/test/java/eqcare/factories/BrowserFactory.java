package eqcare.factories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {

	public static void closeApplication(WebDriver driver) {
		
		driver.close();
		
	}

	public static WebDriver getApplication(String browser, String appURL) {
		WebDriver driver = null;

		if (browser.equalsIgnoreCase("Chrome")) {
		
			System.setProperty("webdriver.chrome.driver", "/Users/sarikadhall/Downloads/chromedriver");

			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
		driver.get(appURL);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		return driver;
	}

}
