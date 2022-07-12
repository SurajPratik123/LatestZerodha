package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
	WebElement practise =driver.findElement(By.xpath("//legend[text()='Element Displayed Example']"));
	
	Thread.sleep(2000);
	
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)", practise);
	
	((JavascriptExecutor)driver).executeScript("window.scrollBy(700,700)");
}
}
