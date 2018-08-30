package example;		

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;		
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;		
public class NewTest {		
	    private WebDriver driver;		
		@Test				
		public void testEasy() {	
			driver.get("http://demo.guru99.com/test/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 	
		}
		
		@Test
		public void testGoogle() {
			driver.get("http://google.com.au");
			String title2 = driver.getTitle();
			Assert.assertTrue(title2.contains("Google"));
		}
		
		
		@BeforeTest
		public void beforeTest() {	
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\695066\\\\Desktop\\\\chromedriver_win32\\\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			
		    //driver = new FirefoxDriver();  
		}		
		@AfterTest
		public void afterTest() {
			driver.quit();			
		}		
}	