//import java.time.Duration;



import java.time.Duration;

import org.openqa.selenium.By;

import darwinbox.ChromeDriver;

public class Amazon_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver  driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	driver.findElement(By.id("ap_email_login")).sendKeys("akr23508@gmail.com");
		driver.findElement(By.className("a-button-input")).click();
		driver.findElement(By.className("a-button-input")).click();
driver.findElement(By.cssSelector("Input#ap_phone_number")).sendKeys("9560802997");
driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Anand");
driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Anand@340");
driver.findElement(By.xpath("//input[@id='continue']")).click();
		System.out.println("welcome to Amazon");
		
	}

}
