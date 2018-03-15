package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AutomationPracticeForm {
	
	WebDriver driver;
	public AutomationPracticeForm(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//select[@id='continents']") WebElement ContinetsDropBox;
	@FindBy(xpath="//input[@id='tool-1']") WebElement SeleniumIDECheckbox;
	@FindBy(xpath="//input[@id='tool-2']") WebElement SeleniumWEbDriverCheckbox;
	@FindBy(xpath="//a[contains(text(),'Selenium Automation Hybrid Framework')]") WebElement DLinkSeleniumAutomation;
	@FindBy(xpath="//a[contains(text(),'Test File to Download')]") WebElement DLinkTestFile;
	@FindBy(xpath="//input[@id='photo']") WebElement UploadProfilePicture;
	@FindBy(xpath="//input[@id='profession-0']") WebElement ManualTesterCheckbox;
	@FindBy(xpath="//input[@id='profession-1']") WebElement AutomationTesterCheckbox;
	@FindBy(xpath="//input[@id='datepicker']") WebElement DOBTextbox;
	@FindBy(xpath="//input[@id='exp-4']") WebElement ExperienceRadioButton;
	@FindBy(xpath="//input[@id='sex-0']") WebElement GenderRadioButton;
	@FindBy(xpath="//input[@name='firstname']") WebElement FirstnameTextbox;
	@FindBy(xpath="//input[@name='lastname']") WebElement Lastnametextbox;
	
	
	public void SelectContinets(String continets)
	{
		Select select = new Select(ContinetsDropBox);
		select.selectByVisibleText(continets);
	}
	
	public void ClickSeleniumIDECheckbox()
	{
		SeleniumIDECheckbox.click();
	}
	
	public void ClickSeleniumWEbDriverCheckbox()
	{
		SeleniumWEbDriverCheckbox.click();
	}
	
	public void DownloadLink()
	{
		
	       String downloadFilepath = "c:\\download";
	 
	       HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
	       chromePrefs.put("profile.default_content_settings.popups", 0);
	       chromePrefs.put("download.default_directory", downloadFilepath);
	       ChromeOptions options = new ChromeOptions();
	       HashMap<String, Object> chromeOptionsMap = new HashMap<String, Object>();
	       options.setExperimentalOption("prefs", chromePrefs);
	       options.addArguments("--test-type");
	       options.addArguments("--disable-extensions"); //to disable browser extension popup
	  
	       DesiredCapabilities cap = DesiredCapabilities.chrome();
	       cap.setCapability(ChromeOptions.CAPABILITY, chromeOptionsMap);
	       cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	       cap.setCapability(ChromeOptions.CAPABILITY, options);
	       
	       DLinkSeleniumAutomation.click();
	       DLinkTestFile.click();
		
	}
	
	public void UploadProfilePicture(String path)
	{
		UploadProfilePicture.click();
		StringSelection ss = new StringSelection(path);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		Robot robot;
		try {
			robot = new Robot();
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			
		} catch (AWTException e) {
			System.out.println("Exception while uploading : "+e.getMessage());
		}
		
	}
	
	
	
	public void ClickManualTesterCheckbox()
	{
		ManualTesterCheckbox.click();
		
	}
	
	public void ClickAutomationTesterCheckbox()
	{
		AutomationTesterCheckbox.click();
	}
	
	public void EnterDateOfBirth(String dob)
	{
		DOBTextbox.sendKeys(dob);
	}
	
	public void ExperienceRadioButton()
	{
		ExperienceRadioButton.click();
	}
	
	public void GenderRadioButton()
	{
		GenderRadioButton.click();
	}
	
	public void EnterFirstAndLastName(String firstname, String lastname)
	{
		FirstnameTextbox.sendKeys(firstname);
		Lastnametextbox.sendKeys(lastname);
	}
}
