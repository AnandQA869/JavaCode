package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkListUsed {

	public static void main(String[] args)
	{
	
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement e1s=driver.findElement(By.linkText("Best Sellers"));
e1s.click();
driver.close();

	}

}
