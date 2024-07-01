package seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


// selenium session : 7

public class TotalLinks {
	
	    //total links
		//fetch the text of each link (if text is present)
		//check link is valid/not broken
		
		// find out total number of links and each and everything of the link
		
		static WebDriver driver;
		private static By img;
		private static List<WebElement> eleTextList;
		//private static List<String> eleTexttList;
	
		public static void main(String[] args) {
			
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");// total links =365
		//driver.get("https://naveenautomationlabs.com/opencart/");
		//driver.get("https://www.freshworks.com/"); //total links = 147
		
		// htmltag for link <a>
		// when we talk about multiple elements we have to use find elements. Mthos return type s list of elements
		
//		java.util.List<WebElement> linksList = driver.findElements(By.tagName("a"));
//		
//		// Total number of elements on th epage:
//		
//		System.out.println("total links = " + linksList.size());// total links = 73
//		
//		// fetch the text of each link (if text is present): need to create for loop
//		// write index based loop
//			
//		for(int i=0; i<linksList.size(); i++) {
//				String text = linksList.get(i).getText();
//					
//			// if the is space there is no link so we see blank space in betwwen that link does not have text
//			// get the links that has text in it and for that need to use below if condition
//				if(text.length()!=0) {
//						System.out.println(text);
//						
//					}
//			}
//		System.out.println("-----------");
//		
//		
//		for (WebElement e : linksList) {
//			String text = e.getText();
//			if(text.length()!=0) {
//				System.out.println(text);	
//			}
//			
//		}
//		
		
		By links = By.tagName("a");
		System.out.println("total links =" + getElementsCount(links));// total links =73
		
		// how to count  images on the page? Create another locator
		By images = By.tagName("img");
	
		System.out.println("total images =" + getElementsCount(images)); // total images =86
		
		// how to get text from the elelement of DOM ?
		List<String> linksTextList = getElementsTeXtList(links);
		System.out.println(linksTextList);
		
		System.out.println(linksTextList.contains("Shopping Cart"));
		}
		

		//// Create an utility for FindElements-> come out of main mathod
		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);    // find a wraper of 
		}
		// create another method-> give me the by locator I give you count
		public static int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		
		//WAF: to fetch the text of each link, store it in some list and return. text should not be a blank
		//name: getElementTextList
		//param: By locator
		//return: List<String>
		
		public static List<String> getElementsTeXtList(By locator) {
			List  <WebElement> eleList = getElements(locator);
			List<String>eleTextList = new ArrayList<String>();// pc =0
			
			
			for(WebElement e : eleList) {
				String text = e.getText();
					if(text.length()!=0) {
						eleTextList.add(text);
				}
				
				
			}
			
			
		return eleTextList;
	}

}
