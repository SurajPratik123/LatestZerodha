package Automation;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserpopupArrayList {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/");
		WebElement seleniumPractice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		Thread.sleep(5000);
		seleniumPractice.click();
		Thread.sleep(5000);
		seleniumPractice.click();
		Thread.sleep(5000);
		seleniumPractice.click();
		
		ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
		int s = list.size();
		System.out.println(s);
		
//		driver.switchTo().window(list.get(0));
//		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(1));
		System.out.println(driver.getTitle());
		WebElement radio1 =driver.findElement(By.xpath("//input[@value='Radio1']"));
		radio1.click();
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(2));
		WebElement radio2 =driver.findElement(By.xpath("//input[@value='Radio2']"));
		radio2.click();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(list.get(3));
		System.out.println(driver.getTitle());
		WebElement radio3 =driver.findElement(By.xpath("//input[@value='Radio3']"));
		radio3.click();
	}

}
