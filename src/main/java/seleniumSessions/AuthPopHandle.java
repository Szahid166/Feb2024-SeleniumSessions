package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String username = "admin";
		String password = "admin";
		driver.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		
		// Another popup is FileUpLoadPopUp
		
		
		

	}

}
