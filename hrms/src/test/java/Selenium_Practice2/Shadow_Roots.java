package Selenium_Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Roots {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver() ;
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.get("https://www.airindia.com/");
WebElement e1=driver.findElement(By.id("onetrust-accept-btn-handler"));
e1.click();
WebElement e2=driver.findElement(By.name("one"));
e2.click();
Thread.sleep(1000);
}
	}


