package Auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.cricbuzz.com/");
		
		//driver.navigate().to("https://www.cricbuzz.com/");
		
		Navigation p = driver.navigate();
		p.to("https://www.cricbuzz.com/");
		
		Thread.sleep(3000);//it stops java execution for mentioned time (in this 3 seconds)
		
		p.back();
		
		Thread.sleep(3000);
		
		p.forward();
		
		Thread.sleep(3000);
		
		p.refresh();
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
	//	driver.manage().window().maximize();
		
		Options o = driver.manage();
		Window w = o.window();
		w.maximize();
		
		w.minimize();
		
	}

}
