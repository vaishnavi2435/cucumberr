package stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpencartSteps
{
public WebDriver driver;
@Given("user enter required data")
public void user_enter_required_data(DataTable table)
{
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	driver= new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	List<Map<String,String>> data= table.asMaps();
	driver.findElement(By.name("firstname")).sendKeys(data.get(0).get("fname"));
	driver.findElement(By.name("lastname")).sendKeys(data.get(0).get("Lname"));
	driver.findElement(By.name("email")).sendKeys(data.get(0).get("email"));
	driver.findElement(By.name("telephone")).sendKeys(data.get(0).get("tele"));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get("psw"));
	driver.findElement(By.name("confirm")).sendKeys(data.get(0).get("cpsw"));
	
	
	
   
}
@When("user click on yes readio button")
public void user_click_on_yes_readio_button()
{
   driver.findElement(By.xpath("(//input[@type='radio'])[2]")) .click();
}

@When("click on privacy policy")
public void click_on_privacy_policy() 
{
    driver.findElement(By.xpath("//input[@name='agree']")).click();
}

@When("click on continue button")
public void click_on_continue_button() 
{
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
}

@Then("user should be register sucessful")
public void user_should_be_register_sucessful()
{
    System.out.println("login....................");
}


//open the loginpage snipped

@Given("user required the data")
public void user_required_the_data(DataTable Table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	driver=new ChromeDriver();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  List<List<String>>data= Table.cells();
  
  driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
  driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
  
}

@When("click on the login btn")
public void click_on_the_login_btn()
{
    driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("user should be login sucessful")
public void user_should_be_login_sucessful()
{
    System.out.println("login***********************");
    System.out.println(driver.getTitle());
    
}




}
