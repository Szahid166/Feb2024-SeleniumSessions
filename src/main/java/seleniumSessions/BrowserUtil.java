package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {
    
	// Create reference Veriable at the class level
    WebDriver driver;	
    public WebDriver launchBrowser(String browserName) {
    	System.out.println("the browser name : " + browserName);
    	
    	switch(browserName.trim().toLowerCase()) {
    	case "chrome":
    		// first top casting
    		driver =new ChromeDriver();
    		break;
    		
    	case "firefox":
    		// 2nd top casting
    		driver =new FirefoxDriver();
    		break;
    		
    	case "edge":
    		// 3rd top casting
    		driver =new EdgeDriver();
    		break;
    		
    	case "safari":
    		// 4th top casting
    		driver =new SafariDriver();
    		break;
    		default:
    			// create own custome  exception class
    			System.out.println("plz pass the right browser..." + browserName);
    			throw new BrowserException("INVALID BROWSER..." + browserName);
    			
    			}
		     return driver;
    }
	
	// creating another Util
     public void launchURL(String url) {
    	  // use a check for url
    	 if(url == null) {
    		 throw new BrowserException("INVALID URL..." + url);
    		 
    	 }
    	 if(url.isBlank()   || url.isEmpty()) {
    		throw new BrowserException("BLANK/Empty URL..." + url); 
    		
    	 }
    	// https://www.google.com
 		if (url.indexOf("http") == -1 || url.indexOf("http") > 0) {
 			throw new BrowserException("HTTP(s) is missing or misplaced..." + url);
 			
     }
     
 		driver.get(url.trim());

 	}
    
 	public String getPageTitle() {
 		String title = driver.getTitle();
 		if(title==null) {
 			System.out.println("getting the null title....");
 			return null;
 		}
 		return title;
 	}

 	public String getPageCurrentURL() {
 		return driver.getCurrentUrl();
 	}

 	public void quitBrowser() {
 		driver.quit();
 	}

 	public void closeBrowser() {
 		driver.close();
  
 		
 		
 		
    
     }
	
	
	}



