import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		import java.time.Duration;

		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import Chrome.ChromeDriver;

		class AmazonPassword {

			public static void main(String[] args) 
			{
				WebDriver driver=new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
				driver.findElement(By.id("ap_email_login")).sendKeys("9560802997");
				
			}

		}


	}

}
