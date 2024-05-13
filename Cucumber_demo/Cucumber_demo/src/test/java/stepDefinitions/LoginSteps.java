package stepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver;
	
	@Given("the user open the application")
	public void the_user_open_the_application() {
	    
	}

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
	    driver.get("https://.....");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//login")).click();
	    
	}

	@When("the user enters valid credentials\\(username: {string} ,password: {string})")
	public void the_user_enters_valid_credentials_username_password(String email, String password) {
	    driver.findElement(By.xpath("//email")).sendKeys(abc@gamil.com);
	    driver.findElement(By.xpath("//pass")).sendKeys(abc@123);

	}

	@When("the user clicked on submit buttton")
	public void the_user_clicked_on_submit_buttton() {
		driver.findElement(By.xpath("//submit btn")).click();
	   
	}

	@Then("the user should see my acco")
	public void the_user_should_see_my_acco() {
	   boolean status =driver.findElement(By.xpath("//nextpage")).isDisplayed();
	   Assert.assertEquals(status, true);
	}

	@Then("the user should see a welcome message")
	public void the_user_should_see_a_welcome_message() {
	    boolean  welcomestatus= driver.findElement(By.xpath("//welcome status")).isDisplayed();
		   Assert.assertEquals(welcomestatus, true);
		   driver.quit();
		   

	    
	}




}
