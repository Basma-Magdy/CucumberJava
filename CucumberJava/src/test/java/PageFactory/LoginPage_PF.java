package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class LoginPage_PF {
	
	WebDriver driver;
	
	@FindBy(name = "username")
	WebElement txtUsrName;
	 
	
	@FindBy(name = "password")
	WebElement txtPassword; 
	
	@FindBy (xpath = "//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy (xpath = "//button[normalize-space()='Upgrade']")
	WebElement btnUpgrade;
	/*
	@FindBy (how = How.ID , using = "Name")
	WebElement abc;
	
	@FindBy (partialLinkText = "Basma")
	List <WebElement> mylinks;
	*/
	
	public LoginPage_PF(WebDriver driver){
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this); 

	}
	
	public void enterUserName(String username)
	{
		txtUsrName.sendKeys(username);
	}

	
	public void enterPassword(String password)
	{
		txtPassword.sendKeys(password);
	}
	
	public void pressLoginBtn()
	{
		btnLogin.click();
	}
	
	
	public boolean upgradeBtnIsPresent()
	{
		if(btnUpgrade.isDisplayed())
		{
			return true;
		}
		else 
		{
			return false;
		}
	
	}
}