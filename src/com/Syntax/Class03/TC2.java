package com.Syntax.Class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2 {
//		TC 2: Syntax Page URL Verification: 
//		Open chrome browser
//		Navigate to “https://www.zillow.com/”
//		Navigate to “https://www.google.com/”
//		Navigate back to Zillow Page
//		Refresh current page
//		Verify url contains “Zillow”
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		String url1 = "https://www.zillow.com/";
		String url2 = "https://www.google.com/";
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to(url1);
		driver.navigate().to(url2);
		driver.navigate().back();
		driver.navigate().refresh();
		if(driver.getCurrentUrl().toLowerCase().contains("zillow"))
			System.out.println("The URL contains \"zillow\"");
		else
			System.out.println("The URL does not contain \"zillow\"");
		
		
	}
}
