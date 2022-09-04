package Framework;

import org.junit.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
    @Test
    public void test1()
    {
    	Assert.assertTrue(true);
    	System.out.println("test1");
    }
    
    @Test
    public void test2()
    {
    	System.out.println("test2");
        Assert.assertTrue("Exception true but condition false", false);
    	
    }
    @Test
    public void test3()
    {
    	System.out.println("test3");
    	String s1 = "Vasant";
    	String s2 = "vasant";
    	Assert.assertEquals(s1, s2);
    }
    
    @Test
    public void test4()
    {
    	System.out.println("test4");
    	String s1 = "Vasant";
    	String s2 = "Vasant";
    	Assert.assertEquals(s1, s2);
    }
   
    @Test
    public void test5()
    {
    	System.out.println("test5");
    	Assert.assertFalse("Exception false condition but gets true", false);
    }
    
    @Test
    public void test6()
    {
    	System.out.println("test6");
    	Assert.assertFalse("Exception true condition but gets false", true);
    }
}