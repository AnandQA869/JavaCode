package Selenium_Practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assertion {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
	Assertion a=new Assertion();
	
		
		
		
	WebElement e1=	driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoes"+Keys.ENTER);
		System.out.println("Amazon");
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\Anand.pdf");
		FileHandler.copy(source, destination);
		
	Thread.sleep(1000);
	
	
		

	}
	

	
}
