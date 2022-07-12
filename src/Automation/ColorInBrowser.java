package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class ColorInBrowser {
	public static void main(String[] args) throws IOException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement openTab =driver.findElement(By.xpath("//a[@id='opentab']"));
		
		String colour = openTab.getCssValue("background-color");
		System.out.println(colour);
		
		String s =Color.fromString(colour).asHex();
		System.out.println(s);
		
		if(s.equals("#39949a")) {
			System.out.println("Background color is correct");
		}
		else
			System.out.println("Background color is wrong");
		
		WebElement headText =driver.findElement(By.xpath("//h1[text()='Practice Page']"));
		String text =headText.getCssValue("color");
		String textColor =Color.fromString(text).asHex();
		System.out.println(textColor);
		if(textColor.equals("#212529")) {
			System.out.println("Text color is correct");
		}
		else {
			System.out.println("Text color is wrong");
		}
//		ScreenShot.takeScreenShot(driver, "fbook");
		
	}

}
