package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver1;
	By txtUsrName = By.name("username");
	By txtPassword = By.name("password");
	By btnLogin = By.xpath("//button[@type='submit']");
	By btnUpgrade = By.xpath("//button[normalize-space()='Upgrade']");
	
	public LoginPage(WebDriver driver){
		
		driver1 = driver;
	}
	
	public void enterUserName(String username)
	{
		driver1.findElement(txtUsrName).sendKeys(username);
	}

	
	public void enterPassword(String password)
	{
		driver1.findElement(txtPassword).sendKeys(password);
	}
	
	public void pressLoginBtn()
	{
		driver1.findElement(btnLogin).click();
	}
	
	
	public boolean upgradeBtnIsPresent()
	{
		if(driver1.findElement(btnUpgrade).isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

}
