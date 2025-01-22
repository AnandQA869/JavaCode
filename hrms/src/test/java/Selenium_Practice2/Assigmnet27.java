package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigmnet27 {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.co.in/");
	WebElement e1 = driver.findElement(By.linkText("Gmail"));
	Thread.sleep(500);
	Actions click = new Actions(driver);
	click.contextClick(e1).perform();
	

}


}

