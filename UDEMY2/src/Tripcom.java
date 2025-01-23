import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tripcom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//To Login WebPage 
		driver.get("https://www.hdfcbank.com/");
		//To Maximun method for windows
		driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		//driver.findElement(By.className("https://www.hdfcbank.com/")).click();
	//driver.findElement(By.xpath("//input[@type='text']")).sendKeys("anandce435@gail.com");
	//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Anand@123");

	//driver.findElement(By.xpath("//button[@value='1']")).click();
	//driver.findElement(By.id("loginbutton")).click();
//driver.findElement(By.xpath("//button[@type='button']")).click();

		 System.out.println(parentid);
		 System.out.println("Welcome to HDFC BANK");
	}
}
		