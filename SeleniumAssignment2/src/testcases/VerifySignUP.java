package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.LoginPage;

public class VerifySignUP {
	
WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver =BrowserFactory.getbrowser("chrome");
		driver.get(DataProviderFactory.getconfig().getURL());
	}
	
	@Test
	public void TestSignUp() throws InterruptedException
	{
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		
		login.clickSignupLink();
		
		login.registrationFrom(DataProviderFactory.getexcel().getdata(0, 1, 0), DataProviderFactory.getexcel().getdata(0, 1, 1), DataProviderFactory.getexcel().getdata(0, 1, 1));
		
		login.clickOkButton();
		Thread.sleep(3000);
		
		login.logIntoVirgo(DataProviderFactory.getexcel().getdata(0, 1, 0), DataProviderFactory.getexcel().getdata(0, 1, 1));
	
		login.EnterActivationCode(DataProviderFactory.getexcel().getintdata(0, 1, 2));
		
		
	}

	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
	}
}
