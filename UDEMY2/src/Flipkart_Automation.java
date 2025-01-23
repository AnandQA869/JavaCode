import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Automation {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.manage().window().maximize();
		driver.findElement(By.className("wsejfv")).click();
		System.out.println("Welcome to Flipkart India ");
		
     
	}

}
