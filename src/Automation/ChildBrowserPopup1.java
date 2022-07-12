package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowserPopup1 {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/");
		WebElement seleniumPract =driver.findElement(By.xpath("(//a[text()='Start Selenium Practice'])[1]"));
		seleniumPract.click();
		seleniumPract.click();
		seleniumPract.click();
		
		Set<String> handles =driver.getWindowHandles();
		Iterator<String> a =handles.iterator();
		
		while(a.hasNext())//returns true if Set has new value present in it
		{
			String handle =a.next();//will return first value from Set
			driver.switchTo().window(handle);//will switch the selenium focus from main page to required page
			String title =driver.getTitle();
			if(title.equals("Practice Page"))
			{
				WebElement radio3 =driver.findElement(By.xpath("//input[@value='Radio3']"));
				radio3.click();
			}
		}
	}

}
