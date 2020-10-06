package com.review.class01;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AnnotationRecap {

	@Test(priority = 1)
	public void test1() {
		System.out.println("I am test-1");
	}
	
	@Test (dependsOnMethods = "test3")
	public void test2() {
		
		SoftAssert sAssert=new SoftAssert();		
		System.out.println("I am test-2");
//		Assert.assertEquals(false, true);		
//		
//		boolean b=true;
//		
//		if(b) {
//			System.out.println("-----------------------Test-2 Pass----------------------------");
//		}else {
//			System.out.println("Test-2 Fail");
//		}
		
//		sAssert.assertAll();
	}
	
	@Test
	public void test3() {
		System.out.println("I am test-3");
		
		//1. Create and object of SoftAssert Class
		SoftAssert sAssert=new SoftAssert();
		
		//2. Apply soft assert by using the created object
		sAssert.assertEquals(35, 25);
		
		sAssert.assertNotEquals(25, 15);
		
		System.out.println("--------------------Test-----------------------");
		
		// 3. sAssert.assertAll()
		sAssert.assertAll();
		
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am after method");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am before class method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am after class method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am before test method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("I am after test method");
	}
	
	/* Assertion? Validating test case result wheter they pass or fail.
	 * 
	 * Hard Assert and SoftAssert?
	 * 
	 * 
	 */
	
	
}
