package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyanamicDropDrown {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement e1=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		
		WebElement e2=driver.findElement(By.xpath("//a[@value='BHO']"));
		e2.click();
		
		driver.quit();
		
		
		
		
	}

}
