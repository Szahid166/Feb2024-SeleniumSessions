package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DulicateElements {

	public static void main1(String[] args) {
		
	}
		
		static WebDriver driver;

		public static void main(String[] args) {

			driver = new ChromeDriver();// 123
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	
			// driver.findElement(By.linkText("Forgotten Password")).click(); // ignore whe created internar public static mathod 
		
			By forgotpwdLink = By.linkText("Forgotten Password");
			By logInLink = By.linkText("login");
			doClick(forgotpwdLink);
			doClick(logInLink);
			
		}
		
		private static void doClick(By forgotpwdLink) {
			// TODO Auto-generated method stub
			
		}

		public static void doClicl(By locator) {
			getElement (locator).click();
		}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}

	

	}


