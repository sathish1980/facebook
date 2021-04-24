package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import General.locatoractions;

public class loginpage 
{
	@FindBy(id="email")
	WebElement user;
	@FindBy(id="pass")
	WebElement pswd;
	@FindBy(name="login")
	WebElement lgn;
	WebDriver dr;
	locatoractions lc= new locatoractions();
	public loginpage(WebDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}

	public void username(String uname)
	{
		//WebElement un=dr.findElement(By.id("email"));
		lc.sendValue(user,uname);
		 
	}
	
	public void password(String pwar)
	{
		//dr.findElement(By.id("pass")).sendKeys(pwar);
		pswd.sendKeys(pwar);
	}
	
	public void loginbuttn()
	{
		//dr.findElement(By.name("login")).click();
		lgn.click();
	}
	
	public void DOB()
	{
		dr.findElement(By.name("login")).click();
	}
}
