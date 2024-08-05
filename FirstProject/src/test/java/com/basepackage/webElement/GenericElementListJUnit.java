package com.basepackage.webElement;

import static org.junit.Assert.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basepackage.utility.GenericElementsPickerClass;

public class GenericElementListJUnit {

	private WebDriver driver;
	private String baseUrl;
	private GenericElementsPickerClass gm;

	@Before
	public void setUp() throws Exception {
		driver = new ChromeDriver();
		baseUrl = "https://www.letskodeit.com/practice";
		gm = new GenericElementsPickerClass(driver);

		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testMethod() throws Exception {
		driver.get(baseUrl);
		
		List<WebElement> elementList = gm.getElements("//input[@type='text']", "xpath");
		
		int size = elementList.size();
		System.out.println("Size of the element list is: " + size);
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		//driver.quit();
	}

	

}
