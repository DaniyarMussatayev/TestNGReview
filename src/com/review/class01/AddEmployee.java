package com.review.class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddEmployee {

	@BeforeMethod(alwaysRun = true)
	public void openBrowser() {

	}

	@AfterMethod(alwaysRun = true)
	public void closeBrowser() {

	}

	@Test(groups = { "smoke" }, enabled = false)
	public void addEmployee() {

	}

	@Test(groups = "regression")
	public void addSkillsToEmployee() {

	}

}
