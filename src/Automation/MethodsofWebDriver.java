package Automation;

import org.openqa.selenium.WebDriver;

public class MethodsofWebDriver {
	
	public static void main(String[] args) {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		 //driver.navigate().to("https://www.facebook.com/");
		
	}
}
