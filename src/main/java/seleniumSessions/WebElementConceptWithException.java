package seleniumSessions;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {

	public static void main(String[] args) {
		
	WebDriver driver; 
	
	driver = new ChromeDriver();// 123
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
	// driver.FE does not find an element it throws "NoSuchElementException" 
	//driver.findElement(By.id("input-email11")).sendKeys("Test@gmail.com");
	
		
//	try {
//		 
//		driver.findElement(By.id("input-email")).sendKeys("Test@gmail.com");
//	}
//		catch(NoSuchElementException e) {
//			e.printStackTrace();
//		}
		
	//driver.findElement(By.id("input-password")).sendKeys("null");// null is not allowed in sendkey
	driver.findElement(By.id("input-password")).sendKeys("Test@123");
		
		
		

	}

}
