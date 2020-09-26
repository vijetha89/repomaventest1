package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class steps {

	WebDriver driver;
	
	@Before
	public void beforetest() {
		
		System.setProperty("webdriver.chrome.driver", "//Users//vijetha//Downloads//chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Given("I am able to navigate onto the login page")
	public void i_am_able_to_navigate_onto_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("txtUsername")).sendKeys(string);

	}
	
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("txtPassword")).sendKeys(string);

	}
	
	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("btnLogin")).click();

	}
	
	@Then("I should see the username as {string}")
	public void i_should_see_the_username_as(String string) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		String expected = driver.findElement(By.id("welcome")).getText();
		Assert.assertEquals(expected, string);
		
		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//[@id='welcome-menu']/ul/li[2]))
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
		Thread.sleep(5000);
//		driver.close();
	}

	@Then("I should see a Error message as {string}")
	public void i_should_see_a_error_message_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
		String errorText = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		Assert.assertEquals(errorText, string);

		
	}
	
	@After
	public void aftertest() {
		driver.close();
	}

	
}
