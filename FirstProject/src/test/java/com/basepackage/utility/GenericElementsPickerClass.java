package com.basepackage.utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class GenericElementsPickerClass {
	private WebDriver driver;
	//String baseUrl;
	public GenericElementsPickerClass(WebDriver driver) {
		// TODO Auto-generated constructor stub
		System.out.println("Started Setting up . . .");
		this.driver=driver;
		//driver.get(url);
		//baseUrl="https://www.letskodeit.com/practice";
	}
	
	
	public List<WebElement> getElements(String locator, String type) {
		List<WebElement> element=null;
		System.out.println("type: "+type);
		switch(type.toLowerCase()){
		case "id": System.out.println("Element found by ID");
				   element=this.driver.findElements(By.id(locator)); 
				   break;
		case "class": System.out.println("Element found by class");
					  element=this.driver.findElements(By.className(locator));
					  break;
		case "xpath": System.out.println("Element found by xpath"); 
					  element=this.driver.findElements(By.xpath(locator));
					  break;
		case "css": System.out.println("Element found by css"); 
		     		element=this.driver.findElements(By.cssSelector(locator));
		     		break;
		case "linktext": System.out.println("Element found by linktext"); 
		 				 element=this.driver.findElements(By.linkText(locator));
		 				 break;
		case "partiallinktext": System.out.println("Element found by partiallinktext"); 
		  						element=this.driver.findElements(By.partialLinkText(locator));
		  						break;
		default : System.out.println("Element not found"); break;
		}
		return element;
		
	}
	
	/*
	 * public static void main(String[] args) { WebDriver drive=new ChromeDriver();
	 * String baseUrl="https://www.letskodeit.com/practice";
	 * GenericElementsPickerClass obj=new GenericElementsPickerClass(drive);
	 * drive.get(baseUrl); drive.manage().window().maximize(); WebElement
	 * element=obj.getElement("hide-textbox", "id");
	 * System.out.println("Click Hide Button"); element.click();
	 * System.out.println("Is Element Displayed? "+element.isDisplayed());
	 * 
	 * List<WebElement> ele=obj.
	 * getElements("//input[contains(@name,'cars') and contains(@type,'radio')]",
	 * "xpath"); for(int i=0;i<ele.size();i++) { ele.get(i).click();
	 * System.out.println("Radio Selected "+ele.get(i).getAttribute("value")+" -> "
	 * +ele.get(i).isSelected()); }
	 * 
	 * }
	 */
}
