package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class LocatorPartialLinkTest {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

			WebDriver driver = new ChromeDriver();
		  
		    
		    driver.manage().window().maximize();
			driver.get("https:www.facebook.com/");
			driver.findElement(By.partialLinkText(" password?")).click();//partial link Forgotten Password = password
			Thread.sleep(5000);
       	    driver.findElement(By.partialLinkText("a Page")).click();//creat a page =a page
       	   Thread.sleep(5000);

	}

}
