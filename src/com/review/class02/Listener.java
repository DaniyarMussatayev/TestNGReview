package com.review.class02;

import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.CommonMethods;

public class Listener extends CommonMethods implements ITestListener {
	/* How to create and execute Listener Class?
	 * 1. Create class named as Listener and implement ITestLisneter
	 * 2. Pick up the methods that you need from ITestListener interface
	 * 3. Write your own logic for each method
	 * 4. Include Listener class to testng.xml file
	 */
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started : " + result.getName());
	}

	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test PASSED : " + result.getName());
		takeScreenShot(result.getName());

	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println("Test FAILED : " + result.getName());
		takeScreenShot(result.getName());


	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test SKIPPED : " + result.getName());

	}

}
