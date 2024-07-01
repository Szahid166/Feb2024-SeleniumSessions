package naveenTestNGSessions2024;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations1 {

	// global pre conditions
		// pre conditions
		// test steps + exp vs act result
		// after steps
		// global after steps
		
	//Interview question: Tell me the sequence of testNG annotation:
	
//		BS -- connect with DB
//		BT -- create user
//		BC -- launch Browser
	//	
				//	BM -- loginToApp
				//	add to cart test
				//	AM -- logout
				//	
				//	BM -- loginToApp
				//	checkout test
				//	AM -- logout
				//	
				//	BM -- loginToApp
				//	search test
				//	AM -- logout
	//	
//		AC -- close browser
//		AT -- delete user
//		AS -- disconnect With DB

		
	//1: // this is global annotation -> Pre conditions
		@BeforeSuite
		public void connectWithDB() {
			System.out.println("BS -- connect with DB");
		}
		

		//2
		@BeforeTest
		public void createUser() {
			System.out.println("BT -- create user");
		}

		//3
		@BeforeClass
		public void launchBrowser() {
			System.out.println("BC -- launch Browser");
		}

		//4 this mathod will run for each of the test cases. that means 3X for these 3 TC it will run. 
		@BeforeMethod
		public void loginToApp() {
			System.out.println("BM -- loginToApp");
		}
		
//.............................................................
		// test runs according to alphabetic order unless the priorities are set
		
		@Test
		public void searchTest1() {
			System.out.println("search test");
		}
		

		
		@Test
		public void addToCartTest() {
			System.out.println("add to cart test");
		}

		
		@Test
		public void checkOutTest() {
			System.out.println("checkout test");
		}

		//...................................................................
		// @Aftermathods will will run the last 
		
		@AfterMethod
		public void logout() {
			System.out.println("AM -- logout");
		}

	
		@AfterClass
		public void closeBrowser() {
			System.out.println("AC -- close browser");
		}

		
		@AfterTest
		public void deleteUser() {
			System.out.println("AT -- delete user");
		}
		
	

		@AfterSuite
		public void diconnectWithDB() {
			System.out.println("AS -- disconnect With DB");
		}


		//C:\Program Files\Java\jdk-17\bin

	}	

	
	
	
	
	

