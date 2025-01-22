package TestngPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
@DataProvider(name="set1")
public Object[][] method1()
	
	{
		return new Object[][] {{"anand"},{"SALAM KHAN"},{"MODI"}};
	}
@Test(dataProvider="set1")
@DataProvider(name="set2")



public void search(String input) throws InterruptedException {
	ChromeDriver driver =new ChromeDriver();
	 FirefoxDriver driver1 =new  FirefoxDriver ();
	
	driver.get("https://www.google.com/");
	WebElement e1=driver.findElement(By.name("q"));
	e1.sendKeys(input+Keys.ENTER);
	
	Thread.sleep(1000);
	driver.close();
}
}
