package Framework;

import org.junit.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAndSoftAssertInTestNG {
	@Test
	public void hardAssert()
	{
		System.out.println("hardAssert()");
		
        Assert.assertTrue(true);
        System.out.println("statement after hardAssert() pass");
        
        Assert.assertFalse(false);
        System.out.println("statement after hardAssert() fail ");
	}
	
	@Test
	public void softAssert()
	{
		SoftAssert softAssert = new SoftAssert();
		System.out.println("softAssert()");
		
        Assert.assertTrue(true);
        System.out.println("statement after softAssert() pass");
        
        Assert.assertFalse(false);
        System.out.println("statement after softAssert() fail ");
        
        softAssert.assertAll();
	}
	

	
}
