package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MActionDragDropFindElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions action = new Actions(driver);
		
		WebElement iframe =driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		List<WebElement> image =driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));
		
		WebElement trash =driver.findElement(By.xpath("//div[@id='trash']"));
		
		for(int i=0;i<image.size();i++)
		{
			WebElement picture =image.get(i);
			Thread.sleep(2000);
			action.dragAndDrop(picture, trash);
			action.perform();
		}
		Thread.sleep(1000);
		
//		List<WebElement> image1 =driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content')]"));
				
		WebElement photoManager =driver.findElement(By.xpath("//ul[@id='gallery']"));
		
		for(int i=0;i<image.size();i++)
		{
			WebElement picture1 =image.get(i);
			Thread.sleep(2000);
			action.dragAndDrop(picture1, photoManager);
			action.perform();
		}
	}
}
