import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://cafehrvarunagroup.darwinbox.in/user/login?source=logout");
driver.findElement(By.id("login username-field form-control db-input")).sendKeys("00004996");
//driver.findElement(By.id("email")).sendKeys("anandcse435@gmail.com");
//driver.findElement(By.id("pass")).sendKeys("anand@123");driver.findElement(By.xpath("//button[@value='1']")).click();
//driver.findElement(By.xpath("//div[@role='none']")).click();
//driver.findElement(By.xpath("//span[@class='x1lliihq x6ikm8r x10wlt62 x1n2onr6']")).click();
System.out.println("Welcome DarwinBox");



	}

}
