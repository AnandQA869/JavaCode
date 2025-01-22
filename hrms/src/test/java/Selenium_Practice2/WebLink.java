package Selenium_Practice2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebLink {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.Google.in	");
		List<WebElement>l1=driver.findElements(By.tagName("a"));
		int Count=l1.size();
		
		System.out.println(Count);
		
		for(int i=0;i<Count;i++) 
		{
		WebElement 	e1=l1.get(i);
			String s1=e1.getText();
			String s2=e1.getAttribute("href");  
			System.out.println(s1);
		}
		
		
}
}