package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForMultipleElement {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new ChromeDriver();
			driver.get("https://classic.crmpro.com/");
		
			WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(5));
		By topLinks = By.cssSelector("div#navbar-collaps a");
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(topLinks));
		
		
		
		

	}

}
