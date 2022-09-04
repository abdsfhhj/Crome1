package Framework;

import org.testng.annotations.Test;

public class GroupsInTestNGTest {
	@Test(groups = {"smoke"})
	public void loginTest()
	{
		System.out.println("smoke test group");
	}
	
	@Test(groups = {"registration"})
	public void registration()
	{
		System.out.println("registration test group");
	}
	@Test(groups = {"sanity"})
	public void creatAccount()
	{
		System.out.println("sanity test group");
	}

}
