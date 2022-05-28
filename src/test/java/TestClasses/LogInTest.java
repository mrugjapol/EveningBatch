package TestClasses;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
@Test
public class LogInTest extends BaseClass {
	
	public void VerifyLoginFunctionalitywithValidCredential() throws InterruptedException
	{
		Reporter.log("Entering UserId", true);
		Assert.assertTrue(lip.UserId("LGD943"));
		Reporter.log("Entering Password", true);
		lip.Password("shree@1234");
		Reporter.log("clicking on login button", true);
		lip.Login();
		lip.pin1("123456");
		lip.ContinueButton();
		Assert.assertEquals("Shilpa",lip.VerifyLoginSuccessful());
		
	}
}
