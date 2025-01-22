package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessOptionworking {

	public static void main(String[] args) {
		ChromeOptions c1=new ChromeOptions();
		c1.addArguments("--headless");
ChromeDriver driver =new ChromeDriver(c1);

driver.get("https://www.google.com/");
WebElement e1=driver.findElement(By.name("q"));
e1.sendKeys("TV");


	}

}
