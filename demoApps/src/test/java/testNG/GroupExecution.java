package testNG;

import org.testng.annotations.Test;

public class GroupExecution {
	
	@Test(priority = 1, groups = "smoke")
	public void login() {
		System.out.println("The user has logged in");
	}
	
	@Test(priority = 5, groups = "smoke")
	public void logout() {
		System.out.println("The user has logged out");
	}
	
	@Test(priority = 2, groups = {"smoke", "regression"})
	public void searchProduct() {
		System.out.println("The product is found");
	}
	
	@Test(priority = 3, groups = "regression")
	public void addToCart() {
		System.out.println("The product is added to cart");
	}
	
	@Test(priority = 4, groups = "regression")
	public void payment() {
		System.out.println("The payment is done");
	}


}
