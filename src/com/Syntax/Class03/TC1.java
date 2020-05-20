package com.Syntax.Class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC1 {
	
//		TC 1: Facebook sign up: 
//		Open chrome browser
//		Go to “https://www.facebook.com/”
//		Enter first name
//		Enter last name
//		Enter mobile number
//		Click on sign up button
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
		
		String url = "https://www.facebook.com/";
		
		WebDriver driver = new FirefoxDriver();
		driver.get(url);
		driver.findElement(By.name("firstname")).sendKeys("John");
		driver.findElement(By.id("u_0_o")).sendKeys("Smith");
		driver.findElement(By.id("u_0_r")).sendKeys("346-250-0132");
		driver.findElement(By.name("websubmit")).click();
		
	}
}
