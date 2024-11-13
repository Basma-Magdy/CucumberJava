package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.LoginPage_PF;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	WebDriver driver = null;
	//LoginPage logObj;
	LoginPage_PF logObj;
	
	// runs after setup 2 as has order larger than setup 2
	// runs for the scenarios with tag SmokeTest only
	@Before(value = "@SmokeTest", order = 2)
	public void browserSetup() {
		
		System.out.println("==== I'm inside browser Setup === \n");
		
		 driver = new ChromeDriver(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		 	
	}
	
	// will run first before each scenario (lowest order)
	@Before (value ="@SmokeTest",order = 1)
	public void Setup2() {
		
		System.out.println("=== I'm inside Setup2  === ");
		
	}
	
	//lower order runs last
	@After (value ="@SmokeTest", order = 1)
	public void tearDown() {
		
		System.out.println("=== I'm inside Teardown === \n");

		driver.close();
		driver.quit();
		
	}
	// higher order runs first in the after annotation
	@After(value ="@SmokeTest", order = 2)
	public void tearDown2() {
		
		System.out.println("=== I'm inside Teardown2 ===");
		
	}
	/*
	@BeforeStep
	public void beforeSteps() {
	System.out.println("***********I'm inside before steps************");	
	}

	@AfterStep
	public void afterSteps() {
		System.out.println("***************I'm inside after steps*************");	
		}
*/
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) {

		//logObj = new LoginPage(driver);
		logObj = new LoginPage_PF(driver);
		
		logObj.enterUserName(username);
		logObj.enterPassword(password);
		
	}

	@And("user pressed the login button")
	public void user_pressed_the_login_button() {
		
		logObj.pressLoginBtn();
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		
		boolean loginSuccess = logObj.upgradeBtnIsPresent();
		if (loginSuccess)
		{ 
			System.out.println("======================Login is successful============================");
		}
		else
		{
		System.out.println("============================Login is failed , Invalid credentials===================================");
		}

		}
	}
