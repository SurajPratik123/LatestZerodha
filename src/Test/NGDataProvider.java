package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Automation.Parametrization;

public class NGDataProvider {
	String value1;
	String value2;
	
	@BeforeClass
	public void getTestData() throws EncryptedDocumentException, IOException {
		value1 = Parametrization.getData("Sheet1", 0, 0);
		value2 =Parametrization.getData("Sheet1", 0, 1);
	}
	
	@DataProvider(name ="ExcelData")
	public Object[][] values(){
		return new Object[][] {{value1}, {value2}};
	}
	@Test(dataProvider = "ExcelData")
	public void demo2(String name) {
		System.out.println(name);
	}
	
	
	
	@DataProvider(name ="TestingData")
	public Object[][] stringData(){
			return new Object[][]{{"A","B","a"},{"C","D","c"}};
	}
	
	@Test(dataProvider = "TestingData")
	public void demo1(String i, String j, String k) {
		System.out.println(i+" & "+j+" & "+k);
	}

}
