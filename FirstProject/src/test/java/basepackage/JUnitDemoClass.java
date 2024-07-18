package basepackage;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JUnitDemoClass {
	WebDriver driver;
	String baseUrl;
	String navigateTo="https://finelens.wordpress.com/wild/";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before Class . . . \n");	
	}


	@Before
	public void setUp() throws Exception {
		System.out.println("Before Test . . . ");
		driver=new ChromeDriver();
		baseUrl="http://www.finelens.wordpress.com";
	}
	
	@Test
	public void test() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(baseUrl);
		System.out.println("\nOpen URL");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Page Title: "+driver.getTitle()+" \n Current URL: "+driver.getCurrentUrl());
		
		driver.navigate().to(navigateTo);
		System.out.println("\nNavigate To URL");
		System.out.println("Page Title: "+driver.getTitle()+" \n Current URL: "+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().back();
		System.out.println("\nNavigate Back");
		System.out.println("Page Title: "+driver.getTitle()+" \n Current URL: "+driver.getCurrentUrl());
		Thread.sleep(3000);
		
		driver.navigate().forward();
		System.out.println("\nNavigate Forward");
		System.out.println("Page Title: "+driver.getTitle()+" \n Current URL: "+driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		System.out.println("\nNavigate Refresh");
		Thread.sleep(2000);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		System.out.println("After Test . . . \n");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After Class . . .");
	}

	

}
