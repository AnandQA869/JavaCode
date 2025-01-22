package Selenium_Practice2;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down2select {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=713930224968&hvpos=&hvnetw=g&hvrand=6072384155409456619&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007765&hvtargid=kwd-10573980&hydadcr=14453_2402227&gad_source=1");
WebElement e1=driver.findElement(By.id("searchDropdownBox"));
Select s=new Select(e1);
//s1.selectByIndex(12);
//s.selectByValue("search-alias=jewelry");
//s.selectByVisibleText("Amazon Devices");
e1.click();
e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ARROW_DOWN);
e1.sendKeys(Keys.ARROW_DOWN);

e1.sendKeys(Keys.ENTER);






	}

}
