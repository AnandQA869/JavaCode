package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickGmail {

	public static void main(String[] args) {
ChromeDriver driver  =new ChromeDriver();

driver.get("https://www.google.co.in/");
driver.manage().window().maximize();
WebElement e2=driver.findElement(By.className("gb_W"));
Actions a1=new Actions(driver);
a1.doubleClick(e2).perform();



	}

}
