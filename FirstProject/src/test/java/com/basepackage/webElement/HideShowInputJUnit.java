package com.basepackage.webElement;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HideShowInputJUnit {
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
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.id("displayed-text"));
		boolean flag=text.isDisplayed();
		System.out.println("Text Box Displayed: "+flag);
		
		Thread.sleep(1000);
		WebElement hide=driver.findElement(By.id("hide-textbox"));
		hide.click();
		System.out.println("Clicked on hide button");
		flag=text.isDisplayed();
		System.out.println("Text Box Displayed: "+(flag+"").toUpperCase());
		
		WebElement show=driver.findElement(By.id("show-textbox"));
		show.click();
		System.out.println("Clicked on show button");
		flag=text.isDisplayed();
		text.sendKeys("TEXT");
		System.out.println("Text Box Displayed: "+flag);
		Thread.sleep(2000);

		//System.out.println("flag "+flag);
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}


}
