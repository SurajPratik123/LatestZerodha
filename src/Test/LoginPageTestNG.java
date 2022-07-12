package Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.Browser;
import Automation.ScreenShot;
import POM.FacebookLoginPage;

public class LoginPageTestNG {
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() {
		driver =Browser.openBrowser("https://www.facebook.com/");
	}
	
	@DataProvider(name ="loginData")
	public Object[][] loginData(){
		return new Object[][] {{"Pratik","QA"},{"Pratik","TestEngineer"}};
	}
	@Test(dataProvider = "loginData")
	public void loginTest(String email, String password) throws InterruptedException {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailID(email);
		facebookLoginPage.enterPassword(password);
		facebookLoginPage.clickOnLogin();
		Thread.sleep(1000);
	}
	@Test(enabled = false)
	public void invalidLoginTest() {
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailID("Suraj");
		facebookLoginPage.clickOnLogin();
	}
	@AfterMethod
	public void screenshot() throws IOException {
		ScreenShot.takeScreenShot(driver, "LoginPage");
		//driver.close();
	}

}
