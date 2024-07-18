package com.basepackage.webElement;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicWebElementTestJUnit {

		WebDriver driver;
		String baseUrl;
		
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test . . . ");
		driver=new ChromeDriver();
		baseUrl="https://www.google.com/";
	}


	@Test
	public void test() {
		System.out.println("Test");
		driver.get(baseUrl);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.manage().window().maximize();
		System.out.println("Test");
		WebElement e1=driver.findElement(By.className("gNO89b"));
		System.out.println("Is Enable? "+e1.isEnabled());
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
		System.out.println("After Test. . .");
	}

}
