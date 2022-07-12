package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MActionDragDrop {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement image =driver.findElement(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(image, trash);
		action.perform();
	}

}
