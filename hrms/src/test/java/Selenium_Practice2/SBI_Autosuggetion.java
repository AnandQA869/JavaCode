package Selenium_Practice2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SBI_Autosuggetion {

	public static void main(String[] args) throws IOException, InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.google.com/");
WebElement d1=driver.findElement(By.name("q"));
d1.sendKeys("sbi");
List<WebElement> d2=driver.findElements(By.xpath("//div[@class='pcTkSc']/div/li"));
Thread.sleep(1000);
int count=d2.size();
System.out.println(count);
d2.get(6).click();
TakesScreenshot ts=driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\Anand"+Math.random()+"png");
FileHandler.copy(source, destination);
Thread.sleep(1000);
	}

	
	}


