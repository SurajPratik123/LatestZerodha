package Auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Dimension d = new Dimension(200,300);
		driver.manage().window().setSize(d);
		
		Thread.sleep(3000);
		Point p = new Point(700,500);
		driver.manage().window().setPosition(p);
	}

}
