import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		System.out.println("Welcome HYR ");
		driver.findElement(By.xpath("//button[@id='alertBox']")).click();
Alert simpleAlert=driver.switchTo().alert();
System.out.println("simpleAlert.gettext()");
simpleAlert.accept();
Thread.sleep(2000);
driver.quit();

	}

}
