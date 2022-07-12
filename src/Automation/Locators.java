package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		
		WebElement s= driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		String s1 =s.getAttribute("placeholder");
		System.out.println(s1);
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Pratik");
		Thread.sleep(2000);
		email.clear();
//		
//		WebElement password = driver.findElement(By.name("pass"));;
//		password.sendKeys("Ind");
//		
//		WebElement login = driver.findElement(By.tagName("button"));
//		login.click();
		
//		WebElement forgot = driver.findElement(By.linkText("Forgotten password?"));
//		forgot.click();
		
//		WebElement createNewAccount = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
//		createNewAccount.click();
		
//		WebElement forgotpassword = driver.findElement(By.className("_6ltj"));
//		forgotpassword.click();
		
//		WebElement forgotten = driver.findElement(By.partialLinkText("Forgotten"));
//		forgotten.click();
	}

}
