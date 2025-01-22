package Test;

import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

import darwinbox.ChromeDriver;

public class TestNg_Practice2 {
@Test
	public void TestGoogle() 
{
	ChromeDriver driver=new ChromeDriver();
 driver.get();
		System.out.println("anan");
	}
}
