package stepdef;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class HrmSteps
{
	WebDriver driver;
	
	@Given("open the Hrm application")
	public void open_the_hrm_application() 
	{
		  driver= new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
		
		 // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
	}

	@When("user enters {string} and  {string}")
	public void user_enters_and(String un, String psw)
	{
		driver.findElement(By.name("username")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("click on login button")
	public void click_on_login_button() 
	{
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("user should be login navigated to dashboard page")
	public void user_should_be_login_navigated_to_dashboard_page()
	{
	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard/index"));
	System.out.println(driver.getCurrentUrl());
	}

}
