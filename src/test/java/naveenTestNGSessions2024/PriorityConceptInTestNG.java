package naveenTestNGSessions2024;

import org.testng.annotations.Test;

public class PriorityConceptInTestNG {

	
	
	
	
	@Test (priority = 1, description = "search Test")
	public void searchTest1() {
		System.out.println("search test");
	}
	
	
	@Test (priority = 5, description = "Add to cart Test")
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	
	@Test(priority = 2)
	public void checkOutTest() {
		System.out.println("checkout test");
	}
	@Test(priority = 4)
	public void paymentTest1() {
		System.out.println("payment test");
	}
	
	@Test(priority = 3)
	public void orderTest() {
		System.out.println("order test");
	}

	
	

	
}
