package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverNavigationCommand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		driver.navigate().to("http://www.facebook.com");
     
		//driver.findElement(By.linkText("English (UK)")).click();

		//System.out.println("Title of the facebook login page : " + driver.getTitle());

		driver.findElement(By.linkText("Forgotten password?")).click();

		System.out.println("Facebook forgot password page : " + driver.getTitle());

		driver.navigate().back();
       Thread.sleep(1000);

		System.out.println(driver.getTitle());
	  driver.navigate().forward();

		//System.out.println(driver.getTitle());
	     Thread.sleep(1000);

		driver.navigate().refresh();

		System.out.println(driver.getTitle());

		driver.navigate().back();

	  System.out.println(driver.getTitle());

	driver.navigate().refresh();

	System.out.println(driver.getTitle());

		//driver.quit();
	//driver.close();



	}

}
