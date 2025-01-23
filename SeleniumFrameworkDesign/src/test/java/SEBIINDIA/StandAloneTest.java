package SEBIINDIA;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://rahulshettyacademy.com/client");
 driver.findElement(By.id("userEmail")).sendKeys("anandcse435@gmail.com");
driver.findElement(By.id("userPassword")).sendKeys("Anand@123");

driver.findElement(By.id("login")).click();
List<WebElement >e1= driver.findElements(By.cssSelector(".mb-3"));
Thread.sleep(10);
      System.out.println("welcome to You Tube");
	}

}
