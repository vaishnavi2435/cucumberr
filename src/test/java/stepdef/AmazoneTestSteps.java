package stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazoneTestSteps 

{
	WebDriver driver;
	String tittle;
	@Given("open amazone app")
	public void open_amazone_app()
	{
	    driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.amazon.in/");
	}

	@When("user get tittle of Homepage")
	public void user_get_tittle_of_homepage() 
	{
	    tittle= driver.getTitle();
	   System.out.println(tittle);
	   
	}

	@Then("Tittle of Homepage should be match")
	public void tittle_of_homepage_should_be_match()
	{
	    Assert.assertTrue(tittle.contains("Online Shopping")," tittle is not matched");
	    System.out.println("Tittle is matched");
	}

	@When("user open Bestseller page")
	public void user_open_bestseller_page()
	{
		driver.findElement(By.linkText("Best Sellers")).click();
		
	   
	}

	@When("user get Tittle of Bestsellerpage")
	public void user_get_tittle_of_bestsellerpage() 
	{
	  tittle= driver.getTitle();
	  System.out.println("tittle of Bestsellers page is :"+tittle);
	}

	@Then("Tittle of Bestseller should be match")
	public void tittle_of_bestseller_should_be_match()
	{
		 Assert.assertTrue(tittle.contains("Bestsellers")," tittle is not matched");
		    System.out.println("Tittle is matched");
	}

	@When("user open  Mobilepage")
	public void user_open_mobilepage()
	{
	    driver.findElement(By.linkText("Mobiles")).click();
	}

	@When("user get Tittle of Mobilepage")
	public void user_get_tittle_of_mobilepage() 
	{
	    tittle=driver.getTitle();
	    System.out.println("tittle of mobiles is :"+tittle);
	}

	@Then("Tittle of Mobilepage should be match")
	public void tittle_of_mobilepage_should_be_match() 
	{
		Assert.assertTrue(tittle.contains("Mobile")," tittle is not matched");
	    System.out.println("Tittle is matched");
	}

	@When("user open  Fashionpage")
	public void user_open_fashionpage()
	{
	   driver.findElement(By.linkText("Amazon Pay")).click();
	}

	@When("user get Tittle of Fashionpage")
	public void user_get_tittle_of_fashionpage()
	{
	   tittle= driver.getTitle();
	   System.out.println("tittle of fashion is :"+tittle);
	}

	@Then("Tittle of FashionPage should be match")
	public void tittle_of_fashion_page_should_be_match()
	{
		Assert.assertTrue(tittle.contains("Amazon")," tittle is not matched");
	    System.out.println("Tittle is matched");
	}

        // System.out.println("complelete the test.....................");


}
