package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practicedrag_drop {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("node"));
		//id node
		WebElement e2=	driver.findElement(By.className("dragged"));
Actions a1=new Actions(driver);
a1.dragAndDrop(e1, e2).perform();
WebElement e3=driver.findElement(By.id("node"));
WebElement e4=driver.findElement(By.id("droparea"));
Actions a2=new Actions(driver);
a2.dragAndDrop(e3, e4).perform();


	}

}
