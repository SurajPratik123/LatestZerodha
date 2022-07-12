package Automation;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Zerodha {
	@FindBy (xpath = "//body//ul//li//span//span[@Class='tradingsymbol']") private List<WebElement> searchStock;
	
	private void name() {
		WebElement stock =searchStock.get(0);
		System.out.println(stock.getText());
	}
	
	public static void main(String[] args) {
		Zerodha zerodha =new Zerodha();
		zerodha.name();
	}
}
	
	
	
	

