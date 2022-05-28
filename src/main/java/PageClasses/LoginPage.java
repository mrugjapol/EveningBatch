package PageClasses;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath ="//input[@type='text']")
	private WebElement UserId;
	@FindBy(xpath ="//input[@type='password']")
	private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement LoginButton;
	@FindBy(xpath ="//input[@type='password']")
	private WebElement pin;
	@FindBy(xpath ="//button[@type='submit']")
	private WebElement ContinueButton;
	@FindBy(xpath="//span[text()='Shilpa']")
	private WebElement afterLoginText;
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public boolean UserId(String userid)
	{
		UserId.sendKeys(userid);
		return UserId.isDisplayed(); 
	}
	public void Password(String password)
	{
		Password.sendKeys(password);
	}
	public boolean Login() 
	{
		LoginButton.click();
		return LoginButton.isEnabled();
		
	}
	public void pin1(String pin1) throws InterruptedException
	{
		Thread.sleep(2000);
		pin.sendKeys(pin1);
	}
	public void ContinueButton()
	{
		ContinueButton.click();
	}
	public String VerifyLoginSuccessful()
	{
		String text = afterLoginText.getText();
		return text;
	}
	
	


}
