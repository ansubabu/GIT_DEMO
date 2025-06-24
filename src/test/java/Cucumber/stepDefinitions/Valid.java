package Cucumber.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Valid 
{
	WebDriver driver;
	@Given("Browser is launched")
	public void Browser_is_launched()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
    @Given ("I have landed on login page")
    public void loginPage()
    {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
    
    @When("^User enter username (.+) and password (.+) credentials$")
    public void loginCredentials(String userId, String password)
    {
    	driver.findElement(By.id("inputUsername")).sendKeys(userId);
    	driver.findElement(By.name("inputPassword")).sendKeys(password);

    }
    
    @And("User clicks Submit")
    public void user_clicks_submit()
    {
    	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
    }

   @Then("User is logged in successfully")
   public void user_is_logged_in_successfully()
   {
	   System.out.println("Success");
   }





}
