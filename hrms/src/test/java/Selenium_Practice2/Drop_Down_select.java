package Selenium_Practice2;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_select {


		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			 // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	        // Open Amazon India website
	        driver.get("https://www.amazon.in/");
	        
	        // Click on 'Sign-In' link
	        driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	        
	        // Enter email or phone number
	        driver.findElement(By.id("ap_email")).sendKeys("9560802997");
	        
	        // Click on the continue button
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        
	        // Enter password
	        driver.findElement(By.id("ap_password")).sendKeys("Anand@321");
	        
	        // Click 'Keep me signed in' checkbox
	        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
	        
	        // Click on the Sign-In button
	        driver.findElement(By.id("signInSubmit")).click();
	        
	        // Select category from dropdown
	       // driver.findElement(By.cssSelector("select[id='searchDropdownBox']")).click();
	      WebElement e1=  driver.findElement(By.id("searchDropdownBox"));
	      //Three way to select drop down for example amazon drop down	
	      //selectByIndex
	      //selectByValue
	      //selectByVisibleText
	        Select s1=new Select(e1);
	        s1.selectByIndex(12);
	        s1.selectByValue("search-alias=electronics");
	       // s1.selectByVisibleText("Books");
	        e1.click();
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ARROW_DOWN);
	        //e1.sendKeys(Keys.ENTER);
	}

}
