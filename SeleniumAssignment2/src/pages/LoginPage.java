package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign up')]") WebElement signUpLink;
	@FindBy(xpath="//input[@name='EmailId']") WebElement emailTextbox;
	@FindBy(xpath="//input[@name='password']") WebElement passwordTextbox;
	@FindBy(xpath="//input[@name='password_confirmation']") WebElement password_confirmationTextbox;
	@FindBy(xpath="//button[@id='primaryBtnColor']") WebElement registerButton;
	@FindBy(xpath="//button[@class='btn btn-success']") WebElement okButton;
	@FindBy(xpath="//input[@id='LoginID']") WebElement loginIDTextbox;
	@FindBy(xpath="//input[@id='login-password']") WebElement loginPasswordTextbox;
	@FindBy(xpath="//button[@class='btn popup-btn']") WebElement loginButton;
	@FindBy(xpath="//input[@name='ActCode']") WebElement activationCodeTextBox;
	
	
	public void clickSignupLink()
	{
		signUpLink.click();
	}
	
	public void registrationFrom(String email, String password, String confirmPasword)
	{
		emailTextbox.sendKeys(email);
		passwordTextbox.sendKeys(password);
		password_confirmationTextbox.sendKeys(confirmPasword);
		registerButton.click();
	}
	
	public void clickOkButton()
	{
		okButton.click();
	}
	
	public void clickLoginButton()
	{	
		loginButton.click();
	}
	
	public void logIntoVirgo(String email, String password)
	{
		loginIDTextbox.sendKeys(email);
		loginPasswordTextbox.sendKeys(password);
		loginButton.click();
	}
	
	public void EnterActivationCode(int ActCode)
	{
		activationCodeTextBox.sendKeys(String.valueOf(ActCode));
	}
	

}
