package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSetup {

	public static void main(String[] args) {
		
		// This is old way before Selenimun manager introduce on version 4.6.0
		
		// windows :
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\fzahi\\Documents\\Samia\\Selenium Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/?tab=wm#inbox");
		
       // chrome (123)---> hrome driver. exc (123)
		// Selenium Manager: 
		
		
	}

}
