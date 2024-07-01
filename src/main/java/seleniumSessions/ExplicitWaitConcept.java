package seleniumSessions;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
			
		// wait (Interface)- until(); method, its an abstrac method. this method is inside the wait.
		driver = new ChromeDriver();
	    driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By passWord = By.id("input-password");  
		By logInBtn= By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
//		WebElement email_ele =wait.until(ExpectedConditions.presenceOfElementLocated(emailId));
//        email_ele.sendKeys("test@gmail.com");
//	    
//	    getElement(passWord).sendKeys("test@123");
//	    getElement(logInBtn).click();
		
		((WebElement) waitForElementPresence(emailId,10)).sendKeys("test@gmail");
		getElement(passWord).sendKeys("test@123");
		//getElement(logInBtn).click();
		waitForElementPresence(logInBtn,5).click();
	  }
	
	public static WebElement waitForElementPresence(By locator,int timeOut) {
		WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		return wait.until((Function<? super WebDriver, WebElement>) ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	
	
	  public static WebElement getElement(By locator) {
	  return driver.findElement(locator);
	  
	  }
	  
	  /**  Satturday May 25th
		 * An expectation for checking that an element is present on the DOM of a page.
		 * This does not necessarily mean that the element is visible.
		 * @param locator
		 * @param timeOut
		 * @return
		 */
		public static WebElement waitForElementPresence1(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	  
	  
		}		
		
		/*
		 * An expectation for checking an element is visible and enable ed such that you can click it.
		 * @param loactor
		 * Oparam timeOut
		 */
		public void clickWhenReady(By locator, int timeOut) {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(locator)).clear();
		}
		
		
	}
			
				
			
	
	
