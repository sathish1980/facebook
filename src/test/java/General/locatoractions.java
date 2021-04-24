package General;

import org.openqa.selenium.WebElement;

public class locatoractions 
{

	public void buttonclick(WebElement actionbutton)
	{
		try
		{	
		actionbutton.click();
		}
		catch(Exception e)
		{
			
		}
	}
	
	public void sendValue(WebElement actionbuttons,String typevalue)
	{
		actionbuttons.sendKeys(typevalue);
	}
}
