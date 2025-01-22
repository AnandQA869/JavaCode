package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment16 {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/hoverover/");
WebElement demo1_btn = driver.findElement(By.xpath("//div[@class='has_eae_slider elementor-element elementor-element-1857001 e-con-full e-flex e-con e-child']"));
Actions e1 = new Actions(driver);   
e1.moveToElement(demo1_btn).perform();
e1.click();   




	}

}
