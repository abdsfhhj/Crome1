package Framework;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterNg 
{
	
	@Test
	@Parameters({"user","pwd"})
	public void loginTest1(@Optional("virat") String username,@Optional("virat123")String password)
	{
		
		System.out.println("user name is : " + username);
		System.out.println("passwor is: " + password);
		
		
	}
}

//public void loginTest(@Optional("Virat") String username, @Optional("Virat@123") String password)