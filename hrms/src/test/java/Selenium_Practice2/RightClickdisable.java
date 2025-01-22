package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RightClickdisable {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://retail.onlinesbi.sbi/retail/login.htm");

WebElement e1=driver.findElement(By.className("login_button"));
Thread.sleep(1000);
e1.click();
WebElement e2 =driver.findElement(By.id("username"));
e2.sendKeys("anand_123");
WebElement e3 =driver.findElement(By.name("password"));
e3.sendKeys("anand_123");
WebElement e4=driver.findElement(By.id("loginCaptchaValue"));
e4.sendKeys("remdc");
WebElement e5=driver.findElement(By.id("Button2"));
e5.click();

	}
}


	


