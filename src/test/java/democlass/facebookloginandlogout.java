package democlass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import General.Browser;
import General.Commonmethods;
import pages.loginpage;
import pages.logout;
import util.excelreaddata;



public class facebookloginandlogout extends Browser
{
	Commonmethods screensht= new Commonmethods();
	//WebDriver dr;
	WebDriverWait wait;
	String filepath="C:\\Users\\sathish.kumar15\\eclipse-workspace\\FacebbokMavenproject\\inputfile\\";
	String filename="facebooklogindetails.xls";
	String sheetname="inputsheet";
			
	
	@BeforeSuite
	public void launch()
	{
		launchbrowser("chrome");
		report = new ExtentReports(System.getProperty("user.dir")
				+"\\extentreport\\ExtentReportResults.html",false);
		test = report.startTest("Sanity testing started");
	}

	@Test(priority=0,dataProvider="datavalue",dataProviderClass=sampleclass2.class)
	public void loginandlogout(String userna,String pass)
	{
		try
		{
		loginpage lp = new loginpage(dr);
		lp.username(userna);
		lp.password(pass);
		lp.loginbuttn();
		String filepath=screensht.capture(dr);
		logout lo= new logout(dr);
		lo.logoutdropdown();
		lo.logoutoption() ;
		test.log(LogStatus.PASS,test.addScreenCapture(filepath));
		}
		catch(Exception e)
		{
			System.out.println(e);
			test.log(LogStatus.FAIL,e);
		}
	}
	
	
	@AfterSuite
	public void teardown()
	{
		dr.quit();
		report.endTest(test);
		report.flush();
	}
}
