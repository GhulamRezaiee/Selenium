package com.Syntax.HW;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HW1 {
	//In your Selenum code use values from properties file to open specifified browser, navigate to specified url and enter username and password
	public static void main(String[] args) throws IOException {
		String filePath = System.getProperty("user.dir")+"\\configs\\info.properties";
		
		FileInputStream fis = new FileInputStream(filePath);
		Properties prop = new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		WebDriver driver = null;
		switch(browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver","drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		}
		
		driver.get(prop.getProperty("url"));
		driver.findElement(By.id("email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("pass")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("u_0_b")).click();
		
		
		
	}
}
