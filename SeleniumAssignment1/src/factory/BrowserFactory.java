package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver getbrowser(String name)
	{
		
		if(name.equalsIgnoreCase("chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver",DataProviderFactory.getconfig().getChromepath() );
			driver=new ChromeDriver();
		}
		if(name.equalsIgnoreCase("IE"))
		{	
			System.setProperty("webdriver.ie.driver",DataProviderFactory.getconfig().getIEpath() );
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static void closeBrowser(WebDriver ldriver)
	{
		ldriver.quit();
	}

}
