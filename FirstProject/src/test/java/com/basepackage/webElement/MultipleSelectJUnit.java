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

public class MultipleSelectJUnit {
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
		WebElement multipleChoice=driver.findElement(By.id("multiple-select-example"));
		Select mulSelect=new Select(multipleChoice);
		
		Thread.sleep(1000);
		System.out.println("Select Orange by value");
		mulSelect.selectByValue("orange");
		boolean flag=mulSelect.isMultiple();
		System.out.println("flag "+flag);
		
		Thread.sleep(2000);
		System.out.println("Select Apple by index");
		mulSelect.selectByIndex(0);
		flag=mulSelect.isMultiple();
		System.out.println("flag "+flag);
		
		Thread.sleep(1000);
		System.out.println("Select Peach by Visible text");
		mulSelect.selectByVisibleText("Peach");
		flag=mulSelect.isMultiple();
		System.out.println("flag "+flag);
		
		Thread.sleep(1000);
		System.out.println("Deselect Apple by index");
		mulSelect.deselectByIndex(0);
		flag=mulSelect.isMultiple();
		System.out.println("flag "+flag);
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


}
