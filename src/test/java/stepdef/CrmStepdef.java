package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import hooks.BrowserProvider;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CrmStepdef
{
	WebDriver driver=BrowserProvider.getdriver();
	@Given("open crm page")
	public void open_crm_page() 
	{
	  //driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://automationplayground.com/crm/");
	}

	@When("user click on signin link")
	public void user_click_on_signin_link()
	{
	    driver.findElement(By.linkText("Sign In")).click();
	}
	@Then("signin page should open")
	public void signin_page_should_open() 
	{
	   Assert.assertTrue(driver.getCurrentUrl().contains("/login.html"));
	   System.out.println("login page open:"+driver.getTitle());
	}

	@When("user enter valid credentials {string} and {string}")
	public void user_enter_valid_credentials_and(String un, String psw) 
	{
	   driver.findElement(By.id("email-id")).sendKeys(un);
	   driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("user click on submit button")
	public void user_click_on_submit_button()
	{
	    driver.findElement(By.id("submit-id")).click();
	}

	@Then("user should able to login and navigate to coustmer page")
	public void user_should_able_to_login_and_navigate_to_coustmer_page()
	{
		System.out.println("login complete.....................!!!!!!!!!");
	}




}
