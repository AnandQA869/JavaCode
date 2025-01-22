package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment21 {
public static void main(String[] args) throws InterruptedException {
	
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement txtBox_Search = driver.findElement(By.id("twotabsearchtextbox"));
	txtBox_Search.sendKeys("Shoes");
	Thread.sleep(1000);
	WebElement s1 = driver.findElement(By.xpath("(//div[@class='two-pane-results-container']/div/div)[2]"));
	s1.click();

	
	
}
}
