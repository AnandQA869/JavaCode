package Selenium_Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement txtBox_Search = driver.findElement(By.name("q"));
		txtBox_Search.sendKeys("Mobiles");
		Thread.sleep(1000);
		List<WebElement> li = driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		WebElement lastItem = li.get(li.size()-1);
		lastItem.click();
		
	}

}
