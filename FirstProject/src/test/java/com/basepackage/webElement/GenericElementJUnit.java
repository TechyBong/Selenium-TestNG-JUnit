package com.basepackage.webElement;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.basepackage.utility.GenericElementPickerClass;

public class GenericElementJUnit {
	private WebDriver drive;
	private String baseUrl;
	private GenericElementPickerClass obj;

	@Before
	public void setUp() throws Exception {
		drive=new ChromeDriver();
		baseUrl="https://www.letskodeit.com/practice";
		obj=new GenericElementPickerClass(drive);
		drive.manage().window().maximize();
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}

	@Test
	public void test() throws InterruptedException {
		
		drive.get(baseUrl);
		
		//Scroll down
		JavascriptExecutor js = (JavascriptExecutor) drive;
		js.executeScript("window.scrollBy(0,350)", "");
		
		//Checked and Select by ID
		WebElement hide=obj.getElement("hide-textbox", "id");
		System.out.println("Click Hide Button");
		hide.click();
		System.out.println("checking for text box. . .");
		
		//Checked and Select by ID
		//WebElement text=obj.getElement("displayed-text", "iD");
		WebElement text=obj.getElement("displayed-class", "class");
		System.out.println("Is Element Displayed? "+text.isDisplayed());
		
		//Checked and Select by ID
		WebElement show=obj.getElement("show-textbox","id");
		show.click();
		System.out.println("Clicked on show button");
		boolean flag=text.isDisplayed();
		text.sendKeys("TEXT");
		System.out.println("Text Box Displayed: "+flag);
		
		//Checked and Select by PartialLinkText
		WebElement e1=obj.getElement( "SIGN","partiallinktext");
		e1.click();
		Thread.sleep(2000);
		System.out.println("Sign In is clicked . . .\n>>"+drive.getCurrentUrl());
		
		//Checked and Select by LinkText
		WebElement e2=obj.getElement( "INTERVIEW","linktext");
		e2.click();
		Thread.sleep(2000);
		System.out.println("INTERVIEW is clicked . . .\n>>"+drive.getCurrentUrl());
		
		//Checked and Select by CSS Selector
		WebElement e3=obj.getElement( ".btn.btn-primary.zen-custom-elm.btn-block.dynamic-button","css");
		e3.click();
		Thread.sleep(2000);
		System.out.println("CSS is clicked . . .\n>>"+drive.getCurrentUrl());
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		drive.quit();
	}

}
