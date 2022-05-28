package TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import PageClasses.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	 static WebDriver driver;
	LoginPage lip;
	
	@BeforeSuite
	public void LaunchingofURL()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		
		
	}
	@BeforeClass
	public void ObjectCreation()
	{
		 lip=new LoginPage(driver);
		
	}
	

}
