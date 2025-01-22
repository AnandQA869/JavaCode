package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUplaod {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver ();
		driver.manage().window().maximize();
		driver.get("https://practice.expandtesting.com/upload");
		WebElement e1=driver.findElement(By.name("file"));
		e1.sendKeys("C:\\Users\\Anand Pramamik\\Downloads\\Anand Resume.docxQuality Assurance.pdf");
		
		
	}

}
