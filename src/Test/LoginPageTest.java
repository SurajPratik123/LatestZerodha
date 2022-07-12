package Test;

import org.openqa.selenium.WebDriver;


import Automation.Browser;
import POM.FacebookLoginPage;

public class LoginPageTest {
	
	public void loginTest() {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailID("Pratik");
		facebookLoginPage.enterPassword("QA");
		facebookLoginPage.clickOnLogin();
	}
	
	public void loginWithOnlyUserTest() {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailID("Suraj");
		facebookLoginPage.clickOnLogin();
	}
	
	public static void main(String[] args) {
		LoginPageTest loginPageTest =new LoginPageTest();
		loginPageTest.loginTest();
		loginPageTest.loginWithOnlyUserTest();
	}

}
