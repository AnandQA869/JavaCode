package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigment19 {

	public static void main(String[] args) {
ChromeDriver driver =new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/registration/");
WebElement skill_DropDown = driver.findElement(By.id("Skills"));
Select select_Skl = new Select(skill_DropDown);
select_Skl.selectByValue("select2");

WebElement DropDown = driver.findElement(By.name("Country"));
Select country = new Select(DropDown);
country .selectByVisibleText("India");

WebElement relegon_DropDown = driver.findElement(By.id("Relegion"));
Select select_relgn = new Select(relegon_DropDown);
select_relgn.selectByIndex(5);    

	}

}
