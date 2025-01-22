package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtubsearchxpath {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=TB-qNwBGiRU");
		
		//ChromeDriver driver=new ChromeDriver();
		WebElement d1=driver.findElement(By.xpath("//input[@id='search']"));
		d1.sendKeys("Anand");
		
		Thread.sleep(1000);
	}

}
