package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatoreConcept {

	

	



	public static void main(String[] args) throws InterruptedException   {
		
	// 	Website for practice: https://www.aqi.in/dashboard/canada
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.aqi.in/dashboard/canada");
	Thread.sleep(3000);
	WebElement ele = driver.findElement(By.linkText("Red Deer, Canada"));
		
	//String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	//System.out.println(leftRank);
	
	String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftRank);//9
 
    		
	String rightScore = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(rightScore);// 58
	
	
	String belowCity = driver.findElement(with (By.tagName("p")).below(ele)).getText();
	System.out.println(belowCity );//Saskatoon, Canada
	
	
	String abovecity = driver.findElement(with (By.tagName("p")).above(ele)).getText();
	System.out.println(abovecity);//Cold Lake, Canada
	
	// near the web element distance measure as CLOSE_IN_PIXELS = 50
	
	
	
		
	}

	
	}


