package democlass;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.excelreaddata;

public class sampleclass2 
{
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\FacebbokMavenproject\\inputfile\\";
	String filename="facebooklogindetails.xls";
	String sheetname="inputsheet";
	@DataProvider
	public String[][] datavalue() throws IOException
	{
		return excelreaddata.excelreaddata(filepath,filename,sheetname);
	}
	
	@BeforeTest(alwaysRun=true)
	public void method4()
	{
		System.out.println("This is Before Test");
	}
	
	@BeforeClass(alwaysRun=true)
	public void method5()
	{
		System.out.println("This is Before Class");
	}

	@AfterSuite(alwaysRun=true)
	public void method2()
	{
		System.out.println("This is After suite");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method7()
	{
		System.out.println("This is Before Method");
	}
	
	@Test(priority=0,dependsOnMethods="method11",description="testcase 1",groups="Sanity")
	public void method9()
	{
		System.out.println("This is Test case 1");
	}
	
	@Test(priority=1,groups= {"SIT"})
	public void method10()
	{
		System.out.println("This is Test case 2");
	}
	
	@Test(priority=2,groups= {"Sanity","SIT"})
	public void method11()
	{
		System.out.println("This is Test case 3");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method8()
	{
		System.out.println("This is After Method");
	}
	@AfterClass(alwaysRun=true)
	public void method6()
	{
		System.out.println("This is After Class");
	}
}
