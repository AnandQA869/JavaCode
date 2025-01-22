package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assigment1_LaunchChrome {

	public static void main(String[] args) {
		//ChromeOptions c1=new ChromeOptions();
		//c1.addArguments("--headless");
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	e1.click();
	WebElement e2=driver.findElement(By.xpath("//span[.='Sign in']"));
	WebElement e3=driver.findElement(By.name("email"));
	e3.sendKeys("8826553341");
	
	
	//driver.findElement(By.name("q")).sendKeys("INDIA");
	//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	
		//FirefoxDriver driver=new FirefoxDriver();
	
	}

}
