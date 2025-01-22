package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebApplication_Automate {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dhbvn.org.in/web/portal/home#");
		WebElement e1=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		WebElement a2=driver.findElement(By.xpath("//a[text()='Deptt. of Power']"));
		Actions a3=new Actions(driver);
		a3.moveToElement(e1).click(a2).build().perform();
		System.out.println("Welcome to Haryana Electric Board Gurgaon");
		
	}

}
