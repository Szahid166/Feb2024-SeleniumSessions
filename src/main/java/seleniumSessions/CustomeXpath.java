package seleniumSessions;

public class CustomeXpath {

	public static void main(String[] args) {
		//xpath: address of the element in the HTM DOM
		
		//1. absolute xpath: html/body/div[2]/div/div/div/div/div[3]/form/div[1]/input
		// If anything changes in the Dom then absolute xpath will not work and high chance is that index will be different
		// we avoid absolute xpath
		//2. relative xpath/custom xpath
		//formula
		//xpath axes: relationship: parent, child, siblings
		//function: text, contain etc
		// Always write xpath with attribute and value both
		// Syntext Xpath: //tagname[@attribute='value']
		// //input[@id='input-email']
		// All correct basic Xpath
		// //input[@name='email']
		// //input[@placeholder='E-Mail Address']
		// input --> 6 elements--> have to use with FindElements method
		// //input[@id]:->  give me those input that has id
		// Give me  those input that has placeholder : // input@[placeholder]
		
		//htmltag[@attr1='value' and @attr2='value' and @attr3='value']
		//input[@id='input-firstname' and @type='text' and @name='firstname']
		//input[@id='input-firstname' and @type='text' and @name]
		//input[@id and @type and @name]
				
		
		//htmltag[@attr1='value' or @attr2='value']
		//input[@type='text' or @name='search' or @type='email']
		
		//*[@attr='value']
		//*[@type='text'] -- 100:3-> star means all the htmltag and that not a good option 
		//input[@type='text'] -- 14:3 --better performance
		
		//text() in xpath: when no headrer and attribute how can you create xpath!!
				//htmltag[text()='value']
				//h1[text()='Register Account']
				//legend[text()='Your Personal Details']
				//a[text()='My Account']
//a[@href='https://naveenautomationlabs.com/opencart/index.php?route=account/login']// Usually we avoid this option
		
		////////////////////////////////////////////////
		
		//contains() in xpath:
		//contains with attribute:
		// Formula : //htmltag[contains(@attr,'value')]
		             //input[contains(@id,'email')]	
		
		// Formula for 2 attribute: //htmltag[contains(@attr1,'value') and @attr2='value']
				//input[contains(@placeholder,'E-Mail') and @name='email']
		
	// Another formula: //htmltag[contains(@attr1,'value') and contains(@attr2,'value')]
				       //input[contains(@placeholder,'E-Mail') and contains(@id,'email')]
		
		//indexing in xpath:
				// (//a[text()='Forgotten Password'])[2]
				//By.xpath("(//a[text()='Forgotten Password'])[2]");
				// (//input[@id])[6]

	}

}
