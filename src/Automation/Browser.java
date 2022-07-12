package Automation;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver openBrowser(String url)  {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting chrome driver to webdriver
		driver.get(url);//get method helps to get a webpage
		driver.manage().window().maximize();
		return driver;
	
	
//		driver.navigate().to("https://www.facebook.com/");
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().back();
//		
//		driver.navigate().forward();
//		
//		driver.navigate().refresh();
	}

}
