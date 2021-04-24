package General;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class Browser 
{
	public static WebDriver dr;
	public ExtentReports report;
	public ExtentTest test;
	public void launchbrowser(String browservalue)
	{
		if(browservalue.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sathish.kumar15\\OneDrive - EY\\Desktop\\SathishkumarR\\Personal\\Software\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.addArguments("--disable-notifications");
		dr=new ChromeDriver(options);
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com");
		}
		
	}
}
