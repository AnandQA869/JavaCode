package Selenium_Practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrollingDownAndScrollingUp {

	public static void main(String[] args) throws InterruptedException, IOException {
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

//Thread.sleep(1000);
//js.executeScript("window.scrollBy(0,-100)");

TakesScreenshot ts =driver;

File source=ts.getScreenshotAs(OutputType.FILE);

File destination=newFile("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random() +"png");
FileHandler.copy(source, destination);












	}

	private static File newFile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}


