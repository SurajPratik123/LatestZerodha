package Auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Vctc {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement create = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		create.click();
		Thread.sleep(2000);
		
		WebElement fname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
		fname.sendKeys("In");
		
		WebElement lname= driver.findElement(By.xpath("//input[@name='lastname']"));
		lname.sendKeys("Prat");
		
		WebElement memail = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		memail.sendKeys("love@birds.com");
		
		WebElement bday = driver.findElement(By.xpath("//select[@id='day']"));
		Select element = new Select(bday);
		element.selectByVisibleText("22");
		
		WebElement gender =driver.findElement(By.xpath("//label[text()='Male']"));
		gender.click();
	}

}
