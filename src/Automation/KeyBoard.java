package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demoqa.com/text-box");
		WebElement fullName =driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.sendKeys("Pratik");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB);
		action.sendKeys("one@gmail.com");
		
		action.sendKeys(Keys.TAB);
		action.sendKeys("DY Patil Pune");
		
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
//		action.keyUp(Keys.CONTROL);
//		
//		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		
		action.sendKeys(Keys.TAB);
		action.sendKeys(Keys.ENTER);
		action.build().perform();
		
	}

}
