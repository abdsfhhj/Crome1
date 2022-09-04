package Framework;

import org.testng.annotations.Test;

public class TestNFTestDefaultExecutionOrder {
	@Test
	public void logintest(){
	 System.out.println("LoginTest()");
	}
	
	@Test
	public void createAccountTest()
	{
		 System.out.println("createAccountTest()");
	}
     
	@Test
	public void updateAccountTest()
	{
		 System.out.println("updateAccountTest()");
	}
	
    @Test
	public void logoutTest()
	{
		 System.out.println("logoutTest()");
	}
	
}
