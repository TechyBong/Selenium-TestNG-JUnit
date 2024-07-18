package basepackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 * @author subhkhan 
 */
public class ChromeDriverWin 
{
	public static void main(String[] args) throws InterruptedException {
    //System.setProperty("webdriver.chrome.driver","C:\\Users\\subhkhan\\Documents\\Selenium\\Driver\\chromedriverWin64\\chromedriver.exe");
	
	/*WebDriver object is to create based on the browser*/	
	WebDriver driver=new ChromeDriver();
    String baseURL="http://www.finelens.wordpress.com";//"https://www.w3schools.com";
    
    /* manage().window().maximize() will max out the browser window */
    driver.manage().window().maximize();
    
    //timeout().implicitlywait will be wait for mentioned second
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    //Go to base URL
    driver.get(baseURL);
    
    //Find element by link
    driver.findElement(By.linkText("URBAN")).click();
    Thread.sleep(3000);
    
    //find element by partial link
    driver.findElement(By.partialLinkText("BL")).click();
   // driver.findElement(By.xpath("//a[@href='https://finelens.wordpress.com/wild/']")).click();
   //  driver.findElement(By.id("search2")).sendKeys("Java");
  //  driver.findElement(By.xpath("//button[@id='learntocode_searchbtn']")).click();
	}
}
