package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstInvioke {

	public static void main(String[] args) {
	ChromeDriver driver  =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
WebElement e1=driver.findElement(By.name("search_query"));
e1.sendKeys("GroTechMinds");
driver.findElement(By.id("search icon-legacy")).sendKeys(Keys.ENTER);
	System.out.println("Welcome To Gro TechMinds");
	

	}

}
