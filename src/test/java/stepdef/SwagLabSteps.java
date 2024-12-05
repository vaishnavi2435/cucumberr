

	package stepdef;
	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;

	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;


	public class SwagLabSteps
	{

		public WebDriver driver;
		@Given("user open the application")
		public void user_open_the_application() 
		{
		    driver=new ChromeDriver();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.get("https://www.saucedemo.com/v1/");
		}

		
		@When("user enter valid Username and valid Password")
		public void user_enter_valid_username_and_valid_password()
		{
			 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			    driver.findElement(By.id("password")).sendKeys("secret_sauce");
		}




		@When("user click on login button")
		public void user_click_on_login_button()
		{
		    driver.findElement(By.id("login-button")).click();
		}

		@Then("user shoud able to login and navigate to inventory page")
		public void user_shoud_able_to_login_and_navigate_to_inventory_page() 
		{
		   Assert.assertTrue(driver.getCurrentUrl().contains("inventory"));
		   System.out.println("login complete........................!!!!!!!!!!!"+driver.getCurrentUrl());
		}

	}



