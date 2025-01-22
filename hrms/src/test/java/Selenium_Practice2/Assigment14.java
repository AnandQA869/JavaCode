package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment14 {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	
	driver.get("https://www.amazon.in/");
	
	WebElement anand= driver.findElement(By.xpath("(//span[.='Fashion'])[2]"));
	anand.clear();
}
}
