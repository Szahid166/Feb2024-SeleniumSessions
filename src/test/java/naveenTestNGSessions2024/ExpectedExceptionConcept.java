package naveenTestNGSessions2024;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	String name;
	
	
	@Test (priority = 1, description = "Add to cart Test",expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void addToCartTest() {
		System.out.println("add to cart test");
		int i =9/0;
		//int i = 9/3;
		ExpectedExceptionConcept obj = null;
		System.out.println(obj.name);// NPE
		
		
	}


}
