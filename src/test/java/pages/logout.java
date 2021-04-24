package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class logout 
{
	@FindBy(xpath="(//div[@aria-label='Account'])[1]")
	WebElement logdrop;
	WebDriver dr;
	WebDriverWait wait; 
	
	public logout(WebDriver dr)
	{
		this.dr=dr;
		wait = new WebDriverWait(dr,60); 
		PageFactory.initElements(dr,this);
	}
	
	public void logoutdropdown()
	 {
	 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@aria-label='Account'])[1]")));
	// dr.findElement(By.xpath("(//div[@aria-label='Account'])[1]")).click();
	 logdrop.click();
	 }
	
	 public void logoutoption() 
	 {
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Log Out']")));
				
	 dr.findElement(By.xpath("//span[text()='Log Out']")).click();
	 
	 }
}
