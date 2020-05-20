package com.Syntax.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Syntax.Utils.CommonMethods;

public class GoogleTest extends CommonMethods {

	public static void main(String[] args) {

		setUp();
		driver.findElement(By.name("q")).sendKeys("iPhone");
		
		wait(5);
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		wait(3);
		
		tearDown();

	}
}