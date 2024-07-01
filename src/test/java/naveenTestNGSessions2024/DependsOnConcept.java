package naveenTestNGSessions2024;

import org.testng.annotations.Test;

public class DependsOnConcept {
	
	@Test()
	public void logingTest() {
		System.out.println("login test");
		int i = 9/3;
		
	}
	
	
	@Test(dependsOnMethods = {"loginTest"})
	public void addToCartTest() {
		System.out.println("addto Cart Test");
		
		
		//Note: got this " org.testng.TestNGException"
		
	}
		
	@Test(dependsOnMethods = {"loginTest"})
	public void orderTest() {
		System.out.println("order Test");
	
}
	
	
}	
	
