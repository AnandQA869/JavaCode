package Selenium_Practice2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Link {
public static void main(String[] args) throws IOException {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	List<WebElement>l1=driver.findElements(By.tagName("a"));
	int Count=l1.size();
	
	System.out.println(Count);
	
	for(int i=0;i<Count;i++) 
	{
	WebElement 	e1=l1.get(i);
		String s1=e1.getText();
		String s2=e1.getAttribute("href");  
		System.out.println(s1);
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination =new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");
		FileHandler.copy(source, destination);
	}
	driver.close();
	
	
}
}
