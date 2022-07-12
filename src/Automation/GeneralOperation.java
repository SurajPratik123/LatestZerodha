package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralOperation {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.facebook.com/");
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("Pratik");
		String s =email.getAttribute("value");
		String text =email.getText();
		System.out.println(s);
		System.out.println(text);
	}

}
