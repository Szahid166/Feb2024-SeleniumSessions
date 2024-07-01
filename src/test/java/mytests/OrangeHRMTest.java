package mytests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHRMTest extends BaseTest {

	
	//AAA
	
	@Test(description="login page title")
	public void OrangeHRMTtitleTest() {	
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "Book Your Free Demo | OrangeHRM");
		//Assert.assertEquals(title, "Account login", "== title is not matched==");
	}
	
	@Test(description="checking loging page url")
	public void OrangeHRMTUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println("page url :" + url);
	Assert.assertTrue(url.contains("Book Your Free Demo | OrangeHRM"), "==url is not matched");
	
	}
	
	
	
	// @AfterMathod--> will run after eaach test mathod too
	@AfterTest
	public void tearDown() {
		driver.quit();
		
}
}
