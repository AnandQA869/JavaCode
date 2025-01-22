package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment17 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://grotechminds.com/drag-and-drop/");
		WebElement e2_ = driver.findElement(By.xpath("//div[@id='container-10']"));
		WebElement e2_targetBox = driver.findElement(By.xpath("//div[@id='div2']"));
		
		Actions json_DragDrop = new Actions(driver);
		//json_DragDrop.dragAndDrop(e21, e2_targetBox).perform();
	}

}
