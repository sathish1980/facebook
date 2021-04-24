package General;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Commonmethods 
{

public static String capture(WebDriver driver) throws IOException {
		
		TakesScreenshot ts = ((TakesScreenshot) driver);
	
		File scrFile=ts.getScreenshotAs(OutputType.FILE);
		
		File Dest = new File(System.getProperty("user.dir")+"\\screenshot\\" + System.currentTimeMillis()+ ".png");
	
		String errflpath = Dest.getAbsolutePath();
		FileUtils.copyFile(scrFile, Dest);
		return errflpath;
		}

}
