package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(priority = 1)
	public void login() {
		System.out.println("The user has logged in");
	}
	
	@Test(priority = 5)
	public void logout() {
		System.out.println("The user has logged out");
	}
	
	@Test(priority = 2)
	public void searchProduct() {
		System.out.println("The product is found");
	}
	
	@Test(priority = 3, invocationCount = 3)
	public void addToCart() {
		System.out.println("The product is added to cart");
	}
	
	@Test(priority = 4)
	public void payment() {
		System.out.println("The payment is done");
	}

}
