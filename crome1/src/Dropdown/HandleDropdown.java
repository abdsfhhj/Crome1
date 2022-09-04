package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\practiesdemoProject\\demo\\chromedriver.exe ");



		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://facebook.com");
		//driver.findElement(By.partialLinkText("UK")).click();

		driver.findElement(By.linkText("Sign Up")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("kishor");

		WebElement dob_dd = driver.findElement(By.name("birthday_day"));
		WebElement dom_dd = driver.findElement(By.name("birthday_month"));
		WebElement doy_dd = driver.findElement(By.name("birthday_year"));
		// We select drop down value by using three ways
			
		Select sel_dob = new Select(dob_dd);
		Select sel_dom = new Select(dom_dd);
		Select sel_doy = new Select(doy_dd);
		
		
		sel_dob.selectByIndex(03); // it will select day of birth
		sel_dom.selectByVisibleText("May");  // it will select birth  month
		sel_doy.selectByValue("1992"); // It will select birth year
		
		



	}

}
