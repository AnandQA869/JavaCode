import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Retry {
@Test

	public void google() {
	
}
	@Test(retryAnalyzer=TestngPackage.RetryWithXML.class)
	public void search() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement e1=driver.findElement(By.name("qa"));
		e1.sendKeys("anand"+Keys.ENTER);
		
	}

}
