package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assigment15LanguageSelectionAmazon {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/");
WebElement btn_Lang = driver.findElement(By.xpath("//span[@class='icp-nav-link-inner']"));
Actions hvrOver_Lang = new Actions(driver);
hvrOver_Lang.moveToElement(btn_Lang).perform();
Thread.sleep(1000);
WebElement select_language = driver.findElement(By.xpath("(//i[@class=\"icp-radio\"])[2]"));
select_language.click();



	}

}
