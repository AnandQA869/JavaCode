package Selenium_Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automation_PracticePage {

	public static void main(String[] args) throws InterruptedException
	{

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://grotechminds.com/hoverover/");
		WebElement e1=driver.findElement(By.className("elementor-shortcode"));		
		Actions a1=new Actions(driver);
		a1.moveToElement(e1).perform();
		
		
		System.out.println("Welcome to Rahul Shetty Page ");

	}

}
