package TestngPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNgTeseCase1 {
	@Test
	
	public void testcse1() {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		WebElement e1=driver.findElement(By.xpath("//a[.='Facebook']"));
		Point p1=e1.getLocation();
		int x=p1.getX();
		int y=p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js=driver;
		//js.executeScript("window.scrollBy(0,100)");

		js.executeScript("window.scrollBy(0,"+y+")");
		
	}
	
	}

