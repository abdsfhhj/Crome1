package WebElementCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
	    driver.manage().window().maximize();
	    driver.get("https://facebook.com");
	    boolean lang =  driver.findElement(By.partialLinkText("UK")).isDisplayed();
	    	if(lang) {
	    		driver.findElement(By.partialLinkText("UK")).click();
	          }
	    	else
	    	{
	    		System.out.println("\"UK is not displayed on the fb login page");
	    	}
	    		if(driver.findElement(By.linkText("Sign Up")).isEnabled()){
	    			driver.findElement(By.linkText("Sign Up")).click();
	    	
	    		}
	    		else {
	    			System.out.println("Sig Up Link is disabled...");
	    		}
	   
	    		if(driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).isSelected()) {
	    			System.out.println("Is already selected");
	    		}
	    		else {
	    			driver.findElement(By.xpath("//input[@class='_8esa' and @value='1']")).click();
	    		}


	}

}
