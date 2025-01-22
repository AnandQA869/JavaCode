package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptHandler {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://grotechminds.com/javascript-popup/");
WebElement e1=driver.findElement(By.xpath("//button[@class='btnjs']"));
e1.click();

driver.switchTo().alert().dismiss();
Thread.sleep(1000);

	}

}
