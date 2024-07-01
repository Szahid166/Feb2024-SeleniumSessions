package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownHandling {
	
	static WebDriver driver;

	private static final String Bahrain = null;

	public static void main(String[] args) {
		
	//htmltag = select
	// Select class in selenium have to use for select tag
		
	driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/en/contact-sales/");
		
    By country = By.id("Form_getForm_Country");
   
    //Select select_country = new Select(driver.findElement(country));
    
    // 3 options are available
    // #1: selectByIndex
     // #2 :selectByVisibleText: this is the best option 
    // #3: selectByValue
    
    //    select_country.selectByIndex(4); // if index position change in that case value may not be correct
    //    select_country.selectByIndex(10);
    //    select_country.selectByVisibleText("Bahrain");// Bahrain this is the best option to chose 
    
    //      select_country.selectByValue("Angola");//give value attribute value from the DOM page
	
    By employee = By.id("Form_getForm_NoOfEmployees"); // Need to create another select class object for the Employee
   
//    Select select_employee = new Select(driver.findElement(employee));
//	select_employee.selectByVisibleText("51 - 75");
	
	
	
	 doSelectByValue(country,"Bangladesh");
	doSelectByValue(employee, "201 - 250");
	//doSelectBy(country, "Bangladesh") {
		
	}
	


	// Creating generic version on my own mathod so no need to repeat writing of object for each drop down element 
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

	public static void doSelectByIndex(By Locator, int index) {
		Select select = new Select (getElement(Locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectByVisbleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
}

	
	
	


