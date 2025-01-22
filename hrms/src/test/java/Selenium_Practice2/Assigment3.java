package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement e1=driver.findElement(By.name("email"));
		e1.sendKeys("9560802997");
		WebElement e2=driver.findElement(By.id("continue"));
		e2.click();
		WebElement e3=driver.findElement(By.name("password"));
		e3.sendKeys("Anand@321");
		e3.click();
		WebElement e4=driver.findElement(By.className("a-button-input"));
		e4.click();
		WebElement e5=driver.findElement(By.id("twotabsearchtextbox"));
		e5.sendKeys("Shoes");
		
		
		

	}

}
