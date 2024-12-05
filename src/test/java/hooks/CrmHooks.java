package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CrmHooks
{
  public 	WebDriver driver;
     @Before
     public void setup()
     {
    	 System.out.println("driver session initilized.................");
    	// driver=new ChromeDriver();
    	driver=  BrowserProvider.SetDriver("Chrome");
     }
     
     @After
     public void teardown()
     {
    	 
    	 System.out.println("driver session is ended...................");
    	 driver.quit();
     }
	
}
