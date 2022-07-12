package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsByXpath {
	public static void main(String[] args) {
		WebDriver driver = Browser.openBrowser("https://www.facebook.com/");
		driver.manage().window().maximize();
		
//		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));//xpath by attribute
//		email.sendKeys("Testing");
//		
//		WebElement forgot = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));//xpath by text
//		forgot.click();
		
//		WebElement forgot = driver.findElement(By.xpath("//a[contains(@href,'https://www.facebook.com/recove')]"));//xpath by contains
//		forgot.click();
		
//		WebElement forgot = driver.findElement(By.xpath("(//a[contains(@href,'https://www.facebook.com')])[1]"));//xpath by index
//		forgot.click();
		
		WebElement email = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div[2]/div/div/form/div/div/input"));
		email.sendKeys("QA");                 //absolute xpath
	}
}
