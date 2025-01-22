package Selenium_Practice2;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePop {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.get("https://admin:admin@the-internet.herokuapp.com/");
	WebElement e2=	driver.findElement(By.xpath("//a[.='Digest Authentication']"));
		e2.click();
		
		
	}

}
