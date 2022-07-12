package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Table {
	public static void main(String[] args) {
		WebDriver driver =Browser.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		
		WebElement currentPrice =driver.findElement(By.xpath("//table//tbody//tr[6]//td[4]"));
		String a =currentPrice.getText();
		System.out.println(a);
		
		List<WebElement> heading =driver.findElements(By.xpath("//table//thead//tr//th"));
		
		int column =heading.size();
		System.out.println(column);
		
		for(int i=0; i<column; i++) {
//			WebElement head =heading.get(i);
//			String headName =head.getText();
//			System.out.println(headName);
			System.out.println(heading.get(i).getText());	
		}
		
		List<WebElement> row =driver.findElements(By.xpath("//table//tbody//tr//td[4]"));
		int rowSize =row.size();
		System.out.println(rowSize);
		double price =0;
		
		for(int i=0; i<rowSize; i++) {
			WebElement currentlyPrice =row.get(i);
			String prices =currentlyPrice.getText();			
			double d =Double.parseDouble(prices);
			if(d>price) {
				price =d;
			}
		}
		System.out.println("Max Price is "+price);
		
		for(int j=0; j<rowSize; j++) {
			WebElement currentPrice1 =row.get(j);
			String prices = currentPrice1.getText();
			double d= Double.parseDouble(prices);
			if(d<price) {
				price =d;
			}
		}
		System.out.println("min price is "+price);
//		List<WebElement> rowCount =driver.findElements(By.xpath("//table//tbody//tr"));
//		int totalRows =rowCount.size();
//		System.out.println(totalRows);
//		double biggestPrice =0;
//		for(int j=1; j<=totalRows; j++) {
//			WebElement priceNow =driver.findElement(By.xpath("//table//tbody//tr["+j+"]//td[4]"));
//			String cost =priceNow.getText();
//			double m =Double.parseDouble(cost);
//			if(m>biggestPrice) {
//				biggestPrice =m;
//			}
//		}
//		System.out.println(biggestPrice);
	}

}
