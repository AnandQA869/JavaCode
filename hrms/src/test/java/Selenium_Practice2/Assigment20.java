package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment20 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		{
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com/");
			
			WebElement txtBox_search = driver.findElement(By.id("APjFqb"));
			txtBox_search.sendKeys("banglore");
			Thread.sleep(1000);
			WebElement click = driver.findElement(By.xpath("(//div[@class='OBMEnb']/ul/li)[5]"));
			click.click();
	}
	}
}
