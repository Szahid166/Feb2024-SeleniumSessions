package mytests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	
		
	@Test(description="login page title")
	public void googletitleTest() {
		driver.get("https://www.google.com/");
		String title = driver.getTitle();
		System.out.println("page title :" + title);
		Assert.assertEquals(title, "google");
		//Assert.assertEquals(title, "Account login", "== title is not matched==");
	}
	
	@Test(description="checking loging page url")
	public void googleUrlTest() {
	String url = driver.getCurrentUrl();
	System.out.println("page url :" + url);
	Assert.assertTrue(url.contains("google"), "==url is not matched");
	
	}
	

	

	
}	


	
	
	
	

