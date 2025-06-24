package Cucumber.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class invalid 
{
	WebDriver driver;
	@Given ("Browser is launched_Invalid")
	public void browserlaunch()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
    @Given("User landed on login page")
    public void login()
    {
    	driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
    
   @When("^User provides username(.+) and password(.+)$")
   public void credentials(String userID, String password)
   {
	   driver.findElement(By.id("inputUsername")).sendKeys(userID);
	   driver.findElement(By.name("inputPassword")).sendKeys(password);

	   
   }
  @And("User clicks on Submit button")
  public void sumbit()
  {
  	driver.findElement(By.xpath("//button[text()='Sign In']")).click();
  	

  }
  @Then("Error message is verified")
  public void error()
  {
	  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='error']")));
	  System.out.println(driver.findElement(By.xpath("//p[@class='error']")).getText());
  }





}
