package Selenium_Practice2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleAssigment8 {

 
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			WebElement e1=driver.findElement(By.partialLinkText("Electronics"));
			e1.click();
			Set<String> parentWindowID = driver.getWindowHandles();
			System.out.println("Parent tab ID "+parentWindowID);
			//System.out.println("Child_Tab_ID "+child_Tab_ID);
	}
}
