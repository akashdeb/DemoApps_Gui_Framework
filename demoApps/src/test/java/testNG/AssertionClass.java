package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionClass {
	
	@Test
	public void test1() {
		
		
		String actualResult = "qspiders" ;
		String expectedResult = "jspiders" ;
		
		Assert.assertEquals(actualResult, expectedResult, "fail");
		System.out.println("Pass: the assertion is correct");

		
	}
	
	@Test
	public void test2() {
		
		
		String actualResult = "qspiders" ;
		String expectedResult = "cockroach" ;
		
		Assert.assertTrue(actualResult.contains(expectedResult), "Fail wala msg");
		System.out.println("Pass: the assertion is correct");

		
	}
	
	@Test
	public void test3() {
		
		String actualResult = "qspiders" ;
		String expectedResult = "jspiders" ;
		

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualResult, expectedResult);
		
		sa.assertAll();
		System.out.println("Pass: the assertion is correct");
	
	}
	
	@Test
	public void test4() {
		
		
		String actualResult = "qspiders" ;
		String expectedResult = "cockroach" ;
		
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(actualResult.contains(expectedResult));
		
		sa.assertAll();
		System.out.println("Pass: the assertion is correct");

		
	}

}

