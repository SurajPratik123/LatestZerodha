package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://vctcpune.com/selenium/practice.html");
		WebElement dropdown =driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select sel =new Select(dropdown);
//		sel.selectByValue("option1");//can select the option from drop down using attribute value
//		sel.selectByVisibleText("Option2");//can select the option from drop down using visible text
		sel.selectByIndex(3);//can select the option from drop down using index
		System.out.println(dropdown.getText());
	}

}
