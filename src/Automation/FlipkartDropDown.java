package Automation;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.flipkart.com/");
		
		WebElement cancel =driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		cancel.click();
		
		WebElement more =driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(more);
		action.perform();
		
		WebElement customer =driver.findElement(By.xpath("//div[text()='24x7 Customer Care']"));
		customer.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		WebElement shop =driver.findElement(By.xpath("//img[@alt='W Women Printed Flared Kurta']"));
		shop.click();
	}

}
