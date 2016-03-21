package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import com.example.MultiThreadedRunner;


@RunWith (MultiThreadedRunner.class)


public class MyFirstTest {
	
	
	
		@Test
		public void testGoogleSearch() throws InterruptedException {
			  // Optional, if not specified, WebDriver will search your path for chromedriver.
			  System.setProperty("webdriver.chrome.driver", "/Users/ianlee/Documents/Selenium/chromedriver");

			  WebDriver driver = new ChromeDriver();
			  driver.get("http://sqa.fyicenter.com/Online_Test_Tools/IP_Address_Format_Validator.php");
			  Thread.sleep(5000);  // Let the user actually see something!
			  WebElement searchBox = driver.findElement(By.name("Query"));
			  driver.findElement(By.name("Query")).clear();
			  searchBox.sendKeys("64.248.161.147");
			  searchBox.submit();
			  Thread.sleep(10000);  // Let the user actually see something!
			  driver.quit();
			  
			  
			  
			  
			  
			  
			}
}
