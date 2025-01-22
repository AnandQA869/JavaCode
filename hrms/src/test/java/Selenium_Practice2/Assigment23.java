package Selenium_Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment23 {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();

driver.get("https://www.google.com/");
WebElement e1=driver.findElement(By.id("APjFqb"));
e1.sendKeys("Automation");
Thread.sleep(1000);
List<WebElement> li = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));

for(int i=0; i<li.size(); i++)
{
	WebElement auto1 = li.get(i);
	System.out.println(auto1.getText());


	}

}
}
