package com.basepackage.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class GenericElementPickerClass {
	private WebDriver driver;
	//String baseUrl;
	public GenericElementPickerClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("Started Setting up . . .");
		this.driver=driver;
		//driver.get(url);
		//baseUrl="https://www.letskodeit.com/practice";
	}
	
	public WebElement getElement(String locator, String type) {
		WebElement element=null;
		System.out.println("type: "+type);
		switch(type.toLowerCase()){
		case "id": System.out.println("Element found by ID"); element=this.driver.findElement(By.id(locator)); break;
		case "class": System.out.println("Element found by class"); element=this.driver.findElement(By.className(locator));break;
		case "xpath": System.out.println("Element found by xpath"); element=this.driver.findElement(By.xpath(locator));break;
		case "css": System.out.println("Element found by css"); element=this.driver.findElement(By.cssSelector(locator));break;
		case "linktext": System.out.println("Element found by linktext"); element=this.driver.findElement(By.linkText(locator));break;
		case "partiallinktext": System.out.println("Element found by partiallinktext"); element=this.driver.findElement(By.partialLinkText(locator));break;
		default : System.out.println("Element not found"); break;
		}
		return element;
		
	}
	public static void main(String[] args) {
		WebDriver drive=new ChromeDriver();
		String baseUrl="https://www.letskodeit.com/practice";
		GenericElementPickerClass obj=new GenericElementPickerClass(drive);
		drive.get(baseUrl);
		drive.manage().window().maximize();
		WebElement element=obj.getElement("hide-textbox", "id");
		System.out.println("Click Hide Button");
		element.click();
		System.out.println("Is Element Displayed? "+element.isDisplayed());
		
	}
}
