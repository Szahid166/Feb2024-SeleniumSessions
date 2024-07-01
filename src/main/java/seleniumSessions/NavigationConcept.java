package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {
	
	    // go to url
		// back
		// forward
		// refresh
	
static WebDriver driver;
		
public static void main(String[] args) {
			
		driver = new ChromeDriver();//123
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		
		// driver.navigate().to("https://www.amazon.com");  // navigate to also works
		
		//Azazon
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		
		// back on google
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// Amazon
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		// google
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		// how get method and navigate to method works internally: you can call get method direcltly or when you use navigate method it call get mathod internally. 
		// there is basically no difference between both mathod
		
		// refresh mathod use only page is blank otherwise it might give exception
		
		//driver.navigate().refresh();// refresh the page
		

	}

}
