package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopUp {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/");
		
		WebElement seleniumPractice =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPractice.click();
//		seleniumPractice.click();
//		seleniumPractice.click();
		
		String homepage =driver.getWindowHandle();//gives the adress of current page
		System.out.println(homepage);
		
		Set<String> handles =driver.getWindowHandles();
		//Set stores multiple data in data
		//<String> generics(<>) tells us what kind of data Set stores
		//Set doesn't save duplicate data
		//Set doesn't maintain insertion order(unorganized)
		
		Iterator<String> i =handles.iterator();//iterator method returns iterator interface
		String handle1 =i.next();//by using next method of iterator interface we can call the value stored in Set
		System.out.println(handle1);
		
		String handle2 =i.next();
		System.out.println(handle2);
		
		driver.switchTo().window(handle2);
		WebElement radio2 =driver.findElement(By.xpath("//input[@value='Radio2']"));
		radio2.click();
	}

}
