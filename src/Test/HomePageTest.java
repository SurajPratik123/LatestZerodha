package Test;

import org.openqa.selenium.WebDriver;

import Automation.Browser;
import POM.FacebookLoginPage;

public class HomePageTest {
	
	public void GoTOHomePageTest() {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		FacebookLoginPage facebookLoginPage =new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailID("xyz@gmail.com");
		facebookLoginPage.enterPassword("12345");
		facebookLoginPage.clickOnLogin();
	}
	
	public static void main(String[] args) {
		HomePageTest homePageTest =new HomePageTest();
		homePageTest.GoTOHomePageTest();
	}
	
}
