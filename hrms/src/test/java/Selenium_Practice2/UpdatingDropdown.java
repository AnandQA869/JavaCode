package Selenium_Practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UpdatingDropdown {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.className("paxinfo"));
		Thread.sleep(2000);
		int i=1;
	while(i<5) {
		WebElement e2=driver.findElement(By.id("hrefIncAdt"));

i++;
	}
		WebElement e8=driver.findElement(By.id("btnclosepaxoption"));

TakesScreenshot ts=driver;
File source =ts.getScreenshotAs(OutputType.FILE);

File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\Anand.pdf");
	FileHandler.copy(source, destination);	
		
		
	}

}
