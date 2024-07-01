package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDiverBasics {

	public static void main(String[] args) {
		
		
		// Java + selenium code + testng 7.0 
		// Auotomation Steps
		
		// open the browser:
			WebDriver driver = new ChromeDriver();
		    //  WebDriver driver = new FirefoxDriver();
		     // WebDriver driver = new EdgeDriver();
		     // WebDriver driver = new SafariDriver();// does not support on windows. Safari version 16 works only with Mac
		      
		
			// Enter the url
			driver.get("https://mail.google.com/mail/u/0/?tab=wm#inbox");
			//"https://google.com
			// Get the Title
			String title = driver.getTitle();
			System.out.println("page titel:" + title);//page titel:Google
		    
			// Validation point
		    // verify the title
			
			if (title.equals("google")) {
				System.out.println("title is correct");//title is not correct
			}
			else {
				System.out.println("title is not correct");
			}
		
			// Automation Steps _ validatio / checkpoints = Automation Testing
		    // get the url:
			String url = driver.getCurrentUrl();
			
		System.out.println("page url :"+ url);//page url :https://www.google.com/
		
		if(url.contains("google.com")) {
			System.out.println("url is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		// close the browser
		//driver.close();
		
	}

}
