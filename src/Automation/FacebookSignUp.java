package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FacebookSignUp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		
		WebElement signUp =driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signUp.click();
		Thread.sleep(2000);
		WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
		month.click();
		System.out.println(month.getAttribute("value"));
		System.out.println(month.getText());
		List<WebElement> options =driver.findElements(By.tagName("option"));
		System.out.println(options.size());
		
	}

}
