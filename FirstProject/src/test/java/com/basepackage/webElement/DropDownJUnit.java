package com.basepackage.webElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownJUnit {
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
		Thread.sleep(2000);
		WebElement dropDown=driver.findElement(By.id("carselect"));
		Select carSelect=new Select(dropDown);
		
		Thread.sleep(1000);
		System.out.println("Select Benz by value");
		carSelect.selectByValue("benz");
		boolean flag=carSelect.isMultiple();
		System.out.println("flag "+flag);
		
		Thread.sleep(2000);
		System.out.println("Select BMW by index");
		carSelect.selectByIndex(1);
		flag=carSelect.isMultiple();
		System.out.println("flag "+flag);
		
		Thread.sleep(1000);
		System.out.println("Select Honda by text");
		carSelect.selectByVisibleText("Honda");
		flag=carSelect.isMultiple();
		System.out.println("flag "+flag);
	}
	

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


}
