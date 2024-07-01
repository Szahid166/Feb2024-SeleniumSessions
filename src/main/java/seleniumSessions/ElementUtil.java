package seleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

public class ElementUtil {
	
	//here using private excess via constractor
	
	private static WebDriver driver;
	 public ElementUtil(WebDriver driver) {
		 this.driver = driver;
		 
	 }
	 
	// thing is internal machanism and concept applied encapculation
	 private void nullcheck(String value) {
		 if (value ==null) {
				throw new ElementException( " Value is Null " + value);
			}
			
	 }
	
	public  void doSendKeys(By locator, String value) {
		nullcheck(value);
		
		((WebElement) getElement(locator)).sendKeys(value);
	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
	
	
// updateding above code using try/ catch in Util for  NoSuchElementException
	public static WebElementConcept getElement(By locator) {
		try {
			WebElementConcept element = (WebElementConcept) driver.findElement(locator);
			return element;
		} catch (NoSuchElementException e) {
			System.out.println("Element is not present on the page..." + locator);
			e.printStackTrace();
			return null;
	
	
	}

}
//**********************************************************************
	public void doClicl(By locator) {
		((WebElement) getElement (locator)).click();
		
	}
	
	public String doGetText(By locator) {
		
		return ((WebElement) getElement(locator)).getText();
	}
	
public  String doGetAttribute(By locator,String attrName) {
		
		return ((WebElement) getElement(locator)).getAttribute(attrName);
	
}	

// added to element Util page after Totallink created
public  List<WebElement> getElements(By locator) {
	return driver.findElements(locator);    // find a wraper of 
}
// create another method-> give me the by locator I give you count
public  int getElementsCount(By locator) {
	return getElements(locator).size();
}


public  List<String> getElementsTeXtList(By locator) {
	List<WebElement> eleList = getElements(locator);
	List<String>eleTextList = new ArrayList<String>();// pc =0
	
	
	for(WebElement e : eleList) {
		String text = ((WebElement) e).getText();
			if(text.length()!=0) {
				eleTextList.add(text);
		}
		
		
	}


	return eleTextList;

}
//////////////////////////////////
//**************Select DropDown********************************************************

public  int getDropDownOptionsCount(By locator) {
	Select select = new Select(driver.findElement(locator));
	return select.getOptions().size();

}

public  List<String> getDropDownOptionsTextList(By locator) {
	Select select = new Select(driver.findElement(locator));

	List<WebElement> optionsList = select.getOptions();
	List<String> optionsTextList = new ArrayList<String>();
	
	for (WebElement e : optionsList) {
		String text = e.getText();
		optionsTextList.add(text);
	}
	
	return optionsTextList;
	
	//**********************************************************
	
	}


public void clickWhenReady(By signupLink, int i) {

}
	
}

	
	







//	public List<String> getElementAttributeList(By locator, String attrName) {
//		List<WebElement> imagesList = getElements(locator);
//		List<String> attrList = new ArrayList<String>();
//		for (WebElement e : imagesList) {
//			String attrVal = e.getAttribute(attrName);
//			if (attrVal != null && attrVal.length()!=0) {
//				attrList.add(attrVal);
//				//System.out.println(attrVal);
//			}
//		}
//		return attrList;
//	}
//	
	
	//********************** Select drop down utils**************//
	
/*	public void doSelectByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectByVisbleText(By locator, String visibleText) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public void doSelectByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public int getDropDownOptionsCount(By locator) {
		Select select = new Select(driver.findElement(locator));
		return select.getOptions().size();

	}

	public List<String> getDropDownOptionsTextList(By locator) {
		Select select = new Select(driver.findElement(locator));

		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList = new ArrayList<String>();
		
		for (WebElement e : optionsList) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		
		return optionsTextList;
	}
	
	
	public void selectValueFromDropDown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();

		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}

	}
*/	
	
	
	

