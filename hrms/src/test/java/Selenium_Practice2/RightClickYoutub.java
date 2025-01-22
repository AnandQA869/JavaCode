package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickYoutub {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.className("gb_W"));
e1.click();
Actions a1=new Actions(driver);
a1.contextClick().perform();

	}

}
