package naveenTestNGSessions2024;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenCartLogingTest {
	
	WebDriver driver;
	// @beforeMathod -> will run for each and every TC
	@BeforeTest
	public void setup () {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
				
	}
	
	@Test(description="login page title")
	public void loginPagetitleTest() {	
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Account Login");
		//Assert.assertEquals(title, "Account login", "== title is not matched==");
	}
	
	@Test(description="checking loging page url")
	public void loginPageUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println("page url :" + url);
	Assert.assertTrue(url.contains("route=account/login"), "==url is not matched");
	
	}
	
	@Test (description="login page title")
	public void loginPageLogoTest() {
		boolean flag = driver.findElement(By.cssSelector("img.img-responsive")).isDisplayed();
		//String url = driver.getCurrentUrl();
		//System.out.println("page title :" + url);
		Assert.assertEquals(flag, true);
	
	}
	// @AfterMathod--> will run after eaach test mathod too
	@AfterTest
	public void tearDown() {
		driver.quit();
		
	
		
// Note : add custome massage so it will print if the TC fail otherwise it will not print. 	
	
}	


}







