package com.basepackage.webElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonElement {
	WebDriver driver;
	String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.out.println("Started Setting up . . .");
		driver=new ChromeDriver();
		baseUrl="https://www.letskodeit.com/practice";
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		/*
		 *Create and store radio element in
		 *WebElement Class 
		 */
		WebElement bmw=driver.findElement(By.id("bmwradio"));
		bmw.click();
		System.out.println("Is Selected BMW: "+bmw.isSelected());
		Thread.sleep(3000);
		
		WebElement benz=driver.findElement(By.id("benzradio"));
		benz.click();
		System.out.println("Is Selected BENZ: "+benz.isSelected());
		Thread.sleep(3000);
		
		WebElement honda=driver.findElement(By.id("hondaradio"));
		honda.click();
		System.out.println("Is Selected HONDA: "+honda.isSelected());
		Thread.sleep(3000);
		
	}

	@After
	public void tearDown() throws Exception {
		driver.manage().window().minimize();
		driver.quit();
		System.out.println("Browser Close. . .");
	}

	

}
