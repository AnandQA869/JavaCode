package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploader {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practice.expandtesting.com/upload");
WebElement e1=driver.findElement(By.id("fileInput"));
Thread.sleep(1000);
e1.sendKeys("C:\\Users\\Anand Pramamik\\Downloads\\Anand Resume.docxQuality Assurance.pdf");
WebElement e3=driver.findElement(By.id("fileSubmit"));
e3.click();
	}

}
