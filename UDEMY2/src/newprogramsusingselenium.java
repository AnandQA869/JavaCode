import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newprogramsusingselenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		WebElement a1=driver.findElement(By.xpath("//span[.='Google']"));
		a1.click();
		
		//driver.findElement(By.name("email")).sendKeys("anandcse435@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Anand@123");
		//driver.findElement(By.id("loginbutton")).click();
	driver.manage().window().minimize();
	
	String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		Set<String>parentchild= driver.getWindowHandles();
		System.out.println(parentchild);
	}
}
