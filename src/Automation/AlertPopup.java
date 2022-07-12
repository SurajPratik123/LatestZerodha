package Automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		WebElement vctcalert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
		vctcalert.click();
		Thread.sleep(2000);
		
		Alert a =driver.switchTo().alert();
		//a.accept();//to select ok or accept the alert
		//a.dismiss();//to select cancel or dismiss the alert
		String text =a.getText();//to get text present on alert popup
		System.out.println(text);
	}

}


//https://the-internet.herokuapp.com/javascript_alerts
//https://nxtgenaiacademy.com/alertandpopup/
//https://chercher.tech/practice/practice-pop-ups-selenium-webdriver
