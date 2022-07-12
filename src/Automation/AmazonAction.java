package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class AmazonAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =Browser.openBrowser("https://www.amazon.com/");
		Thread.sleep(2000);
		
		WebElement signIn =driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Actions action = new Actions(driver);
		action.moveToElement(signIn);
		action.perform();
		Thread.sleep(2000);
		
		WebElement account =driver.findElement(By.xpath("//span[text()='Account']"));
		account.click();
		Thread.sleep(2000);
		
		WebElement yourOrder =driver.findElement(By.xpath("(//div[@class=\"a-box-inner\"])[1]"));
		yourOrder.click();
		Thread.sleep(2000);
		
		WebElement email =driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("Tester");
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		
	}

}
