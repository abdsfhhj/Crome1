package windowhandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class windowhandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\demo2\\chrome\\demo\\chromedriver.exe ");

		WebDriver driver = new ChromeDriver();
	  
	    
	    driver.manage().window().maximize();
		driver.get("http://www.naukri.com");

		String parent = driver.getWindowHandle();
		System.out.println("parent window id : " + parent);

		Set<String> windowIds = driver.getWindowHandles();
		Object[] arr = windowIds.toArray();

		driver.switchTo().window((String) arr[1]);

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();

		driver.switchTo().window(parent);

		driver.switchTo().window((String) arr[2]);

		driver.manage().window().maximize();
		System.out.println(driver.getTitle());

		driver.close();
		
		driver.switchTo().window(parent);
		
		driver.close();




	}

}
