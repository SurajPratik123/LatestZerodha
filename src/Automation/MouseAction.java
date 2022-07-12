package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rightClick =driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action =new Actions(driver);
//		action.contextClick(rightClick);//used to right click on webpage
//		action.perform();
		
		WebElement dClick =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action.doubleClick(dClick);//used to double click on webpage
		action.perform();
	}

}
