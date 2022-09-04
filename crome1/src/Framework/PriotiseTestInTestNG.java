package Framework;

import org.testng.annotations.Test;

public class PriotiseTestInTestNG {
	@Test(priority=1)
	public void loginTest()
	{
		System.out.println("loginTest()");
	}
	
	@Test(priority=0)
	public void createAccountTest()
	{
		System.out.println("createAccountTest()");
	}

	@Test(priority=3)
	public void updateAccountTest()
	{
		System.out.println("updateAccountTest()");
	}

	@Test(priority=-2)
	public void logoutTest()
	{
		System.out.println("logoutTest()");
	}

}
