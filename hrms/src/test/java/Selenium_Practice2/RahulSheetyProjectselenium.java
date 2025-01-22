package Selenium_Practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RahulSheetyProjectselenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//WebElement e1=driver.findElement(By.xpath("//a[.='Flight Booking']"));
WebElement e2=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));


Select dropDown =new Select(e2);
dropDown.selectByIndex(2);

System.out.println(dropDown);
dropDown.selectByVisibleText("USD");
dropDown.selectByValue("AED");



String parentid=driver.getWindowHandle();
System.out.println(parentid);


System.out.println(driver.getCurrentUrl());
Thread.sleep(1000);
	}

}
