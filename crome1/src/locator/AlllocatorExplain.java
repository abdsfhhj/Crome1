package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlllocatorExplain {

	public static void main(String[] args) {
		
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");
   	  	 
		 WebDriver driver = new ChromeDriver();
   	     driver.manage().window().maximize();
   	  
   	     driver.get("https://opensource-demo.orangehrmlive.com/");
   	  
   	  //driver.findElement(By.name("txtUsername")).sendKeys("Admin");
   	 // driver.findElement(By.name("txtPassword")).sendKeys("admin123");
   	 // driver.findElement(By.name("Submit")).click();
         
   	 // driver.findElement(By.id("txtUsername")).sendKeys("Admin");
   	 // driver.findElement(By.id("txtPassword")).sendKeys("admin123");
   	 // driver.findElement(By.id("btnLogin")).click();
   	  
   	  
   	  //driver.get("https://www.facebook.com/");
   	  //driver.findElement(By.className("_6ltg")).click();// **classname**
   	  
   	 //driver.findElement(By.linkText("Forgot your password?")).click();
   	  
   	  //driver.findElement(By.partialLinkText("your password?")).click();
   	  
   	 //driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
   	 // river.findElement(By.cssSelector("#txtPassword")).sendKeys("admin123");
   	  //driver.findElement(By.cssSelector(".button")).click();
   	  
   	 //List ele = driver.findElements(By.tagName("input"));
   	  // int total = ele.size();
   	 //System.out.println("Total no input tag:"+ total);
   	  
   	  
   	  //driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
   	  //driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
   	 // driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
   	  
   	  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
   	  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
   	  driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
   	  
   	  
   	 

	}

}
