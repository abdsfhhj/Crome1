package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorname {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
	    driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/%22");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin ");
		 Thread.sleep(1500);
		    
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		  Thread.sleep(1500);
		    
		driver.findElement(By.name("Submit")).click();
		 Thread.sleep(1500);
		 //driver.findElement(By.linkText("Admin")).click();
		   // driver.quit();
		
		//driver.close();



	}

}
