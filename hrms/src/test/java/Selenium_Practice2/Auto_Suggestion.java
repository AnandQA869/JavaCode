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

public class Auto_Suggestion {

	public static void main(String[] args) throws InterruptedException, IOException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement l2=driver.findElement(By.id("twotabsearchtextbox"));
l2.sendKeys("shoes");
Thread.sleep(1000);
List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
Thread.sleep(2000);
int count =li.size();
System.out.println(count);
li.get(5).click();
TakesScreenshot ts=driver;
File source=ts.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");
FileHandler.copy(source, destination);
driver.close();

	}
}
