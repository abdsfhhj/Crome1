package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
	    driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//ssdriver.findElement(By.className("")).sendKeys("admin");
		
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  // System.out.println("first name is entered");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	   driver.findElement(By.id("btnLogin")).click();
		//driver.close();
	  // driver.quit();



	}

}
