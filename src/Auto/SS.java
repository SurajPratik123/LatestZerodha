package Auto;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import Automation.Browser;

public class SS {
	public static void main(String[] args) throws IOException {
		WebDriver driver = Browser.openBrowser("https://www.amazon.com/");
		
		TakesScreenshot snippet = (TakesScreenshot)driver;//when we upcast method of interface using reference of child interface
		
		File source = snippet.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\ScreenShot\\am.jpg");
		
		FileHandler.copy(source, destination);
	}

}
