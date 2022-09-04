package Framework;

import org.testng.annotations.Test;

public class DisabledTestInTestNG {
	@Test(enabled= true)
	public void test1()
	{
		System.out.println("test1");
	}
 
	@Test(enabled= false)
	public void test2()
	{
		System.out.println("test2");
	}
    @Test
    public void test3()
    {
    	System.out.println("test3");
    }
}
