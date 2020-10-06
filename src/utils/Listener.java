package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends CommonMethods implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started"+result.getName());
	}
	public void onTestSucces(ITestResult result) {
		System.out.println("Test Pass"+result.getName());
		CommonMethods.takeScreenShot("passed/"+result.getName());
	}
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail"+result.getName());
		CommonMethods.takeScreenShot("failed/"+result.getName());
	}

}
