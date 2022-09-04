package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClassName {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
		
	    driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	    driver.findElement(By.className("_6ltj")).click();
		Thread.sleep(300);
		//driver.findElement(By.className("_8esh")).click();
		//Thread.sleep(5000);
		
		driver.close();



	}

}
