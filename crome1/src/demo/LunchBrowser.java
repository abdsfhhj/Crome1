package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LunchBrowser {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\crome1\\demo\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chromeDrive\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
       driver.findElement(By.linkText("Sign Up")).click();
		
		WebElement dom = driver.findElement(By.name("birthday_month"));
	
          Select sel = new Select(dom);
          
          WebElement select = sel.getFirstSelectedOption();
          	String select_month =  select.getText();
         
         System.out.println("Already select moonth:" + select_month);
         
         sel.selectByIndex(3);
    
		


	}

}