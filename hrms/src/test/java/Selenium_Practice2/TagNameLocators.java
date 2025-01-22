package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameLocators {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();

driver.get("file:///C:/Users/Anand%20Pramamik/Downloads/learninig.html");
WebElement e1=driver.findElement(By.tagName("a"));
e1.click();


	}

}
