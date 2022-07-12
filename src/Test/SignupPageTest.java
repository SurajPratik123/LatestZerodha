package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Automation.Browser;
import POM.FacebookSignupPage;

public class SignupPageTest {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {	
		driver =Browser.openBrowser("https://www.facebook.com/");
	}
	@Test
	public void signUpTest() throws InterruptedException {	
		FacebookSignupPage facebookSignupPage =new FacebookSignupPage(driver);
		facebookSignupPage.clickOnCreateAccount();
		Thread.sleep(1000);
		facebookSignupPage.enterFirstName("Software");
		facebookSignupPage.enterLastName("Tester");
		facebookSignupPage.enterEmailID("QualityAnalyst@gmail.com");
		facebookSignupPage.reEnterEmailID("QualityAnalyst@gmail.com");
		facebookSignupPage.enterPassword("QA12345");
		facebookSignupPage.enterBirthDate("22");
		facebookSignupPage.enterBirthMonth("1");
		facebookSignupPage.enterBirthYear("1998");
		facebookSignupPage.clickOnMaleGender();
	}	

}
