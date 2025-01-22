package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMindDropDown {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://grotechminds.com/registration/");
WebElement e1=driver.findElement(By.id("Skills"));
e1.sendKeys("Anand");
WebElement e2 =driver.findElement(By.name("lname"));
e2.sendKeys("Pramanik");
WebElement e3=driver.findElement(By.name("email"));
e3.sendKeys("anandcse435@gmail.com");
WebElement e4=driver.findElement(By.id("password"));
e4.sendKeys("Anand@!23");

Select s=new Select(e1);
s.selectByValue("select1");
//e1.sendKeys(Keys.ARROW_DOWN);
//e1.sendKeys(Keys.ARROW_DOWN);
//e1.sendKeys(Keys.ARROW_DOWN);
//e1.sendKeys(Keys.ENTER);
WebElement e10=driver.findElement(By.id("Country"));


Select s1=new Select(e1);
s1.selectByValue("Bangladesh");







	}

}
