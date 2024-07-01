package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
	driver.findElement(By.name("upfile")).sendKeys("C:\\Users\\fzahi\\Documents\\Samia\\Java 6 Capture.PNG");
	
	// Note: When upload a file selenium can not interact with document window because its not a browser popup
	// In that carse few things need to keep in minde
	// Mendetory to have in Dom "type=file" attribute for choose file : windows/mac/linux
	//Have to use sendkey method not click
	// Have to get file path to add in the code with file nale
	// Go to document-> Click on the file-> right click on the open doc-> Click on File info-> Copy the path link
	// can upload any types of file with correct path
	
	
	/////////////////////////////////////////////
	//1. AutoIT - tool: only for windows -- not recommended
	//2. Sikuli -- lib: images
	//3. Robot class: Java: windows machine
	
	
	}

}
