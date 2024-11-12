package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GoogleSearchSteps {

	WebDriver driver = null;

	@Given("Browser is open")
	public void browser_is_open() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));


	}

	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		
		driver.navigate().to("https://www.google.com");
		
		// press reject all button
		driver.findElement(By.id("W0wltc")).click();
		
	}

	@When("user enters a text in google search bar")
	public void user_enters_a_text_in_goole_search_bar() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Hello !");
		Thread.sleep(2000);

	}

	@And("user hits enter")
	public void user_hits_enter() {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	}

	@Then("user is navigated to search resuts")
	public void user_is_navigated_to_search_resuts() throws InterruptedException {
		
		driver.getPageSource().contains("Royalty");
		
		Thread.sleep(2000);
		driver.close();
		driver.quit();

	}


}
