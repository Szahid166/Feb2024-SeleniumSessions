package seleniumSessions;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleAndUrl {

	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
			
		By pricingLink = By.linkText("pricing");
		ElementUtil elutil = new ElementUtil(driver);
		elutil.clickWhenReady(pricingLink,10);
		
				
	// Note: because of using try catch block not getting the exception anymore.
	
		String title = waitFortitle("PRICING", 5);
        System.out.println(title);
        System.out.println(title.contains("PRICING"));
	// Create a utility so that it will work for any application for any titel
		
	}
	
	public static String waitFortitle(String titleFraction, int timeOut) {
		WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		try {
			 if (wait.until(ExpectedConditions.titleContains(titleFraction))) { // this line is giving exception
				 return driver.getTitle();	
			 }
			}
			
			catch(TimeoutException e) {
				System.out.println("Title not found");
				
			}
		return driver.getTitle();
	
	
	}
}
		
	
	
	

	


