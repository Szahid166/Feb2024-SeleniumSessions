package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	
	static WebDriver driver; 

	public static void main(String[] args) {
	
		 		
			
// Create a webEliment (FE)and perform an action base on what type of element it is. 
// launch the application
	driver = new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	// Lolators: 
	//1. id
//	driver.findElement(By.id("input-password")).sendKeys("test123");
//    driver.findElement(By.id("input-email")).sendKeys("samia@gmail.com");
	
	//2. name: can be duplicate
	//driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
			
	//3. class name: can be duplicate
	//driver.findElement(By.className("form-control")).sendKeys("test@gmail.com");
			
	//4. xpath: its not an attribute. xpath is the address of element in html dom
//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
//	driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
			
//5. cssSelector: its not an attribute.
	//css: cascaded style sheet
//	driver.findElement(By.cssSelector("#input-email")).sendKeys("naveen@gmail.com");
//	driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//	driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
			
//6. LinkText: only for links. htmltag <a>
	//driver.findElement(By.linkText("Register")).click();
			
//7. partialLinkText: only for links
	//driver.findElement(By.partialLinkText("Delivery")).click();
	//Delivery Information
	//Delivery Product
			
			
//8. tagName: html tag
//	String header = driver.findElement(By.tagName("h2")).getText();
//  System.out.println(header);
			
		

		
		
		
		
		
		
		
		
		
		

	}

}
