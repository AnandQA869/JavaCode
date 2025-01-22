package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigmnet18 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e3_json = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e2_targetBox = driver.findElement(By.id("div2"));
		Thread.sleep(1000);
	}

}
