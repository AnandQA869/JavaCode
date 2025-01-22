package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	WebElement  e1=driver.findElement(By.name("q"));
	e1.sendKeys("anand"+Keys.ENTER);
	System.out.println("Searching Sucessfully done ");
	
	}

}
