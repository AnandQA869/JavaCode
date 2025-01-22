package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment26Banking_Application {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		
		
		WebElement e1 = driver.findElement(By.xpath("(//a[.='CONTINUE TO LOGIN'])[1]"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.name("userName"));
		e2.sendKeys("Anand@124");
		WebElement e3 = driver.findElement(By.name("password"));
		e3.sendKeys("asdfg@134");
		WebElement e4 = driver.findElement(By.id("loginCaptchaValue"));
		e4.sendKeys("1235");
		
		WebElement e6 = driver.findElement(By.id("Button2"));
		e6.click();

	

}
	}


