package com.review.class01;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import utils.CommonMethods;

public class Login extends CommonMethods{

	
	
	@Test(groups = "login")
	public void loginValitation() {
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

		driver.findElement(By.id("btnLogin")).click();
		
		WebElement logo =		driver.findElement(By.xpath("//div[@id='branding']/a/img"));
		WebDriverWait wait =new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		Assert.assertTrue(logo.isDisplayed());

		
	}
	
	
}
