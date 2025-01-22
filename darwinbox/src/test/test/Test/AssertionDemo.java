package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionDemo
{
	@Test
public void testMethod()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/");
	String expetedTitle="HYR Tutorials-Google Search";
	String actualTitle=driver.getTitle();
	System.out.println("welcome to WHITE HOUSE SELENIUM");
	Assert.assertEquals(actualTitle, expetedTitle);
	driver.quit();
}
}