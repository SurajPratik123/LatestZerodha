package Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RedBusDynamicDropDwn {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.redbus.in/");
		String s ="Sangamwadi, Pune";
		
		WebElement source =driver.findElement(By.xpath("//input[@id='src']"));
		source.sendKeys("su");
		
		
		List<WebElement> options =driver.findElements(By.xpath("//ul[@class='autoFill homeSearch']"));
		System.out.println(options.size());
		
		
//		for(int i=0;i<options.size();i++) {
//			WebElement share =options.get(i);
//			String shareName =share.getText();
//			if(shareName.equals("Suri")) {
//				share.click();
//			}
//		}
	}

}
