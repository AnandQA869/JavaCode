package Selenium_Practice2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class AmanzonTillPayment {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		
		ChromeDriver  driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		WebElement e1=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		
		e1.click();
		
		WebElement e2=	driver.findElement(By.name("email"));
		e2.sendKeys("9560802997");
		WebElement e3=driver.findElement(By.id("continue"));
		e3.click();
		WebElement e4=driver.findElement(By.xpath("//input[@id='ap_password']"));
		e4.sendKeys("Anand@340");
		WebElement e5=driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		e5.click();
		WebElement e6=driver.findElement(By.id("twotabsearchtextbox"));
		e6.sendKeys("mobile"+Keys.ENTER);
		WebElement e7=driver.findElement(By.name("submit.addToCart"));
		e7.click();
		WebElement e8=driver.findElement(By.id("nav-cart-count"));
		e8.click();
		WebElement e9=driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		e9.click();
		WebElement e10=driver.findElement(By.linkText("Add a new delivery address"));
		e10.click();
		WebElement e11=driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']"));
		
		//Select s1=new Select(e1);
        //s1.selectByIndex(12);
		//s1.selectByIndex(3);
		//s1.selectByVisibleText("India");
		
		//e1.click();
		//e1.sendKeys(Keys.ARROW_DOWN);
		//e1.sendKeys(Keys.ARROW_DOWN);
		
		TakesScreenshot ts=driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");
		FileHandler.copy(source, destination);
		
		Thread.sleep(1000);
		System.out.println("WELCOME TO AMANZON");
		
	}
}