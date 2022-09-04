package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
	    driver.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
	   driver.findElement(By.cssSelector(".button")).click();
	    
	   // driver.close();


	}

}
