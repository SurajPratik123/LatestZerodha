package Test;

import org.testng.annotations.AfterClass;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	
	@AfterClass(enabled = false)
	public void afterClass() {


		System.out.println("After Class");
	}
	@BeforeClass(enabled =false)
	public void beforeClass() {
		System.out.println("Before Class");
	}
	@Test(priority = 1, enabled = false)
	@Parameters({"i","j"})
	public void test1(int a, int b) {
		System.out.println(a+b);
	}
	
	@DataProvider(name ="TestData")
	public Object[][] values(){
		return new Object[][] {{5,7},{7,9}};
	}
	@Test(timeOut = 2000, dataProvider = "TestData")
	public void test2(int a, int b) throws InterruptedException {
//		Thread.sleep(4000);
		System.out.println("Test2 = "+ (a+b));
	}
	@BeforeMethod(enabled = false)
	public void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterMethod(enabled = false)
	public void afterMethod() {
		System.out.println("After Method");
	}
	@Test(invocationCount = 2, priority = -1)
	public void test3() {
		System.out.println("Test3");
	}
	@BeforeTest(enabled = false)
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest(enabled = false)
	public void afterTest() {
		System.out.println("After Test");
	}


}
