package Selenium_Practice2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		//s
		//driver.manage().timeouts().implicitlyWait(10,Timeout.ONE_MILLISECOND)
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e1=driver.findElement(By.id("container-10"));
		WebElement e2=driver.findElement(By.id("div2"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(e1, e2).perform();
		WebElement e3=	driver.findElement(By.id("div2"));
		WebElement e4=driver.findElement(By.id("container-10"));
		Actions a2=new Actions(driver);
		a2.dragAndDrop(e3, e4).perform();
		WebElement e5=driver.findElement(By.id("container-6"));
		WebElement e6=driver.findElement(By.id("div2"));
		Actions a3=new Actions(driver);
		a3.dragAndDrop(e5, e6).perform();
		WebElement e7=driver.findElement(By.id("div2"));
		WebElement e8=driver.findElement(By.id("container-6"));
		Actions a4=new Actions(driver);
		a4.dragAndDrop(e7, e8).perform();
		WebElement e9=	driver.findElement(By.id("container-4"));
		WebElement e10=driver.findElement(By.id("div2"));

		Actions a11=new Actions(driver);
		a11.dragAndDrop(e9, e10).perform();
		WebElement e12=driver.findElement(By.id("div2"));
		WebElement e13=	driver.findElement(By.id("container-4"));
		Actions a14=new Actions(driver);
a14.dragAndDrop(e12, e13).perform();




TakesScreenshot ts=driver;
File source =ts.getScreenshotAs(OutputType.FILE);
//single take screen shot 
//File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand.jpeg");
//Multiple take screen shot with diffrent diffrent id 

File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");

FileHandler.copy(source, destination);

driver.close();

		
		
		
		

		
		
	}


	}


