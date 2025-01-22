package Selenium_Practice2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Link_webPage {

	public static void main(String[] args) {
/*ChromeDriver driver=new ChromeDriver();
FirefoxDriver driver1=new FirefoxDriver();
EdgeDriver driver2=new EdgeDriver();
*/
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
List<WebElement> l1=driver.findElements(By.tagName("a"));
int count=l1.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	WebElement e1=l1.get(i);
	String s1=e1.getAttribute("href");
	System.out.println(s1);
	
	
}

	}

}
