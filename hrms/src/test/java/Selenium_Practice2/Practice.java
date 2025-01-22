package Selenium_Practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Practice {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement e2=driver.findElement(By.xpath("//a[.='About Amazon']"));
		Point p1=e2.getLocation();
	int x=	p1.getX();
		int y= p1.getY();
		System.out.println(x);
		System.out.println(y);
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(1000);
		
		
		
		
		
		
		
			}

}
