package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTCAutomation {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.irctc.co.in/nget/train-search");
//WebElement e1=driver.findElement(By.xpath("//a[.='PNR STATUS']"));
//e1.click();
WebElement e2=driver.findElement(By.cssSelector("input.ng-tns-c57-9 ui-inputtext ui-widget ui-state-default ui-corner-all ui-autocomplete-input ng-star-inserted"));
e2.sendKeys("a");
Thread.sleep(1000);

	}

}
