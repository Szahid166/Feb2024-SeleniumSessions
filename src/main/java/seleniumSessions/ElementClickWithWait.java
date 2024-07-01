package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClickWithWait {

	public static void main(String[] args) {
		
		//User: apiautomation, Pwd: Selenium@12345 (S - cap)
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		
		By signupLink = By.linkText("Sign Up");
		
		ElementUtil elutil = new ElementUtil(driver);
		elutil.clickWhenReady(signupLink,10);
		
		
		
		
		
	}

}
