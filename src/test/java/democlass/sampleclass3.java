package democlass;

import org.testng.annotations.Test;

public class sampleclass3 
{
	@Test(priority=3,groups= {"SIT"},timeOut=60)
	public void method12()
	{
		System.out.println("This is Test case 1 in class 3");
	}
	
	@Test(priority=4,groups= {"Sanity"},invocationCount=4,invocationTimeOut=60,successPercentage=70)
	public void method13()
	{
		System.out.println("This is Test case 2 in class 3");
	}
}
