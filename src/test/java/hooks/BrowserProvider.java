package hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserProvider
{
	
	public static  WebDriver driver;
	
	 static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	
	public  static WebDriver getdriver()
	{
		 return tdriver.get();
	}
	
	public  static WebDriver SetDriver(String bname)
	{
		if(bname.equalsIgnoreCase("chrome"))
		{
			driver= new ChromeDriver();
			tdriver.set(driver);
			
		}else if(bname.equalsIgnoreCase("firefox"))
		{
			
			driver= new FirefoxDriver();
			tdriver.set(driver);
			
		}else if (bname .equalsIgnoreCase("edge"))
		{
			driver= new EdgeDriver();
			tdriver.set(driver);
		}
		
		return tdriver.get();
		
	}

}
