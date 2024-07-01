package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
    // I can use this driver  anywhere in this class yes when it is static in nature. 
	// also no need to create an object
	// here only focused on id locator. (Seleminum session -ch-4)
	static WebDriver driver; 
	
	public static void main(String[] args) {
		
		// Create a webEliment (FE)and perform an action base on what type of element it is. 
		// launch the application
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// https://naveenautomationlabs.com/opencart/index.php?route=accout/login
		
		// #1 Approch:
		// way to get the element
//		driver.findElement(By.id("input-email")).sendKeys("samia@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test123");
	
		
		// #2 Approch-> 2nd one is better because reference variables are reuseble.
		// Store the refeance name in webelement like a String. This webelement is Interface
		// creating 1st part of webelementand maintain it for reuse 
//		WebElement emailId = driver.findElement(By.id ("input-email"));
//		WebElement password= driver.findElement(By.id ("input-password"));
//		
//		emailId.sendKeys("samia@gmail.com");
//		password.sendKeys("test123");
		
		// #3 approch- Is By Locator--> OR= Object Locator
		
		//By.id("input-email");
//		//store in By class reference variavle
		//By emailId = By.id("input-email");
		//By password = By.id("input-password");
//		
		//WebElement emailId_ele = driver.findElement(emailId);
	   // WebElement pwd_ele = driver.findElement(password);
//		perform an action 
	   // emailId_ele.sendKeys("samia@gmail.com");
		//pwd_ele.sendKeys("test123");
		
	
		

		// 4. By locator + Generic function for webelements
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("test@123");
//					

	
	
	// above  code did not work for me--> java.lang.NullPointerException
	// 5  By locator + Generic function for webelements and sendkeys
	
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");

		
//		doSendKeys(emailId,"naveen@gmail.com");
//		doSendKeys(password, "test@123");

        //java.lang.NullPointerException

		//6. By locator + Generic functions for webelements and sendKeys: Create ElementUtil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		ElementUtil eleUtil1 = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId,"naveen@gmail.com");
		eleUtil.doSendKeys(password, "test@123");
		
		//7. By locator + BrowserUtil + ElementUtil  // 
		
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

}