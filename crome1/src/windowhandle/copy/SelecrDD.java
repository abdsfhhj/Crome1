package windowhandle.copy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelecrDD {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://facebook.com");
	    
	  // driver.findElement(By.partialLinkText("UK")).click();
	    driver.findElement(By.linkText("Sign Up")).click();
	      
	   WebElement dob_dd = driver.findElement(By.name("birthday_day"));
	   WebElement dom_dd = driver.findElement(By.name("birthday_month"));   
       WebElement doy_dd = driver.findElement(By.name("birthday_year")); 
       
       Select sel_dob = new Select(dob_dd);
       
       
      // sel_dob.selectByIndex(25);  // selectByIndex
		
		
		//sel_dob.selectByValue("16");  // selectByValue
		
		
		//sel_dob.selectByVisibleText("22");   // selecctByVisibleText
			
		Select sel_dom = new Select(dom_dd);
		Select sel_doy = new Select(doy_dd);
		
		sel_dob.selectByIndex(02); // it will select day of birth
		sel_dom.selectByVisibleText("May");  // it will select birth  month
		sel_doy.selectByValue("1992"); // It will select birth year
			
		


	}

}
