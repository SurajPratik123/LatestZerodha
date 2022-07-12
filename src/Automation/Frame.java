package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {
	public static void main(String[] args) throws IOException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
//		driver.switchTo().frame("courses-iframe");//by id
//		driver.switchTo().frame(0);//by index
		WebElement iframe =driver.findElement(By.xpath("//iframe[@name='iframe-name']"));
		driver.switchTo().frame(iframe);//by webElement
		
		WebElement aboutUs =driver.findElement(By.xpath("(//a[text()='About us'])[1]"));
		aboutUs.click();
		
		ScreenShot.takeScreenShot(driver, "frame");
	}

}
