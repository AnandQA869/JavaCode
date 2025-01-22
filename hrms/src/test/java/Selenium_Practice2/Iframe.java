package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	private static String iframe;

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1=driver.findElement(By.xpath("//a[@class='gb_A']"));
		e1.click();
		WebElement e2= driver.findElement(By.name("app"));
	driver.switchTo().frame(e2);

	//WebElement e3= driver.findElement(By.xpath("//a[@class='tX9u1b']"));
	//e3.click();
	
	WebElement e3=driver.findElement(By.xpath("//span[.='Meet']"));
	e3.click();
	System.out.println("YOUTUB");
		
		
		}

}
