package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeysConcept {

	 static WebDriver driver; 
	public static void main(String[] args) {
					
	// Create a webEliment (FE)and perform an action base on what type of element it is. 
	// launch the application
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.findElement(By.id("input-password")).sendKeys("test123");
		driver.findElement(By.id("input-password")).sendKeys("null");// illigal argument exception


		String name = "naveen";
		String desg = "SDET";
		StringBuilder sb = new StringBuilder("Automation");
		StringBuffer sf = new StringBuffer("Selenium");


		driver.findElement(By.id("input-email")).sendKeys(name, " ", desg, "Google", sb, sf);
		
		//address field: aprt name, block, flat number, 
		
		
		
		
		
		
		
	}

}
