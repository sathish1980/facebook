package democlass;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletcase 
{
@BeforeSuite(alwaysRun=true)
public void method1()
{
	System.out.println("This is Before suite");
}

@AfterTest(alwaysRun=true)
public void method3()
{
	System.out.println("This is After Test");
}

@Test(priority=3)
public void secondtestcase()
{
	System.out.println("This is test case in first class");
	
}
}
