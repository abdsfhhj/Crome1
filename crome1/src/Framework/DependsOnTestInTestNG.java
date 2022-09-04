package Framework;

import org.testng.annotations.Test;

public class DependsOnTestInTestNG {
	@Test
	public void loginTest()
	{
		System.out.println("loginTest");
	}
	
	@Test(dependsOnMethods = {"loginTest"})
	public void creatAccountTest()
	{
		System.out.println("creatAccountTest");
	}
	
	@Test(dependsOnMethods = {"loginTest","creatAccountTest"})
	public void logoutTest()
	{
		System.out.println("logoutTest");
	}

}
