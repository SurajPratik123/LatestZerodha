package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MethodsOfWebElements {
	public static void main(String[] args) {
		WebDriver driver = Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
//		WebElement radio2 = driver.findElement(By.xpath("//input[@value='Radio2']"));
//		radio2.click();
//		
//		boolean result = radio2.isSelected();
//		System.out.println(result);
		
		WebElement input = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean status = input.isDisplayed();
		System.out.println(status);
		
		WebElement hide = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
		hide.click();
		
		boolean newstatus =input.isDisplayed();
		System.out.println(newstatus);
		
		WebElement title = driver.findElement(By.xpath("//h1[@class=' header1 font-weight-bold text-white text-center']"));
		String actualtext = title.getText();
		
		String requiredtext ="Welcome To Practice Page";
		
		if(requiredtext.equals(actualtext))
		{
			System.out.println("Text is correctly displayed");
		}
	}

}
