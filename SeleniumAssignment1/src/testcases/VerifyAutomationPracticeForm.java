package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import factory.BrowserFactory;
import factory.DataProviderFactory;
import pages.AutomationPracticeForm;

public class VerifyAutomationPracticeForm {
	
	WebDriver driver;
	
	
	@Test
	public void TestAutomationPracticeFormChrome() throws InterruptedException 
	{
		
		driver =BrowserFactory.getbrowser("chrome");
				
		driver.navigate().to(DataProviderFactory.getconfig().getURL());
		
		
		AutomationPracticeForm form = PageFactory.initElements(driver, AutomationPracticeForm.class);
		
		form.SelectContinets("Australia");
		
		form.ClickSeleniumIDECheckbox();
		
		form.ClickSeleniumWEbDriverCheckbox();
		Thread.sleep(2000);

		
		form.DownloadLink();
		Thread.sleep(2000);

		
		form.UploadProfilePicture("D:\\Selenium\\Links_b9.txt"); //update the path here
		Thread.sleep(2000);

		form.ClickManualTesterCheckbox();
		form.ClickAutomationTesterCheckbox();

		form.EnterDateOfBirth("15/04/1990");

		form.ExperienceRadioButton();

		form.GenderRadioButton();
		
		form.EnterFirstAndLastName("divyakumar", "marathe");

	}
	
	
	@Test
	public void TestAutomationPracticeFormIE() throws InterruptedException 
	{
		
		driver =BrowserFactory.getbrowser("IE");
		
		driver.navigate().to(DataProviderFactory.getconfig().getURL());
		
		
		AutomationPracticeForm form = PageFactory.initElements(driver, AutomationPracticeForm.class);
		
		form.SelectContinets("Australia");
		
		form.ClickSeleniumIDECheckbox();
		
		form.ClickSeleniumWEbDriverCheckbox();
		Thread.sleep(2000);

		
		form.DownloadLink();
		Thread.sleep(2000);

		
		form.UploadProfilePicture("D:\\Selenium\\Links_b9.txt"); //update the path here
		Thread.sleep(2000);

		form.ClickManualTesterCheckbox();
		form.ClickAutomationTesterCheckbox();

		form.EnterDateOfBirth("15/04/1990");

		form.ExperienceRadioButton();

		form.GenderRadioButton();
		
		form.EnterFirstAndLastName("divyakumar", "marathe");

	}
	
	@AfterMethod
	public void tearDown()
	{
		BrowserFactory.closeBrowser(driver);
		
	}
	
}
