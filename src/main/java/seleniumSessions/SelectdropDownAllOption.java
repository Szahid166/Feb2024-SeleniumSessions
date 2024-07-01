package seleniumSessions;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectdropDownAllOption {

	static WebDriver driver;
	private static By country;
	
	

	public static void main(String[] args) {
		
	//htmltag = select
	// Select class in selenium have to use for select tag
		
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/contact-sales/");
		
    By country = By.id("Form_getForm_Country");
    By employee = By.id("Form_getForm_NoOfEmployees");	
		
	Select select_country = new	Select (driver.findElement(country));
	
	 List<WebElement> countryOptions = select_country.getOptions();	
    
    System.out.println(countryOptions.size()); // 233
    
    // My target is to catch eatch of every country
    
	for (WebElement e : countryOptions ) {
		String text = e.getText();
		System.out.println(text); // all the country name printed on the console
	}
		
  ////////////////////////////////////////////////////////////
	List<String> countryList = getDropDownOptionsTextList(country);
	System.out.println(countryList);
	
	List<String> empList = getDropDownOptionsTextList(employee);
	System.out.println(empList);

	
	System.out.println(getDropDownOptionsCount(country));// 233
	System.out.println(getDropDownOptionsCount(employee));//40
	

}

public static WebElement getElement(By locator) {
	return driver.findElement(locator);
}

public static int getDropDownOptionsCount(By locator) {
	Select select = new Select(driver.findElement(locator));
	return select.getOptions().size();

}

public static List<String> getDropDownOptionsTextList(By locator) {
	Select select = new Select(driver.findElement(locator));

	List<WebElement> optionsList = select.getOptions();
	List<String> optionsTextList = new ArrayList<String>();
	
	for (WebElement e : optionsList) {
		String text = e.getText();
		optionsTextList.add(text);
	}
	
	return optionsTextList;
	
	
	
	}
	
	
	}
	


