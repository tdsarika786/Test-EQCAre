package eqcare.helper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility {
	
	public static String getScreenshot(WebDriver driver) {
		
		String path = System.getProperty("user.dir") + "/Screenshots/Screenshot_" + getCurrentTime() + ".png";
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			
			FileHandler.copy(src, new File(path));
			
		} catch (IOException e) {
			
			System.out.println("Failed to capture screenshot");
			
		}
		return path;
	}

	public static String getCurrentTime() {
		
		DateFormat dateFormat = new SimpleDateFormat("ss_mm_HH_dd_MM_yyyy");

		Date date = new Date();

		return dateFormat.format(date);

	}


	public static WebElement waitForWebElement(WebDriver driver, By byLocator) {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(byLocator));

		return element;
	}

	

}
