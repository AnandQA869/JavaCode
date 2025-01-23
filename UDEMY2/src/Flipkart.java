import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String parentid=driver.getWindowHandle();
		System.out.println(parentid);
		System.out.println("Welome to Flipkart");
driver.findElement(By.xpath("//img[@class=\"_2puWtW _3a3qyb\"]")).click();		
driver.findElement(By.cssSelector("input[placeholder='Enter pincode']")).sendKeys("122001");
driver.findElement(By.cssSelector("input[placeholder='Enter pincode']")).click();

	}

}
