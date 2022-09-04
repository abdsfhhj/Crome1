package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handledropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\crome1\\Driver\\chromedriver.exe ");

		//C:\Users\user\eclipse-workspace\demo2\crome1\Driver\chromedriver.exe

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		
		driver.findElement(By.linkText("Sign Up")).click();
		WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		WebElement doy_dd = driver.findElement(By.name("birthday_year"));
		  
		
		Select sec_db = new Select(dob_dd);
		Select sec_dm = new Select(dom_dd);
		Select sec_dy = new Select(doy_dd);
		
		
		sec_db.selectByIndex(02);
		sec_dm.selectByVisibleText("May");
		sec_dy.selectByValue("1992");
		
		
		

	}

}
