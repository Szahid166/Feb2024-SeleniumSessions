package seleniumSessions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Thread.sleep(1000);// 10sec. Static / hard wait--From JAVA
		
		
		// Dynamic wait: If element found in 2 sec then 8 sec will be cancelled 
		// 10sec-> 0 sec then --> 10 sec will be cancelled, it will not wait for whole 10 sec
		
		// Max is 10 sec
		// Implicit wait is Global wait and that means it will be applied for all the web elements by default
		
             WebDriver driver = new ChromeDriver();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    // after login page any elements I work with 10 sec will applied for each one of them
            // in that case its a performance killer
		    driver.get(" link: https://naveenautomationlabs.com/opencart/index.php?route=accout/login");
		
		    // nullify the imp wait == 0
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0)); 
		    
		    // in frame work implicit wait you should never use. 
		    
		    // Imp wait can't use for non wbelements such as : url, title, alerts
		
		
	}


}
