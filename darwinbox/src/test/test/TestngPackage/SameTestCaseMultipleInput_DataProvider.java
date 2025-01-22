package TestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SameTestCaseMultipleInput_DataProvider 
{
	@DataProvider(name="set1")
	public Object[][]method1(){
		return new Object[][] {{"Anand"},{"SALMAN KHAN"},{"MODI"}};
	}
	@DataProvider(name="set2")
	public Object[][]method2(){
		return new Object[][] {{"PUSPA2"},{"KHAN"},{"LALIT MODI"}};
	}
	@DataProvider(name="set3")
	public Object[][]method3(){
		return new Object[][] {{400},{500},{1000}};
	}
	@Test(dataProvider="set3")
	public void method(int input) {
		int sum=100+input;
		System.out.println(sum);
		Reporter.log("Addition is->"+sum);
	}
	
/*public void search(int input) {
	
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
WebElement e1=	driver.findElement(By.name("q"));
e1.sendKeys(input+Keys.ENTER);*/

	
}

