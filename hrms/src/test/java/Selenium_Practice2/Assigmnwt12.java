package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnwt12 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.amazon.in/");
driver.get("file:///D:/Anand/learningHTML1.html");
WebElement e1 = driver.findElement(By.tagName("a"));
e1.click();
driver.close();
driver.close();

	}

}
