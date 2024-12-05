

package stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazoneSteps 
{
	
	public WebDriver driver;
	String tittle;
	@Given("open the amazon application")
	public void open_the_amazon_application()
	{
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.amazon.in/");
	}

	@When("user get the current tittle of the application")
	public void user_get_the_current_tittle_of_the_application()
	{
	    tittle= driver.getTitle();
	   System.out.println(tittle);
	}

	@Then("tittle should be matched with amazone")
	public void tittle_should_be_matched_with_amazone()
	{
	    Assert.assertTrue(tittle.contains("Online"),"Tittle is not matched");
	    System.out.println("Tittle is matched");
	}
	
	
	@Given("open the amazone application")
	public void open_the_amazone_application() 
	{
		
		driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     driver.get("https://www.amazon.in/");
	}
	


	@When("user search for valid keyword into amazone search")
	public void user_search_for_valid_keyword_into_amazone_search()
	{
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bag");
	}

	@Then("user should get valid search result")
	public void user_should_get_valid_search_result()
	{
	List< WebElement >list = driver.findElements(By.xpath("//div[@id='nav-flyout-searchAjax']//span"));
	System.out.println(list.size());
	
	for(WebElement i:list)
	{
		System.out.println(i.getText());
	}
	}
}
