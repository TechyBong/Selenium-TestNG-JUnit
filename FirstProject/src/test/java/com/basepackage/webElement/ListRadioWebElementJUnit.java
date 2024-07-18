package com.basepackage.webElement;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListRadioWebElementJUnit {
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
		Thread.sleep(3000);
		List<WebElement> radioList=driver.findElements(By.xpath("//input[contains(@name,'cars') and contains(@type,'radio')]"));
		System.out.println("Size of RadioList "+radioList.size());
		for(int i=0;i<radioList.size();i++)
		{
			/* Initialize a single WebElement
			 * from the List
			 */
			WebElement radio=radioList.get(i);
			//Click the radio button
			radio.click();
			//store the value of the tag
			String value=radio.getAttribute("value");
			//Print the radio is actually clicked or not
			System.out.println("Is Clicked? "+value+"  --> "+radio.isSelected());
			//Thread.sleep(3000);
		}
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	

}
