package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Select {

	public static void main(String[] args) throws InterruptedException {
	
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("Skills"));
		 Select s1=new Select(e1);
		 s1.selectByIndex(2);
	
		 System.out.println("Welcome to GroTechMinds");
		 Thread.sleep(1000);
		 
		
}
}
