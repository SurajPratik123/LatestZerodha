package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementIsEnabled {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.instagram.com/");
		Thread.sleep(3000);
		
//		WebElement id =driver.findElement(By.xpath("//input[@name='username']"));
//		id.sendKeys("Pratik");
//		WebElement password =driver.findElement(By.xpath("//input[@name='password']"));
//		password.sendKeys("123456");
		
		WebElement login =driver.findElement(By.xpath("//button[@type='submit']"));		
		boolean a =login.isEnabled();
		System.out.println(a);
	}

}
