package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SmokeTest 
{
	FirefoxDriver driver = new FirefoxDriver();
	
	@Test
	public void test1()
	{
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("u_0_0")).sendKeys("ASad");
		driver.quit();
	}

}
